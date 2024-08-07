/*
 * generated by Xtext 2.14.0
 */
package fr.ubo.collector.dsl.serializer;

import com.google.inject.Inject;
import fr.ubo.collector.CollectorPackage;
import fr.ubo.collector.DataCollector;
import fr.ubo.collector.Drone;
import fr.ubo.collector.MeasuredVariable;
import fr.ubo.collector.PubBroker;
import fr.ubo.collector.Publisher;
import fr.ubo.collector.Sensor;
import fr.ubo.collector.SubBroker;
import fr.ubo.collector.Subscriber;
import fr.ubo.collector.TcpIpEndpoint;
import fr.ubo.collector.dsl.services.DslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CollectorPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CollectorPackage.DATA_COLLECTOR:
				sequence_DataCollector(context, (DataCollector) semanticObject); 
				return; 
			case CollectorPackage.DRONE:
				sequence_Drone(context, (Drone) semanticObject); 
				return; 
			case CollectorPackage.MEASURED_VARIABLE:
				sequence_MeasuredVariable(context, (MeasuredVariable) semanticObject); 
				return; 
			case CollectorPackage.PUB_BROKER:
				sequence_PubBroker(context, (PubBroker) semanticObject); 
				return; 
			case CollectorPackage.PUBLISHER:
				sequence_Publisher(context, (Publisher) semanticObject); 
				return; 
			case CollectorPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case CollectorPackage.SUB_BROKER:
				sequence_SubBroker(context, (SubBroker) semanticObject); 
				return; 
			case CollectorPackage.SUBSCRIBER:
				sequence_Subscriber(context, (Subscriber) semanticObject); 
				return; 
			case CollectorPackage.TCP_IP_ENDPOINT:
				sequence_TcpIpEndpoint(context, (TcpIpEndpoint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DataCollector returns DataCollector
	 *
	 * Constraint:
	 *     (
	 *         drone=Drone 
	 *         pubBroker=PubBroker 
	 *         subBroker=SubBroker 
	 *         publishers+=Publisher 
	 *         publishers+=Publisher* 
	 *         subscribers+=Subscriber 
	 *         subscribers+=Subscriber*
	 *     )
	 */
	protected void sequence_DataCollector(ISerializationContext context, DataCollector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Drone returns Drone
	 *
	 * Constraint:
	 *     (name=EString sensorsDrone+=Sensor sensorsDrone+=Sensor*)
	 */
	protected void sequence_Drone(ISerializationContext context, Drone semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasuredVariable returns MeasuredVariable
	 *
	 * Constraint:
	 *     (name=EString unit=MeasurementDataUnit)
	 */
	protected void sequence_MeasuredVariable(ISerializationContext context, MeasuredVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.MEASURED_VARIABLE__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.MEASURED_VARIABLE__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PubBroker returns PubBroker
	 *
	 * Constraint:
	 *     (name=EString id=Endpoint logPath=EString)
	 */
	protected void sequence_PubBroker(ISerializationContext context, PubBroker semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.ADDRESSABLE_ELEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.ADDRESSABLE_ELEMENT__ID));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.PUB_BROKER__LOG_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.PUB_BROKER__LOG_PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPubBrokerAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPubBrokerAccess().getIdEndpointParserRuleCall_3_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getPubBrokerAccess().getLogPathEStringParserRuleCall_5_0(), semanticObject.getLogPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Publisher returns Publisher
	 *
	 * Constraint:
	 *     (name=EString id=Endpoint period=EDouble publishedMeasures+=[MeasuredVariable|EString] publishedMeasures+=[MeasuredVariable|EString]*)
	 */
	protected void sequence_Publisher(ISerializationContext context, Publisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (name=EString sensorMeasuredVariables+=MeasuredVariable sensorMeasuredVariables+=MeasuredVariable*)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubBroker returns SubBroker
	 *
	 * Constraint:
	 *     (name=EString id=Endpoint configurationPath=EString)
	 */
	protected void sequence_SubBroker(ISerializationContext context, SubBroker semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.ADDRESSABLE_ELEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.ADDRESSABLE_ELEMENT__ID));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.SUB_BROKER__CONFIGURATION_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.SUB_BROKER__CONFIGURATION_PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubBrokerAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSubBrokerAccess().getIdEndpointParserRuleCall_3_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getSubBrokerAccess().getConfigurationPathEStringParserRuleCall_5_0(), semanticObject.getConfigurationPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Subscriber returns Subscriber
	 *
	 * Constraint:
	 *     (name=EString id=Endpoint monitoredMeasure=[MeasuredVariable|EString] period=EDouble aggregation=Aggregation)
	 */
	protected void sequence_Subscriber(ISerializationContext context, Subscriber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.ADDRESSABLE_ELEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.ADDRESSABLE_ELEMENT__ID));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.SUBSCRIBER__MONITORED_MEASURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.SUBSCRIBER__MONITORED_MEASURE));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.SUBSCRIBER__PERIOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.SUBSCRIBER__PERIOD));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.SUBSCRIBER__AGGREGATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.SUBSCRIBER__AGGREGATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSubscriberAccess().getIdEndpointParserRuleCall_3_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getSubscriberAccess().getMonitoredMeasureMeasuredVariableEStringParserRuleCall_5_0_1(), semanticObject.eGet(CollectorPackage.Literals.SUBSCRIBER__MONITORED_MEASURE, false));
		feeder.accept(grammarAccess.getSubscriberAccess().getPeriodEDoubleParserRuleCall_7_0(), semanticObject.getPeriod());
		feeder.accept(grammarAccess.getSubscriberAccess().getAggregationAggregationEnumRuleCall_9_0(), semanticObject.getAggregation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Endpoint returns TcpIpEndpoint
	 *     TcpIpEndpoint returns TcpIpEndpoint
	 *
	 * Constraint:
	 *     (ipAddress=EString port=EInt)
	 */
	protected void sequence_TcpIpEndpoint(ISerializationContext context, TcpIpEndpoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.TCP_IP_ENDPOINT__IP_ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.TCP_IP_ENDPOINT__IP_ADDRESS));
			if (transientValues.isValueTransient(semanticObject, CollectorPackage.Literals.TCP_IP_ENDPOINT__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CollectorPackage.Literals.TCP_IP_ENDPOINT__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTcpIpEndpointAccess().getIpAddressEStringParserRuleCall_0_0(), semanticObject.getIpAddress());
		feeder.accept(grammarAccess.getTcpIpEndpointAccess().getPortEIntParserRuleCall_2_0(), semanticObject.getPort());
		feeder.finish();
	}
	
	
}
