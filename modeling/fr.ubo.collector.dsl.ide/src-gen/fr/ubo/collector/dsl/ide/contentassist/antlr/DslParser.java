/*
 * generated by Xtext 2.14.0
 */
package fr.ubo.collector.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.ubo.collector.dsl.ide.contentassist.antlr.internal.InternalDslParser;
import fr.ubo.collector.dsl.services.DslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getMeasurementDataUnitAccess().getAlternatives(), "rule__MeasurementDataUnit__Alternatives");
			builder.put(grammarAccess.getAggregationAccess().getAlternatives(), "rule__Aggregation__Alternatives");
			builder.put(grammarAccess.getDataCollectorAccess().getGroup(), "rule__DataCollector__Group__0");
			builder.put(grammarAccess.getDataCollectorAccess().getGroup_9(), "rule__DataCollector__Group_9__0");
			builder.put(grammarAccess.getDataCollectorAccess().getGroup_15(), "rule__DataCollector__Group_15__0");
			builder.put(grammarAccess.getDroneAccess().getGroup(), "rule__Drone__Group__0");
			builder.put(grammarAccess.getPubBrokerAccess().getGroup(), "rule__PubBroker__Group__0");
			builder.put(grammarAccess.getPublisherAccess().getGroup(), "rule__Publisher__Group__0");
			builder.put(grammarAccess.getPublisherAccess().getGroup_8(), "rule__Publisher__Group_8__0");
			builder.put(grammarAccess.getSubscriberAccess().getGroup(), "rule__Subscriber__Group__0");
			builder.put(grammarAccess.getSubBrokerAccess().getGroup(), "rule__SubBroker__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_6(), "rule__Sensor__Group_6__0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getGroup(), "rule__MeasuredVariable__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getTcpIpEndpointAccess().getGroup(), "rule__TcpIpEndpoint__Group__0");
			builder.put(grammarAccess.getDataCollectorAccess().getDroneAssignment_2(), "rule__DataCollector__DroneAssignment_2");
			builder.put(grammarAccess.getDataCollectorAccess().getPubBrokerAssignment_3(), "rule__DataCollector__PubBrokerAssignment_3");
			builder.put(grammarAccess.getDataCollectorAccess().getSubBrokerAssignment_4(), "rule__DataCollector__SubBrokerAssignment_4");
			builder.put(grammarAccess.getDataCollectorAccess().getPublishersAssignment_7(), "rule__DataCollector__PublishersAssignment_7");
			builder.put(grammarAccess.getDataCollectorAccess().getPublishersAssignment_9_0(), "rule__DataCollector__PublishersAssignment_9_0");
			builder.put(grammarAccess.getDataCollectorAccess().getSubscribersAssignment_13(), "rule__DataCollector__SubscribersAssignment_13");
			builder.put(grammarAccess.getDataCollectorAccess().getSubscribersAssignment_15_0(), "rule__DataCollector__SubscribersAssignment_15_0");
			builder.put(grammarAccess.getDroneAccess().getNameAssignment_1(), "rule__Drone__NameAssignment_1");
			builder.put(grammarAccess.getDroneAccess().getSensorsDroneAssignment_5(), "rule__Drone__SensorsDroneAssignment_5");
			builder.put(grammarAccess.getDroneAccess().getSensorsDroneAssignment_6(), "rule__Drone__SensorsDroneAssignment_6");
			builder.put(grammarAccess.getPubBrokerAccess().getNameAssignment_1(), "rule__PubBroker__NameAssignment_1");
			builder.put(grammarAccess.getPubBrokerAccess().getIdAssignment_3(), "rule__PubBroker__IdAssignment_3");
			builder.put(grammarAccess.getPubBrokerAccess().getLogPathAssignment_5(), "rule__PubBroker__LogPathAssignment_5");
			builder.put(grammarAccess.getPublisherAccess().getNameAssignment_1(), "rule__Publisher__NameAssignment_1");
			builder.put(grammarAccess.getPublisherAccess().getIdAssignment_3(), "rule__Publisher__IdAssignment_3");
			builder.put(grammarAccess.getPublisherAccess().getPeriodAssignment_5(), "rule__Publisher__PeriodAssignment_5");
			builder.put(grammarAccess.getPublisherAccess().getPublishedMeasuresAssignment_7(), "rule__Publisher__PublishedMeasuresAssignment_7");
			builder.put(grammarAccess.getPublisherAccess().getPublishedMeasuresAssignment_8_1(), "rule__Publisher__PublishedMeasuresAssignment_8_1");
			builder.put(grammarAccess.getSubscriberAccess().getNameAssignment_1(), "rule__Subscriber__NameAssignment_1");
			builder.put(grammarAccess.getSubscriberAccess().getIdAssignment_3(), "rule__Subscriber__IdAssignment_3");
			builder.put(grammarAccess.getSubscriberAccess().getMonitoredMeasureAssignment_5(), "rule__Subscriber__MonitoredMeasureAssignment_5");
			builder.put(grammarAccess.getSubscriberAccess().getPeriodAssignment_7(), "rule__Subscriber__PeriodAssignment_7");
			builder.put(grammarAccess.getSubscriberAccess().getAggregationAssignment_9(), "rule__Subscriber__AggregationAssignment_9");
			builder.put(grammarAccess.getSubBrokerAccess().getNameAssignment_1(), "rule__SubBroker__NameAssignment_1");
			builder.put(grammarAccess.getSubBrokerAccess().getIdAssignment_3(), "rule__SubBroker__IdAssignment_3");
			builder.put(grammarAccess.getSubBrokerAccess().getConfigurationPathAssignment_5(), "rule__SubBroker__ConfigurationPathAssignment_5");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_1(), "rule__Sensor__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_4(), "rule__Sensor__SensorMeasuredVariablesAssignment_4");
			builder.put(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_6_0(), "rule__Sensor__SensorMeasuredVariablesAssignment_6_0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getNameAssignment_0(), "rule__MeasuredVariable__NameAssignment_0");
			builder.put(grammarAccess.getMeasuredVariableAccess().getUnitAssignment_2(), "rule__MeasuredVariable__UnitAssignment_2");
			builder.put(grammarAccess.getTcpIpEndpointAccess().getIpAddressAssignment_0(), "rule__TcpIpEndpoint__IpAddressAssignment_0");
			builder.put(grammarAccess.getTcpIpEndpointAccess().getPortAssignment_2(), "rule__TcpIpEndpoint__PortAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}