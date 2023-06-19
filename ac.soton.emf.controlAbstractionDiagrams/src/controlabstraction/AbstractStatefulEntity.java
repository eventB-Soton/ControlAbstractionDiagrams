/**
 */
package controlabstraction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Stateful Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controlabstraction.AbstractStatefulEntity#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see controlabstraction.ControlabstractionPackage#getAbstractStatefulEntity()
 * @model
 * @generated
 */
public interface AbstractStatefulEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link controlabstraction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see controlabstraction.ControlabstractionPackage#getAbstractStatefulEntity_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // AbstractStatefulEntity
