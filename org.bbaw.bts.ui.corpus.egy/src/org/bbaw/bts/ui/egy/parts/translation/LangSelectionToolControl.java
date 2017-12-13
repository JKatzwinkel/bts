package org.bbaw.bts.ui.egy.parts.translation;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.egy.parts.EgyTextTranslationPart;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class LangSelectionToolControl {
	
	/** The resource provider. */
	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private EPartService partService;
	private Combo combo;
	private Composite parent;

	// XXX better have global language preference in addition to lemma label display? 
	@Inject
	@Preference(value = BTSEGYUIConstants.PREF_LEMMATIZER_LABEL_LANG, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private String preferredTranslationLanguage;


	@Inject
	public LangSelectionToolControl() {
		
	}


	@PostConstruct
	public void createGui(Composite parent) {
		this.parent = parent;
		this.parent.setLayout(new GridLayout(2, false));
		Label l = new Label(parent, SWT.NONE);
		l.setToolTipText("Set Language of Translation");
		l.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LOCALE));
		l.setLayoutData(new GridData(SWT.RIGHT, SWT.BEGINNING, false, false, 1,
				1));
		((GridData) l.getLayoutData()).verticalIndent = 2;
		((GridData) l.getLayoutData()).horizontalIndent = 5;

		combo = new Combo(parent, SWT.READ_ONLY);
		combo.setItems(BTSCoreConstants.LANGS);
		combo.setLayoutData(new GridData(SWT.RIGHT, SWT.BEGINNING, false,
				false, 1, 1));
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String lang = combo.getItem(combo.getSelectionIndex());
				loadTranslation(lang);
			}
		});
		combo.select(combo.indexOf(preferredTranslationLanguage));
	}


	protected void loadTranslation(String lang) {
		MPart part = partService.getActivePart();
		if (part.getObject() instanceof EgyTextTranslationPart)
		{
			EgyTextTranslationPart translationPart = (EgyTextTranslationPart) part.getObject();
			translationPart.setLanguage(lang);
			combo.select(combo.indexOf(lang));
		}
		
	}

}