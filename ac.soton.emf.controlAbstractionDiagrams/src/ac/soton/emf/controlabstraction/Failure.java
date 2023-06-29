/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.Failure#getMitigation <em>Mitigation</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Failure#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getFailure()
 * @model
 * @generated
 */
public interface Failure extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation</em>' attribute.
	 * @see #setMitigation(String)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getFailure_Mitigation()
	 * @model
	 * @generated
	 */
	String getMitigation();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.Failure#getMitigation <em>Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation</em>' attribute.
	 * @see #getMitigation()
	 * @generated
	 */
	void setMitigation(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.emf.controlabstraction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getFailure_States()
	 * @model
	 * @generated
	 */
	EList<State> getStates();

} // Failure
