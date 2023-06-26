/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Active Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.AbstractActiveEntity#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAbstractActiveEntity()
 * @model abstract="true"
 * @generated
 */
public interface AbstractActiveEntity extends AbstractEntity {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(Action)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAbstractActiveEntity_Actions()
	 * @model containment="true"
	 * @generated
	 */
	Action getActions();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.AbstractActiveEntity#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Action value);

} // AbstractActiveEntity
