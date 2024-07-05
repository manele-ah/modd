/**
 */
package fr.ubo.collector.util;

import fr.ubo.collector.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.ubo.collector.CollectorPackage
 * @generated
 */
public class CollectorValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CollectorValidator INSTANCE = new CollectorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.ubo.collector";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorValidator()
	{
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
		return CollectorPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
			case CollectorPackage.DATA_COLLECTOR:
				return validateDataCollector((DataCollector) value, diagnostics, context);
			case CollectorPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement) value, diagnostics, context);
			case CollectorPackage.DRONE:
				return validateDrone((Drone) value, diagnostics, context);
			case CollectorPackage.SENSOR:
				return validateSensor((Sensor) value, diagnostics, context);
			case CollectorPackage.MEASURED_VARIABLE:
				return validateMeasuredVariable((MeasuredVariable) value, diagnostics, context);
			case CollectorPackage.PUBLISHER:
				return validatePublisher((Publisher) value, diagnostics, context);
			case CollectorPackage.SUBSCRIBER:
				return validateSubscriber((Subscriber) value, diagnostics, context);
			case CollectorPackage.PUB_BROKER:
				return validatePubBroker((PubBroker) value, diagnostics, context);
			case CollectorPackage.SUB_BROKER:
				return validateSubBroker((SubBroker) value, diagnostics, context);
			case CollectorPackage.ADDRESSABLE_ELEMENT:
				return validateAddressableElement((AddressableElement) value, diagnostics, context);
			case CollectorPackage.ENDPOINT:
				return validateEndpoint((Endpoint) value, diagnostics, context);
			case CollectorPackage.TCP_IP_ENDPOINT:
				return validateTcpIpEndpoint((TcpIpEndpoint) value, diagnostics, context);
			case CollectorPackage.MEASUREMENT_DATA_UNIT:
				return validateMeasurementDataUnit((MeasurementDataUnit) value, diagnostics, context);
			case CollectorPackage.AGGREGATION:
				return validateAggregation((Aggregation) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector(DataCollector dataCollector, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		if ( ! validate_NoCircularContainment(dataCollector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesDrones(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesPubBrokers(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesSubBrokers(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesPublishers(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesSubscribers(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesSensors(dataCollector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataCollector_differentNamesMeasuredVariables(dataCollector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentNamesDrones constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_DRONES__EEXPRESSION = "\n"
		+ "\t\t\tDrone.allInstances() -> forAll(drone_1, drone_2 | drone_1 <> drone_2 implies drone_1.name <> drone_2.name)";

	/**
	 * Validates the differentNamesDrones constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesDrones(DataCollector dataCollector, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesDrones",
			DATA_COLLECTOR__DIFFERENT_NAMES_DRONES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesPubBrokers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_PUB_BROKERS__EEXPRESSION = "\n"
		+ "\t\t\tPubBroker.allInstances() -> forAll(pub_broker_1, pub_broker_2 | pub_broker_1 <> pub_broker_2 implies pub_broker_1.name <> pub_broker_2.name)";

	/**
	 * Validates the differentNamesPubBrokers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesPubBrokers(DataCollector dataCollector,
		DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesPubBrokers",
			DATA_COLLECTOR__DIFFERENT_NAMES_PUB_BROKERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesSubBrokers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_SUB_BROKERS__EEXPRESSION = "\n"
		+ "\t\t\tSubBroker.allInstances() -> forAll(sub_broker_1, sub_broker_2 | sub_broker_1 <> sub_broker_2 implies sub_broker_1.name <> sub_broker_2.name)";

	/**
	 * Validates the differentNamesSubBrokers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesSubBrokers(DataCollector dataCollector,
		DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesSubBrokers",
			DATA_COLLECTOR__DIFFERENT_NAMES_SUB_BROKERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesPublishers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_PUBLISHERS__EEXPRESSION = "\n"
		+ "\t\t\tPublisher.allInstances() -> forAll(pub_1, pub_2 | pub_1 <> pub_2 implies pub_1.name <> pub_2.name)";

	/**
	 * Validates the differentNamesPublishers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesPublishers(DataCollector dataCollector,
		DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesPublishers",
			DATA_COLLECTOR__DIFFERENT_NAMES_PUBLISHERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesSubscribers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_SUBSCRIBERS__EEXPRESSION = "\n"
		+ "\t\t\tSubscriber.allInstances() -> forAll(sub_1, sub_2 | sub_1 <> sub_2 implies sub_1.name <> sub_2.name)";

	/**
	 * Validates the differentNamesSubscribers constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesSubscribers(DataCollector dataCollector,
		DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesSubscribers",
			DATA_COLLECTOR__DIFFERENT_NAMES_SUBSCRIBERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesSensors constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_SENSORS__EEXPRESSION = "\n"
		+ "\t\t\tSensor.allInstances() -> forAll(sensor_1, sensor_2 | sensor_1 <> sensor_2 implies sensor_1.name <> sensor_2.name)";

	/**
	 * Validates the differentNamesSensors constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesSensors(DataCollector dataCollector, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesSensors",
			DATA_COLLECTOR__DIFFERENT_NAMES_SENSORS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesMeasuredVariables constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_COLLECTOR__DIFFERENT_NAMES_MEASURED_VARIABLES__EEXPRESSION = "\n"
		+ "\t\t\tMeasuredVariable.allInstances() -> forAll(variable_1, variable_2 | variable_1 <> variable_2 implies variable_1.name <> variable_2.name)";

	/**
	 * Validates the differentNamesMeasuredVariables constraint of '<em>Data Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCollector_differentNamesMeasuredVariables(DataCollector dataCollector,
		DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(CollectorPackage.Literals.DATA_COLLECTOR, dataCollector, diagnostics, context,
			"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesMeasuredVariables",
			DATA_COLLECTOR__DIFFERENT_NAMES_MEASURED_VARIABLES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrone(Drone drone, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(drone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredVariable(MeasuredVariable measuredVariable, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(measuredVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisher(Publisher publisher, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(publisher, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(subscriber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePubBroker(PubBroker pubBroker, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(pubBroker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubBroker(SubBroker subBroker, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(subBroker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressableElement(AddressableElement addressableElement, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(addressableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTcpIpEndpoint(TcpIpEndpoint tcpIpEndpoint, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(tcpIpEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementDataUnit(MeasurementDataUnit measurementDataUnit, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregation(Aggregation aggregation, DiagnosticChain diagnostics,
		Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CollectorValidator
