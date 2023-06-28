/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Stateful Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.AbstractStatefulEntity#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAbstractStatefulEntity()
 * @model abstract="true"
 * @generated
 */
public interface AbstractStatefulEntity extends AbstractEntity {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.emf.controlabstraction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAbstractStatefulEntity_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // AbstractStatefulEntity
