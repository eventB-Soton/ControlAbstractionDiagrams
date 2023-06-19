/**
 */
package controlabstraction.impl;

import controlabstraction.ControlabstractionPackage;
import controlabstraction.ErrorType;
import controlabstraction.Failure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link controlabstraction.impl.ErrorImpl#getType <em>Type</em>}</li>
 *   <li>{@link controlabstraction.impl.ErrorImpl#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorImpl extends AbstractNamedElementImpl implements controlabstraction.Error {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorType TYPE_EDEFAULT = ErrorType.NOTOCCURRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ErrorType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected Failure failure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlabstractionPackage.Literals.ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ErrorType newType) {
		ErrorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlabstractionPackage.ERROR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailure() {
		if (failure != null && failure.eIsProxy()) {
			InternalEObject oldFailure = (InternalEObject)failure;
			failure = (Failure)eResolveProxy(oldFailure);
			if (failure != oldFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlabstractionPackage.ERROR__FAILURE, oldFailure, failure));
			}
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(Failure newFailure) {
		Failure oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlabstractionPackage.ERROR__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlabstractionPackage.ERROR__TYPE:
				return getType();
			case ControlabstractionPackage.ERROR__FAILURE:
				if (resolve) return getFailure();
				return basicGetFailure();
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
			case ControlabstractionPackage.ERROR__TYPE:
				setType((ErrorType)newValue);
				return;
			case ControlabstractionPackage.ERROR__FAILURE:
				setFailure((Failure)newValue);
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
			case ControlabstractionPackage.ERROR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ControlabstractionPackage.ERROR__FAILURE:
				setFailure((Failure)null);
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
			case ControlabstractionPackage.ERROR__TYPE:
				return type != TYPE_EDEFAULT;
			case ControlabstractionPackage.ERROR__FAILURE:
				return failure != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ErrorImpl
