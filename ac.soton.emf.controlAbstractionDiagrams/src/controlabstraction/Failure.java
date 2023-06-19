/**
 */
package controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controlabstraction.Failure#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see controlabstraction.ControlabstractionPackage#getFailure()
 * @model
 * @generated
 */
public interface Failure extends AbstractNamedElement, State {
	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation</em>' attribute.
	 * @see #setMitigation(String)
	 * @see controlabstraction.ControlabstractionPackage#getFailure_Mitigation()
	 * @model
	 * @generated
	 */
	String getMitigation();

	/**
	 * Sets the value of the '{@link controlabstraction.Failure#getMitigation <em>Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation</em>' attribute.
	 * @see #getMitigation()
	 * @generated
	 */
	void setMitigation(String value);

} // Failure
