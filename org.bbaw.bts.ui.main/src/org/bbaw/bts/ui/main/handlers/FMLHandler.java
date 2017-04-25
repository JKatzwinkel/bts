package org.bbaw.bts.ui.main.handlers;

import java.net.MalformedURLException;

import javax.inject.Inject;

import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.di.annotations.Execute;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.services.BTSProjectService;

public class FMLHandler {
	
	@Inject
	private DBManager dbManager;
	
	@Inject
	private BTSProjectService projectService;
	
	@Execute
	public void execute() {
		
		System.out.println("FML");

	
	
		BTSProject project = projectService.getMainProject();
		
		try {
			dbManager.prepareDBSynchronization(project);
		} catch (MalformedURLException e) {
			System.out.println("FML FML!");
			e.printStackTrace();
		}
		
		
		
	}
		
}