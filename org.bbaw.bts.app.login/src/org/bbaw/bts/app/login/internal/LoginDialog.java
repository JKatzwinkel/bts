

package org.bbaw.bts.app.login.internal;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;


public class LoginDialog extends Dialog {

	protected Composite loginComposite;

	private final Shell shell;

	private Image titleImage;

	private ImageDescriptor imageDescriptor;

	public LoginDialog() {
		this(Display.getCurrent().getActiveShell());
	}

	public LoginDialog(Shell parentShell) {
		super(parentShell);
		this.shell = parentShell;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("BTS Login");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		parent.setBackgroundMode(SWT.INHERIT_DEFAULT);
		Composite control = createContentArea(parent);
		control.setData("org.eclipse.e4.ui.css.id", "LoginDialog");
		Rectangle controlRect = control.getBounds();
		
		// looks strange in multi monitor environments
		// Rectangle displayBounds = shell.getDisplay().getBounds();
		
		Monitor primary = shell.getDisplay().getPrimaryMonitor();
	    Rectangle displayBounds = primary.getBounds();
	    
		int x = (displayBounds.width - controlRect.width) / 2;
		int y = (displayBounds.height - controlRect.height) / 2;
		shell.setBounds(x, y, controlRect.width, controlRect.height);

		return control;
	}

	protected Composite createContentArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setBackgroundMode(SWT.INHERIT_DEFAULT);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		composite.setLayout(gridLayout);

		if (imageDescriptor == null) {
			imageDescriptor = imageDescriptorFromURI(URI.createURI("platform:/plugin/org.bbaw.bts.app.login/images/btsStart.jpg"));
		}
		if (imageDescriptor != null) {
			titleImage = imageDescriptor.createImage();
			Label imageLabel = new Label(composite, SWT.NONE);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.verticalAlignment = GridData.BEGINNING;
			data.horizontalSpan = 1;
			imageLabel.setLayoutData(data);
			imageLabel.setImage(titleImage);
		}
		
		Composite userPasswortComposite = new Composite(composite, SWT.NONE);
		userPasswortComposite.setData("org.eclipse.e4.ui.css.id", "LoginDialog");
		GridLayout gridLayout2 = new GridLayout(2,false);
		gridLayout2.marginHeight = 10;
		gridLayout2.marginWidth = 30;
		userPasswortComposite.setLayout(gridLayout2);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		userPasswortComposite.setLayoutData(gridData);
	
		Label userLabel = new Label(userPasswortComposite, SWT.NONE);
		userLabel.setText("User  ");
		Text userText = new Text(userPasswortComposite, SWT.BORDER);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		userText.setLayoutData(gridData);
		
		Label passwordLabel = new Label(userPasswortComposite, SWT.NONE);
		passwordLabel.setText("Password  ");
		Text passwortText = new Text(userPasswortComposite, SWT.PASSWORD |SWT.BORDER);
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		passwortText.setLayoutData(gridData);
		
		return composite;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		parent.setBackgroundMode(SWT.INHERIT_DEFAULT);
		
		//FIXME add custom buttons
		// add authentication validation
		// set return value according to authentication result.
//		Bundle bundle = FrameworkUtil.getBundle(getClass());
//		  BundleContext bundleContext = bundle.getBundleContext();
//		  IEclipseContext eclipseCtx =   
//		      EclipseContextFactory.getServiceContext(bundleContext);
//		  eclipseCtx.set("currentUser", user);
		super.createButtonsForButtonBar(parent);
	}

	@Override
	public boolean close() {
		if (titleImage != null) {
			titleImage.dispose();
		}
		return super.close();
	}
	
	public ImageDescriptor imageDescriptorFromURI(URI iconPath) {
		try {
			return ImageDescriptor.createFromURL(new URL(iconPath.toString()));
		} catch (MalformedURLException e) {
			System.err.println("iconURI \"" + iconPath.toString()
					+ "\" is invalid, a \"missing image\" icon will be shown");
			return ImageDescriptor.getMissingImageDescriptor();
		}
	}

}
