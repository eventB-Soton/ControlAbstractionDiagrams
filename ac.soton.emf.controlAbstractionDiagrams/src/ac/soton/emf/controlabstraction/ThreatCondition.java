/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.ThreatCondition#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getThreatCondition()
 * @model
 * @generated
 */
public interface ThreatCondition extends AbstractNamedElement, State {
	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation</em>' attribute.
	 * @see #setMitigation(String)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getThreatCondition_Mitigation()
	 * @model
	 * @generated
	 */
	String getMitigation();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.ThreatCondition#getMitigation <em>Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation</em>' attribute.
	 * @see #getMitigation()
	 * @generated
	 */
	void setMitigation(String value);

} // ThreatCondition
