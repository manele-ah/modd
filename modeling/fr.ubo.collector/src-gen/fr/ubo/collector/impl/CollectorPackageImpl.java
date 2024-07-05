/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.AddressableElement;
import fr.ubo.collector.Aggregation;
import fr.ubo.collector.CollectorFactory;
import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.DataCollector;
import fr.ubo.collector.Drone;
import fr.ubo.collector.Endpoint;
import fr.ubo.collector.MeasuredVariable;
import fr.ubo.collector.MeasurementDataUnit;
import fr.ubo.collector.NamedElement;
import fr.ubo.collector.PubBroker;
import fr.ubo.collector.Publisher;
import fr.ubo.collector.Sensor;
import fr.ubo.collector.SubBroker;
import fr.ubo.collector.Subscriber;
import fr.ubo.collector.TcpIpEndpoint;

import fr.ubo.collector.util.CollectorValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectorPackageImpl extends EPackageImpl implements CollectorPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pubBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpIpEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementDataUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.ubo.collector.CollectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectorPackageImpl()
	{
		super(eNS_URI, CollectorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CollectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectorPackage init()
	{
		if (isInited)
			return (CollectorPackage) EPackage.Registry.INSTANCE.getEPackage(CollectorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCollectorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CollectorPackageImpl theCollectorPackage = registeredCollectorPackage instanceof CollectorPackageImpl
			? (CollectorPackageImpl) registeredCollectorPackage
			: new CollectorPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCollectorPackage.createPackageContents();

		// Initialize created meta-data
		theCollectorPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCollectorPackage, new EValidator.Descriptor()
		{
			public EValidator getEValidator()
			{
				return CollectorValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCollectorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectorPackage.eNS_URI, theCollectorPackage);
		return theCollectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCollector()
	{
		return dataCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollector_Drone()
	{
		return (EReference) dataCollectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollector_PubBroker()
	{
		return (EReference) dataCollectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollector_Publishers()
	{
		return (EReference) dataCollectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollector_Subscribers()
	{
		return (EReference) dataCollectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCollector_SubBroker()
	{
		return (EReference) dataCollectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement()
	{
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name()
	{
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrone()
	{
		return droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrone_SensorsDrone()
	{
		return (EReference) droneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor()
	{
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_SensorMeasuredVariables()
	{
		return (EReference) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasuredVariable()
	{
		return measuredVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredVariable_Unit()
	{
		return (EAttribute) measuredVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisher()
	{
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisher_PublishedMeasures()
	{
		return (EReference) publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_Period()
	{
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriber()
	{
		return subscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriber_Period()
	{
		return (EAttribute) subscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriber_Aggregation()
	{
		return (EAttribute) subscriberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriber_MonitoredMeasure()
	{
		return (EReference) subscriberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPubBroker()
	{
		return pubBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPubBroker_LogPath()
	{
		return (EAttribute) pubBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubBroker()
	{
		return subBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubBroker_ConfigurationPath()
	{
		return (EAttribute) subBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressableElement()
	{
		return addressableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressableElement_Id()
	{
		return (EReference) addressableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpoint()
	{
		return endpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcpIpEndpoint()
	{
		return tcpIpEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcpIpEndpoint_IpAddress()
	{
		return (EAttribute) tcpIpEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcpIpEndpoint_Port()
	{
		return (EAttribute) tcpIpEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementDataUnit()
	{
		return measurementDataUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregation()
	{
		return aggregationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorFactory getCollectorFactory()
	{
		return (CollectorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dataCollectorEClass = createEClass(DATA_COLLECTOR);
		createEReference(dataCollectorEClass, DATA_COLLECTOR__DRONE);
		createEReference(dataCollectorEClass, DATA_COLLECTOR__PUB_BROKER);
		createEReference(dataCollectorEClass, DATA_COLLECTOR__PUBLISHERS);
		createEReference(dataCollectorEClass, DATA_COLLECTOR__SUBSCRIBERS);
		createEReference(dataCollectorEClass, DATA_COLLECTOR__SUB_BROKER);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		droneEClass = createEClass(DRONE);
		createEReference(droneEClass, DRONE__SENSORS_DRONE);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__SENSOR_MEASURED_VARIABLES);

		measuredVariableEClass = createEClass(MEASURED_VARIABLE);
		createEAttribute(measuredVariableEClass, MEASURED_VARIABLE__UNIT);

		publisherEClass = createEClass(PUBLISHER);
		createEReference(publisherEClass, PUBLISHER__PUBLISHED_MEASURES);
		createEAttribute(publisherEClass, PUBLISHER__PERIOD);

		subscriberEClass = createEClass(SUBSCRIBER);
		createEAttribute(subscriberEClass, SUBSCRIBER__PERIOD);
		createEAttribute(subscriberEClass, SUBSCRIBER__AGGREGATION);
		createEReference(subscriberEClass, SUBSCRIBER__MONITORED_MEASURE);

		pubBrokerEClass = createEClass(PUB_BROKER);
		createEAttribute(pubBrokerEClass, PUB_BROKER__LOG_PATH);

		subBrokerEClass = createEClass(SUB_BROKER);
		createEAttribute(subBrokerEClass, SUB_BROKER__CONFIGURATION_PATH);

		addressableElementEClass = createEClass(ADDRESSABLE_ELEMENT);
		createEReference(addressableElementEClass, ADDRESSABLE_ELEMENT__ID);

		endpointEClass = createEClass(ENDPOINT);

		tcpIpEndpointEClass = createEClass(TCP_IP_ENDPOINT);
		createEAttribute(tcpIpEndpointEClass, TCP_IP_ENDPOINT__IP_ADDRESS);
		createEAttribute(tcpIpEndpointEClass, TCP_IP_ENDPOINT__PORT);

		// Create enums
		measurementDataUnitEEnum = createEEnum(MEASUREMENT_DATA_UNIT);
		aggregationEEnum = createEEnum(AGGREGATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		droneEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getNamedElement());
		measuredVariableEClass.getESuperTypes().add(this.getNamedElement());
		publisherEClass.getESuperTypes().add(this.getNamedElement());
		publisherEClass.getESuperTypes().add(this.getAddressableElement());
		subscriberEClass.getESuperTypes().add(this.getNamedElement());
		subscriberEClass.getESuperTypes().add(this.getAddressableElement());
		pubBrokerEClass.getESuperTypes().add(this.getAddressableElement());
		subBrokerEClass.getESuperTypes().add(this.getAddressableElement());
		addressableElementEClass.getESuperTypes().add(this.getNamedElement());
		tcpIpEndpointEClass.getESuperTypes().add(this.getEndpoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataCollectorEClass, DataCollector.class, "DataCollector", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCollector_Drone(), this.getDrone(), null, "drone", null, 1, 1, DataCollector.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE,
			IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollector_PubBroker(), this.getPubBroker(), null, "pubBroker", null, 1, 1,
			DataCollector.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollector_Publishers(), this.getPublisher(), null, "publishers", null, 1, - 1,
			DataCollector.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollector_Subscribers(), this.getSubscriber(), null, "subscribers", null, 1, - 1,
			DataCollector.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);
		initEReference(getDataCollector_SubBroker(), this.getSubBroker(), null, "subBroker", null, 1, 1,
			DataCollector.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED,
			IS_ORDERED);

		initEClass(droneEClass, Drone.class, "Drone", ! IS_ABSTRACT, ! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrone_SensorsDrone(), this.getSensor(), null, "sensorsDrone", null, 1, - 1, Drone.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE,
			IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", ! IS_ABSTRACT, ! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_SensorMeasuredVariables(), this.getMeasuredVariable(), null, "sensorMeasuredVariables",
			null, 1, - 1, Sensor.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);

		initEClass(measuredVariableEClass, MeasuredVariable.class, "MeasuredVariable", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasuredVariable_Unit(), this.getMeasurementDataUnit(), "unit", null, 1, 1,
			MeasuredVariable.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE,
			! IS_DERIVED, IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublisher_PublishedMeasures(), this.getMeasuredVariable(), null, "publishedMeasures", null, 1,
			- 1, Publisher.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_COMPOSITE, IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Period(), ecorePackage.getEDouble(), "period", "0.04", 1, 1, Publisher.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED,
			IS_ORDERED);

		initEClass(subscriberEClass, Subscriber.class, "Subscriber", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscriber_Period(), ecorePackage.getEDouble(), "period", "2", 1, 1, Subscriber.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED,
			IS_ORDERED);
		initEAttribute(getSubscriber_Aggregation(), this.getAggregation(), "aggregation", null, 1, 1, Subscriber.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED,
			IS_ORDERED);
		initEReference(getSubscriber_MonitoredMeasure(), this.getMeasuredVariable(), null, "monitoredMeasure", null, 1,
			1, Subscriber.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_COMPOSITE, IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE, IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);

		initEClass(pubBrokerEClass, PubBroker.class, "PubBroker", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPubBroker_LogPath(), ecorePackage.getEString(), "logPath", null, 1, 1, PubBroker.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED,
			IS_ORDERED);

		initEClass(subBrokerEClass, SubBroker.class, "SubBroker", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubBroker_ConfigurationPath(), ecorePackage.getEString(), "configurationPath", null, 1, 1,
			SubBroker.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE,
			! IS_DERIVED, IS_ORDERED);

		initEClass(addressableElementEClass, AddressableElement.class, "AddressableElement", ! IS_ABSTRACT,
			! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressableElement_Id(), this.getEndpoint(), null, "id", null, 1, 1, AddressableElement.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE,
			IS_UNIQUE, ! IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcpIpEndpointEClass, TcpIpEndpoint.class, "TcpIpEndpoint", ! IS_ABSTRACT, ! IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcpIpEndpoint_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 1, 1,
			TcpIpEndpoint.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE,
			! IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcpIpEndpoint_Port(), ecorePackage.getEInt(), "port", null, 1, 1, TcpIpEndpoint.class,
			! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED,
			IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(measurementDataUnitEEnum, MeasurementDataUnit.class, "MeasurementDataUnit");
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.METER);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.METER_PER_SECOND);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.METER_PER_SECOND_SQUARED);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.DEGREE_CELSIUS);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.RADIAN);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.RADIAN_PER_SECOND);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.BAR);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.LITER);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.GRAM);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.NONE);

		initEEnum(aggregationEEnum, Aggregation.class, "Aggregation");
		addEEnumLiteral(aggregationEEnum, Aggregation.MIN);
		addEEnumLiteral(aggregationEEnum, Aggregation.MAX);
		addEEnumLiteral(aggregationEEnum, Aggregation.AVERAGE);
		addEEnumLiteral(aggregationEEnum, Aggregation.FIRST);
		addEEnumLiteral(aggregationEEnum, Aggregation.LAST);
		addEEnumLiteral(aggregationEEnum, Aggregation.ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
			new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "settingDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(dataCollectorEClass, source, new String[] { "constraints",
			"differentNamesDrones differentNamesPubBrokers differentNamesSubBrokers differentNamesPublishers differentNamesSubscribers differentNamesSensors differentNamesMeasuredVariables" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(dataCollectorEClass, source, new String[] { "differentNamesDrones",
			"\n\t\t\tDrone.allInstances() -> forAll(drone_1, drone_2 | drone_1 <> drone_2 implies drone_1.name <> drone_2.name)",
			"differentNamesPubBrokers",
			"\n\t\t\tPubBroker.allInstances() -> forAll(pub_broker_1, pub_broker_2 | pub_broker_1 <> pub_broker_2 implies pub_broker_1.name <> pub_broker_2.name)",
			"differentNamesSubBrokers",
			"\n\t\t\tSubBroker.allInstances() -> forAll(sub_broker_1, sub_broker_2 | sub_broker_1 <> sub_broker_2 implies sub_broker_1.name <> sub_broker_2.name)",
			"differentNamesPublishers",
			"\n\t\t\tPublisher.allInstances() -> forAll(pub_1, pub_2 | pub_1 <> pub_2 implies pub_1.name <> pub_2.name)",
			"differentNamesSubscribers",
			"\n\t\t\tSubscriber.allInstances() -> forAll(sub_1, sub_2 | sub_1 <> sub_2 implies sub_1.name <> sub_2.name)",
			"differentNamesSensors",
			"\n\t\t\tSensor.allInstances() -> forAll(sensor_1, sensor_2 | sensor_1 <> sensor_2 implies sensor_1.name <> sensor_2.name)",
			"differentNamesMeasuredVariables",
			"\n\t\t\tMeasuredVariable.allInstances() -> forAll(variable_1, variable_2 | variable_1 <> variable_2 implies variable_1.name <> variable_2.name)" });
	}

} //CollectorPackageImpl
