/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.Error#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Error#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getError()
 * @model
 * @generated
 */
public interface Error extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.soton.emf.controlabstraction.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ac.soton.emf.controlabstraction.ErrorType
	 * @see #setType(ErrorType)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getError_Type()
	 * @model
	 * @generated
	 */
	ErrorType getType();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.Error#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ac.soton.emf.controlabstraction.ErrorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ErrorType value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(ThreatCondition)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getError_Failure()
	 * @model
	 * @generated
	 */
	ThreatCondition getFailure();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.Error#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(ThreatCondition value);

} // Error
