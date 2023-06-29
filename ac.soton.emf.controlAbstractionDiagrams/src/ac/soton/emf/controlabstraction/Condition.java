/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.Condition#getState <em>State</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Condition#isAssumption <em>Assumption</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getCondition_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.Condition#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' attribute.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getCondition_Assumption()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isAssumption();

} // Condition
