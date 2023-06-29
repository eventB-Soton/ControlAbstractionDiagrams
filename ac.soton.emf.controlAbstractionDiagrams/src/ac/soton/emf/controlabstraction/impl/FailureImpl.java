/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction.impl;

import ac.soton.emf.controlabstraction.ControlabstractionPackage;
import ac.soton.emf.controlabstraction.Failure;
import ac.soton.emf.controlabstraction.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.FailureImpl#getMitigation <em>Mitigation</em>}</li>
 *   <li>{@link ac.soton.emf.controlabstraction.impl.FailureImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureImpl extends AbstractNamedElementImpl implements Failure {
	/**
	 * The default value of the '{@link #getMitigation() <em>Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected static final String MITIGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected String mitigation = MITIGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlabstractionPackage.Literals.FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMitigation() {
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitigation(String newMitigation) {
		String oldMitigation = mitigation;
		mitigation = newMitigation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlabstractionPackage.FAILURE__MITIGATION, oldMitigation, mitigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectResolvingEList<State>(State.class, this, ControlabstractionPackage.FAILURE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlabstractionPackage.FAILURE__MITIGATION:
				return getMitigation();
			case ControlabstractionPackage.FAILURE__STATES:
				return getStates();
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
			case ControlabstractionPackage.FAILURE__MITIGATION:
				setMitigation((String)newValue);
				return;
			case ControlabstractionPackage.FAILURE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case ControlabstractionPackage.FAILURE__MITIGATION:
				setMitigation(MITIGATION_EDEFAULT);
				return;
			case ControlabstractionPackage.FAILURE__STATES:
				getStates().clear();
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
			case ControlabstractionPackage.FAILURE__MITIGATION:
				return MITIGATION_EDEFAULT == null ? mitigation != null : !MITIGATION_EDEFAULT.equals(mitigation);
			case ControlabstractionPackage.FAILURE__STATES:
				return states != null && !states.isEmpty();
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
		result.append(" (mitigation: ");
		result.append(mitigation);
		result.append(')');
		return result.toString();
	}

} //FailureImpl
