/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.Actor#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Agent {
	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.emf.controlabstraction.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getActor_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

} // Actor
