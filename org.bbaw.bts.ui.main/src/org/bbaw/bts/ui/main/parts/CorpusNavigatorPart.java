package org.bbaw.bts.ui.main.parts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.main.test.OCLTest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class CorpusNavigatorPart
{

	private Label label;
	private TreeViewer treeViewer;
	private StructuredSelection selection;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private CorpusNavigatorController corpusNavigatorController;
	// Get UISynchronize injected as field
	@Inject
	private UISynchronize sync;
	// use field injection for the service
	@Inject
	private ESelectionService selectionService;
	private Map<String, BTSQueryResultAbstract> queryResultMap = new HashMap<String, BTSQueryResultAbstract>();
	private Map<String, List<TreeNodeWrapper>> viewHolderMap = new HashMap<String, List<TreeNodeWrapper>>();

	private EditingDomain editingDomain;
	private ISelectionChangedListener selectionListener;

	@Inject
	public CorpusNavigatorPart()
	{
		// TODO Your code here
	}

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		parent.setLayout(new GridLayout());
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		label = new Label(composite, SWT.NONE);
		label.setText("Corpus-Navigator");

		// Button b = new Button(composite, SWT.PUSH);
		// b.setText("ADD");
		// b.addSelectionListener(new SelectionListener(){
		//
		// @Override
		// public void widgetSelected(SelectionEvent e) {
		// BTSCorpusObject o = createTextObject(1);
		// input.add(o);
		//
		// }
		//
		// @Override
		// public void widgetDefaultSelected(SelectionEvent e) {
		// // TODO Auto-generated method stub
		//
		// }});

		Button b2 = new Button(composite, SWT.PUSH);
		b2.setText("SAVE");
		b2.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selection != null)
				{
					Object o = ((TreeNodeWrapper) selection.getFirstElement()).getObject();
					if (o instanceof BTSCorpusObject)
					{
						corpusNavigatorController.save((BTSCorpusObject) o);
					}
					if (o instanceof BTSTextCorpus)
					{
						treeViewer.refresh();
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});

		Button b3 = new Button(composite, SWT.PUSH);
		b3.setText("CHECK");
		b3.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selection != null)
				{
					Object o = ((TreeNodeWrapper) selection.getFirstElement()).getObject();
					if (o instanceof BTSCorpusObject)
					{
						// ((BTSCorpusObject) o).setName(((BTSCorpusObject)
						// o).getName() + "#!");
						// has to be accessed through emf
						OCLTest test = new OCLTest();
						test.validate((BTSCorpusObject) o);
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});

		treeViewer = new TreeViewer(composite);
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.getTree().setLayout(new GridLayout());

		loadInput();

		parent.layout();
		// parent.pack();
		// tryRunnable();
	}

	private void loadInput()
	{
		Job job = new Job("load input")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor)
			{
				final TreeNodeWrapper root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();

				// input = new WritableList(nodes, TreeNodeWrapper.class);
				// Set the writeableList as input for the viewer
				// Create sample data
				final List<BTSCorpusObject> obs = corpusNavigatorController.getRootBTSCorpusObjects(queryResultMap,
						treeViewer, root, BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
				List<TreeNodeWrapper> nodes = loadNodes(obs);
				root.getChildren().addAll(nodes);

				// If you want to update the UI
				sync.asyncExec(new Runnable()
				{
					@Override
					public void run()
					{
						loadTree(root);
					}
				});
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();

		// if (obs != null && !obs.isEmpty())
		// {
		// loadChildren(loadNodes(obs), false);
		// }

	}

	private void loadChildren(final List<TreeNodeWrapper> parents, boolean includeGrandChildren)
	{
		Job job = new Job("load children")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor)
			{
				final List<TreeNodeWrapper> grandChildren = new Vector<>();
				for (final TreeNodeWrapper parent : parents)
				{
					final List<BTSCorpusObject> children = corpusNavigatorController.findChildren(
							(BTSCorpusObject) parent.getObject(), queryResultMap, treeViewer, parent,
							BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
					// If you want to update the UI
					sync.asyncExec(new Runnable()
					{

						@Override
						public void run()
						{
							System.out.println("add children" + children.size());
							for (BTSObject o : children)
							{
								TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
								tn.setObject(o);
								addTooHolderMap(o, tn);
								tn.setParent(parent);
								// grandChildren.add(tn);
								parent.getChildren().add(tn);
							}
							parent.setChildrenLoaded(true);

						}

					});
				}
				// loadChildren(grandChildren, false);

				return Status.OK_STATUS;
			}
		};
		// Start the Job
		job.schedule();
		refreshTreeViewer(null);
	}

	private void addTooHolderMap(BTSObject o, TreeNodeWrapper tn)
	{
		List<TreeNodeWrapper> list = viewHolderMap.get(((BTSDBBaseObject) o).get_id());
		if (list == null)
		{
			list = new Vector<TreeNodeWrapper>(1);
		}
		if (!list.contains(tn))
		{
			list.add(tn);
		}
		viewHolderMap.put(((BTSDBBaseObject) o).get_id(), list);

	}

	private void loadTree(TreeNodeWrapper root)
	{
		//
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(factory);

		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);

		treeViewer.setUseHashlookup(true);
		selectionListener = new ISelectionChangedListener()
		{

			private BTSCorpusObject selectedTreeObject;

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selection = (StructuredSelection) event.getSelection();
				System.out.println(event.getSelection());
				if (selection.getFirstElement() != null && selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
					if (tn.getObject() != null)
					{
						BTSObject o = (BTSObject) tn.getObject();
						if (o instanceof BTSCorpusObject)
						{
							selectedTreeObject = (BTSCorpusObject) o;
	
						}
						if (!tn.isChildrenLoaded())
						{
							List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(1);
							parents.add(tn);
							loadChildren(parents, false);
						}
						selectionService.setSelection(o);
						eventBroker.send("viewcommunication/syncEvent", o);
					}

				}
			}
		};

		treeViewer.setSorter(new ViewerSorter()
		{
			@Override
			public int compare(Viewer viewer, Object e1, Object e2)
			{
				if (e1 instanceof BTSObject && e2 instanceof BTSObject)
				{
					BTSObject b1 = (BTSObject) e1;
					BTSObject b2 = (BTSObject) e2;
					if (b1.getName() != null)
					{
						if (b2.getName() != null)
						{
							return ((BTSObject) e1).getName().compareTo(((BTSObject) e2).getName());
						} else
							return -1;
					}

				}
				return 0;
			}
		});

		treeViewer.setInput(root);
		treeViewer.addSelectionChangedListener(selectionListener);

	}

	private List<TreeNodeWrapper> loadNodes(List<BTSCorpusObject> obs)
	{
		List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(obs.size());
		for (BTSObject o : obs)
		{
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
			tn.setObject(o);
			nodes.add(tn);
		}
		return nodes;
	}

	@PreDestroy
	public void preDestroy()
	{
		// TODO Your code here
	}

	@Focus
	public void onFocus()
	{
		// TODO Your code here
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/*") BTSObject object)
	{
		if (object instanceof BTSTextCorpus)
		{
			addObjectToInput(object);
		} else if (object instanceof BTSTCObject && selection != null
				&& ((TreeNodeWrapper) selection.getFirstElement()).getObject() instanceof BTSCorpusObject)
		{
			corpusNavigatorController.addRelation((BTSCorpusObject) object, "partOf",
					(TreeNodeWrapper) selection.getFirstElement());

			refreshTreeViewer((BTSTCObject) object);

		}
	}

	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/async") Object object)
	{
		if (object instanceof BTSTextCorpus)
		{
			sync.asyncExec(new Runnable()
			{
				public void run()
				{
					// if (input.contains(object))
					// {
					// input.remove(object);
					// input.add(object);
					//
					// } else
					// {
					// input.add(object);
					// }
				}
			});
		} else if (object instanceof BTSTCObject && selection != null
				&& selection.getFirstElement() instanceof BTSCorpusObject)
		{
			// corpusNavigatorController.addRelation((BTSCorpusObject) object,
			// "partOf",
			// (BTSCorpusObject) selection.getFirstElement(), input);

			refreshTreeViewer((BTSTCObject) object);
		} else if (object instanceof BTSTCObject)
		{
			refreshTreeViewer((BTSTCObject) object);
		} else if (object instanceof BTSModelUpdateNotification)
		{
			if (corpusNavigatorController.handleModelUpdate((BTSModelUpdateNotification) object, queryResultMap,
					viewHolderMap))
			{
				refreshTreeViewer((BTSTCObject) ((BTSModelUpdateNotification) object).getObject());
			}

		}
	}

	private void refreshTreeViewer(final BTSTCObject object)
	{
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				treeViewer.removeSelectionChangedListener(selectionListener);
				for (TreePath path : treeViewer.getExpandedTreePaths())
					System.out.println(path.getLastSegment());
				treeViewer.refresh();
				treeViewer.addSelectionChangedListener(selectionListener);
			}
		});

	}

	private void addObjectToInput(final BTSObject object)
	{
		sync.asyncExec(new Runnable()
		{
			@Override
			public void run()
			{
				// input.add(object);
			}
		});

	}

}