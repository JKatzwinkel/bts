package org.bbaw.bts.core.remote.dao.couchDB.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.remote.dao.RemoteDBConnectionProvider;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.osgi.service.prefs.Preferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;

// TODO integrate user authentication, authenticated_user, reload dbclient pool
// when user change
public class RemoteDBConnectionProviderImpl implements RemoteDBConnectionProvider
{
	@Inject
	private IEclipseContext context;
	@Inject
	@Preference(value = BTSPluginIDs.PREF_REMOTE_DB_URL, nodePath = "org.bbaw.bts.app")
	private String remote_db_url;

	@Inject
	@Preference(value = "username", nodePath = "org.bbaw.bts.app")
	private String user;

	@Inject
	@Preference(value = "password", nodePath = "org.bbaw.bts.app")
	private String password;

	private Client searchClient;
	private String protocol;
	private String host;
	private int port;

	private Map<String, CouchDbClient> remoteCouchDbClients = new HashMap<>();

	@Override
	public <T> T getDBClient(Class<T> clazz, String path)
	{
		if (clazz != CouchDbClient.class) {
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}

		return (T) getRemoteDbClient(path);
	}

	private void initDBHost()
	{
		if (remote_db_url == null || remote_db_url.trim().length() == 0)
		{
			remote_db_url = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_REMOTE_DB_URL, null);
		}
		if (remote_db_url != null && remote_db_url.trim().length() > 0)
		{
			try
			{
				URL url = new URL(remote_db_url);
				protocol = url.getProtocol();
				host = url.getHost();
				port = url.getPort();
			} catch (MalformedURLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("CouchDBDao initDBHost " + remote_db_url);

	}

	private boolean retrieveLoginDataFromSecurePrefs() {
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		try {
			user = auth.get("username", null);
			password = auth.get("password", null);
		} catch (StorageException e) {
			return false;
		}
		return (user != null && password != null);
	}

	private CouchDbClient initializeRemoteCouchDbClient(String path) {
		// look up remote DB address in preferences
		remote_db_url = getRemoteDBURL();
		System.out.println("CouchDBDao initDBHost " + remote_db_url);

		// try to get login data if necessary
		if (user == null || password == null) {
			boolean loginDataAvailable = retrieveLoginDataFromSecurePrefs();
			System.out.println("Retrieval of secure storage login data successful: "+loginDataAvailable);
		}

		// populate client configuration from preferences
		CouchDbProperties couchDbProperties = new CouchDbProperties();
		try {
			// create URL object from remote url string found in preferences
			URL remoteDBURL = new URL(remote_db_url);

			// configure couchdb properties according to known remote address
			couchDbProperties
					.setDbName(path)
					.setCreateDbIfNotExist(true)
					.setProtocol(remoteDBURL.getProtocol()) // TODO handle absent
					.setHost(remoteDBURL.getHost())
					.setPort(remoteDBURL.getPort()) // TODO handle absent
					.setMaxConnections(100)
					.setConnectionTimeout(0);

			// set login data
			couchDbProperties.setUsername(user).setPassword(password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// create client for couchdb at remote address
		CouchDbClient remoteCouchDbClient = new CouchDbClient(couchDbProperties);

		return remoteCouchDbClient;
	}

	private CouchDbClient getRemoteDbClient(String path) {
		// look up client to remote collection under path
		// create one if none found
		if (!remoteCouchDbClients.containsKey(path)) {
			remoteCouchDbClients.put(path,
					initializeRemoteCouchDbClient(path));
		}
		return remoteCouchDbClients.get(path);
	}

	@Override
	public <T> T getSearchClient(Class<T> clazz)
	{
		if (clazz == Client.class)
		{
			if (searchClient == null)
			{
				searchClient = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost",
						9300));
			}
			return (T) searchClient;

		}
		return null;
	}

	@Override
	public ResourceSet getEmfResourceSet()
	{
		ResourceSet set = (ResourceSet) context.get(RemoteDaoConstants.RESOURCE_SET);
		if (set == null)
		{
			Map<URI, Resource> uriResourceMap = new HashMap<URI, Resource>();
			set = new ResourceSetImpl();
			set.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
			((ResourceSetImpl) set).setURIResourceMap(uriResourceMap);
			context.set(RemoteDaoConstants.RESOURCE_SET, set);
		}
		return set;
	}

	@Override
	public String getRemoteDBURL()
	{
		return ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app")
				.get(BTSPluginIDs.PREF_REMOTE_DB_URL, "http://aaew64.bbaw.de:9589");
	}

	@Override
	public <T> T getDBClient(Class<T> clazz, String path, String userName, String password)
	{
		if (clazz != CouchDbClient.class)
		{
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}

		if (userName != null && password != null) {
			user = userName;
			this.password = password;
		}
		return (T) getRemoteDbClient(path);
	}

	@Override
	public void purgeDBConnectionPool() {

		for (CouchDbClient client : remoteCouchDbClients.values()) {
			client.shutdown();
		}

		remoteCouchDbClients.clear();

	}
}
