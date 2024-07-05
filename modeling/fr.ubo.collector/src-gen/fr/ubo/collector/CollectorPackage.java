/**
 */
package fr.ubo.collector;

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
 * @see fr.ubo.collector.CollectorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CollectorPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ubo.collector";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectorPackage eINSTANCE = fr.ubo.collector.impl.CollectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.DataCollectorImpl <em>Data Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.DataCollectorImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getDataCollector()
	 * @generated
	 */
	int DATA_COLLECTOR = 0;

	/**
	 * The feature id for the '<em><b>Drone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__DRONE = 0;

	/**
	 * The feature id for the '<em><b>Pub Broker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__PUB_BROKER = 1;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__PUBLISHERS = 2;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__SUBSCRIBERS = 3;

	/**
	 * The feature id for the '<em><b>Sub Broker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__SUB_BROKER = 4;

	/**
	 * The number of structural features of the '<em>Data Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.NamedElementImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.DroneImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensors Drone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SENSORS_DRONE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.SensorImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Measured Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_MEASURED_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.MeasuredVariableImpl <em>Measured Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.MeasuredVariableImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getMeasuredVariable()
	 * @generated
	 */
	int MEASURED_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE__UNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measured Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measured Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.PublisherImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Published Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PUBLISHED_MEASURES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PERIOD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.SubscriberImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__PERIOD = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__AGGREGATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitored Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__MONITORED_MEASURE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.AddressableElementImpl <em>Addressable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.AddressableElementImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getAddressableElement()
	 * @generated
	 */
	int ADDRESSABLE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Addressable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Addressable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.PubBrokerImpl <em>Pub Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.PubBrokerImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getPubBroker()
	 * @generated
	 */
	int PUB_BROKER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_BROKER__NAME = ADDRESSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_BROKER__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Log Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_BROKER__LOG_PATH = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pub Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_BROKER_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pub Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_BROKER_OPERATION_COUNT = ADDRESSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.SubBrokerImpl <em>Sub Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.SubBrokerImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getSubBroker()
	 * @generated
	 */
	int SUB_BROKER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BROKER__NAME = ADDRESSABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BROKER__ID = ADDRESSABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Configuration Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BROKER__CONFIGURATION_PATH = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BROKER_FEATURE_COUNT = ADDRESSABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_BROKER_OPERATION_COUNT = ADDRESSABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.EndpointImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 10;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.impl.TcpIpEndpointImpl <em>Tcp Ip Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.impl.TcpIpEndpointImpl
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getTcpIpEndpoint()
	 * @generated
	 */
	int TCP_IP_ENDPOINT = 11;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IP_ENDPOINT__IP_ADDRESS = ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IP_ENDPOINT__PORT = ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tcp Ip Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IP_ENDPOINT_FEATURE_COUNT = ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tcp Ip Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IP_ENDPOINT_OPERATION_COUNT = ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.MeasurementDataUnit <em>Measurement Data Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.MeasurementDataUnit
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getMeasurementDataUnit()
	 * @generated
	 */
	int MEASUREMENT_DATA_UNIT = 12;

	/**
	 * The meta object id for the '{@link fr.ubo.collector.Aggregation <em>Aggregation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ubo.collector.Aggregation
	 * @see fr.ubo.collector.impl.CollectorPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 13;

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.DataCollector <em>Data Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collector</em>'.
	 * @see fr.ubo.collector.DataCollector
	 * @generated
	 */
	EClass getDataCollector();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ubo.collector.DataCollector#getDrone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drone</em>'.
	 * @see fr.ubo.collector.DataCollector#getDrone()
	 * @see #getDataCollector()
	 * @generated
	 */
	EReference getDataCollector_Drone();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ubo.collector.DataCollector#getPubBroker <em>Pub Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pub Broker</em>'.
	 * @see fr.ubo.collector.DataCollector#getPubBroker()
	 * @see #getDataCollector()
	 * @generated
	 */
	EReference getDataCollector_PubBroker();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.collector.DataCollector#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see fr.ubo.collector.DataCollector#getPublishers()
	 * @see #getDataCollector()
	 * @generated
	 */
	EReference getDataCollector_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.collector.DataCollector#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see fr.ubo.collector.DataCollector#getSubscribers()
	 * @see #getDataCollector()
	 * @generated
	 */
	EReference getDataCollector_Subscribers();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ubo.collector.DataCollector#getSubBroker <em>Sub Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Broker</em>'.
	 * @see fr.ubo.collector.DataCollector#getSubBroker()
	 * @see #getDataCollector()
	 * @generated
	 */
	EReference getDataCollector_SubBroker();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.ubo.collector.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ubo.collector.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see fr.ubo.collector.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.collector.Drone#getSensorsDrone <em>Sensors Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors Drone</em>'.
	 * @see fr.ubo.collector.Drone#getSensorsDrone()
	 * @see #getDrone()
	 * @generated
	 */
	EReference getDrone_SensorsDrone();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.ubo.collector.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.collector.Sensor#getSensorMeasuredVariables <em>Sensor Measured Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Measured Variables</em>'.
	 * @see fr.ubo.collector.Sensor#getSensorMeasuredVariables()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorMeasuredVariables();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.MeasuredVariable <em>Measured Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Variable</em>'.
	 * @see fr.ubo.collector.MeasuredVariable
	 * @generated
	 */
	EClass getMeasuredVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.MeasuredVariable#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.ubo.collector.MeasuredVariable#getUnit()
	 * @see #getMeasuredVariable()
	 * @generated
	 */
	EAttribute getMeasuredVariable_Unit();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see fr.ubo.collector.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the reference list '{@link fr.ubo.collector.Publisher#getPublishedMeasures <em>Published Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Published Measures</em>'.
	 * @see fr.ubo.collector.Publisher#getPublishedMeasures()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_PublishedMeasures();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.Publisher#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.ubo.collector.Publisher#getPeriod()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Period();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see fr.ubo.collector.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.Subscriber#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.ubo.collector.Subscriber#getPeriod()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_Period();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.Subscriber#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see fr.ubo.collector.Subscriber#getAggregation()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_Aggregation();

	/**
	 * Returns the meta object for the reference '{@link fr.ubo.collector.Subscriber#getMonitoredMeasure <em>Monitored Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitored Measure</em>'.
	 * @see fr.ubo.collector.Subscriber#getMonitoredMeasure()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_MonitoredMeasure();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.PubBroker <em>Pub Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pub Broker</em>'.
	 * @see fr.ubo.collector.PubBroker
	 * @generated
	 */
	EClass getPubBroker();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.PubBroker#getLogPath <em>Log Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Path</em>'.
	 * @see fr.ubo.collector.PubBroker#getLogPath()
	 * @see #getPubBroker()
	 * @generated
	 */
	EAttribute getPubBroker_LogPath();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.SubBroker <em>Sub Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Broker</em>'.
	 * @see fr.ubo.collector.SubBroker
	 * @generated
	 */
	EClass getSubBroker();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.SubBroker#getConfigurationPath <em>Configuration Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Path</em>'.
	 * @see fr.ubo.collector.SubBroker#getConfigurationPath()
	 * @see #getSubBroker()
	 * @generated
	 */
	EAttribute getSubBroker_ConfigurationPath();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.AddressableElement <em>Addressable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressable Element</em>'.
	 * @see fr.ubo.collector.AddressableElement
	 * @generated
	 */
	EClass getAddressableElement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ubo.collector.AddressableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see fr.ubo.collector.AddressableElement#getId()
	 * @see #getAddressableElement()
	 * @generated
	 */
	EReference getAddressableElement_Id();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see fr.ubo.collector.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for class '{@link fr.ubo.collector.TcpIpEndpoint <em>Tcp Ip Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Ip Endpoint</em>'.
	 * @see fr.ubo.collector.TcpIpEndpoint
	 * @generated
	 */
	EClass getTcpIpEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.TcpIpEndpoint#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see fr.ubo.collector.TcpIpEndpoint#getIpAddress()
	 * @see #getTcpIpEndpoint()
	 * @generated
	 */
	EAttribute getTcpIpEndpoint_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.collector.TcpIpEndpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.ubo.collector.TcpIpEndpoint#getPort()
	 * @see #getTcpIpEndpoint()
	 * @generated
	 */
	EAttribute getTcpIpEndpoint_Port();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.collector.MeasurementDataUnit <em>Measurement Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurement Data Unit</em>'.
	 * @see fr.ubo.collector.MeasurementDataUnit
	 * @generated
	 */
	EEnum getMeasurementDataUnit();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.collector.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation</em>'.
	 * @see fr.ubo.collector.Aggregation
	 * @generated
	 */
	EEnum getAggregation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectorFactory getCollectorFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.DataCollectorImpl <em>Data Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.DataCollectorImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getDataCollector()
		 * @generated
		 */
		EClass DATA_COLLECTOR = eINSTANCE.getDataCollector();

		/**
		 * The meta object literal for the '<em><b>Drone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTOR__DRONE = eINSTANCE.getDataCollector_Drone();

		/**
		 * The meta object literal for the '<em><b>Pub Broker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTOR__PUB_BROKER = eINSTANCE.getDataCollector_PubBroker();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTOR__PUBLISHERS = eINSTANCE.getDataCollector_Publishers();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTOR__SUBSCRIBERS = eINSTANCE.getDataCollector_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Sub Broker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COLLECTOR__SUB_BROKER = eINSTANCE.getDataCollector_SubBroker();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.NamedElementImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.DroneImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>Sensors Drone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRONE__SENSORS_DRONE = eINSTANCE.getDrone_SensorsDrone();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.SensorImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor Measured Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSOR_MEASURED_VARIABLES = eINSTANCE.getSensor_SensorMeasuredVariables();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.MeasuredVariableImpl <em>Measured Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.MeasuredVariableImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getMeasuredVariable()
		 * @generated
		 */
		EClass MEASURED_VARIABLE = eINSTANCE.getMeasuredVariable();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_VARIABLE__UNIT = eINSTANCE.getMeasuredVariable_Unit();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.PublisherImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Published Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__PUBLISHED_MEASURES = eINSTANCE.getPublisher_PublishedMeasures();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__PERIOD = eINSTANCE.getPublisher_Period();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.SubscriberImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__PERIOD = eINSTANCE.getSubscriber_Period();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__AGGREGATION = eINSTANCE.getSubscriber_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Monitored Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__MONITORED_MEASURE = eINSTANCE.getSubscriber_MonitoredMeasure();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.PubBrokerImpl <em>Pub Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.PubBrokerImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getPubBroker()
		 * @generated
		 */
		EClass PUB_BROKER = eINSTANCE.getPubBroker();

		/**
		 * The meta object literal for the '<em><b>Log Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUB_BROKER__LOG_PATH = eINSTANCE.getPubBroker_LogPath();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.SubBrokerImpl <em>Sub Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.SubBrokerImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getSubBroker()
		 * @generated
		 */
		EClass SUB_BROKER = eINSTANCE.getSubBroker();

		/**
		 * The meta object literal for the '<em><b>Configuration Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_BROKER__CONFIGURATION_PATH = eINSTANCE.getSubBroker_ConfigurationPath();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.AddressableElementImpl <em>Addressable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.AddressableElementImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getAddressableElement()
		 * @generated
		 */
		EClass ADDRESSABLE_ELEMENT = eINSTANCE.getAddressableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSABLE_ELEMENT__ID = eINSTANCE.getAddressableElement_Id();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.EndpointImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.impl.TcpIpEndpointImpl <em>Tcp Ip Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.impl.TcpIpEndpointImpl
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getTcpIpEndpoint()
		 * @generated
		 */
		EClass TCP_IP_ENDPOINT = eINSTANCE.getTcpIpEndpoint();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_IP_ENDPOINT__IP_ADDRESS = eINSTANCE.getTcpIpEndpoint_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_IP_ENDPOINT__PORT = eINSTANCE.getTcpIpEndpoint_Port();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.MeasurementDataUnit <em>Measurement Data Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.MeasurementDataUnit
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getMeasurementDataUnit()
		 * @generated
		 */
		EEnum MEASUREMENT_DATA_UNIT = eINSTANCE.getMeasurementDataUnit();

		/**
		 * The meta object literal for the '{@link fr.ubo.collector.Aggregation <em>Aggregation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ubo.collector.Aggregation
		 * @see fr.ubo.collector.impl.CollectorPackageImpl#getAggregation()
		 * @generated
		 */
		EEnum AGGREGATION = eINSTANCE.getAggregation();

	}

} //CollectorPackage
