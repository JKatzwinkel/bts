package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSAnnotationAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.annotation";

	public static final String TYPE_RUBRUM = "org.bbaw.bts.ui.text.modelAnnotation.annotation.rubrum";
	public static final String TYPE_RUBRUM_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.annotation.rubrum.highlighted";
	public static final String TYPE_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.annotation.highlighted";
	
//	public BTSAnnotationAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference,
//			BTSAnnotation annotation) {
//		super(model, interTextReference,annotation);
//	}
//
//	public BTSAnnotationAnnotation(XtextDocument document, String typeRubrum,
//			Issue issue, BTSObject object, BTSAnnotation modelObject) {
//		super(TYPE, document, issue, modelObject);
////		this.setAnnotation(btsAnnotation);
//	}
	
	public BTSAnnotationAnnotation(String type, IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSAnnotation btsAnnotation) {
		super(type, document, issue, modelObject);
		this.setRelatingObject(btsAnnotation);
	}

	public BTSAnnotationAnnotation(IXtextDocument document, String type,
			Issue issue, BTSIdentifiableItem modelObject,
			BTSAnnotation btsAnnotation) {
		super(type, document, issue, modelObject);
		this.setRelatingObject(btsAnnotation);
	}

	public BTSAnnotationAnnotation(String type, BTSIdentifiableItem item,
			BTSInterTextReference interTextReference, BTSAnnotation relatingObject) {
		super(type, item, interTextReference, relatingObject);
	}

	@Override
	public String getType() {
		return super.getType();
	}
	
	public void setHighlighted(boolean highlighted)
	{
		if (highlighted)
		{
			if (!getType().endsWith("highlighted")) {
				cachedType = getType();
				setType(getType() + ".highlighted");
			}
		} else {
			setType(cachedType);
		}
	}
	
	
}