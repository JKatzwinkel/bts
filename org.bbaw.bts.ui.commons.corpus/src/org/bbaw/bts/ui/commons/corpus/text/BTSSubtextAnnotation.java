package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSSubtextAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.subtext";
	public static final String TYPE_HIGHLIGHTED = TYPE + ".highlighted";


	public BTSSubtextAnnotation(String type, BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSText subtext) {
		super(type, model, interTextReference, subtext);
	}

	public BTSSubtextAnnotation(String type, IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSText subtext) {
		super(type, document, issue, modelObject);
		this.setRelatingObject(subtext);
	}


}