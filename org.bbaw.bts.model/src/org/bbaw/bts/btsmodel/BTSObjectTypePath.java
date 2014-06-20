/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Object Type Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObjectTypePath#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSObjectTypePath#getReferencedTypesPath <em>Referenced Types Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObjectTypePath()
 * @model abstract="true"
 * @generated
 */
public interface BTSObjectTypePath extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.ObjectTypePathEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObjectTypePath_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectTypePathEntry> getChildren();

	/**
	 * Returns the value of the '<em><b>Referenced Types Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Types Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Types Path</em>' reference.
	 * @see #setReferencedTypesPath(BTSObjectTypePathRoot)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSObjectTypePath_ReferencedTypesPath()
	 * @model
	 * @generated
	 */
	BTSObjectTypePathRoot getReferencedTypesPath();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSObjectTypePath#getReferencedTypesPath <em>Referenced Types Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Types Path</em>' reference.
	 * @see #getReferencedTypesPath()
	 * @generated
	 */
	void setReferencedTypesPath(BTSObjectTypePathRoot value);

} // BTSObjectTypePath
