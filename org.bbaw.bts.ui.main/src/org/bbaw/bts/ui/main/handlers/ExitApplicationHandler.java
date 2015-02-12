 
package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class ExitApplicationHandler {
	@Execute
	  public void execute(final IWorkbench workbench, DBManager dbManager, UISynchronize sync) {
		try {
			if (dbManager.optimizationRequired())
			{
				// ask user if optimize
				dbManager.optimize();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			dbManager.shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				 workbench.close();
			}
		});
	   

	  }
		
}