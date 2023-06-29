/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction.util;

import ac.soton.emf.controlabstraction.AbstractActiveEntity;
import ac.soton.emf.controlabstraction.AbstractEntity;
import ac.soton.emf.controlabstraction.AbstractNamedElement;
import ac.soton.emf.controlabstraction.AbstractStatefulEntity;
import ac.soton.emf.controlabstraction.Action;
import ac.soton.emf.controlabstraction.Actor;
import ac.soton.emf.controlabstraction.Agent;
import ac.soton.emf.controlabstraction.Component;
import ac.soton.emf.controlabstraction.Condition;
import ac.soton.emf.controlabstraction.ControlabstractionPackage;
import ac.soton.emf.controlabstraction.Failure;
import ac.soton.emf.controlabstraction.State;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ac.soton.emf.controlabstraction.ControlabstractionPackage
 * @generated
 */
public class ControlabstractionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlabstractionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlabstractionSwitch() {
		if (modelPackage == null) {
			modelPackage = ControlabstractionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ControlabstractionPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseAbstractStatefulEntity(component);
				if (result == null) result = caseAbstractEntity(component);
				if (result == null) result = caseAbstractNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseAbstractActiveEntity(agent);
				if (result == null) result = caseAbstractEntity(agent);
				if (result == null) result = caseAbstractNamedElement(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseAbstractNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseAbstractNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ABSTRACT_STATEFUL_ENTITY: {
				AbstractStatefulEntity abstractStatefulEntity = (AbstractStatefulEntity)theEObject;
				T result = caseAbstractStatefulEntity(abstractStatefulEntity);
				if (result == null) result = caseAbstractEntity(abstractStatefulEntity);
				if (result == null) result = caseAbstractNamedElement(abstractStatefulEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ABSTRACT_NAMED_ELEMENT: {
				AbstractNamedElement abstractNamedElement = (AbstractNamedElement)theEObject;
				T result = caseAbstractNamedElement(abstractNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseAbstractActiveEntity(actor);
				if (result == null) result = caseAbstractEntity(actor);
				if (result == null) result = caseAbstractNamedElement(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ERROR: {
				ac.soton.emf.controlabstraction.Error error = (ac.soton.emf.controlabstraction.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = caseAbstractNamedElement(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.FAILURE: {
				Failure failure = (Failure)theEObject;
				T result = caseFailure(failure);
				if (result == null) result = caseAbstractNamedElement(failure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.SYSTEM: {
				ac.soton.emf.controlabstraction.System system = (ac.soton.emf.controlabstraction.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseAbstractNamedElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ABSTRACT_ENTITY: {
				AbstractEntity abstractEntity = (AbstractEntity)theEObject;
				T result = caseAbstractEntity(abstractEntity);
				if (result == null) result = caseAbstractNamedElement(abstractEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.ABSTRACT_ACTIVE_ENTITY: {
				AbstractActiveEntity abstractActiveEntity = (AbstractActiveEntity)theEObject;
				T result = caseAbstractActiveEntity(abstractActiveEntity);
				if (result == null) result = caseAbstractEntity(abstractActiveEntity);
				if (result == null) result = caseAbstractNamedElement(abstractActiveEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlabstractionPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseAbstractNamedElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Stateful Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Stateful Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStatefulEntity(AbstractStatefulEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(ac.soton.emf.controlabstraction.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure(Failure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(ac.soton.emf.controlabstraction.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntity(AbstractEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Active Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Active Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActiveEntity(AbstractActiveEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ControlabstractionSwitch
