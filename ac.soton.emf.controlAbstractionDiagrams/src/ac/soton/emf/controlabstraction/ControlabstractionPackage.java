/**
 * Copyright Text	Copyright © 2023-2023 - University of Southampton....
 */
package ac.soton.emf.controlabstraction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.emf.controlabstraction.ControlabstractionFactory
 * @model kind="package"
 * @generated
 */
public interface ControlabstractionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controlabstraction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/controlabstraction/2023";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controlabstraction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlabstractionPackage eINSTANCE = ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.AbstractNamedElementImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractNamedElement()
	 * @generated
	 */
	int ABSTRACT_NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Abstract Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.AbstractEntityImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractEntity()
	 * @generated
	 */
	int ABSTRACT_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Abstract Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.AbstractStatefulEntityImpl <em>Abstract Stateful Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.AbstractStatefulEntityImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractStatefulEntity()
	 * @generated
	 */
	int ABSTRACT_STATEFUL_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEFUL_ENTITY__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEFUL_ENTITY__DESCRIPTION = ABSTRACT_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEFUL_ENTITY__STATES = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Stateful Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEFUL_ENTITY_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Stateful Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEFUL_ENTITY_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.ComponentImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ABSTRACT_STATEFUL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = ABSTRACT_STATEFUL_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATES = ABSTRACT_STATEFUL_ENTITY__STATES;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ABSTRACT_STATEFUL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ABSTRACT_STATEFUL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.AbstractActiveEntityImpl <em>Abstract Active Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.AbstractActiveEntityImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractActiveEntity()
	 * @generated
	 */
	int ABSTRACT_ACTIVE_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVE_ENTITY__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVE_ENTITY__DESCRIPTION = ABSTRACT_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVE_ENTITY__ACTIONS = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Active Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVE_ENTITY_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Active Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVE_ENTITY_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.AgentImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = ABSTRACT_ACTIVE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DESCRIPTION = ABSTRACT_ACTIVE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACTIONS = ABSTRACT_ACTIVE_ENTITY__ACTIONS;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = ABSTRACT_ACTIVE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = ABSTRACT_ACTIVE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.ActionImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONDITIONS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ERRORS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RESULT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.StateImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.ActorImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ABSTRACT_ACTIVE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = ABSTRACT_ACTIVE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTIONS = ABSTRACT_ACTIVE_ENTITY__ACTIONS;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ABSTRACT_ACTIVE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = ABSTRACT_ACTIVE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.ErrorImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__TYPE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__FAILURE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.FailureImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mitigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__MITIGATION = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__STATES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.SystemImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENTITIES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PURPOSE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FAILURES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.impl.ConditionImpl
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = ABSTRACT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ASSUMPTION = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = ABSTRACT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.emf.controlabstraction.ErrorType <em>Error Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.emf.controlabstraction.ErrorType
	 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see ac.soton.emf.controlabstraction.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see ac.soton.emf.controlabstraction.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ac.soton.emf.controlabstraction.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.emf.controlabstraction.Action#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see ac.soton.emf.controlabstraction.Action#getConditions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Conditions();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.emf.controlabstraction.Action#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ac.soton.emf.controlabstraction.Action#getTarget()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.emf.controlabstraction.Action#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see ac.soton.emf.controlabstraction.Action#getErrors()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Errors();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.emf.controlabstraction.Action#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see ac.soton.emf.controlabstraction.Action#getResult()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Result();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ac.soton.emf.controlabstraction.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.AbstractStatefulEntity <em>Abstract Stateful Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Stateful Entity</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractStatefulEntity
	 * @generated
	 */
	EClass getAbstractStatefulEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.emf.controlabstraction.AbstractStatefulEntity#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractStatefulEntity#getStates()
	 * @see #getAbstractStatefulEntity()
	 * @generated
	 */
	EReference getAbstractStatefulEntity_States();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Element</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractNamedElement
	 * @generated
	 */
	EClass getAbstractNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.emf.controlabstraction.AbstractNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractNamedElement#getName()
	 * @see #getAbstractNamedElement()
	 * @generated
	 */
	EAttribute getAbstractNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.emf.controlabstraction.AbstractNamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractNamedElement#getDescription()
	 * @see #getAbstractNamedElement()
	 * @generated
	 */
	EAttribute getAbstractNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see ac.soton.emf.controlabstraction.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see ac.soton.emf.controlabstraction.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.emf.controlabstraction.Error#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ac.soton.emf.controlabstraction.Error#getType()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Type();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.emf.controlabstraction.Error#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure</em>'.
	 * @see ac.soton.emf.controlabstraction.Error#getFailure()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_Failure();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see ac.soton.emf.controlabstraction.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.emf.controlabstraction.Failure#getMitigation <em>Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitigation</em>'.
	 * @see ac.soton.emf.controlabstraction.Failure#getMitigation()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_Mitigation();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.emf.controlabstraction.Failure#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see ac.soton.emf.controlabstraction.Failure#getStates()
	 * @see #getFailure()
	 * @generated
	 */
	EReference getFailure_States();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see ac.soton.emf.controlabstraction.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.emf.controlabstraction.System#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see ac.soton.emf.controlabstraction.System#getEntities()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Entities();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.emf.controlabstraction.System#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see ac.soton.emf.controlabstraction.System#getPurpose()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.emf.controlabstraction.System#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failures</em>'.
	 * @see ac.soton.emf.controlabstraction.System#getFailures()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Failures();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.AbstractEntity <em>Abstract Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entity</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractEntity
	 * @generated
	 */
	EClass getAbstractEntity();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.AbstractActiveEntity <em>Abstract Active Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Active Entity</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractActiveEntity
	 * @generated
	 */
	EClass getAbstractActiveEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.emf.controlabstraction.AbstractActiveEntity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ac.soton.emf.controlabstraction.AbstractActiveEntity#getActions()
	 * @see #getAbstractActiveEntity()
	 * @generated
	 */
	EReference getAbstractActiveEntity_Actions();

	/**
	 * Returns the meta object for class '{@link ac.soton.emf.controlabstraction.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ac.soton.emf.controlabstraction.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.emf.controlabstraction.Condition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see ac.soton.emf.controlabstraction.Condition#getState()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_State();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.emf.controlabstraction.Condition#isAssumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumption</em>'.
	 * @see ac.soton.emf.controlabstraction.Condition#isAssumption()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Assumption();

	/**
	 * Returns the meta object for enum '{@link ac.soton.emf.controlabstraction.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Type</em>'.
	 * @see ac.soton.emf.controlabstraction.ErrorType
	 * @generated
	 */
	EEnum getErrorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlabstractionFactory getControlabstractionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.ComponentImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.AgentImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.ActionImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONDITIONS = eINSTANCE.getAction_Conditions();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TARGET = eINSTANCE.getAction_Target();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ERRORS = eINSTANCE.getAction_Errors();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RESULT = eINSTANCE.getAction_Result();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.StateImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.AbstractStatefulEntityImpl <em>Abstract Stateful Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.AbstractStatefulEntityImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractStatefulEntity()
		 * @generated
		 */
		EClass ABSTRACT_STATEFUL_ENTITY = eINSTANCE.getAbstractStatefulEntity();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATEFUL_ENTITY__STATES = eINSTANCE.getAbstractStatefulEntity_States();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.AbstractNamedElementImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractNamedElement()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_ELEMENT = eINSTANCE.getAbstractNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_ELEMENT__NAME = eINSTANCE.getAbstractNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getAbstractNamedElement_Description();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.ActorImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.ErrorImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__TYPE = eINSTANCE.getError_Type();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__FAILURE = eINSTANCE.getError_Failure();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.FailureImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '<em><b>Mitigation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__MITIGATION = eINSTANCE.getFailure_Mitigation();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE__STATES = eINSTANCE.getFailure_States();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.SystemImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENTITIES = eINSTANCE.getSystem_Entities();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__PURPOSE = eINSTANCE.getSystem_Purpose();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__FAILURES = eINSTANCE.getSystem_Failures();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.AbstractEntityImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractEntity()
		 * @generated
		 */
		EClass ABSTRACT_ENTITY = eINSTANCE.getAbstractEntity();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.AbstractActiveEntityImpl <em>Abstract Active Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.AbstractActiveEntityImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getAbstractActiveEntity()
		 * @generated
		 */
		EClass ABSTRACT_ACTIVE_ENTITY = eINSTANCE.getAbstractActiveEntity();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTIVE_ENTITY__ACTIONS = eINSTANCE.getAbstractActiveEntity_Actions();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.impl.ConditionImpl
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__STATE = eINSTANCE.getCondition_State();

		/**
		 * The meta object literal for the '<em><b>Assumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ASSUMPTION = eINSTANCE.getCondition_Assumption();

		/**
		 * The meta object literal for the '{@link ac.soton.emf.controlabstraction.ErrorType <em>Error Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.emf.controlabstraction.ErrorType
		 * @see ac.soton.emf.controlabstraction.impl.ControlabstractionPackageImpl#getErrorType()
		 * @generated
		 */
		EEnum ERROR_TYPE = eINSTANCE.getErrorType();

	}

} //ControlabstractionPackage
