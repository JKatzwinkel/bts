function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSTextCorpus' && doc.state == 'terminated'){
		emit(null, doc);
	}
}