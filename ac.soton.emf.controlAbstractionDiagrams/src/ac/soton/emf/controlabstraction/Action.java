/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.Action#getConditions <em>Conditions</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Action#getAction <em>Action</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Action#getTarget <em>Target</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Action#getErrors <em>Errors</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.Action#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.emf.controlabstraction.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAction_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAction_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.Action#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAction_Target()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Component getTarget();

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.emf.controlabstraction.Error}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAction_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ac.soton.emf.controlabstraction.Error> getErrors();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(State)
	 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage#getAction_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getResult();

	/**
	 * Sets the value of the '{@link ac.soton.emf.controlabstraction.Action#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(State value);

} // Action
