/**
 */
package controlabstraction.impl;

import controlabstraction.ControlabstractionPackage;
import controlabstraction.Failure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link controlabstraction.impl.FailureImpl#getMitigation <em>Mitigation</em>}</li>
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
	public String getMitigation() {
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlabstractionPackage.FAILURE__MITIGATION:
				return getMitigation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlabstractionPackage.FAILURE__MITIGATION:
				setMitigation((String)newValue);
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
