/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.bbaw.bts.btsmodel.BtsmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory
 * @model kind="package"
 * @generated
 */
public interface BtsCorpusModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btsCorpusModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://btsCorpusModel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btsCorpusModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsCorpusModelPackage eINSTANCE = org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl <em>BTS Corpus Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSCorpusObject()
	 * @generated
	 */
	int BTS_CORPUS_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__ID = BtsmodelPackage.BTS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REVISIONS = BtsmodelPackage.BTS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__STATE = BtsmodelPackage.BTS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REVISION_STATE = BtsmodelPackage.BTS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__VISIBILITY = BtsmodelPackage.BTS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__REV = BtsmodelPackage.BTS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PROJECT = BtsmodelPackage.BTS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__LOCKED = BtsmodelPackage.BTS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__UPDATERS = BtsmodelPackage.BTS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__READERS = BtsmodelPackage.BTS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__DELETED = BtsmodelPackage.BTS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CONFLICTING_REVS = BtsmodelPackage.BTS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__DB_COLLECTION_KEY = BtsmodelPackage.BTS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__SORT_KEY = BtsmodelPackage.BTS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__NAME = BtsmodelPackage.BTS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__TYPE = BtsmodelPackage.BTS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__SUBTYPE = BtsmodelPackage.BTS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CODE = BtsmodelPackage.BTS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__RELATIONS = BtsmodelPackage.BTS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__TEMP_SORT_KEY = BtsmodelPackage.BTS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__PASSPORT = BtsmodelPackage.BTS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__CORPUS_PREFIX = BtsmodelPackage.BTS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT__WORK_PHASE = BtsmodelPackage.BTS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS Corpus Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT_FEATURE_COUNT = BtsmodelPackage.BTS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Corpus Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_OBJECT_OPERATION_COUNT = BtsmodelPackage.BTS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTCObjectImpl <em>BTSTC Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTCObjectImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTCObject()
	 * @generated
	 */
	int BTSTC_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTSTC Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTSTC Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTSTC_OBJECT_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextImpl <em>BTS Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSText()
	 * @generated
	 */
	int BTS_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT__TEXT_CONTENT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl <em>BTS Lemma Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSLemmaEntry()
	 * @generated
	 */
	int BTS_LEMMA_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__IGNORE = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__WORDS = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY__TRANSLATIONS = BTS_CORPUS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTS Lemma Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Lemma Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_ENTRY_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl <em>BTS Passport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassport()
	 * @generated
	 */
	int BTS_PASSPORT = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Bibliography</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__BIBLIOGRAPHY = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Wb Slips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__WB_SLIPS = 3;

	/**
	 * The feature id for the '<em><b>Wb Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__WB_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__PROVENANCE = 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__CHILDREN = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT__DESCRIPTIONS = 8;

	/**
	 * The number of structural features of the '<em>BTS Passport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>BTS Passport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAnnotationImpl <em>BTS Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAnnotationImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSAnnotation()
	 * @generated
	 */
	int BTS_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_ANNOTATION_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryImpl <em>BTS Passport Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassportEntry()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__ID = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__PROVIDER = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__COMMENT = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__TYPE = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__VALUE = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__CHILDREN = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__LABEL = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__NAME = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY__KEY = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_FEATURE_COUNT = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>BTS Passport Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_OPERATION_COUNT = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryGroupImpl <em>BTS Passport Entry Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryGroupImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassportEntryGroup()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY_GROUP = 6;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__ID = BTS_PASSPORT_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__PROVIDER = BTS_PASSPORT_ENTRY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__COMMENT = BTS_PASSPORT_ENTRY__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__TYPE = BTS_PASSPORT_ENTRY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__VALUE = BTS_PASSPORT_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__CHILDREN = BTS_PASSPORT_ENTRY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__LABEL = BTS_PASSPORT_ENTRY__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__NAME = BTS_PASSPORT_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__KEY = BTS_PASSPORT_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP__ITEMS = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP_FEATURE_COUNT = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BTS Passport Entry Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_GROUP_OPERATION_COUNT = BTS_PASSPORT_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextCorpusImpl <em>BTS Text Corpus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextCorpusImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextCorpus()
	 * @generated
	 */
	int BTS_TEXT_CORPUS = 7;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS__HEADER = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Text Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Text Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CORPUS_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSImageImpl <em>BTS Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSImageImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSImage()
	 * @generated
	 */
	int BTS_IMAGE = 8;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE__MEDIA_TYPE = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Get Attachement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE___GET_ATTACHEMENT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>BTS Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_IMAGE_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusHeaderImpl <em>BTS Corpus Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusHeaderImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSCorpusHeader()
	 * @generated
	 */
	int BTS_CORPUS_HEADER = 9;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__AUTHOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__PROJECT_ID = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER__PROJECT_NAME = 2;

	/**
	 * The number of structural features of the '<em>BTS Corpus Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BTS Corpus Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_CORPUS_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSThsEntryImpl <em>BTS Ths Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSThsEntryImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSThsEntry()
	 * @generated
	 */
	int BTS_THS_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PROPERTY_CHANGE_SUPPORT = BTS_CORPUS_OBJECT__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__ID = BTS_CORPUS_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REVISIONS = BTS_CORPUS_OBJECT__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__STATE = BTS_CORPUS_OBJECT__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REVISION_STATE = BTS_CORPUS_OBJECT__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__VISIBILITY = BTS_CORPUS_OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__REV = BTS_CORPUS_OBJECT__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PROJECT = BTS_CORPUS_OBJECT__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__LOCKED = BTS_CORPUS_OBJECT__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__UPDATERS = BTS_CORPUS_OBJECT__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__READERS = BTS_CORPUS_OBJECT__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__DELETED = BTS_CORPUS_OBJECT__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CONFLICTING_REVS = BTS_CORPUS_OBJECT__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__DB_COLLECTION_KEY = BTS_CORPUS_OBJECT__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__SORT_KEY = BTS_CORPUS_OBJECT__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__NAME = BTS_CORPUS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__TYPE = BTS_CORPUS_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__SUBTYPE = BTS_CORPUS_OBJECT__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CODE = BTS_CORPUS_OBJECT__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__RELATIONS = BTS_CORPUS_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__TEMP_SORT_KEY = BTS_CORPUS_OBJECT__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__EXTERNAL_REFERENCES = BTS_CORPUS_OBJECT__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__PASSPORT = BTS_CORPUS_OBJECT__PASSPORT;

	/**
	 * The feature id for the '<em><b>Corpus Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__CORPUS_PREFIX = BTS_CORPUS_OBJECT__CORPUS_PREFIX;

	/**
	 * The feature id for the '<em><b>Work Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY__WORK_PHASE = BTS_CORPUS_OBJECT__WORK_PHASE;

	/**
	 * The number of structural features of the '<em>BTS Ths Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY_FEATURE_COUNT = BTS_CORPUS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_CORPUS_OBJECT___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The number of operations of the '<em>BTS Ths Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_THS_ENTRY_OPERATION_COUNT = BTS_CORPUS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextContentImpl <em>BTS Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextContentImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextContent()
	 * @generated
	 */
	int BTS_TEXT_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Text Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CONTENT__TEXT_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>BTS Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BTS Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl <em>BTS Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSWord()
	 * @generated
	 */
	int BTS_WORD = 13;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__TRANSLATION = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>WType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__WTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__LKEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flex Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__FLEX_CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>WChar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__WCHAR = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__VALUE = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD__GRAPHICS = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>BTS Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_WORD_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems <em>BTS Text Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextItems()
	 * @generated
	 */
	int BTS_TEXT_ITEMS = 14;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Text Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Text Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_ITEMS_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl <em>BTS Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSGraphic()
	 * @generated
	 */
	int BTS_GRAPHIC = 15;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__ID = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Inner Sentence Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__INNER_SENTENCE_ORDER = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__CODE = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__REFERENCE = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC__IGNORED = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BTS Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC_FEATURE_COUNT = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BTS Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_GRAPHIC_OPERATION_COUNT = BtsmodelPackage.BTS_IDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl <em>BTS Senctence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSSenctence()
	 * @generated
	 */
	int BTS_SENCTENCE = 16;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Sentence Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__SENTENCE_ITEMS = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE__TRANSLATION = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BTS Senctence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Senctence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENCTENCE_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSMarkerImpl <em>BTS Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSMarkerImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSMarker()
	 * @generated
	 */
	int BTS_MARKER = 17;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER__VALUE = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_MARKER_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem <em>BTS Sentence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSSentenceItem()
	 * @generated
	 */
	int BTS_SENTENCE_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_SENTENCE_ITEM_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAmbivalenceImpl <em>BTS Ambivalence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAmbivalenceImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSAmbivalence()
	 * @generated
	 */
	int BTS_AMBIVALENCE = 19;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE__CASES = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Ambivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Ambivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaCaseImpl <em>BTS Lemma Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaCaseImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSLemmaCase()
	 * @generated
	 */
	int BTS_LEMMA_CASE = 20;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PROPERTY_CHANGE_SUPPORT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__REVISIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__REVISION_STATE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__VISIBILITY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__REV = BtsmodelPackage.BTS_REFERENCABLE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PROJECT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__LOCKED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__UPDATERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__READERS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__DELETED = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__CONFLICTING_REVS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__DB_COLLECTION_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__NAME = BtsmodelPackage.BTS_REFERENCABLE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__TYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SUBTYPE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__CODE = BtsmodelPackage.BTS_REFERENCABLE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__RELATIONS = BtsmodelPackage.BTS_REFERENCABLE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__TEMP_SORT_KEY = BtsmodelPackage.BTS_REFERENCABLE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__EXTERNAL_REFERENCES = BtsmodelPackage.BTS_REFERENCABLE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__COMMENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PARENT = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__PARENT_ID = BtsmodelPackage.BTS_REFERENCABLE_ITEM__PARENT_ID;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE__SCENARIO = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTS Lemma Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE_FEATURE_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BtsmodelPackage.BTS_REFERENCABLE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Lemma Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_LEMMA_CASE_OPERATION_COUNT = BtsmodelPackage.BTS_REFERENCABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl <em>BTS Text Sentence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextSentenceItem()
	 * @generated
	 */
	int BTS_TEXT_SENTENCE_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Property Change Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT = BTS_SENTENCE_ITEM__PROPERTY_CHANGE_SUPPORT;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__ID = BTS_SENTENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REVISIONS = BTS_SENTENCE_ITEM__REVISIONS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__STATE = BTS_SENTENCE_ITEM__STATE;

	/**
	 * The feature id for the '<em><b>Revision State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REVISION_STATE = BTS_SENTENCE_ITEM__REVISION_STATE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__VISIBILITY = BTS_SENTENCE_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__REV = BTS_SENTENCE_ITEM__REV;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PROJECT = BTS_SENTENCE_ITEM__PROJECT;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__LOCKED = BTS_SENTENCE_ITEM__LOCKED;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__UPDATERS = BTS_SENTENCE_ITEM__UPDATERS;

	/**
	 * The feature id for the '<em><b>Readers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__READERS = BTS_SENTENCE_ITEM__READERS;

	/**
	 * The feature id for the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__DELETED = BTS_SENTENCE_ITEM__DELETED;

	/**
	 * The feature id for the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__CONFLICTING_REVS = BTS_SENTENCE_ITEM__CONFLICTING_REVS;

	/**
	 * The feature id for the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__DB_COLLECTION_KEY = BTS_SENTENCE_ITEM__DB_COLLECTION_KEY;

	/**
	 * The feature id for the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__SORT_KEY = BTS_SENTENCE_ITEM__SORT_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__NAME = BTS_SENTENCE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__TYPE = BTS_SENTENCE_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__SUBTYPE = BTS_SENTENCE_ITEM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__CODE = BTS_SENTENCE_ITEM__CODE;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__RELATIONS = BTS_SENTENCE_ITEM__RELATIONS;

	/**
	 * The feature id for the '<em><b>Temp Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__TEMP_SORT_KEY = BTS_SENTENCE_ITEM__TEMP_SORT_KEY;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__EXTERNAL_REFERENCES = BTS_SENTENCE_ITEM__EXTERNAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__COMMENT = BTS_SENTENCE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PARENT = BTS_SENTENCE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM__PARENT_ID = BTS_SENTENCE_ITEM__PARENT_ID;

	/**
	 * The number of structural features of the '<em>BTS Text Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM_FEATURE_COUNT = BTS_SENTENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_SENTENCE_ITEM___ADD_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Property Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER = BTS_SENTENCE_ITEM___REMOVE_PROPERTY_CHANGE_LISTENER__PROPERTYCHANGELISTENER;


	/**
	 * The number of operations of the '<em>BTS Text Sentence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_TEXT_SENTENCE_ITEM_OPERATION_COUNT = BTS_SENTENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSAmbivalenceItem()
	 * @generated
	 */
	int BTS_AMBIVALENCE_ITEM = 22;

	/**
	 * The number of structural features of the '<em>BTS Ambivalence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BTS Ambivalence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_AMBIVALENCE_ITEM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl <em>BTS Passport Entry Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl
	 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassportEntryItem()
	 * @generated
	 */
	int BTS_PASSPORT_ENTRY_ITEM = 23;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__ID = BTS_PASSPORT_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__PROVIDER = BTS_PASSPORT_ENTRY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__COMMENT = BTS_PASSPORT_ENTRY__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__TYPE = BTS_PASSPORT_ENTRY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__VALUE = BTS_PASSPORT_ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__CHILDREN = BTS_PASSPORT_ENTRY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__LABEL = BTS_PASSPORT_ENTRY__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__NAME = BTS_PASSPORT_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__KEY = BTS_PASSPORT_ENTRY__KEY;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__SUBTYPE = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timespan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__TIMESPAN = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM__TRANSLATION = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>BTS Passport Entry Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM_FEATURE_COUNT = BTS_PASSPORT_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>BTS Passport Entry Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTS_PASSPORT_ENTRY_ITEM_OPERATION_COUNT = BTS_PASSPORT_ENTRY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject <em>BTS Corpus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Corpus Object</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject
	 * @generated
	 */
	EClass getBTSCorpusObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getPassport <em>Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passport</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getPassport()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EReference getBTSCorpusObject_Passport();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getCorpusPrefix <em>Corpus Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corpus Prefix</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getCorpusPrefix()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EAttribute getBTSCorpusObject_CorpusPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getWorkPhase <em>Work Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Phase</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject#getWorkPhase()
	 * @see #getBTSCorpusObject()
	 * @generated
	 */
	EAttribute getBTSCorpusObject_WorkPhase();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject <em>BTSTC Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTSTC Object</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject
	 * @generated
	 */
	EClass getBTSTCObject();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSText <em>BTS Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSText
	 * @generated
	 */
	EClass getBTSText();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSText#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Content</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSText#getTextContent()
	 * @see #getBTSText()
	 * @generated
	 */
	EReference getBTSText_TextContent();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry <em>BTS Lemma Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Lemma Entry</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry
	 * @generated
	 */
	EClass getBTSLemmaEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#isIgnore()
	 * @see #getBTSLemmaEntry()
	 * @generated
	 */
	EAttribute getBTSLemmaEntry_Ignore();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getWords()
	 * @see #getBTSLemmaEntry()
	 * @generated
	 */
	EReference getBTSLemmaEntry_Words();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translations</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry#getTranslations()
	 * @see #getBTSLemmaEntry()
	 * @generated
	 */
	EReference getBTSLemmaEntry_Translations();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport <em>BTS Passport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport
	 * @generated
	 */
	EClass getBTSPassport();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getProtocol()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliography</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getBibliography()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Bibliography();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDate()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getWbSlips <em>Wb Slips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wb Slips</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getWbSlips()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_WbSlips();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getWbFolder <em>Wb Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wb Folder</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getWbFolder()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_WbFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provenance</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getProvenance()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getChildren()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getComment()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EAttribute getBTSPassport_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDescriptions()
	 * @see #getBTSPassport()
	 * @generated
	 */
	EReference getBTSPassport_Descriptions();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation <em>BTS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Annotation</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation
	 * @generated
	 */
	EClass getBTSAnnotation();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup <em>BTS Passport Entry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry Group</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup
	 * @generated
	 */
	EClass getBTSPassportEntryGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup#getItems()
	 * @see #getBTSPassportEntryGroup()
	 * @generated
	 */
	EReference getBTSPassportEntryGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus <em>BTS Text Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Corpus</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus
	 * @generated
	 */
	EClass getBTSTextCorpus();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus#getHeader()
	 * @see #getBTSTextCorpus()
	 * @generated
	 */
	EReference getBTSTextCorpus_Header();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSImage <em>BTS Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Image</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSImage
	 * @generated
	 */
	EClass getBTSImage();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSImage#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSImage#getMediaType()
	 * @see #getBTSImage()
	 * @generated
	 */
	EAttribute getBTSImage_MediaType();

	/**
	 * Returns the meta object for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSImage#getAttachement() <em>Get Attachement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachement</em>' operation.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSImage#getAttachement()
	 * @generated
	 */
	EOperation getBTSImage__GetAttachement();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader <em>BTS Corpus Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Corpus Header</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader
	 * @generated
	 */
	EClass getBTSCorpusHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getAuthorName()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectId()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader#getProjectName()
	 * @see #getBTSCorpusHeader()
	 * @generated
	 */
	EAttribute getBTSCorpusHeader_ProjectName();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry <em>BTS Ths Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ths Entry</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry
	 * @generated
	 */
	EClass getBTSThsEntry();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent <em>BTS Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Content</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent
	 * @generated
	 */
	EClass getBTSTextContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent#getTextItems <em>Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Items</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent#getTextItems()
	 * @see #getBTSTextContent()
	 * @generated
	 */
	EReference getBTSTextContent_TextItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry <em>BTS Passport Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry
	 * @generated
	 */
	EClass getBTSPassportEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getProvider()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getComment()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getType()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getValue()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getChildren()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EReference getBTSPassportEntry_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getLabel()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EReference getBTSPassportEntry_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getName()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry#getKey()
	 * @see #getBTSPassportEntry()
	 * @generated
	 */
	EAttribute getBTSPassportEntry_Key();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord <em>BTS Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Word</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord
	 * @generated
	 */
	EClass getBTSWord();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getTranslation()
	 * @see #getBTSWord()
	 * @generated
	 */
	EReference getBTSWord_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWType <em>WType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WType</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWType()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_WType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLType <em>LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LType</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLType()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_LType();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLKey <em>LKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LKey</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getLKey()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_LKey();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getFlexCode <em>Flex Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flex Code</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getFlexCode()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_FlexCode();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWChar <em>WChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WChar</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getWChar()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_WChar();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getValue()
	 * @see #getBTSWord()
	 * @generated
	 */
	EAttribute getBTSWord_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getGraphics <em>Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphics</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSWord#getGraphics()
	 * @see #getBTSWord()
	 * @generated
	 */
	EReference getBTSWord_Graphics();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems <em>BTS Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Items</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems
	 * @generated
	 */
	EClass getBTSTextItems();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic <em>BTS Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Graphic</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic
	 * @generated
	 */
	EClass getBTSGraphic();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#getInnerSentenceOrder <em>Inner Sentence Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Sentence Order</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#getInnerSentenceOrder()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_InnerSentenceOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#getCode()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#getReference()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#isIgnored <em>Ignored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignored</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic#isIgnored()
	 * @see #getBTSGraphic()
	 * @generated
	 */
	EAttribute getBTSGraphic_Ignored();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence <em>BTS Senctence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Senctence</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence
	 * @generated
	 */
	EClass getBTSSenctence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence#getSentenceItems <em>Sentence Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentence Items</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence#getSentenceItems()
	 * @see #getBTSSenctence()
	 * @generated
	 */
	EReference getBTSSenctence_SentenceItems();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence#getTranslation()
	 * @see #getBTSSenctence()
	 * @generated
	 */
	EReference getBTSSenctence_Translation();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSMarker <em>BTS Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Marker</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSMarker
	 * @generated
	 */
	EClass getBTSMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSMarker#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSMarker#getValue()
	 * @see #getBTSMarker()
	 * @generated
	 */
	EAttribute getBTSMarker_Value();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem <em>BTS Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Sentence Item</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem
	 * @generated
	 */
	EClass getBTSSentenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence <em>BTS Ambivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ambivalence</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence
	 * @generated
	 */
	EClass getBTSAmbivalence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence#getCases()
	 * @see #getBTSAmbivalence()
	 * @generated
	 */
	EReference getBTSAmbivalence_Cases();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase <em>BTS Lemma Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Lemma Case</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase
	 * @generated
	 */
	EClass getBTSLemmaCase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase#getScenario()
	 * @see #getBTSLemmaCase()
	 * @generated
	 */
	EReference getBTSLemmaCase_Scenario();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextSentenceItem <em>BTS Text Sentence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Text Sentence Item</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextSentenceItem
	 * @generated
	 */
	EClass getBTSTextSentenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Ambivalence Item</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem
	 * @generated
	 */
	EClass getBTSAmbivalenceItem();

	/**
	 * Returns the meta object for class '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem <em>BTS Passport Entry Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTS Passport Entry Item</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem
	 * @generated
	 */
	EClass getBTSPassportEntryItem();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getSubtype()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EAttribute getBTSPassportEntryItem_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getSubValue <em>Sub Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Value</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getSubValue()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EAttribute getBTSPassportEntryItem_SubValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External References</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getExternalReferences()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getTimespan <em>Timespan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timespan</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getTimespan()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_Timespan();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getDescription()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation</em>'.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem#getTranslation()
	 * @see #getBTSPassportEntryItem()
	 * @generated
	 */
	EReference getBTSPassportEntryItem_Translation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtsCorpusModelFactory getBtsCorpusModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl <em>BTS Corpus Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusObjectImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSCorpusObject()
		 * @generated
		 */
		EClass BTS_CORPUS_OBJECT = eINSTANCE.getBTSCorpusObject();

		/**
		 * The meta object literal for the '<em><b>Passport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_CORPUS_OBJECT__PASSPORT = eINSTANCE.getBTSCorpusObject_Passport();

		/**
		 * The meta object literal for the '<em><b>Corpus Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_OBJECT__CORPUS_PREFIX = eINSTANCE.getBTSCorpusObject_CorpusPrefix();

		/**
		 * The meta object literal for the '<em><b>Work Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_OBJECT__WORK_PHASE = eINSTANCE.getBTSCorpusObject_WorkPhase();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTCObjectImpl <em>BTSTC Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTCObjectImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTCObject()
		 * @generated
		 */
		EClass BTSTC_OBJECT = eINSTANCE.getBTSTCObject();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextImpl <em>BTS Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSText()
		 * @generated
		 */
		EClass BTS_TEXT = eINSTANCE.getBTSText();

		/**
		 * The meta object literal for the '<em><b>Text Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT__TEXT_CONTENT = eINSTANCE.getBTSText_TextContent();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl <em>BTS Lemma Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaEntryImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSLemmaEntry()
		 * @generated
		 */
		EClass BTS_LEMMA_ENTRY = eINSTANCE.getBTSLemmaEntry();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_LEMMA_ENTRY__IGNORE = eINSTANCE.getBTSLemmaEntry_Ignore();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LEMMA_ENTRY__WORDS = eINSTANCE.getBTSLemmaEntry_Words();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LEMMA_ENTRY__TRANSLATIONS = eINSTANCE.getBTSLemmaEntry_Translations();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl <em>BTS Passport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassport()
		 * @generated
		 */
		EClass BTS_PASSPORT = eINSTANCE.getBTSPassport();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__PROTOCOL = eINSTANCE.getBTSPassport_Protocol();

		/**
		 * The meta object literal for the '<em><b>Bibliography</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__BIBLIOGRAPHY = eINSTANCE.getBTSPassport_Bibliography();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__DATE = eINSTANCE.getBTSPassport_Date();

		/**
		 * The meta object literal for the '<em><b>Wb Slips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__WB_SLIPS = eINSTANCE.getBTSPassport_WbSlips();

		/**
		 * The meta object literal for the '<em><b>Wb Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__WB_FOLDER = eINSTANCE.getBTSPassport_WbFolder();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__PROVENANCE = eINSTANCE.getBTSPassport_Provenance();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__CHILDREN = eINSTANCE.getBTSPassport_Children();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT__COMMENT = eINSTANCE.getBTSPassport_Comment();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT__DESCRIPTIONS = eINSTANCE.getBTSPassport_Descriptions();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAnnotationImpl <em>BTS Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAnnotationImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSAnnotation()
		 * @generated
		 */
		EClass BTS_ANNOTATION = eINSTANCE.getBTSAnnotation();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryGroupImpl <em>BTS Passport Entry Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryGroupImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassportEntryGroup()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY_GROUP = eINSTANCE.getBTSPassportEntryGroup();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_GROUP__ITEMS = eINSTANCE.getBTSPassportEntryGroup_Items();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextCorpusImpl <em>BTS Text Corpus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextCorpusImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextCorpus()
		 * @generated
		 */
		EClass BTS_TEXT_CORPUS = eINSTANCE.getBTSTextCorpus();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT_CORPUS__HEADER = eINSTANCE.getBTSTextCorpus_Header();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSImageImpl <em>BTS Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSImageImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSImage()
		 * @generated
		 */
		EClass BTS_IMAGE = eINSTANCE.getBTSImage();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_IMAGE__MEDIA_TYPE = eINSTANCE.getBTSImage_MediaType();

		/**
		 * The meta object literal for the '<em><b>Get Attachement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BTS_IMAGE___GET_ATTACHEMENT = eINSTANCE.getBTSImage__GetAttachement();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusHeaderImpl <em>BTS Corpus Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSCorpusHeaderImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSCorpusHeader()
		 * @generated
		 */
		EClass BTS_CORPUS_HEADER = eINSTANCE.getBTSCorpusHeader();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__AUTHOR_NAME = eINSTANCE.getBTSCorpusHeader_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__PROJECT_ID = eINSTANCE.getBTSCorpusHeader_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_CORPUS_HEADER__PROJECT_NAME = eINSTANCE.getBTSCorpusHeader_ProjectName();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSThsEntryImpl <em>BTS Ths Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSThsEntryImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSThsEntry()
		 * @generated
		 */
		EClass BTS_THS_ENTRY = eINSTANCE.getBTSThsEntry();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextContentImpl <em>BTS Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextContentImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextContent()
		 * @generated
		 */
		EClass BTS_TEXT_CONTENT = eINSTANCE.getBTSTextContent();

		/**
		 * The meta object literal for the '<em><b>Text Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_TEXT_CONTENT__TEXT_ITEMS = eINSTANCE.getBTSTextContent_TextItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryImpl <em>BTS Passport Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassportEntry()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY = eINSTANCE.getBTSPassportEntry();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__PROVIDER = eINSTANCE.getBTSPassportEntry_Provider();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__COMMENT = eINSTANCE.getBTSPassportEntry_Comment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__TYPE = eINSTANCE.getBTSPassportEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__VALUE = eINSTANCE.getBTSPassportEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY__CHILDREN = eINSTANCE.getBTSPassportEntry_Children();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY__LABEL = eINSTANCE.getBTSPassportEntry_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__NAME = eINSTANCE.getBTSPassportEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY__KEY = eINSTANCE.getBTSPassportEntry_Key();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl <em>BTS Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSWordImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSWord()
		 * @generated
		 */
		EClass BTS_WORD = eINSTANCE.getBTSWord();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORD__TRANSLATION = eINSTANCE.getBTSWord_Translation();

		/**
		 * The meta object literal for the '<em><b>WType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__WTYPE = eINSTANCE.getBTSWord_WType();

		/**
		 * The meta object literal for the '<em><b>LType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__LTYPE = eINSTANCE.getBTSWord_LType();

		/**
		 * The meta object literal for the '<em><b>LKey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__LKEY = eINSTANCE.getBTSWord_LKey();

		/**
		 * The meta object literal for the '<em><b>Flex Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__FLEX_CODE = eINSTANCE.getBTSWord_FlexCode();

		/**
		 * The meta object literal for the '<em><b>WChar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__WCHAR = eINSTANCE.getBTSWord_WChar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_WORD__VALUE = eINSTANCE.getBTSWord_Value();

		/**
		 * The meta object literal for the '<em><b>Graphics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_WORD__GRAPHICS = eINSTANCE.getBTSWord_Graphics();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems <em>BTS Text Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextItems()
		 * @generated
		 */
		EClass BTS_TEXT_ITEMS = eINSTANCE.getBTSTextItems();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl <em>BTS Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSGraphicImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSGraphic()
		 * @generated
		 */
		EClass BTS_GRAPHIC = eINSTANCE.getBTSGraphic();

		/**
		 * The meta object literal for the '<em><b>Inner Sentence Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__INNER_SENTENCE_ORDER = eINSTANCE.getBTSGraphic_InnerSentenceOrder();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__CODE = eINSTANCE.getBTSGraphic_Code();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__REFERENCE = eINSTANCE.getBTSGraphic_Reference();

		/**
		 * The meta object literal for the '<em><b>Ignored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_GRAPHIC__IGNORED = eINSTANCE.getBTSGraphic_Ignored();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl <em>BTS Senctence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSSenctenceImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSSenctence()
		 * @generated
		 */
		EClass BTS_SENCTENCE = eINSTANCE.getBTSSenctence();

		/**
		 * The meta object literal for the '<em><b>Sentence Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_SENCTENCE__SENTENCE_ITEMS = eINSTANCE.getBTSSenctence_SentenceItems();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_SENCTENCE__TRANSLATION = eINSTANCE.getBTSSenctence_Translation();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSMarkerImpl <em>BTS Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSMarkerImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSMarker()
		 * @generated
		 */
		EClass BTS_MARKER = eINSTANCE.getBTSMarker();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_MARKER__VALUE = eINSTANCE.getBTSMarker_Value();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem <em>BTS Sentence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSSentenceItem()
		 * @generated
		 */
		EClass BTS_SENTENCE_ITEM = eINSTANCE.getBTSSentenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAmbivalenceImpl <em>BTS Ambivalence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSAmbivalenceImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSAmbivalence()
		 * @generated
		 */
		EClass BTS_AMBIVALENCE = eINSTANCE.getBTSAmbivalence();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_AMBIVALENCE__CASES = eINSTANCE.getBTSAmbivalence_Cases();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaCaseImpl <em>BTS Lemma Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSLemmaCaseImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSLemmaCase()
		 * @generated
		 */
		EClass BTS_LEMMA_CASE = eINSTANCE.getBTSLemmaCase();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_LEMMA_CASE__SCENARIO = eINSTANCE.getBTSLemmaCase_Scenario();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl <em>BTS Text Sentence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSTextSentenceItemImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSTextSentenceItem()
		 * @generated
		 */
		EClass BTS_TEXT_SENTENCE_ITEM = eINSTANCE.getBTSTextSentenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem <em>BTS Ambivalence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSAmbivalenceItem()
		 * @generated
		 */
		EClass BTS_AMBIVALENCE_ITEM = eINSTANCE.getBTSAmbivalenceItem();

		/**
		 * The meta object literal for the '{@link org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl <em>BTS Passport Entry Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BTSPassportEntryItemImpl
		 * @see org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelPackageImpl#getBTSPassportEntryItem()
		 * @generated
		 */
		EClass BTS_PASSPORT_ENTRY_ITEM = eINSTANCE.getBTSPassportEntryItem();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY_ITEM__SUBTYPE = eINSTANCE.getBTSPassportEntryItem_Subtype();

		/**
		 * The meta object literal for the '<em><b>Sub Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE = eINSTANCE.getBTSPassportEntryItem_SubValue();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES = eINSTANCE.getBTSPassportEntryItem_ExternalReferences();

		/**
		 * The meta object literal for the '<em><b>Timespan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__TIMESPAN = eINSTANCE.getBTSPassportEntryItem_Timespan();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION = eINSTANCE.getBTSPassportEntryItem_Description();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTS_PASSPORT_ENTRY_ITEM__TRANSLATION = eINSTANCE.getBTSPassportEntryItem_Translation();

	}

} //BtsCorpusModelPackage
