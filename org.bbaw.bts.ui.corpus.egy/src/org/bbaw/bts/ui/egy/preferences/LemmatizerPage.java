package org.bbaw.bts.ui.egy.preferences;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.ui.IWorkbench;

public class LemmatizerPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public LemmatizerPage() {
		super(FLAT);
	}


	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub

		addField(new IntegerFieldEditor(BTSEGYUIConstants.PREF_LEMMATIZER_FELXION_DEFAULT, 
				"Default Inflexion", 
				getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(BTSEGYUIConstants.PREF_LEMMATIZER_AUTO_LEMMA_PROPOSAL_SELECTION, 
				"Automatically select first lemma proposal", 
				getFieldEditorParent()));
		
		String[][] languageOptions = new String[BTSCoreConstants.LANGS.length][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < BTSCoreConstants.LANGS.length; j++) {
				languageOptions[j][i] = BTSCoreConstants.LANGS[j];
			}
		}
		
		addField(new ComboFieldEditor(BTSEGYUIConstants.PREF_LEMMATIZER_LABEL_LANG, 
				"Lemma Item Label Language", 
				languageOptions, 
				getFieldEditorParent()));

	}
	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}
}
