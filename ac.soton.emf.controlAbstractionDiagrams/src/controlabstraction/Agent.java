/**
 */
package controlabstraction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link controlabstraction.Agent#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see controlabstraction.ControlabstractionPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends AbstractNamedElement, AbstractStatefulEntity {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(Action)
	 * @see controlabstraction.ControlabstractionPackage#getAgent_Actions()
	 * @model containment="true"
	 * @generated
	 */
	Action getActions();

	/**
	 * Sets the value of the '{@link controlabstraction.Agent#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Action value);

} // Agent
