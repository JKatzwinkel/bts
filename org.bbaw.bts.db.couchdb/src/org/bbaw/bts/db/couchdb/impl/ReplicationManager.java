package org.bbaw.bts.db.couchdb.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.elasticsearch.common.util.ArrayUtils;
import org.lightcouch.CouchDbClient;
import org.lightcouch.Replicator;
import org.lightcouch.ReplicatorDocument;
import org.lightcouch.Response;

import com.google.gson.JsonObject;

public class ReplicationManager {
	
	final static String REPLICATOR_ERR = "error";
	final static String REPLICATOR_OK = "triggered";
	final static List<String> ignoreCollectionNames = Arrays.asList(
		"local",
		"notification",
		"admin"
	);

	@Inject
	private DBConnectionProvider connectionProvider;
	
	@Inject
	private IEclipseContext context;
	
	public void listCollections(BTSProject project) {
		for (BTSProjectDBCollection c : project.getDbCollections()) {
			System.out.println("--- "+c.getCollectionName()+" ---");
			for (BTSDBCollectionRoleDesc roleDescription : c.getRoleDescriptions()) {
				System.out.println(" > "+roleDescription.getRoleName());
				System.out.println("   users: ");
				for (String user : roleDescription.getUserNames()) {
					System.out.print(user+ " ");
				}
				System.out.println("   groups: ");
				for (String usergroup : roleDescription.getUserRoles()) {
					System.out.print(usergroup);
				}
			}
			
			
		}
	}
	

	public void synchronizeProject(BTSProject project) {

		String remoteURL = getProjectRemoteDBLocator(project);
		
		for (BTSProjectDBCollection collection : project.getDbCollections()) {
			// is collection to be synchronized?
			if (!ignoreCollectionNames.contains(collection.getCollectionName()) && 
					collection.isSynchronized()) {
				synchronizeCollection(remoteURL, collection);				
			}
		}
				
		
	}
	
	public boolean synchronizeCollection(String remoteURL, BTSProjectDBCollection collection) {
		
		boolean status = true;
		
		// for both pull and push
		for (String sfx : DaoConstants.REPLICATOR_SUFFIXES) {
			String repId = collection.getCollectionName() + sfx;
			
			ReplicatorDocument rep = getDbClient().replicator().replicatorDocId(repId).find();
			
			if (rep != null && REPLICATOR_OK.equals(rep.getReplicationState())) {
				// XXX replicator is ok
			} else {
				// replication must have been fucked up somehow
				// so create a new replicator document
				status &= setupReplicator(remoteURL, 
						collection.getCollectionName(), 
						DaoConstants.REPLICATOR_SUFFIX_TO_REMOTE.equals(sfx));
			}
			
		}
		
		return status;
	}
	
	public boolean setupReplicator(String remoteURL, String collectionName, boolean push) {
		
		Replicator repl = getDbClient().replicator()
				.continuous(true)
				.createTarget(true);
		
		repl.source(
				(push ? "" : remoteURL)
				+ collectionName
				);
		
		repl.target(
				(push ? remoteURL : "")
				+ collectionName
				);
		
		
		Response res = repl.save();
		System.out.println("replcation result: "+res.getError()+" ; "+res);
		
		return true;
	}
	
	
	private CouchDbClient getDbClient() {
		return connectionProvider.getDBClient(CouchDbClient.class, DaoConstants.REPLICATOR);
	}
	
	private String getProjectRemoteDBLocator(BTSProject project) {
		String loctmpl = "%s://%s@%s%s/";
		URL masterServer = null;
		
		try {
			masterServer = new URL(project.getDbConnection().getMasterServer());
		} catch (MalformedURLException e) {
			// XXX log
			e.printStackTrace();
			return null;
		}
		
		String loc = String.format(loctmpl, 
				masterServer.getProtocol(),
				getUserAuthPartForURL(),
				masterServer.getHost(),
				(masterServer.getPort() > -1) ? ":"+masterServer.getPort() : "");
						
		return loc;
	}
	
	private String getUserAuthPartForURL() {
		BTSUser user = (BTSUser)context.get(BTSConstants.AUTHENTICATED_USER);
		return String.format("%s:%s", user.getUserName(), user.getPassword());
	}

}
