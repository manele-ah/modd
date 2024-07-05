/**
 */
package fr.ubo.collector.impl;

import fr.ubo.collector.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectorFactoryImpl extends EFactoryImpl implements CollectorFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollectorFactory init()
	{
		try
		{
			CollectorFactory theCollectorFactory = (CollectorFactory) EPackage.Registry.INSTANCE
				.getEFactory(CollectorPackage.eNS_URI);
			if (theCollectorFactory != null)
			{
				return theCollectorFactory;
			}
		} catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollectorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case CollectorPackage.DATA_COLLECTOR:
				return createDataCollector();
			case CollectorPackage.NAMED_ELEMENT:
				return createNamedElement();
			case CollectorPackage.DRONE:
				return createDrone();
			case CollectorPackage.SENSOR:
				return createSensor();
			case CollectorPackage.MEASURED_VARIABLE:
				return createMeasuredVariable();
			case CollectorPackage.PUBLISHER:
				return createPublisher();
			case CollectorPackage.SUBSCRIBER:
				return createSubscriber();
			case CollectorPackage.PUB_BROKER:
				return createPubBroker();
			case CollectorPackage.SUB_BROKER:
				return createSubBroker();
			case CollectorPackage.ADDRESSABLE_ELEMENT:
				return createAddressableElement();
			case CollectorPackage.TCP_IP_ENDPOINT:
				return createTcpIpEndpoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case CollectorPackage.MEASUREMENT_DATA_UNIT:
				return createMeasurementDataUnitFromString(eDataType, initialValue);
			case CollectorPackage.AGGREGATION:
				return createAggregationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case CollectorPackage.MEASUREMENT_DATA_UNIT:
				return convertMeasurementDataUnitToString(eDataType, instanceValue);
			case CollectorPackage.AGGREGATION:
				return convertAggregationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCollector createDataCollector()
	{
		DataCollectorImpl dataCollector = new DataCollectorImpl();
		return dataCollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement()
	{
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drone createDrone()
	{
		DroneImpl drone = new DroneImpl();
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor()
	{
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredVariable createMeasuredVariable()
	{
		MeasuredVariableImpl measuredVariable = new MeasuredVariableImpl();
		return measuredVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher()
	{
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber createSubscriber()
	{
		SubscriberImpl subscriber = new SubscriberImpl();
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubBroker createPubBroker()
	{
		PubBrokerImpl pubBroker = new PubBrokerImpl();
		return pubBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubBroker createSubBroker()
	{
		SubBrokerImpl subBroker = new SubBrokerImpl();
		return subBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressableElement createAddressableElement()
	{
		AddressableElementImpl addressableElement = new AddressableElementImpl();
		return addressableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcpIpEndpoint createTcpIpEndpoint()
	{
		TcpIpEndpointImpl tcpIpEndpoint = new TcpIpEndpointImpl();
		return tcpIpEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementDataUnit createMeasurementDataUnitFromString(EDataType eDataType, String initialValue)
	{
		MeasurementDataUnit result = MeasurementDataUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementDataUnitToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregationFromString(EDataType eDataType, String initialValue)
	{
		Aggregation result = Aggregation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorPackage getCollectorPackage()
	{
		return (CollectorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollectorPackage getPackage()
	{
		return CollectorPackage.eINSTANCE;
	}

} //CollectorFactoryImpl
