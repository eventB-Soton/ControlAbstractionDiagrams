/**
 */
package controlabstraction;

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
 *   <li>{@link controlabstraction.Action#getConditions <em>Conditions</em>}</li>
 *   <li>{@link controlabstraction.Action#getReliances <em>Reliances</em>}</li>
 *   <li>{@link controlabstraction.Action#getAction <em>Action</em>}</li>
 *   <li>{@link controlabstraction.Action#getTarget <em>Target</em>}</li>
 *   <li>{@link controlabstraction.Action#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see controlabstraction.ControlabstractionPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference list.
	 * The list contents are of type {@link controlabstraction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference list.
	 * @see controlabstraction.ControlabstractionPackage#getAction_Conditions()
	 * @model
	 * @generated
	 */
	EList<State> getConditions();

	/**
	 * Returns the value of the '<em><b>Reliances</b></em>' reference list.
	 * The list contents are of type {@link controlabstraction.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliances</em>' reference list.
	 * @see controlabstraction.ControlabstractionPackage#getAction_Reliances()
	 * @model
	 * @generated
	 */
	EList<Assumption> getReliances();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see controlabstraction.ControlabstractionPackage#getAction_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link controlabstraction.Action#getAction <em>Action</em>}' attribute.
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
	 * @see #setTarget(Component)
	 * @see controlabstraction.ControlabstractionPackage#getAction_Target()
	 * @model
	 * @generated
	 */
	Component getTarget();

	/**
	 * Sets the value of the '{@link controlabstraction.Action#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Component value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link controlabstraction.Error}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see controlabstraction.ControlabstractionPackage#getAction_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<controlabstraction.Error> getErrors();

} // Action
