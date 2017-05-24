package org.bbaw.bts.dao.couchDB;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.lightcouch.CouchDbClient;

public class CouchDBCollectionConnectionProvider implements
		DBConnectionProvider {

	private Map<String, CouchDbClient> couchDbConnectionClients = new HashMap<>();
	
	@Override
	public <T> T getDBClient(Class<T> clazz, String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getDBClient(Class<T> clazz, String path, String userName,
			String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getSearchClient(Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceSet getEmfResourceSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocalDBURL() { // XXX rename
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getDBClient(Class<T> clazz, String localDBUrl, //XXX remove?
			String collectionName) throws MalformedURLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void purgeDBConnectionPool() {

		for (CouchDbClient client : couchDbConnectionClients.values()) {
			client.shutdown();
		}
		
		couchDbConnectionClients.clear();
	}

}
