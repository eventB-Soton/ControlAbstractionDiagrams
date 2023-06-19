/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction.impl;

import ac.soton.emf.controlabstraction.Action;
import ac.soton.emf.controlabstraction.Assumption;
import ac.soton.emf.controlabstraction.Component;
import ac.soton.emf.controlabstraction.ControlabstractionPackage;
import ac.soton.emf.controlabstraction.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.ActionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.ActionImpl#getReliances <em>Reliances</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.ActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.ActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.ActionImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends AbstractNamedElementImpl implements Action {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<State> conditions;

	/**
	 * The cached value of the '{@link #getReliances() <em>Reliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> reliances;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Component target;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<ac.soton.emf.controlabstraction.Error> errors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlabstractionPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getConditions() {
		if (conditions == null) {
			conditions = new EObjectResolvingEList<State>(State.class, this, ControlabstractionPackage.ACTION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assumption> getReliances() {
		if (reliances == null) {
			reliances = new EObjectResolvingEList<Assumption>(Assumption.class, this, ControlabstractionPackage.ACTION__RELIANCES);
		}
		return reliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlabstractionPackage.ACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Component)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlabstractionPackage.ACTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Component newTarget) {
		Component oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlabstractionPackage.ACTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ac.soton.emf.controlabstraction.Error> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<ac.soton.emf.controlabstraction.Error>(ac.soton.emf.controlabstraction.Error.class, this, ControlabstractionPackage.ACTION__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlabstractionPackage.ACTION__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlabstractionPackage.ACTION__CONDITIONS:
				return getConditions();
			case ControlabstractionPackage.ACTION__RELIANCES:
				return getReliances();
			case ControlabstractionPackage.ACTION__ACTION:
				return getAction();
			case ControlabstractionPackage.ACTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ControlabstractionPackage.ACTION__ERRORS:
				return getErrors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlabstractionPackage.ACTION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends State>)newValue);
				return;
			case ControlabstractionPackage.ACTION__RELIANCES:
				getReliances().clear();
				getReliances().addAll((Collection<? extends Assumption>)newValue);
				return;
			case ControlabstractionPackage.ACTION__ACTION:
				setAction((String)newValue);
				return;
			case ControlabstractionPackage.ACTION__TARGET:
				setTarget((Component)newValue);
				return;
			case ControlabstractionPackage.ACTION__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends ac.soton.emf.controlabstraction.Error>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ControlabstractionPackage.ACTION__CONDITIONS:
				getConditions().clear();
				return;
			case ControlabstractionPackage.ACTION__RELIANCES:
				getReliances().clear();
				return;
			case ControlabstractionPackage.ACTION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case ControlabstractionPackage.ACTION__TARGET:
				setTarget((Component)null);
				return;
			case ControlabstractionPackage.ACTION__ERRORS:
				getErrors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ControlabstractionPackage.ACTION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case ControlabstractionPackage.ACTION__RELIANCES:
				return reliances != null && !reliances.isEmpty();
			case ControlabstractionPackage.ACTION__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case ControlabstractionPackage.ACTION__TARGET:
				return target != null;
			case ControlabstractionPackage.ACTION__ERRORS:
				return errors != null && !errors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
