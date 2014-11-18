package org.bbaw.bts.db.couchdb.impl;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSDBConnection;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.commons.CopyDirectory;
import org.bbaw.bts.commons.OSValidator;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.remote.dao.RemoteDBManager;
import org.bbaw.bts.db.DBManager;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.ElasticsearchParseException;
import org.elasticsearch.action.UnavailableShardsException;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.refresh.RefreshRequestBuilder;
import org.elasticsearch.action.admin.indices.stats.IndexStats;
import org.elasticsearch.action.admin.indices.stats.IndicesStatsRequest;
import org.elasticsearch.action.admin.indices.stats.IndicesStatsResponse;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.IndicesAdminClient;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.node.Node;
import org.elasticsearch.river.couchdb.CouchdbRiver;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;
import org.lightcouch.NoDocumentException;
import org.lightcouch.Replicator;
import org.lightcouch.ReplicatorDocument;
import org.osgi.framework.Bundle;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class CouchDBManager implements DBManager
{
	//FIXME javascript korrigieren
	private static final String VALIDATE_DOC_READ = "function(doc,userCtx,secObj){if(!doc.visibility){return;}else{if(doc.visibility=='public'||doc.visibility=='repository'||doc.visibility=='project'){return;}} if(userCtx.roles.indexOf('_admin')!==-1||userCtx.roles.indexOf('admin')!==-1){return;}else if(secObj&&secObj.admins&&secObj.admins.roles){for(var i=0,l=secObj.admins.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.admins.roles[i])!==-1){return;}}}else{if(userCtx.roles.indexOf('editors')!==-1){return;} if(secObj&&secObj.editors&&secObj.editors.roles){for(var i=0,l=secObj.editors.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.editors[i])!==-1){return;}}} for(var i=0,l=doc.readers.length;i<l;i++){if(doc.readers[i]==userCtx.name){return;} if(userCtx.roles.indexOf(doc.readers[i])!==-1){return;}}} throw({forbidden:secObj.admins.names[0]+secObj.editors.names[0]+'name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. writers: '+doc.readers[0]});throw({forbidden:secObj.admins.names[0]+' hallo '+secObj.editors.names[0]+' name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Writers: '+doc.writers[0]});}";
	//FIXME javascript korrigieren
	private static final String VALIDATE_DOC_UPDATE = "function(newDoc,oldDoc,userCtx,secObj){return;}";
	
//	private static final String VALIDATE_DOC_UPDATE = "function(newDoc,oldDoc,userCtx,secObj){if(!oldDoc){return;}else{if(userCtx.roles.indexOf('_admin')!==-1||userCtx.roles.indexOf('admin')!==-1){return;}else if(secObj&&secObj.admins&&secObj.admins.roles){for(var i=0,l=secObj.admins.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.admins.roles[i])!==-1){return;}}}else{if(userCtx.roles.indexOf('editors')!==-1){return;} if(secObj&&secObj.editors&&secObj.editors.roles){for(var i=0,l=secObj.editors.roles.length;i<l;i++){if(userCtx.roles.indexOf(secObj.editors[i])!==-1){return;}}} for(var i=0,l=oldDoc.writers.length;i<l;i++){if(oldDoc.writers[i]==userCtx.name){return;} if(userCtx.roles.indexOf(oldDoc.writers[i])!==-1){return;}}} throw({forbidden:secObj.admins.names[0]+secObj.editors.names[0]+'name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Hallo Welt22. writers: '+oldDoc.writers[0]});} throw({forbidden:secObj.admins.names[0]+' hallo '+secObj.editors.names[0]+' name: '+userCtx.name+userCtx.roles[0]+' '+userCtx.roles[1]+' Only admins may edit the database. Hallo Welt22. writers: '+oldDoc.writers[0]});}";

	private static final String RIVER_HEART_BEAT = "500ms";
	
	private static final int RIVER_READ_TIMEOUT = 15;
	private static final String DB_ARCHIVE_NAME = "CouchDB";
	private static final String DB_RUNTIME_PROCESS = "db_runtime_process";

	@Inject
	@Preference(value = "local_elasticsearch_url", nodePath = "org.bbaw.bts.app")
	protected String local_elasticsearch_url = "http://127.0.0.1:9200";

	@Inject
	private DBConnectionProvider connectionProvider;

	@Inject
	@Preference(value = "username", nodePath = "org.bbaw.bts.app")
	private String username;

	@Inject
	@Preference(value = "password", nodePath = "org.bbaw.bts.app")
	private String password;

	@Inject
	private Logger logger;
	
	@Inject
	private IEclipseContext context;
	
	@Inject
	private Backend2ClientUpdateDao backend2ClientUpdateDao;
	
	@Inject
	private RemoteDBManager remoteDBManager;
	
	private Client esClient;
	private Process process;
	private Pattern urlAuthorityRemovelPattern = Pattern.compile("(https?:\\/\\/)([^@]+@)(.+)");

	@Override
	public boolean prepareDBSynchronization(BTSProject project) throws MalformedURLException
	{
		boolean success = true;
		boolean notificationCollFound = false;

		Map<String, ReplicatorDocument> replicationMap = loadReplicationMap();
		
		// make sure that user context roles are set in _replicator collection
		if (!replicationMap.isEmpty())
		{
			checkAndSetSecurityContextOnReplicator();
		}
		boolean foundAdmin = false;
		boolean foundUsers = false;

		boolean anySync = false;
		for (BTSProjectDBCollection collection : project.getDbCollections())
		{
			if (!collection.getCollectionName().equals("local") && collection.isSynchronized())
			{
				if (checkAndSetSyncToRemote(collection.getCollectionName(), project.getDbConnection(), replicationMap)
						&& checkAndSetSyncFromRemote(collection.getCollectionName(), project.getDbConnection(), replicationMap))
				{
					// fine
				} else
				{
					success = false;
				}
				anySync = true;
			} else if (!collection.isSynchronized())
			{
				checkAndRemoveReplication(collection, project.getDbConnection());
			}
			checkAndAddAuthentication(collection);
			if (DaoConstants.NOTIFICATION.equals(collection.getCollectionName()))
			{
				notificationCollFound = true;
			}
			if (collection.getCollectionName().equals("admin")) foundAdmin = true;
			if (collection.getCollectionName().equals("_users")) foundUsers = true;

			//TODO check and set _desing/auth docs with custom function
		}
		if (anySync) 
		{
			if (!foundAdmin)
			{
				if (checkAndSetSyncToRemote("admin", project.getDbConnection(), replicationMap)
						&& checkAndSetSyncFromRemote("admin", project.getDbConnection(), replicationMap))
				{
					// fine
				} else
				{
					success = false;
				}
			}
			
			if (!foundUsers)
			{
				if (checkAndSetSyncToRemote("_users", project.getDbConnection(), replicationMap)
						&& checkAndSetSyncFromRemote("_users", project.getDbConnection(), replicationMap))
				{
					// fine
				} else
				{
					success = false;
				}
			}
		}
		if (!notificationCollFound)
		{
			BTSProjectDBCollection coll = BtsmodelFactory.eINSTANCE.createBTSProjectDBCollection();
			coll.setCollectionName(DaoConstants.NOTIFICATION);
			coll.setIndexed(true);
			coll.setSynchronized(true);
			project.getDbCollections().add(coll);
			checkAndSetSyncToRemote(coll.getCollectionName(), project.getDbConnection(), replicationMap);
			checkAndSetSyncFromRemote(coll.getCollectionName(), project.getDbConnection(), replicationMap);
			checkAndAddAuthentication(coll);
		}

		return success;
	}

	private void checkAndSetSecurityContextOnReplicator() {
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, DaoConstants.REPLICATOR);
		JsonObject jsonobj = dbClient.find(JsonObject.class, "_security");
		String inner = "\"admins\":{\"names\":[\"admin\"],\"roles\":[\"_admin\"]},"
				+ "\"members\":{\"names\":[],\"roles\":[]}";
		String json = 
				"{"
					+ inner
				+ "}";
		
		// check if sec from db is correct.
		if (jsonobj != null)
		{
			String dbObject = dbClient.getGson().toJson(jsonobj);
			if (dbObject != null && dbObject.equals(json))
			{
				// return if it is correct
				return;
			}
		}
		
		// add id
		 json = 
					"{"
					+ "\"_id\":\"_security\","
					+ inner
					+ "}";
			System.out.println(json);

		try {
			// if not correct, set sec context.
			jsonobj = dbClient.getGson().fromJson(json, JsonObject.class);
		System.out.println(json);
			dbClient.save(jsonobj);
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private Map<String, ReplicatorDocument> loadReplicationMap() throws MalformedURLException {
		List<ReplicatorDocument> docs = getReplicatorDocuments(DaoConstants.ADMIN);
		Map<String, ReplicatorDocument> map = new HashMap<String, ReplicatorDocument>();
		if (docs != null && !docs.isEmpty())
		{
			for (ReplicatorDocument doc : docs)
			{
				map.put(doc.getId(), doc);
			}
		} 
		return map;
	}

	private void checkAndAddAuthentication(BTSProjectDBCollection collection)
	{
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName());
		JsonObject jsonObject = null;
		try {
			jsonObject = dbClient.find(JsonObject.class, "_design/auth");
		} catch (Exception e) {
			logger.info("_design/auth JsonObject Not found for collection "
							+ collection.getCollectionName());
		}

		if (!collection.getRoleDescriptions().isEmpty()) // auth required
		{
			if (jsonObject == null) // auth not found
			{
				String json = "{ ";
				json += "\"_id\": \"_design/auth\",";
				json += "\"language\": \"javascript\",";
				json += "\"validate_doc_read\": \"" + VALIDATE_DOC_READ + "\",";
				json += "\"validate_doc_update\": \"" + VALIDATE_DOC_UPDATE + "\"";
				json += "}";
				
				JsonObject jsonobj = dbClient.getGson().fromJson(json, JsonObject.class);
				dbClient.save(jsonobj);
				logger.info("_design/auth created for collection "
						+ collection.getCollectionName() + ", doc content: " + json);
			} else
			{
				boolean changed = false;
				if (jsonObject.get("validate_doc_read") == null
						|| !jsonObject.get("validate_doc_read").getAsString().equals(VALIDATE_DOC_READ))
				{
					jsonObject.addProperty("validate_doc_read", VALIDATE_DOC_READ);
					changed = true;
				}
				if (jsonObject.get("validate_doc_update") == null
						|| !jsonObject.get("validate_doc_update").getAsString().equals(VALIDATE_DOC_UPDATE))
				{
					jsonObject.addProperty("validate_doc_update", VALIDATE_DOC_UPDATE);
					changed = true;
				}
				if (changed)
				{
					//					jsonObject.remove("_rev");
					dbClient.update(jsonObject);
				}
			}
		} else
		// no auth required
		{
			if (jsonObject != null) // auth  found
			{
				dbClient.remove(jsonObject); // delete auth
			}
		}
	}

	private void checkAndRemoveReplication(BTSProjectDBCollection collection, BTSDBConnection dbConnection)

	{
		ReplicatorDocument doc = null;
		try
		{
			doc = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName())
					.replicator().replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE).find();
			
			if (doc != null)
			{
				String rev = doc.getRevision();
				connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName()).replicator()
				.replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE)
				.replicatorDocRev(rev)
				.remove();
			}
			
		}catch (NoDocumentException e)
		{
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			doc = connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName())
					.replicator().replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE).find();
			if (doc != null)
			{
				String rev = doc.getRevision();
				connectionProvider.getDBClient(CouchDbClient.class, collection.getCollectionName()).replicator()
					.replicatorDocId(collection.getCollectionName() + DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE)
					.replicatorDocRev(rev)
					.remove();
			}
		}catch (NoDocumentException e)
		{
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean checkAndSetSyncFromRemote(String collectionName, BTSDBConnection dbConnection,
			Map<String, ReplicatorDocument> replicationMap)
			throws MalformedURLException
	{
		ReplicatorDocument doc = replicationMap.get(collectionName + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE);
		if (doc != null)
		{
			if (isValidReplicationFromRemote(doc, dbConnection, collectionName))
			{
				return true;
			}
			else
			{
				connectionProvider.getDBClient(CouchDbClient.class, collectionName)
				.replicator().replicatorDocId(doc.getId()).replicatorDocRev(doc.getRevision()).remove();
			}
		}
		String source = processServerAuthURL(dbConnection.getMasterServer(), collectionName);

		if (source == null)
		{
			return false;
		}
		boolean createTarget = false;
		try {
			createTarget = checkUserIsDBAdmin(username, password);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			Replicator replicator2 = connectionProvider.getDBClient(CouchDbClient.class,collectionName)
					.replicator();
			replicator2.target(collectionName);
			replicator2.source(source);
			replicator2.continuous(true);
			replicator2.createTarget(createTarget);
			replicator2.userCtxName(username);
			replicator2.userCtxRoles("_admin");
			String docId = collectionName + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE;
			if (docId.startsWith("_"))
			{
				docId = docId.substring(1);
			}
			replicator2.replicatorDocId(docId);
			replicator2.save(); // triggers a replication
		} catch (Exception e) {
			logger.error(e);
		}
 
		return true;
	}

	private String processServerAuthURL(String masterServer,
			String collectionName) {
		if (username == null || password == null)
		{
			URL url = null;
			try {
				url = new URL(connectionProvider.getLocalDBURL());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			if (url != null && url.getUserInfo() != null && !"".equals(url.getUserInfo()) && (username == null || "".equals(username)))
			{
				String userInfo = url.getUserInfo();
				if (userInfo != null && userInfo.contains(":"))
				{
					username = userInfo.split(":")[0];
					password = userInfo.split(":")[1];
				}
			}
		}
		URL server = null;
		try {
			server = new URL(masterServer);
		} catch (MalformedURLException e) {
			logger.error("processServerAuthURL malformed url: " + masterServer + ", collection: " + collectionName, e);
		}
		if (server == null)
		{
			return null;
		}
		String su = server.getProtocol() + "://";  

		if (username != null && password != null)
		{
			
			su += username + ":" + password + "@";
		}
		su += server.getHost();
		if (server.getPort()  > -1)
		{ 
			su += ":" + server.getPort();
		}
		if ( server.getPath() != null &&  server.getPath().length() > 0)
		{
			if (!server.getPath().startsWith("/"))
			{
				su += "/";
			}
			su += server.getPath();
		}
		if (!su.endsWith("/"))
		{
			su += "/";
		}
		
		su +=  collectionName;
		logger.info("Masterserver replicator " + su);
		return su;
	}

	private boolean checkAndSetSyncToRemote(String collectionName, BTSDBConnection dbConnection, Map<String, ReplicatorDocument> replicationMap)
			throws MalformedURLException
	{
		String docId = collectionName + DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE;
		if (docId.startsWith("_"))
		{
			docId = docId.substring(1);
		}
		ReplicatorDocument doc = replicationMap.get(docId);
		if (doc != null)
		{
			if (isValidReplicationToRemote(doc, dbConnection, collectionName))
			{
				return true;
			}
			else
			{
				connectionProvider.getDBClient(CouchDbClient.class, collectionName)
				.replicator().replicatorDocId(doc.getId()).replicatorDocRev(doc.getRevision()).remove();
			}
		}
		String target = processServerAuthURL(dbConnection.getMasterServer(), collectionName);

		if (target == null)
		{
			return false;
		}
		boolean createTarget = false;
		try {
			createTarget = remoteDBManager.checkUserIsDBAdmin(username, password);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Replicator replicator = connectionProvider.getDBClient(CouchDbClient.class, collectionName)
					.replicator();
			replicator.source(collectionName);
			replicator.target(target);
			replicator.continuous(true);
			replicator.createTarget(createTarget);
			
			replicator.userCtxName(username);
			replicator.userCtxRoles("_admin");
			replicator.replicatorDocId(docId);
			replicator.save(); // triggers a replication
		} catch (Exception e) {
			logger.error(e);
		}

		return true;
	}

	private List<ReplicatorDocument> getReplicatorDocuments(String collectionName) throws MalformedURLException
	{
		List<ReplicatorDocument> docs = null;
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, collectionName);
		try
		{
			docs = client.replicator().findAll();
			return docs;
		} catch (NoDocumentException e)
		{
			client.context().createDB(DaoConstants.REPLICATOR);
		}
		try
		{
			docs = client.replicator().findAll();
			return docs;
		} catch (NoDocumentException e)
		{
		}
		return null;
	}

	private boolean isValidReplicationToRemote(ReplicatorDocument doc, BTSDBConnection dbConnection,
			String collectionName)
	{
		String target = doc.getTarget();
		if (target.contains("@"))
		{
			Matcher m = urlAuthorityRemovelPattern.matcher(target);
			target = m.replaceAll("$1$3");
		}
		String url = dbConnection.getMasterServer();
		url = url.replaceAll("\\/", "\\\\/");
		Pattern pattern = Pattern.compile(url + "\\/*" + collectionName);
		Matcher m = pattern.matcher(target);
		if (!m.matches())
		{
			return false;
		}
		if (doc.getReplicationState() != null && doc.getReplicationState().equals("error"))
		{
			return false;
		}
		return true;
	}

	private boolean isValidReplicationFromRemote(ReplicatorDocument doc, BTSDBConnection dbConnection,
			String collectionName)
	{
		String source = doc.getSource();
		if (source.contains("@"))
		{
			Matcher m = urlAuthorityRemovelPattern.matcher(source);
			source = m.replaceAll("$1$3");
		}
		String url = dbConnection.getMasterServer();
		url = url.replaceAll("\\/", "\\\\/");
		Pattern pattern = Pattern.compile(url + "\\/*" + collectionName);
		Matcher m = pattern.matcher(source);
		if (!m.matches())
		{
			return false;
		}
		if (doc.getReplicationState() != null && doc.getReplicationState().equals("error"))
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean prepareDBIndexing(BTSProject project) throws URISyntaxException
	{
		boolean success = true;
		getClient();
		for (BTSProjectDBCollection collection : project.getDbCollections())
		{
			if (collection.isIndexed() && !checkAndCreateIndex(collection.getCollectionName(), esClient))
			{
				success = false;
			}
		}

		return success;
	}

	private Client getClient() throws URISyntaxException
	{
		if (esClient == null)
		{
			esClient = connectionProvider
					.getSearchClient(Client.class);
//			URI uri = new URI(local_elasticsearch_url);
//			esClient = new TransportClient().addTransportAddress(new InetSocketTransportAddress(uri.getHost(), uri
//					.getPort()));
//			Node node = nodeBuilder().node();
//			esClient = node.client();
		}
		return esClient;
	}

	private boolean checkAndCreateIndex(String collection, Client esClient)
	{
		boolean hasIndex = existsIndex(esClient, collection);

		// FIXME
		if (true && hasIndex)
		{
			return true;
		} else
		{
			createRiver(esClient, collection);
		}

		return true;
	}

	private void createIndex(Client esClient2, String collectionName)
	{
		// TODO Auto-generated method stub

	}
	
	

	private void createRiver(final Client esClient2, final String collectionName)
	{
//		CouchdbRiver r = new CouchdbRiver(arg0, arg1, arg2, arg3, arg4);
		String json = "";
		try
		{
			URL url = new URL(connectionProvider.getLocalDBURL());
			if (url.getUserInfo() != null && !"".equals(url.getUserInfo()) && (username == null || "".equals(username)))
			{
				String userInfo = url.getUserInfo();
				if (userInfo != null && userInfo.contains(":"))
				{
					username = userInfo.split(":")[0];
					password = userInfo.split(":")[1];
				}
			}
			
			json = "{\r\n" + "    \"type\" : \"couchdb\",\r\n" + "    \"couchdb\" : {\r\n"
					+ "        \"user\" : \""
					+ username
					+ "\",\r\n"
					+ "        \"password\" : \""
					+ password
					+ "\",\r\n"
					+ "        \"host\" : \""
					+ url.getHost()
					+ "\",\r\n"
					+ "        \"port\" : "
					+ url.getPort()
					+ ",\r\n"
					+ "        \"heartbeat\" : \""
					+ RIVER_HEART_BEAT
					+ "\",\r\n"
					+ "        \"read_timeout\" : "
					+ RIVER_READ_TIMEOUT
					+ ",\r\n"
					+ "        \"db\" : \""
					+ collectionName
					+ "\",\r\n"
					+ "        \"filter\" : null\r\n"
					+ "    }, index: {\r\n"
					+ "index: \""
					+ collectionName.trim()
					+ "\",\r\n"
					+ "\"type\": \""
					+ collectionName
					+ "\",\r\n"
					+ "\"bulk_size\": 100,\r\n" + "\"bulk_timeout\": \"500ms\"\r\n" + "}\r\n}";
			//FIXME suppress credentials in logging
			logger.info(json);
			esClient2.index(Requests.indexRequest("_river").type(collectionName).id("_meta").source(json)).actionGet();
		} catch (Exception e)
		{
			System.out.println("org.elasticsearch.action.UnavailableShardsException? " + (e instanceof org.elasticsearch.action.UnavailableShardsException));
			
			e.printStackTrace();
			if (e instanceof UnavailableShardsException)
			{
				final String fjson = json;
				// TODO delete elasticsearch dirasdf
				Job sleeper = new Job("sleeper") {

					@Override
					protected IStatus run(IProgressMonitor monitor) {
				for (int i = 0; i < 5; i++)
				{
					try {
						
						esClient2.index(Requests.indexRequest("_river").type(collectionName).id("_meta").source(fjson)).actionGet();
					} catch (Exception ee) {
						logger.error(ee);
					}
					Job sleeper = new Job("sleeper") {

						@Override
						protected IStatus run(IProgressMonitor monitor) {
							System.out.println("sleep");
							return Status.OK_STATUS;
						}

					};
					sleeper.schedule(1000);
					try {
						sleeper.join();
					} catch (InterruptedException eee) {
						// TODO Auto-generated catch block
						eee.printStackTrace();
					}

					System.out.println("slept");
				}
				return Status.OK_STATUS;
					}

				};
			}
		}

	}

	private boolean existsRiver(Client esClient2, String collectionName)
	{
		// TODO Auto-generated method stub
		return false;
	}

	private boolean existsIndex(Client esClient2, String indexName)
	{
		boolean hasIndex = esClient2.admin().indices().exists(new IndicesExistsRequest(indexName)).actionGet()
				.isExists();
		return hasIndex;
	}

	@Override
	public boolean prepareDB() throws URISyntaxException
	{
		// database should be installed
		// should be running

		try
		{
			DeleteIndexResponse delete = getClient().admin().indices()
					.delete(new DeleteIndexRequest(DaoConstants.PERCOLATOR)).actionGet();
		} catch (Exception e)
		{
			logger.info("No percolator to be deleted.");
		}

		return true;
	}

	@Override
	public boolean databaseIsInstalled(String dbInstallationDir)
	{
		String dbdir = dbInstallationDir + BTSConstants.FS + DB_ARCHIVE_NAME;
		File dir = new File(dbdir);
		File ertsDir = null;
		if (dir.exists() && dir.isDirectory())
		{
			for (File child : dir.listFiles())
			{
				if (child.isDirectory() && child.getName().startsWith("erts"))
				{
					ertsDir = child;
					break;
				}
			}
			if (ertsDir != null)
			{
				logger.info("ertsDir " + ertsDir.getAbsolutePath());
				File erlIni = new File(ertsDir.getAbsolutePath() + BTSConstants.FS + "bin" + BTSConstants.FS + "erl.ini");
				logger.info("erl.ini exists: " + erlIni.exists() + ", location: " + erlIni.getAbsolutePath());

				return erlIni.exists();
			}
		}
		return false;
	}

	@Override
	public boolean installDatabase(String dbInstallationDir, int localPort, String localAdminName, String localAdminpassword) throws IOException, InterruptedException, URISyntaxException
	{
		if (databaseIsInstalled(dbInstallationDir))
		{
			return true;
		}
		File dir = new File(dbInstallationDir);

		//load couchdb-setup
		File setupFile = loadCouchBaseArchive();
		logger.info("DB setup file: " + setupFile.getAbsolutePath());
		
		//unzip to installation dir
		FileInputStream fis = new FileInputStream(setupFile);
		CopyDirectory.unZipIt(fis, dbInstallationDir, null);
		logger.info("DB setup file unzipped to: " + dbInstallationDir);

		
		File eRLInstaller = loadDBSetupFile(dbInstallationDir + BTSConstants.FS + DB_ARCHIVE_NAME + BTSConstants.FS);
		logger.info("Erlang installer: " + eRLInstaller.getAbsolutePath());


		String fileName = eRLInstaller.getAbsolutePath();
		if (OSValidator.isWindows())
		{
			String[] commands = new String[]{"cmd",  "/c", fileName, "-s"}; //"runas",  "/profile",  "/user:Administrator",
			Process process = Runtime.getRuntime().exec(commands);
			process.waitFor();
		}
		else if (OSValidator.isMac())
		{
			//FIXME
		}
		else if (OSValidator.isUnix())
		{
		}
		
		// set local port and local admin
		logger.info("CouchDB set local port " + localPort);

		String localIni = dbInstallationDir + BTSConstants.FS + DB_ARCHIVE_NAME
				+ BTSConstants.FS + "etc" + BTSConstants.FS + "couchdb"
				+ BTSConstants.FS + "local.ini";
		File localIniFile = new File(localIni);
		if (localIniFile.exists()) {
			Scanner scanner = new Scanner(localIniFile);
			StringBuffer stringBufferOfData = new StringBuffer();
			for (String line; scanner.hasNextLine()
					&& (line = scanner.nextLine()) != null;) {
				// set local db port
				if (line.trim().startsWith(";port") || line.trim().startsWith("port") 
						|| line.trim().startsWith("; port")) {
					stringBufferOfData.append("port=" + localPort).append(
							"\r\n");
				} else if (line.trim().startsWith(";require_valid_user") 
						|| line.trim().startsWith("require_valid_user") 
						|| line.trim().startsWith("; require_valid_user")) {
					
					// make authentication mandatory
					stringBufferOfData.append("require_valid_user=true").append(
							"\r\n");
				}
				else if (line.trim().startsWith("[log]")) {
					// set local user
					stringBufferOfData.append(localAdminName +"=" + localAdminpassword).append(
							"\r\n");
					stringBufferOfData.append("\r\n");
					stringBufferOfData.append(line).append("\r\n");
				}
				else if (line.trim().startsWith("[admins]")) {
					// set local admin
					stringBufferOfData.append(line).append("\r\n");
					stringBufferOfData.append(localAdminName +"=" + localAdminpassword).append(
							"\r\n");
					stringBufferOfData.append("\r\n");
				}
				else {
					stringBufferOfData.append(line).append("\r\n");
				}
			}
			scanner.close();// this is used to release the scanner from file
			try {
				BufferedWriter bufwriter = new BufferedWriter(new FileWriter(
						localIni));
				bufwriter.write(stringBufferOfData.toString());
				bufwriter.flush();
				bufwriter.close();// closes the file
			} catch (Exception e) {// if an exception occurs
				logger.info("Error occured while attempting to write to file: "
								+ e.getMessage());
			}
		}
		
		if (OSValidator.isMac())
		{
			//FIXME copy Apache CouchDB.app into Applications folder or don't!
			
		}
		else if (OSValidator.isUnix())
		{
		}
		logger.info("CouchDB installed");

		return true;
	}

	private File loadCouchBaseArchive() throws URISyntaxException, IOException {
		File file = null;
		URL entry = Platform.getBundle("org.bbaw.bts.db.couchdb").getEntry(
				"/db/" + DB_ARCHIVE_NAME + ".zip");
		String fileURL = null;
		if (entry != null) {
			fileURL = FileLocator.toFileURL(entry).getPath();
			fileURL = fileURL.substring(1, fileURL.length());
			file = new File(fileURL);
			return file;
		} else {
			throw new IOException("CouchDB Base Archive not found!");
		}

	}

	private File loadDBSetupFile(String dir) {
		
		File file = null;
		file = new File(dir);
		File setupFile = null;
		if (file.isDirectory())
		{
			for (File child : file.listFiles())
			{
				if (OSValidator.isWindows() && child.getName().equals("Install.exe"))
				{
					setupFile = child;
					break;
				}
				else if (OSValidator.isMac() && child.getName().endsWith(".zip"))
				{
					//FIXME todo
					setupFile = child;
					break;
				}
				else if (OSValidator.isUnix() && child.getName().endsWith(".sh"))
				{
					//FIXME todo
					setupFile = child;
					break;
				}
			}
		}
		else
		{
			setupFile = file;
		}
		return setupFile;
	}

	@Override
	public boolean checkConnection(String urlString, String username, String password) throws MalformedURLException
	{

		URL url = new URL(urlString);
		try
		{
			CouchDbProperties properties = new CouchDbProperties().setDbName("admin")
					.setCreateDbIfNotExist(false).setProtocol(url.getProtocol()).setHost(url.getHost())
					.setPort(url.getPort()).setMaxConnections(1).setConnectionTimeout(0).setUsername(username)
					.setPassword(password);
			CouchDbClient dbClient = new CouchDbClient(properties);
		} catch (Exception e)
		{
			logger.warn("Malformed url or invalid credentials: "+ urlString + ", Exception message: " + e.getMessage(), e);
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public boolean prepareDBCollectionIndexing(String collection) {
		try {
			return checkAndCreateIndex(collection, getClient());
		} catch (URISyntaxException e) {
			return false;
		}
		
	}

	@Override
	public boolean startDatabase(String dbInsallationDir, String localDBUrl) throws IOException, InterruptedException {
		
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		try {
			username = auth.get("username", null);
			password = auth.get("password", null);
		} catch (StorageException e) {
			logger.error(e);
		}
		try {
			if (localDBUrl != null && !"".equals(localDBUrl)) {
				if (checkConnection(localDBUrl, username, password)) {
					return true;
				}
			} else {
				if (checkConnection(connectionProvider.getLocalDBURL(), username, password)) {
					return true;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
		
		String runFileName = getOSCouchDBStartUpFileName(dbInsallationDir);
		logger.info("DB Erlang startup file: " + runFileName);
		String[] commands;
		//FIXME
		logger.error("Start Database, show Console: " + logger.isInfoEnabled());
		if (logger.isInfoEnabled())
		{
			commands = new String[]{runFileName};
		}
		else
		{
			commands = new String[]{runFileName, "-detached"};
		}
		process = Runtime.getRuntime().exec(commands);
		context.set(DB_RUNTIME_PROCESS, process);
		
//		// get the error stream of the process and print it
//        InputStream error = process.getErrorStream();
//        for (int i = 0; i < error.available(); i++) {
//        	logger.info("DB Erlang error: " + error.read());
//        }
		// check if db is up and running
		logger.info("Checking and waiting if DB Erlang started successfully");
		for (int i = 0; i < 20; i++)
		{
			try {
				if (localDBUrl != null && !"".equals(localDBUrl)) {
					if (checkConnection(localDBUrl, username, password)) {
						logger.info("DB Erlang started");
						return true;
					}
				} else {
					if (checkConnection(connectionProvider.getLocalDBURL(),
							username, password)) {
						logger.info("DB Erlang started");
						return true;
					}
				}
			} catch (Exception e) {
				logger.error(e);
			}
			Job sleeper = new Job("sleeper") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					System.out.println("sleep");
					return Status.OK_STATUS;
				}

			};
			sleeper.schedule(1000);
			try {
				sleeper.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("slept");
		}
		
		
		logger.info("DB Erlang started");

		return true;
	}

	private String getOSCouchDBStartUpFileName(String dbInsallationDir) throws FileNotFoundException {
		String runFileName = dbInsallationDir  + BTSConstants.FS + DB_ARCHIVE_NAME;
		if (OSValidator.isWindows())
		{
			return runFileName  + BTSConstants.FS + "bin" + BTSConstants.FS + "couchdb.bat";
		}
		else if (OSValidator.isMac())
		{
			//FIXME
			return runFileName +  BTSConstants.FS + "Apache CouchDB.app" + BTSConstants.FS 
					+ "Contents"+ BTSConstants.FS + "MacOS" + BTSConstants.FS + "Apache CouchDB";
		}
		else if (OSValidator.isUnix())
		{
			return runFileName  + BTSConstants.FS + "bin" + BTSConstants.FS + "couchdb.sh";
		}
		
//		File dir = new File(runFileName);
//		File ertsDir = null;
//		if (dir.exists() && dir.isDirectory())
//		{
//			for (File child : dir.listFiles())
//			{
//				if (child.isDirectory() && child.getName().startsWith("erts"))
//				{
//					ertsDir = child;
//					break;
//				}
//			}
//			if (ertsDir != null)
//			{
//				logger.info("ertsDir " + ertsDir.getAbsolutePath());
//				runFileName = ertsDir.getAbsolutePath() + BTSConstants.FS + "bin" + BTSConstants.FS;
//				if (OSValidator.isWindows())
//				{
//					return runFileName + "erl.exe";
//				}
//				else if (OSValidator.isMac())
//				{
//					//FIXME
//					return runFileName + "couchdb.bat";
//				}
//				else if (OSValidator.isUnix())
//				{
//					return runFileName + "couchdb.sh";
//				}
//			}
//		}
		
		throw new FileNotFoundException("CouchDB Erlang startup executable not found");
	}

	@Override
	public boolean synchronizeRemoteProjects(String mainProject,
			List<String> projecsToSync, String serverurl, String localDBUrl) throws Exception {
		
		boolean required = true;
		boolean success = true;

		Map<String, ReplicatorDocument> replicationMap = loadReplicationMap();
		
		// make sure that user context roles are set in _replicator collection
		if (!replicationMap.isEmpty())
		{
			checkAndSetSecurityContextOnReplicator();
		}
		BTSDBConnection dbConnection = BtsmodelFactory.eINSTANCE.createBTSDBConnection();
		
		dbConnection.setMasterServer(serverurl);
		if (checkAndSetSyncToRemote("admin", dbConnection, replicationMap)
				&& checkAndSetSyncFromRemote("admin", dbConnection, replicationMap))
		{
			// fine
		} else
		{
			success = false;
		}
		
		// sync users
		if (checkAndSetSyncToRemote("_users", dbConnection, replicationMap)
				&& checkAndSetSyncFromRemote("_users", dbConnection, replicationMap))
		{
			// fine
		} else
		{
			success = false;
		}
//		try {
//			docs = getStartupReplicatorDocuments("admin", localDBUrl);
//			if (docs != null && !docs.isEmpty()) {
//				for (ReplicatorDocument doc : docs) {
//					if (doc.getSource().equals(serverurl + "/" + "admin")) {
//						required = false;
//					}
//				}
//			}
//		} catch (MalformedURLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		if (required) {
//			ReplicatorDocument doc = connectionProvider.getDBClient(
//					CouchDbClient.class, localDBUrl, "admin").replicator().replicatorDocId("admin"
//					+ DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE).find();
//			Replicator replicator2 = connectionProvider.getDBClient(
//					CouchDbClient.class, localDBUrl, "admin").replicator();
//			replicator2.target("admin");
//			replicator2.source(serverurl + "/" + "admin");
//			replicator2.continuous(true);
//			replicator2.replicatorDocId("admin"
//					+ DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE);
//			replicator2.save(); // triggers a replication
//		}
//
//		// replication to remote
//		required = true;
//		try {
//			docs = getStartupReplicatorDocuments("admin", localDBUrl);
//
//			docs = connectionProvider.getDBClient(CouchDbClient.class, localDBUrl, "admin")
//					.replicator().findAll();
//			if (docs != null && !docs.isEmpty()) {
//				for (ReplicatorDocument doc : docs) {
//					if (doc.getTarget().equals(serverurl + "/" + "admin")) {
//						required = false;
//					}
//				}
//			}
//		} catch (NoDocumentException e) {
//
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		if (required) {
//			Replicator replicator = connectionProvider.getDBClient(
//					CouchDbClient.class, localDBUrl, "admin").replicator();
//			replicator.source("admin");
//			replicator.target(serverurl + "/" + "admin");
//			replicator.continuous(true);
//			replicator.createTarget(true);
//			replicator.replicatorDocId("admin"
//					+ DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE);
//			replicator.save(); // triggers a replication
//		}
		Job sleeper = new Job("sleeper") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				System.out.println("sleep");
				return Status.OK_STATUS;
			}

		};
		sleeper.schedule(1000);
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("slept");

		return success;
	}

	private List<ReplicatorDocument> getStartupReplicatorDocuments(
			String collectionName, String localDBUrl) throws MalformedURLException {
		List<ReplicatorDocument> docs = null;
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, localDBUrl, collectionName);
		try
		{
			docs = client.replicator().findAll();
			return docs;
		} catch (NoDocumentException e)
		{
			client.context().createDB(DaoConstants.REPLICATOR);
		}
		try
		{
			docs = client.replicator().findAll();
			return docs;
		} catch (NoDocumentException e)
		{
		}
		return null;
	}

	@Override
	public void shutdown() {
		
		prepareShutdown();
		try {
			logger.info("Shutdown DB, process: " + process);
			process = (Process) context.get(DB_RUNTIME_PROCESS);
			if (process != null)
			{

				logger.info("Shutdown DB, process: " + process);
				
				logger.info("Shutdown DB, stop listening to CouchDB changes");
				backend2ClientUpdateDao.stopListening();
				process.destroy();
				// presuming that when process is not null the couchdb process was startedd by bts
				// and shall then be killed by bts
				if (OSValidator.isWindows())
				{
					try {
						Runtime.getRuntime().exec("taskkill /F /IM werl.exe");
					} catch (IOException e) {
						logger.error(e);
					}
				}
				else if (OSValidator.isMac())
				{
					//FIXME
				}
				else if (OSValidator.isUnix())
				{
				}
			}
		} catch (Exception e) {
			logger.info("Shutdown DB failed: " + process, e);
		}
		
		
	}

	private void prepareShutdown() {
		Client client = connectionProvider.getSearchClient(Client.class);
		try {
			client.close();
		} catch (ElasticsearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, DaoConstants.NOTIFICATION);
		dbClient.context().compact();
		dbClient.shutdown();
		
	}

	

	@Override
	public boolean checkAndCreateDBCollection(BTSProject project, BTSProjectDBCollection collection, String dbCollectionName, boolean index, boolean synchronize) {
		
		CouchDbClient dbClient = null;
		boolean success = true;
		try {
			dbClient = connectionProvider.getDBClient(CouchDbClient.class, dbCollectionName);
			dbClient.context().createDB(dbCollectionName);
			Map<String, ReplicatorDocument> replicationMap = loadReplicationMap();

			if (synchronize && project != null && collection != null)
			{
				if (checkAndSetSyncToRemote(collection.getCollectionName(), project.getDbConnection(), replicationMap)
						&& checkAndSetSyncFromRemote(collection.getCollectionName(), project.getDbConnection(), replicationMap))
				{
				}
				else 
				{
					success = false;
				}
			}
			if (index && !checkAndCreateIndex(dbCollectionName, esClient))
			{
				success = false;
			}
			checkAndAddAuthentication(collection);
		} catch (Exception e) {
			logger.error(e);
		}
		return success;

		
	}

	@Override
	public boolean checkUserIsDBAdmin(String userName, String password) {
		CouchDbClient dbClient = null;
		boolean success = true;
		try {
			dbClient = connectionProvider.getDBClient(CouchDbClient.class, "_users");
			dbClient.design().getFromDb("_all_docs");
		} catch (Exception e) {
			success = false;
		}
		return success;
	}

	@Override
	public boolean dbCollectionExists(String dbCollectionName) {
		CouchDbClient dbClient = null;
		boolean exists = true;
		try {
			dbClient = connectionProvider.getDBClient(CouchDbClient.class, dbCollectionName);
		} catch (Exception e) {
			exists = false;
		}
		return exists;
	}

	@Override
	public boolean optimizationRequired() {
		// check if storage is very large
		
		
		// check for all db collection if compact is recommended
		return false;
	}

	@Override
	public boolean optimize() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getLocalDBurl() {
		return connectionProvider.getLocalDBURL();
	}

	@Override
	public String getLocalESGuiURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DBCollectionStatusInformation> getDBCollectionStatusInformations(IProgressMonitor monitor) {
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, "admin");
		try {
			Client esClient = getClient();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> allDBs = dbClient.context().getAllDbs();
		Map<String, ReplicatorDocument> replicationMap = null;
		try {
			replicationMap = loadReplicationMap();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (monitor != null)
		{
			monitor.beginTask("Load DB Collection Information...", allDBs.size());
		}
		List<DBCollectionStatusInformation> dbCollectionInfos = new Vector<DBCollectionStatusInformation>(allDBs.size());
		for (String db : allDBs)
		{
			DBCollectionStatusInformation info = BtsviewmodelFactory.eINSTANCE.createDBCollectionStatusInformation();
			info.setDbCollectionName(db);
			dbCollectionInfos.add(info);
			
			// db info
			CouchDbClient collectionClient = connectionProvider.getDBClient(CouchDbClient.class, db);
			info.setDbDiskSize(new Long(collectionClient.context().info().getDiskSize()).toString());
			info.setDbDocCount(collectionClient.context().info().getDocCount());
			info.setDbDocDelCount(new Long(collectionClient.context().info().getDocDelCount()).toString());
			info.setDbPurgeSeq(new Long(collectionClient.context().info().getPurgeSeq()).toString());
			info.setDbUpdateSeq(collectionClient.context().info().getUpdateSeq());
			
			// db sync
			if (replicationMap != null)
			{
				ReplicatorDocument docFrom = replicationMap.get(db + DaoConstants.REPLICATOR_SUFFIX_FROM_REMOTE);
				if (docFrom != null)
				{
					info.setSyncStatusFromRemote(docFrom.getReplicationState());
				}
				ReplicatorDocument docTo = replicationMap.get(db + DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE);
				if (docTo != null)
				{
					info.setSyncStatusToRemote(docTo.getReplicationState());
				}
			}
			
			// index
			try {
				IndicesAdminClient iac = esClient.admin().indices();
				IndicesStatsResponse isr = iac.stats(new IndicesStatsRequest()).actionGet();
				IndexStats is = isr.getIndex(db);
				info.setIndexDocCount(is.getTotal().docs.getCount());
			}  
			catch (ElasticsearchException e) {
				info.setIndexDocCount(-1);
				e.printStackTrace();
			} catch (Exception e) {
				info.setIndexDocCount(-1);
				e.printStackTrace();
			} finally {
				
			}
			
			try {
//				RefreshRequestBuilder
				IndicesAdminClient iac = esClient.admin().indices();
				iac.prepareRefresh("_river")
				.execute()
				.actionGet();
				GetResponse lastSeqGetResponse = esClient
						.prepareGet("_river", db, "_seq")
						.execute()
						.actionGet();
				 if (lastSeqGetResponse.isExists()) {
				     Map<String, Object> couchdbState = (Map<String, Object>) lastSeqGetResponse.getSourceAsMap().get("couchdb");
				     if (couchdbState != null) {
				         String lastSeq = couchdbState.get("last_seq").toString(); // we know its always a string
				         info.setIndexUpdateSeq(lastSeq);
				     }
				 }
			} catch (ElasticsearchParseException e) {
				e.printStackTrace();
			} catch (ElasticsearchException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			// berechne index status
			if (db.equals("_replicator") || db.equals("_users"))
			{
				info.setIndexStatus("SYSTEM DB");
			}
			else if (info.getIndexDocCount() == - 1 || info.getDbDocCount() - info.getIndexDocCount() > 20)
			{
				info.setIndexStatus("ERROR");
			}
			else if (info.getDbDocCount() - info.getIndexDocCount() > 4)
			{
				info.setIndexStatus("INDEX_BEHIND");
			}
			else
			{
				info.setIndexStatus("OK");
			}
			if (monitor != null)
			{
				monitor.worked(1);
				if (monitor.isCanceled()) return dbCollectionInfos;
			}
		}
		return dbCollectionInfos;
	}

	@Override
	public boolean reindex(String dbCollectionName, IProgressMonitor monitor) {
		return reIndexDBCollection(dbCollectionName, monitor);
	}
	
	private boolean reIndexDBCollection(String dbCollectionName, IProgressMonitor monitor)
	{
		// remove index
		try {
			esClient = connectionProvider
					.getSearchClient(Client.class);
			boolean deleted = esClient.admin().indices().delete(new DeleteIndexRequest(dbCollectionName)).actionGet().isAcknowledged();
			esClient.prepareGet("_river", dbCollectionName, "_seq").execute().actionGet();
			DeleteResponse response = esClient.prepareDelete("_river", dbCollectionName, "_seq").execute().actionGet();

		} catch (ElasticsearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// recreate index
		try {
			esClient = connectionProvider
					.getSearchClient(Client.class);
			
			checkAndCreateIndex(dbCollectionName, esClient);
			return true;

		} catch (ElasticsearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
