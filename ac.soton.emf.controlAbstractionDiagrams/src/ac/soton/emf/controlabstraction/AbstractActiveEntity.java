/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;

import org.eclipse.emf.common.util.EList;


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
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.emf.controlabstraction.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAbstractActiveEntity_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // AbstractActiveEntity
