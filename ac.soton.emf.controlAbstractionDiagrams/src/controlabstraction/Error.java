/**
 */
package controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controlabstraction.Error#getType <em>Type</em>}</li>
 *   <li>{@link controlabstraction.Error#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @see controlabstraction.ControlabstractionPackage#getError()
 * @model
 * @generated
 */
public interface Error extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link controlabstraction.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see controlabstraction.ErrorType
	 * @see #setType(ErrorType)
	 * @see controlabstraction.ControlabstractionPackage#getError_Type()
	 * @model
	 * @generated
	 */
	ErrorType getType();

	/**
	 * Sets the value of the '{@link controlabstraction.Error#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see controlabstraction.ErrorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ErrorType value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(Failure)
	 * @see controlabstraction.ControlabstractionPackage#getError_Failure()
	 * @model
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link controlabstraction.Error#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

} // Error
