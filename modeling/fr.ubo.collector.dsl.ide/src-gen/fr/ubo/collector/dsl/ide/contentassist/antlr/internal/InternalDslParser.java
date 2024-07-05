package fr.ubo.collector.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.ubo.collector.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'METER'", "'METER_PER_SECOND'", "'METER_PER_SECOND_SQUARED'", "'DEGREE_CELSIUS'", "'RADIAN'", "'RADIAN_PER_SECOND'", "'BAR'", "'LITER'", "'GRAM'", "'NONE'", "'MIN'", "'MAX'", "'AVERAGE'", "'FIRST'", "'LAST'", "'ALL'", "'DataCollector'", "'{'", "'Publishers'", "';'", "'}'", "'Subscriptions'", "'Drone'", "'Sensors'", "'PubBroker'", "'('", "','", "')'", "'Publisher'", "'Subscriber'", "'SubBroker'", "'Sensor'", "'measures'", "'-'", "'.'", "':'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDataCollector"
    // InternalDsl.g:53:1: entryRuleDataCollector : ruleDataCollector EOF ;
    public final void entryRuleDataCollector() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleDataCollector EOF )
            // InternalDsl.g:55:1: ruleDataCollector EOF
            {
             before(grammarAccess.getDataCollectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDataCollector();

            state._fsp--;

             after(grammarAccess.getDataCollectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataCollector"


    // $ANTLR start "ruleDataCollector"
    // InternalDsl.g:62:1: ruleDataCollector : ( ( rule__DataCollector__Group__0 ) ) ;
    public final void ruleDataCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__DataCollector__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__DataCollector__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__DataCollector__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__DataCollector__Group__0 )
            {
             before(grammarAccess.getDataCollectorAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__DataCollector__Group__0 )
            // InternalDsl.g:69:4: rule__DataCollector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataCollector"


    // $ANTLR start "entryRuleEndpoint"
    // InternalDsl.g:78:1: entryRuleEndpoint : ruleEndpoint EOF ;
    public final void entryRuleEndpoint() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleEndpoint EOF )
            // InternalDsl.g:80:1: ruleEndpoint EOF
            {
             before(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getEndpointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalDsl.g:87:1: ruleEndpoint : ( ruleTcpIpEndpoint ) ;
    public final void ruleEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ruleTcpIpEndpoint ) )
            // InternalDsl.g:92:2: ( ruleTcpIpEndpoint )
            {
            // InternalDsl.g:92:2: ( ruleTcpIpEndpoint )
            // InternalDsl.g:93:3: ruleTcpIpEndpoint
            {
             before(grammarAccess.getEndpointAccess().getTcpIpEndpointParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTcpIpEndpoint();

            state._fsp--;

             after(grammarAccess.getEndpointAccess().getTcpIpEndpointParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleDrone"
    // InternalDsl.g:103:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleDrone EOF )
            // InternalDsl.g:105:1: ruleDrone EOF
            {
             before(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getDroneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalDsl.g:112:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Drone__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Drone__Group__0 )
            // InternalDsl.g:119:4: rule__Drone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRulePubBroker"
    // InternalDsl.g:128:1: entryRulePubBroker : rulePubBroker EOF ;
    public final void entryRulePubBroker() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( rulePubBroker EOF )
            // InternalDsl.g:130:1: rulePubBroker EOF
            {
             before(grammarAccess.getPubBrokerRule()); 
            pushFollow(FOLLOW_1);
            rulePubBroker();

            state._fsp--;

             after(grammarAccess.getPubBrokerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePubBroker"


    // $ANTLR start "rulePubBroker"
    // InternalDsl.g:137:1: rulePubBroker : ( ( rule__PubBroker__Group__0 ) ) ;
    public final void rulePubBroker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__PubBroker__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__PubBroker__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__PubBroker__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__PubBroker__Group__0 )
            {
             before(grammarAccess.getPubBrokerAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__PubBroker__Group__0 )
            // InternalDsl.g:144:4: rule__PubBroker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPubBrokerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePubBroker"


    // $ANTLR start "entryRulePublisher"
    // InternalDsl.g:153:1: entryRulePublisher : rulePublisher EOF ;
    public final void entryRulePublisher() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( rulePublisher EOF )
            // InternalDsl.g:155:1: rulePublisher EOF
            {
             before(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getPublisherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalDsl.g:162:1: rulePublisher : ( ( rule__Publisher__Group__0 ) ) ;
    public final void rulePublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Publisher__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Publisher__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Publisher__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Publisher__Group__0 )
            {
             before(grammarAccess.getPublisherAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Publisher__Group__0 )
            // InternalDsl.g:169:4: rule__Publisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalDsl.g:178:1: entryRuleSubscriber : ruleSubscriber EOF ;
    public final void entryRuleSubscriber() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleSubscriber EOF )
            // InternalDsl.g:180:1: ruleSubscriber EOF
            {
             before(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getSubscriberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalDsl.g:187:1: ruleSubscriber : ( ( rule__Subscriber__Group__0 ) ) ;
    public final void ruleSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Subscriber__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Subscriber__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Subscriber__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Subscriber__Group__0 )
            {
             before(grammarAccess.getSubscriberAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Subscriber__Group__0 )
            // InternalDsl.g:194:4: rule__Subscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleSubBroker"
    // InternalDsl.g:203:1: entryRuleSubBroker : ruleSubBroker EOF ;
    public final void entryRuleSubBroker() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleSubBroker EOF )
            // InternalDsl.g:205:1: ruleSubBroker EOF
            {
             before(grammarAccess.getSubBrokerRule()); 
            pushFollow(FOLLOW_1);
            ruleSubBroker();

            state._fsp--;

             after(grammarAccess.getSubBrokerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubBroker"


    // $ANTLR start "ruleSubBroker"
    // InternalDsl.g:212:1: ruleSubBroker : ( ( rule__SubBroker__Group__0 ) ) ;
    public final void ruleSubBroker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__SubBroker__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__SubBroker__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__SubBroker__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__SubBroker__Group__0 )
            {
             before(grammarAccess.getSubBrokerAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__SubBroker__Group__0 )
            // InternalDsl.g:219:4: rule__SubBroker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubBrokerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubBroker"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleEString EOF )
            // InternalDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalDsl.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:253:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleSensor EOF )
            // InternalDsl.g:255:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDsl.g:262:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Sensor__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Sensor__Group__0 )
            // InternalDsl.g:269:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleMeasuredVariable"
    // InternalDsl.g:278:1: entryRuleMeasuredVariable : ruleMeasuredVariable EOF ;
    public final void entryRuleMeasuredVariable() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleMeasuredVariable EOF )
            // InternalDsl.g:280:1: ruleMeasuredVariable EOF
            {
             before(grammarAccess.getMeasuredVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasuredVariable();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasuredVariable"


    // $ANTLR start "ruleMeasuredVariable"
    // InternalDsl.g:287:1: ruleMeasuredVariable : ( ( rule__MeasuredVariable__Group__0 ) ) ;
    public final void ruleMeasuredVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__MeasuredVariable__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__MeasuredVariable__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__MeasuredVariable__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__MeasuredVariable__Group__0 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__MeasuredVariable__Group__0 )
            // InternalDsl.g:294:4: rule__MeasuredVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasuredVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:303:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleEDouble EOF )
            // InternalDsl.g:305:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:312:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__EDouble__Group__0 )
            // InternalDsl.g:319:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleEInt EOF )
            // InternalDsl.g:330:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:337:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__EInt__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__EInt__Group__0 )
            // InternalDsl.g:344:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTcpIpEndpoint"
    // InternalDsl.g:353:1: entryRuleTcpIpEndpoint : ruleTcpIpEndpoint EOF ;
    public final void entryRuleTcpIpEndpoint() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTcpIpEndpoint EOF )
            // InternalDsl.g:355:1: ruleTcpIpEndpoint EOF
            {
             before(grammarAccess.getTcpIpEndpointRule()); 
            pushFollow(FOLLOW_1);
            ruleTcpIpEndpoint();

            state._fsp--;

             after(grammarAccess.getTcpIpEndpointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTcpIpEndpoint"


    // $ANTLR start "ruleTcpIpEndpoint"
    // InternalDsl.g:362:1: ruleTcpIpEndpoint : ( ( rule__TcpIpEndpoint__Group__0 ) ) ;
    public final void ruleTcpIpEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__TcpIpEndpoint__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__TcpIpEndpoint__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__TcpIpEndpoint__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__TcpIpEndpoint__Group__0 )
            {
             before(grammarAccess.getTcpIpEndpointAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__TcpIpEndpoint__Group__0 )
            // InternalDsl.g:369:4: rule__TcpIpEndpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TcpIpEndpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTcpIpEndpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTcpIpEndpoint"


    // $ANTLR start "ruleMeasurementDataUnit"
    // InternalDsl.g:378:1: ruleMeasurementDataUnit : ( ( rule__MeasurementDataUnit__Alternatives ) ) ;
    public final void ruleMeasurementDataUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:382:1: ( ( ( rule__MeasurementDataUnit__Alternatives ) ) )
            // InternalDsl.g:383:2: ( ( rule__MeasurementDataUnit__Alternatives ) )
            {
            // InternalDsl.g:383:2: ( ( rule__MeasurementDataUnit__Alternatives ) )
            // InternalDsl.g:384:3: ( rule__MeasurementDataUnit__Alternatives )
            {
             before(grammarAccess.getMeasurementDataUnitAccess().getAlternatives()); 
            // InternalDsl.g:385:3: ( rule__MeasurementDataUnit__Alternatives )
            // InternalDsl.g:385:4: rule__MeasurementDataUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementDataUnit"


    // $ANTLR start "ruleAggregation"
    // InternalDsl.g:394:1: ruleAggregation : ( ( rule__Aggregation__Alternatives ) ) ;
    public final void ruleAggregation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:398:1: ( ( ( rule__Aggregation__Alternatives ) ) )
            // InternalDsl.g:399:2: ( ( rule__Aggregation__Alternatives ) )
            {
            // InternalDsl.g:399:2: ( ( rule__Aggregation__Alternatives ) )
            // InternalDsl.g:400:3: ( rule__Aggregation__Alternatives )
            {
             before(grammarAccess.getAggregationAccess().getAlternatives()); 
            // InternalDsl.g:401:3: ( rule__Aggregation__Alternatives )
            // InternalDsl.g:401:4: rule__Aggregation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:409:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:413:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:414:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:414:2: ( RULE_STRING )
                    // InternalDsl.g:415:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:420:2: ( RULE_ID )
                    {
                    // InternalDsl.g:420:2: ( RULE_ID )
                    // InternalDsl.g:421:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalDsl.g:430:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:434:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:435:2: ( 'E' )
                    {
                    // InternalDsl.g:435:2: ( 'E' )
                    // InternalDsl.g:436:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:441:2: ( 'e' )
                    {
                    // InternalDsl.g:441:2: ( 'e' )
                    // InternalDsl.g:442:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__MeasurementDataUnit__Alternatives"
    // InternalDsl.g:451:1: rule__MeasurementDataUnit__Alternatives : ( ( ( 'METER' ) ) | ( ( 'METER_PER_SECOND' ) ) | ( ( 'METER_PER_SECOND_SQUARED' ) ) | ( ( 'DEGREE_CELSIUS' ) ) | ( ( 'RADIAN' ) ) | ( ( 'RADIAN_PER_SECOND' ) ) | ( ( 'BAR' ) ) | ( ( 'LITER' ) ) | ( ( 'GRAM' ) ) | ( ( 'NONE' ) ) );
    public final void rule__MeasurementDataUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:455:1: ( ( ( 'METER' ) ) | ( ( 'METER_PER_SECOND' ) ) | ( ( 'METER_PER_SECOND_SQUARED' ) ) | ( ( 'DEGREE_CELSIUS' ) ) | ( ( 'RADIAN' ) ) | ( ( 'RADIAN_PER_SECOND' ) ) | ( ( 'BAR' ) ) | ( ( 'LITER' ) ) | ( ( 'GRAM' ) ) | ( ( 'NONE' ) ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            case 22:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:456:2: ( ( 'METER' ) )
                    {
                    // InternalDsl.g:456:2: ( ( 'METER' ) )
                    // InternalDsl.g:457:3: ( 'METER' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getMETEREnumLiteralDeclaration_0()); 
                    // InternalDsl.g:458:3: ( 'METER' )
                    // InternalDsl.g:458:4: 'METER'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getMETEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:462:2: ( ( 'METER_PER_SECOND' ) )
                    {
                    // InternalDsl.g:462:2: ( ( 'METER_PER_SECOND' ) )
                    // InternalDsl.g:463:3: ( 'METER_PER_SECOND' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECONDEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:464:3: ( 'METER_PER_SECOND' )
                    // InternalDsl.g:464:4: 'METER_PER_SECOND'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECONDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:468:2: ( ( 'METER_PER_SECOND_SQUARED' ) )
                    {
                    // InternalDsl.g:468:2: ( ( 'METER_PER_SECOND_SQUARED' ) )
                    // InternalDsl.g:469:3: ( 'METER_PER_SECOND_SQUARED' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECOND_SQUAREDEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:470:3: ( 'METER_PER_SECOND_SQUARED' )
                    // InternalDsl.g:470:4: 'METER_PER_SECOND_SQUARED'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECOND_SQUAREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:474:2: ( ( 'DEGREE_CELSIUS' ) )
                    {
                    // InternalDsl.g:474:2: ( ( 'DEGREE_CELSIUS' ) )
                    // InternalDsl.g:475:3: ( 'DEGREE_CELSIUS' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getDEGREE_CELSIUSEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:476:3: ( 'DEGREE_CELSIUS' )
                    // InternalDsl.g:476:4: 'DEGREE_CELSIUS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getDEGREE_CELSIUSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:480:2: ( ( 'RADIAN' ) )
                    {
                    // InternalDsl.g:480:2: ( ( 'RADIAN' ) )
                    // InternalDsl.g:481:3: ( 'RADIAN' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getRADIANEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:482:3: ( 'RADIAN' )
                    // InternalDsl.g:482:4: 'RADIAN'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getRADIANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:486:2: ( ( 'RADIAN_PER_SECOND' ) )
                    {
                    // InternalDsl.g:486:2: ( ( 'RADIAN_PER_SECOND' ) )
                    // InternalDsl.g:487:3: ( 'RADIAN_PER_SECOND' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getRADIAN_PER_SECONDEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:488:3: ( 'RADIAN_PER_SECOND' )
                    // InternalDsl.g:488:4: 'RADIAN_PER_SECOND'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getRADIAN_PER_SECONDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:492:2: ( ( 'BAR' ) )
                    {
                    // InternalDsl.g:492:2: ( ( 'BAR' ) )
                    // InternalDsl.g:493:3: ( 'BAR' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getBAREnumLiteralDeclaration_6()); 
                    // InternalDsl.g:494:3: ( 'BAR' )
                    // InternalDsl.g:494:4: 'BAR'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getBAREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:498:2: ( ( 'LITER' ) )
                    {
                    // InternalDsl.g:498:2: ( ( 'LITER' ) )
                    // InternalDsl.g:499:3: ( 'LITER' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getLITEREnumLiteralDeclaration_7()); 
                    // InternalDsl.g:500:3: ( 'LITER' )
                    // InternalDsl.g:500:4: 'LITER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getLITEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:504:2: ( ( 'GRAM' ) )
                    {
                    // InternalDsl.g:504:2: ( ( 'GRAM' ) )
                    // InternalDsl.g:505:3: ( 'GRAM' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getGRAMEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:506:3: ( 'GRAM' )
                    // InternalDsl.g:506:4: 'GRAM'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getGRAMEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:510:2: ( ( 'NONE' ) )
                    {
                    // InternalDsl.g:510:2: ( ( 'NONE' ) )
                    // InternalDsl.g:511:3: ( 'NONE' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getNONEEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:512:3: ( 'NONE' )
                    // InternalDsl.g:512:4: 'NONE'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getNONEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementDataUnit__Alternatives"


    // $ANTLR start "rule__Aggregation__Alternatives"
    // InternalDsl.g:520:1: rule__Aggregation__Alternatives : ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AVERAGE' ) ) | ( ( 'FIRST' ) ) | ( ( 'LAST' ) ) | ( ( 'ALL' ) ) );
    public final void rule__Aggregation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:524:1: ( ( ( 'MIN' ) ) | ( ( 'MAX' ) ) | ( ( 'AVERAGE' ) ) | ( ( 'FIRST' ) ) | ( ( 'LAST' ) ) | ( ( 'ALL' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:525:2: ( ( 'MIN' ) )
                    {
                    // InternalDsl.g:525:2: ( ( 'MIN' ) )
                    // InternalDsl.g:526:3: ( 'MIN' )
                    {
                     before(grammarAccess.getAggregationAccess().getMINEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:527:3: ( 'MIN' )
                    // InternalDsl.g:527:4: 'MIN'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationAccess().getMINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:531:2: ( ( 'MAX' ) )
                    {
                    // InternalDsl.g:531:2: ( ( 'MAX' ) )
                    // InternalDsl.g:532:3: ( 'MAX' )
                    {
                     before(grammarAccess.getAggregationAccess().getMAXEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:533:3: ( 'MAX' )
                    // InternalDsl.g:533:4: 'MAX'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationAccess().getMAXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:537:2: ( ( 'AVERAGE' ) )
                    {
                    // InternalDsl.g:537:2: ( ( 'AVERAGE' ) )
                    // InternalDsl.g:538:3: ( 'AVERAGE' )
                    {
                     before(grammarAccess.getAggregationAccess().getAVERAGEEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:539:3: ( 'AVERAGE' )
                    // InternalDsl.g:539:4: 'AVERAGE'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationAccess().getAVERAGEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:543:2: ( ( 'FIRST' ) )
                    {
                    // InternalDsl.g:543:2: ( ( 'FIRST' ) )
                    // InternalDsl.g:544:3: ( 'FIRST' )
                    {
                     before(grammarAccess.getAggregationAccess().getFIRSTEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:545:3: ( 'FIRST' )
                    // InternalDsl.g:545:4: 'FIRST'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationAccess().getFIRSTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:549:2: ( ( 'LAST' ) )
                    {
                    // InternalDsl.g:549:2: ( ( 'LAST' ) )
                    // InternalDsl.g:550:3: ( 'LAST' )
                    {
                     before(grammarAccess.getAggregationAccess().getLASTEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:551:3: ( 'LAST' )
                    // InternalDsl.g:551:4: 'LAST'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationAccess().getLASTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:555:2: ( ( 'ALL' ) )
                    {
                    // InternalDsl.g:555:2: ( ( 'ALL' ) )
                    // InternalDsl.g:556:3: ( 'ALL' )
                    {
                     before(grammarAccess.getAggregationAccess().getALLEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:557:3: ( 'ALL' )
                    // InternalDsl.g:557:4: 'ALL'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationAccess().getALLEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Alternatives"


    // $ANTLR start "rule__DataCollector__Group__0"
    // InternalDsl.g:565:1: rule__DataCollector__Group__0 : rule__DataCollector__Group__0__Impl rule__DataCollector__Group__1 ;
    public final void rule__DataCollector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:569:1: ( rule__DataCollector__Group__0__Impl rule__DataCollector__Group__1 )
            // InternalDsl.g:570:2: rule__DataCollector__Group__0__Impl rule__DataCollector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataCollector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__0"


    // $ANTLR start "rule__DataCollector__Group__0__Impl"
    // InternalDsl.g:577:1: rule__DataCollector__Group__0__Impl : ( 'DataCollector' ) ;
    public final void rule__DataCollector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:1: ( ( 'DataCollector' ) )
            // InternalDsl.g:582:1: ( 'DataCollector' )
            {
            // InternalDsl.g:582:1: ( 'DataCollector' )
            // InternalDsl.g:583:2: 'DataCollector'
            {
             before(grammarAccess.getDataCollectorAccess().getDataCollectorKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getDataCollectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__0__Impl"


    // $ANTLR start "rule__DataCollector__Group__1"
    // InternalDsl.g:592:1: rule__DataCollector__Group__1 : rule__DataCollector__Group__1__Impl rule__DataCollector__Group__2 ;
    public final void rule__DataCollector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:596:1: ( rule__DataCollector__Group__1__Impl rule__DataCollector__Group__2 )
            // InternalDsl.g:597:2: rule__DataCollector__Group__1__Impl rule__DataCollector__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataCollector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__1"


    // $ANTLR start "rule__DataCollector__Group__1__Impl"
    // InternalDsl.g:604:1: rule__DataCollector__Group__1__Impl : ( '{' ) ;
    public final void rule__DataCollector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:608:1: ( ( '{' ) )
            // InternalDsl.g:609:1: ( '{' )
            {
            // InternalDsl.g:609:1: ( '{' )
            // InternalDsl.g:610:2: '{'
            {
             before(grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__1__Impl"


    // $ANTLR start "rule__DataCollector__Group__2"
    // InternalDsl.g:619:1: rule__DataCollector__Group__2 : rule__DataCollector__Group__2__Impl rule__DataCollector__Group__3 ;
    public final void rule__DataCollector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:623:1: ( rule__DataCollector__Group__2__Impl rule__DataCollector__Group__3 )
            // InternalDsl.g:624:2: rule__DataCollector__Group__2__Impl rule__DataCollector__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DataCollector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__2"


    // $ANTLR start "rule__DataCollector__Group__2__Impl"
    // InternalDsl.g:631:1: rule__DataCollector__Group__2__Impl : ( ( rule__DataCollector__DroneAssignment_2 ) ) ;
    public final void rule__DataCollector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:635:1: ( ( ( rule__DataCollector__DroneAssignment_2 ) ) )
            // InternalDsl.g:636:1: ( ( rule__DataCollector__DroneAssignment_2 ) )
            {
            // InternalDsl.g:636:1: ( ( rule__DataCollector__DroneAssignment_2 ) )
            // InternalDsl.g:637:2: ( rule__DataCollector__DroneAssignment_2 )
            {
             before(grammarAccess.getDataCollectorAccess().getDroneAssignment_2()); 
            // InternalDsl.g:638:2: ( rule__DataCollector__DroneAssignment_2 )
            // InternalDsl.g:638:3: rule__DataCollector__DroneAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__DroneAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getDroneAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__2__Impl"


    // $ANTLR start "rule__DataCollector__Group__3"
    // InternalDsl.g:646:1: rule__DataCollector__Group__3 : rule__DataCollector__Group__3__Impl rule__DataCollector__Group__4 ;
    public final void rule__DataCollector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:650:1: ( rule__DataCollector__Group__3__Impl rule__DataCollector__Group__4 )
            // InternalDsl.g:651:2: rule__DataCollector__Group__3__Impl rule__DataCollector__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DataCollector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__3"


    // $ANTLR start "rule__DataCollector__Group__3__Impl"
    // InternalDsl.g:658:1: rule__DataCollector__Group__3__Impl : ( ( rule__DataCollector__PubBrokerAssignment_3 ) ) ;
    public final void rule__DataCollector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:662:1: ( ( ( rule__DataCollector__PubBrokerAssignment_3 ) ) )
            // InternalDsl.g:663:1: ( ( rule__DataCollector__PubBrokerAssignment_3 ) )
            {
            // InternalDsl.g:663:1: ( ( rule__DataCollector__PubBrokerAssignment_3 ) )
            // InternalDsl.g:664:2: ( rule__DataCollector__PubBrokerAssignment_3 )
            {
             before(grammarAccess.getDataCollectorAccess().getPubBrokerAssignment_3()); 
            // InternalDsl.g:665:2: ( rule__DataCollector__PubBrokerAssignment_3 )
            // InternalDsl.g:665:3: rule__DataCollector__PubBrokerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__PubBrokerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getPubBrokerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__3__Impl"


    // $ANTLR start "rule__DataCollector__Group__4"
    // InternalDsl.g:673:1: rule__DataCollector__Group__4 : rule__DataCollector__Group__4__Impl rule__DataCollector__Group__5 ;
    public final void rule__DataCollector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( rule__DataCollector__Group__4__Impl rule__DataCollector__Group__5 )
            // InternalDsl.g:678:2: rule__DataCollector__Group__4__Impl rule__DataCollector__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DataCollector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__4"


    // $ANTLR start "rule__DataCollector__Group__4__Impl"
    // InternalDsl.g:685:1: rule__DataCollector__Group__4__Impl : ( ( rule__DataCollector__SubBrokerAssignment_4 ) ) ;
    public final void rule__DataCollector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:689:1: ( ( ( rule__DataCollector__SubBrokerAssignment_4 ) ) )
            // InternalDsl.g:690:1: ( ( rule__DataCollector__SubBrokerAssignment_4 ) )
            {
            // InternalDsl.g:690:1: ( ( rule__DataCollector__SubBrokerAssignment_4 ) )
            // InternalDsl.g:691:2: ( rule__DataCollector__SubBrokerAssignment_4 )
            {
             before(grammarAccess.getDataCollectorAccess().getSubBrokerAssignment_4()); 
            // InternalDsl.g:692:2: ( rule__DataCollector__SubBrokerAssignment_4 )
            // InternalDsl.g:692:3: rule__DataCollector__SubBrokerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__SubBrokerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getSubBrokerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__4__Impl"


    // $ANTLR start "rule__DataCollector__Group__5"
    // InternalDsl.g:700:1: rule__DataCollector__Group__5 : rule__DataCollector__Group__5__Impl rule__DataCollector__Group__6 ;
    public final void rule__DataCollector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( rule__DataCollector__Group__5__Impl rule__DataCollector__Group__6 )
            // InternalDsl.g:705:2: rule__DataCollector__Group__5__Impl rule__DataCollector__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__DataCollector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__5"


    // $ANTLR start "rule__DataCollector__Group__5__Impl"
    // InternalDsl.g:712:1: rule__DataCollector__Group__5__Impl : ( 'Publishers' ) ;
    public final void rule__DataCollector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:1: ( ( 'Publishers' ) )
            // InternalDsl.g:717:1: ( 'Publishers' )
            {
            // InternalDsl.g:717:1: ( 'Publishers' )
            // InternalDsl.g:718:2: 'Publishers'
            {
             before(grammarAccess.getDataCollectorAccess().getPublishersKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getPublishersKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__5__Impl"


    // $ANTLR start "rule__DataCollector__Group__6"
    // InternalDsl.g:727:1: rule__DataCollector__Group__6 : rule__DataCollector__Group__6__Impl rule__DataCollector__Group__7 ;
    public final void rule__DataCollector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:731:1: ( rule__DataCollector__Group__6__Impl rule__DataCollector__Group__7 )
            // InternalDsl.g:732:2: rule__DataCollector__Group__6__Impl rule__DataCollector__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__DataCollector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__6"


    // $ANTLR start "rule__DataCollector__Group__6__Impl"
    // InternalDsl.g:739:1: rule__DataCollector__Group__6__Impl : ( '{' ) ;
    public final void rule__DataCollector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:743:1: ( ( '{' ) )
            // InternalDsl.g:744:1: ( '{' )
            {
            // InternalDsl.g:744:1: ( '{' )
            // InternalDsl.g:745:2: '{'
            {
             before(grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__6__Impl"


    // $ANTLR start "rule__DataCollector__Group__7"
    // InternalDsl.g:754:1: rule__DataCollector__Group__7 : rule__DataCollector__Group__7__Impl rule__DataCollector__Group__8 ;
    public final void rule__DataCollector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( rule__DataCollector__Group__7__Impl rule__DataCollector__Group__8 )
            // InternalDsl.g:759:2: rule__DataCollector__Group__7__Impl rule__DataCollector__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__DataCollector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__7"


    // $ANTLR start "rule__DataCollector__Group__7__Impl"
    // InternalDsl.g:766:1: rule__DataCollector__Group__7__Impl : ( ( rule__DataCollector__PublishersAssignment_7 ) ) ;
    public final void rule__DataCollector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:770:1: ( ( ( rule__DataCollector__PublishersAssignment_7 ) ) )
            // InternalDsl.g:771:1: ( ( rule__DataCollector__PublishersAssignment_7 ) )
            {
            // InternalDsl.g:771:1: ( ( rule__DataCollector__PublishersAssignment_7 ) )
            // InternalDsl.g:772:2: ( rule__DataCollector__PublishersAssignment_7 )
            {
             before(grammarAccess.getDataCollectorAccess().getPublishersAssignment_7()); 
            // InternalDsl.g:773:2: ( rule__DataCollector__PublishersAssignment_7 )
            // InternalDsl.g:773:3: rule__DataCollector__PublishersAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__PublishersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getPublishersAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__7__Impl"


    // $ANTLR start "rule__DataCollector__Group__8"
    // InternalDsl.g:781:1: rule__DataCollector__Group__8 : rule__DataCollector__Group__8__Impl rule__DataCollector__Group__9 ;
    public final void rule__DataCollector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:785:1: ( rule__DataCollector__Group__8__Impl rule__DataCollector__Group__9 )
            // InternalDsl.g:786:2: rule__DataCollector__Group__8__Impl rule__DataCollector__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__DataCollector__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__8"


    // $ANTLR start "rule__DataCollector__Group__8__Impl"
    // InternalDsl.g:793:1: rule__DataCollector__Group__8__Impl : ( ';' ) ;
    public final void rule__DataCollector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:797:1: ( ( ';' ) )
            // InternalDsl.g:798:1: ( ';' )
            {
            // InternalDsl.g:798:1: ( ';' )
            // InternalDsl.g:799:2: ';'
            {
             before(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__8__Impl"


    // $ANTLR start "rule__DataCollector__Group__9"
    // InternalDsl.g:808:1: rule__DataCollector__Group__9 : rule__DataCollector__Group__9__Impl rule__DataCollector__Group__10 ;
    public final void rule__DataCollector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:812:1: ( rule__DataCollector__Group__9__Impl rule__DataCollector__Group__10 )
            // InternalDsl.g:813:2: rule__DataCollector__Group__9__Impl rule__DataCollector__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__DataCollector__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__9"


    // $ANTLR start "rule__DataCollector__Group__9__Impl"
    // InternalDsl.g:820:1: rule__DataCollector__Group__9__Impl : ( ( rule__DataCollector__Group_9__0 )* ) ;
    public final void rule__DataCollector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:824:1: ( ( ( rule__DataCollector__Group_9__0 )* ) )
            // InternalDsl.g:825:1: ( ( rule__DataCollector__Group_9__0 )* )
            {
            // InternalDsl.g:825:1: ( ( rule__DataCollector__Group_9__0 )* )
            // InternalDsl.g:826:2: ( rule__DataCollector__Group_9__0 )*
            {
             before(grammarAccess.getDataCollectorAccess().getGroup_9()); 
            // InternalDsl.g:827:2: ( rule__DataCollector__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==41) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:827:3: rule__DataCollector__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataCollector__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDataCollectorAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__9__Impl"


    // $ANTLR start "rule__DataCollector__Group__10"
    // InternalDsl.g:835:1: rule__DataCollector__Group__10 : rule__DataCollector__Group__10__Impl rule__DataCollector__Group__11 ;
    public final void rule__DataCollector__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:839:1: ( rule__DataCollector__Group__10__Impl rule__DataCollector__Group__11 )
            // InternalDsl.g:840:2: rule__DataCollector__Group__10__Impl rule__DataCollector__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__DataCollector__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__10"


    // $ANTLR start "rule__DataCollector__Group__10__Impl"
    // InternalDsl.g:847:1: rule__DataCollector__Group__10__Impl : ( '}' ) ;
    public final void rule__DataCollector__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:851:1: ( ( '}' ) )
            // InternalDsl.g:852:1: ( '}' )
            {
            // InternalDsl.g:852:1: ( '}' )
            // InternalDsl.g:853:2: '}'
            {
             before(grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__10__Impl"


    // $ANTLR start "rule__DataCollector__Group__11"
    // InternalDsl.g:862:1: rule__DataCollector__Group__11 : rule__DataCollector__Group__11__Impl rule__DataCollector__Group__12 ;
    public final void rule__DataCollector__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:1: ( rule__DataCollector__Group__11__Impl rule__DataCollector__Group__12 )
            // InternalDsl.g:867:2: rule__DataCollector__Group__11__Impl rule__DataCollector__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__DataCollector__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__11"


    // $ANTLR start "rule__DataCollector__Group__11__Impl"
    // InternalDsl.g:874:1: rule__DataCollector__Group__11__Impl : ( 'Subscriptions' ) ;
    public final void rule__DataCollector__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:878:1: ( ( 'Subscriptions' ) )
            // InternalDsl.g:879:1: ( 'Subscriptions' )
            {
            // InternalDsl.g:879:1: ( 'Subscriptions' )
            // InternalDsl.g:880:2: 'Subscriptions'
            {
             before(grammarAccess.getDataCollectorAccess().getSubscriptionsKeyword_11()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getSubscriptionsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__11__Impl"


    // $ANTLR start "rule__DataCollector__Group__12"
    // InternalDsl.g:889:1: rule__DataCollector__Group__12 : rule__DataCollector__Group__12__Impl rule__DataCollector__Group__13 ;
    public final void rule__DataCollector__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:893:1: ( rule__DataCollector__Group__12__Impl rule__DataCollector__Group__13 )
            // InternalDsl.g:894:2: rule__DataCollector__Group__12__Impl rule__DataCollector__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__DataCollector__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__12"


    // $ANTLR start "rule__DataCollector__Group__12__Impl"
    // InternalDsl.g:901:1: rule__DataCollector__Group__12__Impl : ( '{' ) ;
    public final void rule__DataCollector__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:905:1: ( ( '{' ) )
            // InternalDsl.g:906:1: ( '{' )
            {
            // InternalDsl.g:906:1: ( '{' )
            // InternalDsl.g:907:2: '{'
            {
             before(grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__12__Impl"


    // $ANTLR start "rule__DataCollector__Group__13"
    // InternalDsl.g:916:1: rule__DataCollector__Group__13 : rule__DataCollector__Group__13__Impl rule__DataCollector__Group__14 ;
    public final void rule__DataCollector__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:920:1: ( rule__DataCollector__Group__13__Impl rule__DataCollector__Group__14 )
            // InternalDsl.g:921:2: rule__DataCollector__Group__13__Impl rule__DataCollector__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__DataCollector__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__13"


    // $ANTLR start "rule__DataCollector__Group__13__Impl"
    // InternalDsl.g:928:1: rule__DataCollector__Group__13__Impl : ( ( rule__DataCollector__SubscribersAssignment_13 ) ) ;
    public final void rule__DataCollector__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:932:1: ( ( ( rule__DataCollector__SubscribersAssignment_13 ) ) )
            // InternalDsl.g:933:1: ( ( rule__DataCollector__SubscribersAssignment_13 ) )
            {
            // InternalDsl.g:933:1: ( ( rule__DataCollector__SubscribersAssignment_13 ) )
            // InternalDsl.g:934:2: ( rule__DataCollector__SubscribersAssignment_13 )
            {
             before(grammarAccess.getDataCollectorAccess().getSubscribersAssignment_13()); 
            // InternalDsl.g:935:2: ( rule__DataCollector__SubscribersAssignment_13 )
            // InternalDsl.g:935:3: rule__DataCollector__SubscribersAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__SubscribersAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getSubscribersAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__13__Impl"


    // $ANTLR start "rule__DataCollector__Group__14"
    // InternalDsl.g:943:1: rule__DataCollector__Group__14 : rule__DataCollector__Group__14__Impl rule__DataCollector__Group__15 ;
    public final void rule__DataCollector__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:947:1: ( rule__DataCollector__Group__14__Impl rule__DataCollector__Group__15 )
            // InternalDsl.g:948:2: rule__DataCollector__Group__14__Impl rule__DataCollector__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__DataCollector__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__14"


    // $ANTLR start "rule__DataCollector__Group__14__Impl"
    // InternalDsl.g:955:1: rule__DataCollector__Group__14__Impl : ( ';' ) ;
    public final void rule__DataCollector__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:959:1: ( ( ';' ) )
            // InternalDsl.g:960:1: ( ';' )
            {
            // InternalDsl.g:960:1: ( ';' )
            // InternalDsl.g:961:2: ';'
            {
             before(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_14()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__14__Impl"


    // $ANTLR start "rule__DataCollector__Group__15"
    // InternalDsl.g:970:1: rule__DataCollector__Group__15 : rule__DataCollector__Group__15__Impl rule__DataCollector__Group__16 ;
    public final void rule__DataCollector__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:974:1: ( rule__DataCollector__Group__15__Impl rule__DataCollector__Group__16 )
            // InternalDsl.g:975:2: rule__DataCollector__Group__15__Impl rule__DataCollector__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__DataCollector__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__15"


    // $ANTLR start "rule__DataCollector__Group__15__Impl"
    // InternalDsl.g:982:1: rule__DataCollector__Group__15__Impl : ( ( rule__DataCollector__Group_15__0 )* ) ;
    public final void rule__DataCollector__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:986:1: ( ( ( rule__DataCollector__Group_15__0 )* ) )
            // InternalDsl.g:987:1: ( ( rule__DataCollector__Group_15__0 )* )
            {
            // InternalDsl.g:987:1: ( ( rule__DataCollector__Group_15__0 )* )
            // InternalDsl.g:988:2: ( rule__DataCollector__Group_15__0 )*
            {
             before(grammarAccess.getDataCollectorAccess().getGroup_15()); 
            // InternalDsl.g:989:2: ( rule__DataCollector__Group_15__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:989:3: rule__DataCollector__Group_15__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DataCollector__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataCollectorAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__15__Impl"


    // $ANTLR start "rule__DataCollector__Group__16"
    // InternalDsl.g:997:1: rule__DataCollector__Group__16 : rule__DataCollector__Group__16__Impl rule__DataCollector__Group__17 ;
    public final void rule__DataCollector__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1001:1: ( rule__DataCollector__Group__16__Impl rule__DataCollector__Group__17 )
            // InternalDsl.g:1002:2: rule__DataCollector__Group__16__Impl rule__DataCollector__Group__17
            {
            pushFollow(FOLLOW_16);
            rule__DataCollector__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__16"


    // $ANTLR start "rule__DataCollector__Group__16__Impl"
    // InternalDsl.g:1009:1: rule__DataCollector__Group__16__Impl : ( '}' ) ;
    public final void rule__DataCollector__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1013:1: ( ( '}' ) )
            // InternalDsl.g:1014:1: ( '}' )
            {
            // InternalDsl.g:1014:1: ( '}' )
            // InternalDsl.g:1015:2: '}'
            {
             before(grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_16()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__16__Impl"


    // $ANTLR start "rule__DataCollector__Group__17"
    // InternalDsl.g:1024:1: rule__DataCollector__Group__17 : rule__DataCollector__Group__17__Impl ;
    public final void rule__DataCollector__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1028:1: ( rule__DataCollector__Group__17__Impl )
            // InternalDsl.g:1029:2: rule__DataCollector__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__17"


    // $ANTLR start "rule__DataCollector__Group__17__Impl"
    // InternalDsl.g:1035:1: rule__DataCollector__Group__17__Impl : ( '}' ) ;
    public final void rule__DataCollector__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( ( '}' ) )
            // InternalDsl.g:1040:1: ( '}' )
            {
            // InternalDsl.g:1040:1: ( '}' )
            // InternalDsl.g:1041:2: '}'
            {
             before(grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_17()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group__17__Impl"


    // $ANTLR start "rule__DataCollector__Group_9__0"
    // InternalDsl.g:1051:1: rule__DataCollector__Group_9__0 : rule__DataCollector__Group_9__0__Impl rule__DataCollector__Group_9__1 ;
    public final void rule__DataCollector__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1055:1: ( rule__DataCollector__Group_9__0__Impl rule__DataCollector__Group_9__1 )
            // InternalDsl.g:1056:2: rule__DataCollector__Group_9__0__Impl rule__DataCollector__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__DataCollector__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_9__0"


    // $ANTLR start "rule__DataCollector__Group_9__0__Impl"
    // InternalDsl.g:1063:1: rule__DataCollector__Group_9__0__Impl : ( ( rule__DataCollector__PublishersAssignment_9_0 ) ) ;
    public final void rule__DataCollector__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1067:1: ( ( ( rule__DataCollector__PublishersAssignment_9_0 ) ) )
            // InternalDsl.g:1068:1: ( ( rule__DataCollector__PublishersAssignment_9_0 ) )
            {
            // InternalDsl.g:1068:1: ( ( rule__DataCollector__PublishersAssignment_9_0 ) )
            // InternalDsl.g:1069:2: ( rule__DataCollector__PublishersAssignment_9_0 )
            {
             before(grammarAccess.getDataCollectorAccess().getPublishersAssignment_9_0()); 
            // InternalDsl.g:1070:2: ( rule__DataCollector__PublishersAssignment_9_0 )
            // InternalDsl.g:1070:3: rule__DataCollector__PublishersAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__PublishersAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getPublishersAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_9__0__Impl"


    // $ANTLR start "rule__DataCollector__Group_9__1"
    // InternalDsl.g:1078:1: rule__DataCollector__Group_9__1 : rule__DataCollector__Group_9__1__Impl ;
    public final void rule__DataCollector__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1082:1: ( rule__DataCollector__Group_9__1__Impl )
            // InternalDsl.g:1083:2: rule__DataCollector__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_9__1"


    // $ANTLR start "rule__DataCollector__Group_9__1__Impl"
    // InternalDsl.g:1089:1: rule__DataCollector__Group_9__1__Impl : ( ';' ) ;
    public final void rule__DataCollector__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1093:1: ( ( ';' ) )
            // InternalDsl.g:1094:1: ( ';' )
            {
            // InternalDsl.g:1094:1: ( ';' )
            // InternalDsl.g:1095:2: ';'
            {
             before(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_9_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_9__1__Impl"


    // $ANTLR start "rule__DataCollector__Group_15__0"
    // InternalDsl.g:1105:1: rule__DataCollector__Group_15__0 : rule__DataCollector__Group_15__0__Impl rule__DataCollector__Group_15__1 ;
    public final void rule__DataCollector__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1109:1: ( rule__DataCollector__Group_15__0__Impl rule__DataCollector__Group_15__1 )
            // InternalDsl.g:1110:2: rule__DataCollector__Group_15__0__Impl rule__DataCollector__Group_15__1
            {
            pushFollow(FOLLOW_9);
            rule__DataCollector__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataCollector__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_15__0"


    // $ANTLR start "rule__DataCollector__Group_15__0__Impl"
    // InternalDsl.g:1117:1: rule__DataCollector__Group_15__0__Impl : ( ( rule__DataCollector__SubscribersAssignment_15_0 ) ) ;
    public final void rule__DataCollector__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1121:1: ( ( ( rule__DataCollector__SubscribersAssignment_15_0 ) ) )
            // InternalDsl.g:1122:1: ( ( rule__DataCollector__SubscribersAssignment_15_0 ) )
            {
            // InternalDsl.g:1122:1: ( ( rule__DataCollector__SubscribersAssignment_15_0 ) )
            // InternalDsl.g:1123:2: ( rule__DataCollector__SubscribersAssignment_15_0 )
            {
             before(grammarAccess.getDataCollectorAccess().getSubscribersAssignment_15_0()); 
            // InternalDsl.g:1124:2: ( rule__DataCollector__SubscribersAssignment_15_0 )
            // InternalDsl.g:1124:3: rule__DataCollector__SubscribersAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__SubscribersAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getDataCollectorAccess().getSubscribersAssignment_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_15__0__Impl"


    // $ANTLR start "rule__DataCollector__Group_15__1"
    // InternalDsl.g:1132:1: rule__DataCollector__Group_15__1 : rule__DataCollector__Group_15__1__Impl ;
    public final void rule__DataCollector__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1136:1: ( rule__DataCollector__Group_15__1__Impl )
            // InternalDsl.g:1137:2: rule__DataCollector__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataCollector__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_15__1"


    // $ANTLR start "rule__DataCollector__Group_15__1__Impl"
    // InternalDsl.g:1143:1: rule__DataCollector__Group_15__1__Impl : ( ';' ) ;
    public final void rule__DataCollector__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1147:1: ( ( ';' ) )
            // InternalDsl.g:1148:1: ( ';' )
            {
            // InternalDsl.g:1148:1: ( ';' )
            // InternalDsl.g:1149:2: ';'
            {
             before(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_15_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataCollectorAccess().getSemicolonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__Group_15__1__Impl"


    // $ANTLR start "rule__Drone__Group__0"
    // InternalDsl.g:1159:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1163:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalDsl.g:1164:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Drone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__0"


    // $ANTLR start "rule__Drone__Group__0__Impl"
    // InternalDsl.g:1171:1: rule__Drone__Group__0__Impl : ( 'Drone' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1175:1: ( ( 'Drone' ) )
            // InternalDsl.g:1176:1: ( 'Drone' )
            {
            // InternalDsl.g:1176:1: ( 'Drone' )
            // InternalDsl.g:1177:2: 'Drone'
            {
             before(grammarAccess.getDroneAccess().getDroneKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getDroneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__0__Impl"


    // $ANTLR start "rule__Drone__Group__1"
    // InternalDsl.g:1186:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1190:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalDsl.g:1191:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Drone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__1"


    // $ANTLR start "rule__Drone__Group__1__Impl"
    // InternalDsl.g:1198:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__NameAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1202:1: ( ( ( rule__Drone__NameAssignment_1 ) ) )
            // InternalDsl.g:1203:1: ( ( rule__Drone__NameAssignment_1 ) )
            {
            // InternalDsl.g:1203:1: ( ( rule__Drone__NameAssignment_1 ) )
            // InternalDsl.g:1204:2: ( rule__Drone__NameAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getNameAssignment_1()); 
            // InternalDsl.g:1205:2: ( rule__Drone__NameAssignment_1 )
            // InternalDsl.g:1205:3: rule__Drone__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Drone__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__1__Impl"


    // $ANTLR start "rule__Drone__Group__2"
    // InternalDsl.g:1213:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1217:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalDsl.g:1218:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Drone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__2"


    // $ANTLR start "rule__Drone__Group__2__Impl"
    // InternalDsl.g:1225:1: rule__Drone__Group__2__Impl : ( '{' ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1229:1: ( ( '{' ) )
            // InternalDsl.g:1230:1: ( '{' )
            {
            // InternalDsl.g:1230:1: ( '{' )
            // InternalDsl.g:1231:2: '{'
            {
             before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__2__Impl"


    // $ANTLR start "rule__Drone__Group__3"
    // InternalDsl.g:1240:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl rule__Drone__Group__4 ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1244:1: ( rule__Drone__Group__3__Impl rule__Drone__Group__4 )
            // InternalDsl.g:1245:2: rule__Drone__Group__3__Impl rule__Drone__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Drone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__3"


    // $ANTLR start "rule__Drone__Group__3__Impl"
    // InternalDsl.g:1252:1: rule__Drone__Group__3__Impl : ( 'Sensors' ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1256:1: ( ( 'Sensors' ) )
            // InternalDsl.g:1257:1: ( 'Sensors' )
            {
            // InternalDsl.g:1257:1: ( 'Sensors' )
            // InternalDsl.g:1258:2: 'Sensors'
            {
             before(grammarAccess.getDroneAccess().getSensorsKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getSensorsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__3__Impl"


    // $ANTLR start "rule__Drone__Group__4"
    // InternalDsl.g:1267:1: rule__Drone__Group__4 : rule__Drone__Group__4__Impl rule__Drone__Group__5 ;
    public final void rule__Drone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1271:1: ( rule__Drone__Group__4__Impl rule__Drone__Group__5 )
            // InternalDsl.g:1272:2: rule__Drone__Group__4__Impl rule__Drone__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Drone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__4"


    // $ANTLR start "rule__Drone__Group__4__Impl"
    // InternalDsl.g:1279:1: rule__Drone__Group__4__Impl : ( '{' ) ;
    public final void rule__Drone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1283:1: ( ( '{' ) )
            // InternalDsl.g:1284:1: ( '{' )
            {
            // InternalDsl.g:1284:1: ( '{' )
            // InternalDsl.g:1285:2: '{'
            {
             before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__4__Impl"


    // $ANTLR start "rule__Drone__Group__5"
    // InternalDsl.g:1294:1: rule__Drone__Group__5 : rule__Drone__Group__5__Impl rule__Drone__Group__6 ;
    public final void rule__Drone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1298:1: ( rule__Drone__Group__5__Impl rule__Drone__Group__6 )
            // InternalDsl.g:1299:2: rule__Drone__Group__5__Impl rule__Drone__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Drone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__5"


    // $ANTLR start "rule__Drone__Group__5__Impl"
    // InternalDsl.g:1306:1: rule__Drone__Group__5__Impl : ( ( rule__Drone__SensorsDroneAssignment_5 ) ) ;
    public final void rule__Drone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1310:1: ( ( ( rule__Drone__SensorsDroneAssignment_5 ) ) )
            // InternalDsl.g:1311:1: ( ( rule__Drone__SensorsDroneAssignment_5 ) )
            {
            // InternalDsl.g:1311:1: ( ( rule__Drone__SensorsDroneAssignment_5 ) )
            // InternalDsl.g:1312:2: ( rule__Drone__SensorsDroneAssignment_5 )
            {
             before(grammarAccess.getDroneAccess().getSensorsDroneAssignment_5()); 
            // InternalDsl.g:1313:2: ( rule__Drone__SensorsDroneAssignment_5 )
            // InternalDsl.g:1313:3: rule__Drone__SensorsDroneAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Drone__SensorsDroneAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getSensorsDroneAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__5__Impl"


    // $ANTLR start "rule__Drone__Group__6"
    // InternalDsl.g:1321:1: rule__Drone__Group__6 : rule__Drone__Group__6__Impl rule__Drone__Group__7 ;
    public final void rule__Drone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1325:1: ( rule__Drone__Group__6__Impl rule__Drone__Group__7 )
            // InternalDsl.g:1326:2: rule__Drone__Group__6__Impl rule__Drone__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Drone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__6"


    // $ANTLR start "rule__Drone__Group__6__Impl"
    // InternalDsl.g:1333:1: rule__Drone__Group__6__Impl : ( ( rule__Drone__SensorsDroneAssignment_6 )* ) ;
    public final void rule__Drone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1337:1: ( ( ( rule__Drone__SensorsDroneAssignment_6 )* ) )
            // InternalDsl.g:1338:1: ( ( rule__Drone__SensorsDroneAssignment_6 )* )
            {
            // InternalDsl.g:1338:1: ( ( rule__Drone__SensorsDroneAssignment_6 )* )
            // InternalDsl.g:1339:2: ( rule__Drone__SensorsDroneAssignment_6 )*
            {
             before(grammarAccess.getDroneAccess().getSensorsDroneAssignment_6()); 
            // InternalDsl.g:1340:2: ( rule__Drone__SensorsDroneAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==44) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:1340:3: rule__Drone__SensorsDroneAssignment_6
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Drone__SensorsDroneAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDroneAccess().getSensorsDroneAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__6__Impl"


    // $ANTLR start "rule__Drone__Group__7"
    // InternalDsl.g:1348:1: rule__Drone__Group__7 : rule__Drone__Group__7__Impl rule__Drone__Group__8 ;
    public final void rule__Drone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1352:1: ( rule__Drone__Group__7__Impl rule__Drone__Group__8 )
            // InternalDsl.g:1353:2: rule__Drone__Group__7__Impl rule__Drone__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Drone__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__7"


    // $ANTLR start "rule__Drone__Group__7__Impl"
    // InternalDsl.g:1360:1: rule__Drone__Group__7__Impl : ( '}' ) ;
    public final void rule__Drone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1364:1: ( ( '}' ) )
            // InternalDsl.g:1365:1: ( '}' )
            {
            // InternalDsl.g:1365:1: ( '}' )
            // InternalDsl.g:1366:2: '}'
            {
             before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__7__Impl"


    // $ANTLR start "rule__Drone__Group__8"
    // InternalDsl.g:1375:1: rule__Drone__Group__8 : rule__Drone__Group__8__Impl ;
    public final void rule__Drone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1379:1: ( rule__Drone__Group__8__Impl )
            // InternalDsl.g:1380:2: rule__Drone__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__8"


    // $ANTLR start "rule__Drone__Group__8__Impl"
    // InternalDsl.g:1386:1: rule__Drone__Group__8__Impl : ( '}' ) ;
    public final void rule__Drone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1390:1: ( ( '}' ) )
            // InternalDsl.g:1391:1: ( '}' )
            {
            // InternalDsl.g:1391:1: ( '}' )
            // InternalDsl.g:1392:2: '}'
            {
             before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__8__Impl"


    // $ANTLR start "rule__PubBroker__Group__0"
    // InternalDsl.g:1402:1: rule__PubBroker__Group__0 : rule__PubBroker__Group__0__Impl rule__PubBroker__Group__1 ;
    public final void rule__PubBroker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1406:1: ( rule__PubBroker__Group__0__Impl rule__PubBroker__Group__1 )
            // InternalDsl.g:1407:2: rule__PubBroker__Group__0__Impl rule__PubBroker__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PubBroker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__0"


    // $ANTLR start "rule__PubBroker__Group__0__Impl"
    // InternalDsl.g:1414:1: rule__PubBroker__Group__0__Impl : ( 'PubBroker' ) ;
    public final void rule__PubBroker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1418:1: ( ( 'PubBroker' ) )
            // InternalDsl.g:1419:1: ( 'PubBroker' )
            {
            // InternalDsl.g:1419:1: ( 'PubBroker' )
            // InternalDsl.g:1420:2: 'PubBroker'
            {
             before(grammarAccess.getPubBrokerAccess().getPubBrokerKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPubBrokerAccess().getPubBrokerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__0__Impl"


    // $ANTLR start "rule__PubBroker__Group__1"
    // InternalDsl.g:1429:1: rule__PubBroker__Group__1 : rule__PubBroker__Group__1__Impl rule__PubBroker__Group__2 ;
    public final void rule__PubBroker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1433:1: ( rule__PubBroker__Group__1__Impl rule__PubBroker__Group__2 )
            // InternalDsl.g:1434:2: rule__PubBroker__Group__1__Impl rule__PubBroker__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PubBroker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__1"


    // $ANTLR start "rule__PubBroker__Group__1__Impl"
    // InternalDsl.g:1441:1: rule__PubBroker__Group__1__Impl : ( ( rule__PubBroker__NameAssignment_1 ) ) ;
    public final void rule__PubBroker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1445:1: ( ( ( rule__PubBroker__NameAssignment_1 ) ) )
            // InternalDsl.g:1446:1: ( ( rule__PubBroker__NameAssignment_1 ) )
            {
            // InternalDsl.g:1446:1: ( ( rule__PubBroker__NameAssignment_1 ) )
            // InternalDsl.g:1447:2: ( rule__PubBroker__NameAssignment_1 )
            {
             before(grammarAccess.getPubBrokerAccess().getNameAssignment_1()); 
            // InternalDsl.g:1448:2: ( rule__PubBroker__NameAssignment_1 )
            // InternalDsl.g:1448:3: rule__PubBroker__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PubBroker__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPubBrokerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__1__Impl"


    // $ANTLR start "rule__PubBroker__Group__2"
    // InternalDsl.g:1456:1: rule__PubBroker__Group__2 : rule__PubBroker__Group__2__Impl rule__PubBroker__Group__3 ;
    public final void rule__PubBroker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1460:1: ( rule__PubBroker__Group__2__Impl rule__PubBroker__Group__3 )
            // InternalDsl.g:1461:2: rule__PubBroker__Group__2__Impl rule__PubBroker__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PubBroker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__2"


    // $ANTLR start "rule__PubBroker__Group__2__Impl"
    // InternalDsl.g:1468:1: rule__PubBroker__Group__2__Impl : ( '(' ) ;
    public final void rule__PubBroker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1472:1: ( ( '(' ) )
            // InternalDsl.g:1473:1: ( '(' )
            {
            // InternalDsl.g:1473:1: ( '(' )
            // InternalDsl.g:1474:2: '('
            {
             before(grammarAccess.getPubBrokerAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPubBrokerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__2__Impl"


    // $ANTLR start "rule__PubBroker__Group__3"
    // InternalDsl.g:1483:1: rule__PubBroker__Group__3 : rule__PubBroker__Group__3__Impl rule__PubBroker__Group__4 ;
    public final void rule__PubBroker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1487:1: ( rule__PubBroker__Group__3__Impl rule__PubBroker__Group__4 )
            // InternalDsl.g:1488:2: rule__PubBroker__Group__3__Impl rule__PubBroker__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__PubBroker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__3"


    // $ANTLR start "rule__PubBroker__Group__3__Impl"
    // InternalDsl.g:1495:1: rule__PubBroker__Group__3__Impl : ( ( rule__PubBroker__IdAssignment_3 ) ) ;
    public final void rule__PubBroker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1499:1: ( ( ( rule__PubBroker__IdAssignment_3 ) ) )
            // InternalDsl.g:1500:1: ( ( rule__PubBroker__IdAssignment_3 ) )
            {
            // InternalDsl.g:1500:1: ( ( rule__PubBroker__IdAssignment_3 ) )
            // InternalDsl.g:1501:2: ( rule__PubBroker__IdAssignment_3 )
            {
             before(grammarAccess.getPubBrokerAccess().getIdAssignment_3()); 
            // InternalDsl.g:1502:2: ( rule__PubBroker__IdAssignment_3 )
            // InternalDsl.g:1502:3: rule__PubBroker__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PubBroker__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPubBrokerAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__3__Impl"


    // $ANTLR start "rule__PubBroker__Group__4"
    // InternalDsl.g:1510:1: rule__PubBroker__Group__4 : rule__PubBroker__Group__4__Impl rule__PubBroker__Group__5 ;
    public final void rule__PubBroker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1514:1: ( rule__PubBroker__Group__4__Impl rule__PubBroker__Group__5 )
            // InternalDsl.g:1515:2: rule__PubBroker__Group__4__Impl rule__PubBroker__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__PubBroker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__4"


    // $ANTLR start "rule__PubBroker__Group__4__Impl"
    // InternalDsl.g:1522:1: rule__PubBroker__Group__4__Impl : ( ',' ) ;
    public final void rule__PubBroker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1526:1: ( ( ',' ) )
            // InternalDsl.g:1527:1: ( ',' )
            {
            // InternalDsl.g:1527:1: ( ',' )
            // InternalDsl.g:1528:2: ','
            {
             before(grammarAccess.getPubBrokerAccess().getCommaKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPubBrokerAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__4__Impl"


    // $ANTLR start "rule__PubBroker__Group__5"
    // InternalDsl.g:1537:1: rule__PubBroker__Group__5 : rule__PubBroker__Group__5__Impl rule__PubBroker__Group__6 ;
    public final void rule__PubBroker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1541:1: ( rule__PubBroker__Group__5__Impl rule__PubBroker__Group__6 )
            // InternalDsl.g:1542:2: rule__PubBroker__Group__5__Impl rule__PubBroker__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__PubBroker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__5"


    // $ANTLR start "rule__PubBroker__Group__5__Impl"
    // InternalDsl.g:1549:1: rule__PubBroker__Group__5__Impl : ( ( rule__PubBroker__LogPathAssignment_5 ) ) ;
    public final void rule__PubBroker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1553:1: ( ( ( rule__PubBroker__LogPathAssignment_5 ) ) )
            // InternalDsl.g:1554:1: ( ( rule__PubBroker__LogPathAssignment_5 ) )
            {
            // InternalDsl.g:1554:1: ( ( rule__PubBroker__LogPathAssignment_5 ) )
            // InternalDsl.g:1555:2: ( rule__PubBroker__LogPathAssignment_5 )
            {
             before(grammarAccess.getPubBrokerAccess().getLogPathAssignment_5()); 
            // InternalDsl.g:1556:2: ( rule__PubBroker__LogPathAssignment_5 )
            // InternalDsl.g:1556:3: rule__PubBroker__LogPathAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PubBroker__LogPathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPubBrokerAccess().getLogPathAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__5__Impl"


    // $ANTLR start "rule__PubBroker__Group__6"
    // InternalDsl.g:1564:1: rule__PubBroker__Group__6 : rule__PubBroker__Group__6__Impl rule__PubBroker__Group__7 ;
    public final void rule__PubBroker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1568:1: ( rule__PubBroker__Group__6__Impl rule__PubBroker__Group__7 )
            // InternalDsl.g:1569:2: rule__PubBroker__Group__6__Impl rule__PubBroker__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__PubBroker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__6"


    // $ANTLR start "rule__PubBroker__Group__6__Impl"
    // InternalDsl.g:1576:1: rule__PubBroker__Group__6__Impl : ( ')' ) ;
    public final void rule__PubBroker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1580:1: ( ( ')' ) )
            // InternalDsl.g:1581:1: ( ')' )
            {
            // InternalDsl.g:1581:1: ( ')' )
            // InternalDsl.g:1582:2: ')'
            {
             before(grammarAccess.getPubBrokerAccess().getRightParenthesisKeyword_6()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPubBrokerAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__6__Impl"


    // $ANTLR start "rule__PubBroker__Group__7"
    // InternalDsl.g:1591:1: rule__PubBroker__Group__7 : rule__PubBroker__Group__7__Impl ;
    public final void rule__PubBroker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1595:1: ( rule__PubBroker__Group__7__Impl )
            // InternalDsl.g:1596:2: rule__PubBroker__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PubBroker__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__7"


    // $ANTLR start "rule__PubBroker__Group__7__Impl"
    // InternalDsl.g:1602:1: rule__PubBroker__Group__7__Impl : ( ';' ) ;
    public final void rule__PubBroker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1606:1: ( ( ';' ) )
            // InternalDsl.g:1607:1: ( ';' )
            {
            // InternalDsl.g:1607:1: ( ';' )
            // InternalDsl.g:1608:2: ';'
            {
             before(grammarAccess.getPubBrokerAccess().getSemicolonKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPubBrokerAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__Group__7__Impl"


    // $ANTLR start "rule__Publisher__Group__0"
    // InternalDsl.g:1618:1: rule__Publisher__Group__0 : rule__Publisher__Group__0__Impl rule__Publisher__Group__1 ;
    public final void rule__Publisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1622:1: ( rule__Publisher__Group__0__Impl rule__Publisher__Group__1 )
            // InternalDsl.g:1623:2: rule__Publisher__Group__0__Impl rule__Publisher__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0"


    // $ANTLR start "rule__Publisher__Group__0__Impl"
    // InternalDsl.g:1630:1: rule__Publisher__Group__0__Impl : ( 'Publisher' ) ;
    public final void rule__Publisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1634:1: ( ( 'Publisher' ) )
            // InternalDsl.g:1635:1: ( 'Publisher' )
            {
            // InternalDsl.g:1635:1: ( 'Publisher' )
            // InternalDsl.g:1636:2: 'Publisher'
            {
             before(grammarAccess.getPublisherAccess().getPublisherKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getPublisherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0__Impl"


    // $ANTLR start "rule__Publisher__Group__1"
    // InternalDsl.g:1645:1: rule__Publisher__Group__1 : rule__Publisher__Group__1__Impl rule__Publisher__Group__2 ;
    public final void rule__Publisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1649:1: ( rule__Publisher__Group__1__Impl rule__Publisher__Group__2 )
            // InternalDsl.g:1650:2: rule__Publisher__Group__1__Impl rule__Publisher__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Publisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1"


    // $ANTLR start "rule__Publisher__Group__1__Impl"
    // InternalDsl.g:1657:1: rule__Publisher__Group__1__Impl : ( ( rule__Publisher__NameAssignment_1 ) ) ;
    public final void rule__Publisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1661:1: ( ( ( rule__Publisher__NameAssignment_1 ) ) )
            // InternalDsl.g:1662:1: ( ( rule__Publisher__NameAssignment_1 ) )
            {
            // InternalDsl.g:1662:1: ( ( rule__Publisher__NameAssignment_1 ) )
            // InternalDsl.g:1663:2: ( rule__Publisher__NameAssignment_1 )
            {
             before(grammarAccess.getPublisherAccess().getNameAssignment_1()); 
            // InternalDsl.g:1664:2: ( rule__Publisher__NameAssignment_1 )
            // InternalDsl.g:1664:3: rule__Publisher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1__Impl"


    // $ANTLR start "rule__Publisher__Group__2"
    // InternalDsl.g:1672:1: rule__Publisher__Group__2 : rule__Publisher__Group__2__Impl rule__Publisher__Group__3 ;
    public final void rule__Publisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1676:1: ( rule__Publisher__Group__2__Impl rule__Publisher__Group__3 )
            // InternalDsl.g:1677:2: rule__Publisher__Group__2__Impl rule__Publisher__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2"


    // $ANTLR start "rule__Publisher__Group__2__Impl"
    // InternalDsl.g:1684:1: rule__Publisher__Group__2__Impl : ( '(' ) ;
    public final void rule__Publisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1688:1: ( ( '(' ) )
            // InternalDsl.g:1689:1: ( '(' )
            {
            // InternalDsl.g:1689:1: ( '(' )
            // InternalDsl.g:1690:2: '('
            {
             before(grammarAccess.getPublisherAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2__Impl"


    // $ANTLR start "rule__Publisher__Group__3"
    // InternalDsl.g:1699:1: rule__Publisher__Group__3 : rule__Publisher__Group__3__Impl rule__Publisher__Group__4 ;
    public final void rule__Publisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1703:1: ( rule__Publisher__Group__3__Impl rule__Publisher__Group__4 )
            // InternalDsl.g:1704:2: rule__Publisher__Group__3__Impl rule__Publisher__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Publisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3"


    // $ANTLR start "rule__Publisher__Group__3__Impl"
    // InternalDsl.g:1711:1: rule__Publisher__Group__3__Impl : ( ( rule__Publisher__IdAssignment_3 ) ) ;
    public final void rule__Publisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1715:1: ( ( ( rule__Publisher__IdAssignment_3 ) ) )
            // InternalDsl.g:1716:1: ( ( rule__Publisher__IdAssignment_3 ) )
            {
            // InternalDsl.g:1716:1: ( ( rule__Publisher__IdAssignment_3 ) )
            // InternalDsl.g:1717:2: ( rule__Publisher__IdAssignment_3 )
            {
             before(grammarAccess.getPublisherAccess().getIdAssignment_3()); 
            // InternalDsl.g:1718:2: ( rule__Publisher__IdAssignment_3 )
            // InternalDsl.g:1718:3: rule__Publisher__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3__Impl"


    // $ANTLR start "rule__Publisher__Group__4"
    // InternalDsl.g:1726:1: rule__Publisher__Group__4 : rule__Publisher__Group__4__Impl rule__Publisher__Group__5 ;
    public final void rule__Publisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1730:1: ( rule__Publisher__Group__4__Impl rule__Publisher__Group__5 )
            // InternalDsl.g:1731:2: rule__Publisher__Group__4__Impl rule__Publisher__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Publisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4"


    // $ANTLR start "rule__Publisher__Group__4__Impl"
    // InternalDsl.g:1738:1: rule__Publisher__Group__4__Impl : ( ',' ) ;
    public final void rule__Publisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1742:1: ( ( ',' ) )
            // InternalDsl.g:1743:1: ( ',' )
            {
            // InternalDsl.g:1743:1: ( ',' )
            // InternalDsl.g:1744:2: ','
            {
             before(grammarAccess.getPublisherAccess().getCommaKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4__Impl"


    // $ANTLR start "rule__Publisher__Group__5"
    // InternalDsl.g:1753:1: rule__Publisher__Group__5 : rule__Publisher__Group__5__Impl rule__Publisher__Group__6 ;
    public final void rule__Publisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1757:1: ( rule__Publisher__Group__5__Impl rule__Publisher__Group__6 )
            // InternalDsl.g:1758:2: rule__Publisher__Group__5__Impl rule__Publisher__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Publisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5"


    // $ANTLR start "rule__Publisher__Group__5__Impl"
    // InternalDsl.g:1765:1: rule__Publisher__Group__5__Impl : ( ( rule__Publisher__PeriodAssignment_5 ) ) ;
    public final void rule__Publisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1769:1: ( ( ( rule__Publisher__PeriodAssignment_5 ) ) )
            // InternalDsl.g:1770:1: ( ( rule__Publisher__PeriodAssignment_5 ) )
            {
            // InternalDsl.g:1770:1: ( ( rule__Publisher__PeriodAssignment_5 ) )
            // InternalDsl.g:1771:2: ( rule__Publisher__PeriodAssignment_5 )
            {
             before(grammarAccess.getPublisherAccess().getPeriodAssignment_5()); 
            // InternalDsl.g:1772:2: ( rule__Publisher__PeriodAssignment_5 )
            // InternalDsl.g:1772:3: rule__Publisher__PeriodAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__PeriodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getPeriodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5__Impl"


    // $ANTLR start "rule__Publisher__Group__6"
    // InternalDsl.g:1780:1: rule__Publisher__Group__6 : rule__Publisher__Group__6__Impl rule__Publisher__Group__7 ;
    public final void rule__Publisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1784:1: ( rule__Publisher__Group__6__Impl rule__Publisher__Group__7 )
            // InternalDsl.g:1785:2: rule__Publisher__Group__6__Impl rule__Publisher__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6"


    // $ANTLR start "rule__Publisher__Group__6__Impl"
    // InternalDsl.g:1792:1: rule__Publisher__Group__6__Impl : ( ',' ) ;
    public final void rule__Publisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1796:1: ( ( ',' ) )
            // InternalDsl.g:1797:1: ( ',' )
            {
            // InternalDsl.g:1797:1: ( ',' )
            // InternalDsl.g:1798:2: ','
            {
             before(grammarAccess.getPublisherAccess().getCommaKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6__Impl"


    // $ANTLR start "rule__Publisher__Group__7"
    // InternalDsl.g:1807:1: rule__Publisher__Group__7 : rule__Publisher__Group__7__Impl rule__Publisher__Group__8 ;
    public final void rule__Publisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1811:1: ( rule__Publisher__Group__7__Impl rule__Publisher__Group__8 )
            // InternalDsl.g:1812:2: rule__Publisher__Group__7__Impl rule__Publisher__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Publisher__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__7"


    // $ANTLR start "rule__Publisher__Group__7__Impl"
    // InternalDsl.g:1819:1: rule__Publisher__Group__7__Impl : ( ( rule__Publisher__PublishedMeasuresAssignment_7 ) ) ;
    public final void rule__Publisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1823:1: ( ( ( rule__Publisher__PublishedMeasuresAssignment_7 ) ) )
            // InternalDsl.g:1824:1: ( ( rule__Publisher__PublishedMeasuresAssignment_7 ) )
            {
            // InternalDsl.g:1824:1: ( ( rule__Publisher__PublishedMeasuresAssignment_7 ) )
            // InternalDsl.g:1825:2: ( rule__Publisher__PublishedMeasuresAssignment_7 )
            {
             before(grammarAccess.getPublisherAccess().getPublishedMeasuresAssignment_7()); 
            // InternalDsl.g:1826:2: ( rule__Publisher__PublishedMeasuresAssignment_7 )
            // InternalDsl.g:1826:3: rule__Publisher__PublishedMeasuresAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__PublishedMeasuresAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getPublishedMeasuresAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__7__Impl"


    // $ANTLR start "rule__Publisher__Group__8"
    // InternalDsl.g:1834:1: rule__Publisher__Group__8 : rule__Publisher__Group__8__Impl rule__Publisher__Group__9 ;
    public final void rule__Publisher__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1838:1: ( rule__Publisher__Group__8__Impl rule__Publisher__Group__9 )
            // InternalDsl.g:1839:2: rule__Publisher__Group__8__Impl rule__Publisher__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Publisher__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__8"


    // $ANTLR start "rule__Publisher__Group__8__Impl"
    // InternalDsl.g:1846:1: rule__Publisher__Group__8__Impl : ( ( rule__Publisher__Group_8__0 )* ) ;
    public final void rule__Publisher__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1850:1: ( ( ( rule__Publisher__Group_8__0 )* ) )
            // InternalDsl.g:1851:1: ( ( rule__Publisher__Group_8__0 )* )
            {
            // InternalDsl.g:1851:1: ( ( rule__Publisher__Group_8__0 )* )
            // InternalDsl.g:1852:2: ( rule__Publisher__Group_8__0 )*
            {
             before(grammarAccess.getPublisherAccess().getGroup_8()); 
            // InternalDsl.g:1853:2: ( rule__Publisher__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1853:3: rule__Publisher__Group_8__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Publisher__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPublisherAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__8__Impl"


    // $ANTLR start "rule__Publisher__Group__9"
    // InternalDsl.g:1861:1: rule__Publisher__Group__9 : rule__Publisher__Group__9__Impl ;
    public final void rule__Publisher__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1865:1: ( rule__Publisher__Group__9__Impl )
            // InternalDsl.g:1866:2: rule__Publisher__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__9"


    // $ANTLR start "rule__Publisher__Group__9__Impl"
    // InternalDsl.g:1872:1: rule__Publisher__Group__9__Impl : ( ')' ) ;
    public final void rule__Publisher__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1876:1: ( ( ')' ) )
            // InternalDsl.g:1877:1: ( ')' )
            {
            // InternalDsl.g:1877:1: ( ')' )
            // InternalDsl.g:1878:2: ')'
            {
             before(grammarAccess.getPublisherAccess().getRightParenthesisKeyword_9()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__9__Impl"


    // $ANTLR start "rule__Publisher__Group_8__0"
    // InternalDsl.g:1888:1: rule__Publisher__Group_8__0 : rule__Publisher__Group_8__0__Impl rule__Publisher__Group_8__1 ;
    public final void rule__Publisher__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1892:1: ( rule__Publisher__Group_8__0__Impl rule__Publisher__Group_8__1 )
            // InternalDsl.g:1893:2: rule__Publisher__Group_8__0__Impl rule__Publisher__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Publisher__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_8__0"


    // $ANTLR start "rule__Publisher__Group_8__0__Impl"
    // InternalDsl.g:1900:1: rule__Publisher__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Publisher__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1904:1: ( ( ',' ) )
            // InternalDsl.g:1905:1: ( ',' )
            {
            // InternalDsl.g:1905:1: ( ',' )
            // InternalDsl.g:1906:2: ','
            {
             before(grammarAccess.getPublisherAccess().getCommaKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_8__0__Impl"


    // $ANTLR start "rule__Publisher__Group_8__1"
    // InternalDsl.g:1915:1: rule__Publisher__Group_8__1 : rule__Publisher__Group_8__1__Impl ;
    public final void rule__Publisher__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1919:1: ( rule__Publisher__Group_8__1__Impl )
            // InternalDsl.g:1920:2: rule__Publisher__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_8__1"


    // $ANTLR start "rule__Publisher__Group_8__1__Impl"
    // InternalDsl.g:1926:1: rule__Publisher__Group_8__1__Impl : ( ( rule__Publisher__PublishedMeasuresAssignment_8_1 ) ) ;
    public final void rule__Publisher__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1930:1: ( ( ( rule__Publisher__PublishedMeasuresAssignment_8_1 ) ) )
            // InternalDsl.g:1931:1: ( ( rule__Publisher__PublishedMeasuresAssignment_8_1 ) )
            {
            // InternalDsl.g:1931:1: ( ( rule__Publisher__PublishedMeasuresAssignment_8_1 ) )
            // InternalDsl.g:1932:2: ( rule__Publisher__PublishedMeasuresAssignment_8_1 )
            {
             before(grammarAccess.getPublisherAccess().getPublishedMeasuresAssignment_8_1()); 
            // InternalDsl.g:1933:2: ( rule__Publisher__PublishedMeasuresAssignment_8_1 )
            // InternalDsl.g:1933:3: rule__Publisher__PublishedMeasuresAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__PublishedMeasuresAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getPublishedMeasuresAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_8__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__0"
    // InternalDsl.g:1942:1: rule__Subscriber__Group__0 : rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 ;
    public final void rule__Subscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1946:1: ( rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 )
            // InternalDsl.g:1947:2: rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0"


    // $ANTLR start "rule__Subscriber__Group__0__Impl"
    // InternalDsl.g:1954:1: rule__Subscriber__Group__0__Impl : ( 'Subscriber' ) ;
    public final void rule__Subscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1958:1: ( ( 'Subscriber' ) )
            // InternalDsl.g:1959:1: ( 'Subscriber' )
            {
            // InternalDsl.g:1959:1: ( 'Subscriber' )
            // InternalDsl.g:1960:2: 'Subscriber'
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getSubscriberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0__Impl"


    // $ANTLR start "rule__Subscriber__Group__1"
    // InternalDsl.g:1969:1: rule__Subscriber__Group__1 : rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 ;
    public final void rule__Subscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1973:1: ( rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 )
            // InternalDsl.g:1974:2: rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Subscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1"


    // $ANTLR start "rule__Subscriber__Group__1__Impl"
    // InternalDsl.g:1981:1: rule__Subscriber__Group__1__Impl : ( ( rule__Subscriber__NameAssignment_1 ) ) ;
    public final void rule__Subscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1985:1: ( ( ( rule__Subscriber__NameAssignment_1 ) ) )
            // InternalDsl.g:1986:1: ( ( rule__Subscriber__NameAssignment_1 ) )
            {
            // InternalDsl.g:1986:1: ( ( rule__Subscriber__NameAssignment_1 ) )
            // InternalDsl.g:1987:2: ( rule__Subscriber__NameAssignment_1 )
            {
             before(grammarAccess.getSubscriberAccess().getNameAssignment_1()); 
            // InternalDsl.g:1988:2: ( rule__Subscriber__NameAssignment_1 )
            // InternalDsl.g:1988:3: rule__Subscriber__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__2"
    // InternalDsl.g:1996:1: rule__Subscriber__Group__2 : rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 ;
    public final void rule__Subscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2000:1: ( rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 )
            // InternalDsl.g:2001:2: rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2"


    // $ANTLR start "rule__Subscriber__Group__2__Impl"
    // InternalDsl.g:2008:1: rule__Subscriber__Group__2__Impl : ( '(' ) ;
    public final void rule__Subscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2012:1: ( ( '(' ) )
            // InternalDsl.g:2013:1: ( '(' )
            {
            // InternalDsl.g:2013:1: ( '(' )
            // InternalDsl.g:2014:2: '('
            {
             before(grammarAccess.getSubscriberAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2__Impl"


    // $ANTLR start "rule__Subscriber__Group__3"
    // InternalDsl.g:2023:1: rule__Subscriber__Group__3 : rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 ;
    public final void rule__Subscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2027:1: ( rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 )
            // InternalDsl.g:2028:2: rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Subscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3"


    // $ANTLR start "rule__Subscriber__Group__3__Impl"
    // InternalDsl.g:2035:1: rule__Subscriber__Group__3__Impl : ( ( rule__Subscriber__IdAssignment_3 ) ) ;
    public final void rule__Subscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2039:1: ( ( ( rule__Subscriber__IdAssignment_3 ) ) )
            // InternalDsl.g:2040:1: ( ( rule__Subscriber__IdAssignment_3 ) )
            {
            // InternalDsl.g:2040:1: ( ( rule__Subscriber__IdAssignment_3 ) )
            // InternalDsl.g:2041:2: ( rule__Subscriber__IdAssignment_3 )
            {
             before(grammarAccess.getSubscriberAccess().getIdAssignment_3()); 
            // InternalDsl.g:2042:2: ( rule__Subscriber__IdAssignment_3 )
            // InternalDsl.g:2042:3: rule__Subscriber__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3__Impl"


    // $ANTLR start "rule__Subscriber__Group__4"
    // InternalDsl.g:2050:1: rule__Subscriber__Group__4 : rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 ;
    public final void rule__Subscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2054:1: ( rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 )
            // InternalDsl.g:2055:2: rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Subscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4"


    // $ANTLR start "rule__Subscriber__Group__4__Impl"
    // InternalDsl.g:2062:1: rule__Subscriber__Group__4__Impl : ( ',' ) ;
    public final void rule__Subscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2066:1: ( ( ',' ) )
            // InternalDsl.g:2067:1: ( ',' )
            {
            // InternalDsl.g:2067:1: ( ',' )
            // InternalDsl.g:2068:2: ','
            {
             before(grammarAccess.getSubscriberAccess().getCommaKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4__Impl"


    // $ANTLR start "rule__Subscriber__Group__5"
    // InternalDsl.g:2077:1: rule__Subscriber__Group__5 : rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 ;
    public final void rule__Subscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2081:1: ( rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 )
            // InternalDsl.g:2082:2: rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Subscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5"


    // $ANTLR start "rule__Subscriber__Group__5__Impl"
    // InternalDsl.g:2089:1: rule__Subscriber__Group__5__Impl : ( ( rule__Subscriber__MonitoredMeasureAssignment_5 ) ) ;
    public final void rule__Subscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2093:1: ( ( ( rule__Subscriber__MonitoredMeasureAssignment_5 ) ) )
            // InternalDsl.g:2094:1: ( ( rule__Subscriber__MonitoredMeasureAssignment_5 ) )
            {
            // InternalDsl.g:2094:1: ( ( rule__Subscriber__MonitoredMeasureAssignment_5 ) )
            // InternalDsl.g:2095:2: ( rule__Subscriber__MonitoredMeasureAssignment_5 )
            {
             before(grammarAccess.getSubscriberAccess().getMonitoredMeasureAssignment_5()); 
            // InternalDsl.g:2096:2: ( rule__Subscriber__MonitoredMeasureAssignment_5 )
            // InternalDsl.g:2096:3: rule__Subscriber__MonitoredMeasureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__MonitoredMeasureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getMonitoredMeasureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5__Impl"


    // $ANTLR start "rule__Subscriber__Group__6"
    // InternalDsl.g:2104:1: rule__Subscriber__Group__6 : rule__Subscriber__Group__6__Impl rule__Subscriber__Group__7 ;
    public final void rule__Subscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2108:1: ( rule__Subscriber__Group__6__Impl rule__Subscriber__Group__7 )
            // InternalDsl.g:2109:2: rule__Subscriber__Group__6__Impl rule__Subscriber__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Subscriber__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6"


    // $ANTLR start "rule__Subscriber__Group__6__Impl"
    // InternalDsl.g:2116:1: rule__Subscriber__Group__6__Impl : ( ',' ) ;
    public final void rule__Subscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2120:1: ( ( ',' ) )
            // InternalDsl.g:2121:1: ( ',' )
            {
            // InternalDsl.g:2121:1: ( ',' )
            // InternalDsl.g:2122:2: ','
            {
             before(grammarAccess.getSubscriberAccess().getCommaKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6__Impl"


    // $ANTLR start "rule__Subscriber__Group__7"
    // InternalDsl.g:2131:1: rule__Subscriber__Group__7 : rule__Subscriber__Group__7__Impl rule__Subscriber__Group__8 ;
    public final void rule__Subscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2135:1: ( rule__Subscriber__Group__7__Impl rule__Subscriber__Group__8 )
            // InternalDsl.g:2136:2: rule__Subscriber__Group__7__Impl rule__Subscriber__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Subscriber__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__7"


    // $ANTLR start "rule__Subscriber__Group__7__Impl"
    // InternalDsl.g:2143:1: rule__Subscriber__Group__7__Impl : ( ( rule__Subscriber__PeriodAssignment_7 ) ) ;
    public final void rule__Subscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2147:1: ( ( ( rule__Subscriber__PeriodAssignment_7 ) ) )
            // InternalDsl.g:2148:1: ( ( rule__Subscriber__PeriodAssignment_7 ) )
            {
            // InternalDsl.g:2148:1: ( ( rule__Subscriber__PeriodAssignment_7 ) )
            // InternalDsl.g:2149:2: ( rule__Subscriber__PeriodAssignment_7 )
            {
             before(grammarAccess.getSubscriberAccess().getPeriodAssignment_7()); 
            // InternalDsl.g:2150:2: ( rule__Subscriber__PeriodAssignment_7 )
            // InternalDsl.g:2150:3: rule__Subscriber__PeriodAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__PeriodAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getPeriodAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__7__Impl"


    // $ANTLR start "rule__Subscriber__Group__8"
    // InternalDsl.g:2158:1: rule__Subscriber__Group__8 : rule__Subscriber__Group__8__Impl rule__Subscriber__Group__9 ;
    public final void rule__Subscriber__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2162:1: ( rule__Subscriber__Group__8__Impl rule__Subscriber__Group__9 )
            // InternalDsl.g:2163:2: rule__Subscriber__Group__8__Impl rule__Subscriber__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Subscriber__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__8"


    // $ANTLR start "rule__Subscriber__Group__8__Impl"
    // InternalDsl.g:2170:1: rule__Subscriber__Group__8__Impl : ( ',' ) ;
    public final void rule__Subscriber__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2174:1: ( ( ',' ) )
            // InternalDsl.g:2175:1: ( ',' )
            {
            // InternalDsl.g:2175:1: ( ',' )
            // InternalDsl.g:2176:2: ','
            {
             before(grammarAccess.getSubscriberAccess().getCommaKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__8__Impl"


    // $ANTLR start "rule__Subscriber__Group__9"
    // InternalDsl.g:2185:1: rule__Subscriber__Group__9 : rule__Subscriber__Group__9__Impl rule__Subscriber__Group__10 ;
    public final void rule__Subscriber__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2189:1: ( rule__Subscriber__Group__9__Impl rule__Subscriber__Group__10 )
            // InternalDsl.g:2190:2: rule__Subscriber__Group__9__Impl rule__Subscriber__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__Subscriber__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__9"


    // $ANTLR start "rule__Subscriber__Group__9__Impl"
    // InternalDsl.g:2197:1: rule__Subscriber__Group__9__Impl : ( ( rule__Subscriber__AggregationAssignment_9 ) ) ;
    public final void rule__Subscriber__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2201:1: ( ( ( rule__Subscriber__AggregationAssignment_9 ) ) )
            // InternalDsl.g:2202:1: ( ( rule__Subscriber__AggregationAssignment_9 ) )
            {
            // InternalDsl.g:2202:1: ( ( rule__Subscriber__AggregationAssignment_9 ) )
            // InternalDsl.g:2203:2: ( rule__Subscriber__AggregationAssignment_9 )
            {
             before(grammarAccess.getSubscriberAccess().getAggregationAssignment_9()); 
            // InternalDsl.g:2204:2: ( rule__Subscriber__AggregationAssignment_9 )
            // InternalDsl.g:2204:3: rule__Subscriber__AggregationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__AggregationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getAggregationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__9__Impl"


    // $ANTLR start "rule__Subscriber__Group__10"
    // InternalDsl.g:2212:1: rule__Subscriber__Group__10 : rule__Subscriber__Group__10__Impl ;
    public final void rule__Subscriber__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2216:1: ( rule__Subscriber__Group__10__Impl )
            // InternalDsl.g:2217:2: rule__Subscriber__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__10"


    // $ANTLR start "rule__Subscriber__Group__10__Impl"
    // InternalDsl.g:2223:1: rule__Subscriber__Group__10__Impl : ( ')' ) ;
    public final void rule__Subscriber__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2227:1: ( ( ')' ) )
            // InternalDsl.g:2228:1: ( ')' )
            {
            // InternalDsl.g:2228:1: ( ')' )
            // InternalDsl.g:2229:2: ')'
            {
             before(grammarAccess.getSubscriberAccess().getRightParenthesisKeyword_10()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__10__Impl"


    // $ANTLR start "rule__SubBroker__Group__0"
    // InternalDsl.g:2239:1: rule__SubBroker__Group__0 : rule__SubBroker__Group__0__Impl rule__SubBroker__Group__1 ;
    public final void rule__SubBroker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2243:1: ( rule__SubBroker__Group__0__Impl rule__SubBroker__Group__1 )
            // InternalDsl.g:2244:2: rule__SubBroker__Group__0__Impl rule__SubBroker__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__SubBroker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__0"


    // $ANTLR start "rule__SubBroker__Group__0__Impl"
    // InternalDsl.g:2251:1: rule__SubBroker__Group__0__Impl : ( 'SubBroker' ) ;
    public final void rule__SubBroker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2255:1: ( ( 'SubBroker' ) )
            // InternalDsl.g:2256:1: ( 'SubBroker' )
            {
            // InternalDsl.g:2256:1: ( 'SubBroker' )
            // InternalDsl.g:2257:2: 'SubBroker'
            {
             before(grammarAccess.getSubBrokerAccess().getSubBrokerKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSubBrokerAccess().getSubBrokerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__0__Impl"


    // $ANTLR start "rule__SubBroker__Group__1"
    // InternalDsl.g:2266:1: rule__SubBroker__Group__1 : rule__SubBroker__Group__1__Impl rule__SubBroker__Group__2 ;
    public final void rule__SubBroker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2270:1: ( rule__SubBroker__Group__1__Impl rule__SubBroker__Group__2 )
            // InternalDsl.g:2271:2: rule__SubBroker__Group__1__Impl rule__SubBroker__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SubBroker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__1"


    // $ANTLR start "rule__SubBroker__Group__1__Impl"
    // InternalDsl.g:2278:1: rule__SubBroker__Group__1__Impl : ( ( rule__SubBroker__NameAssignment_1 ) ) ;
    public final void rule__SubBroker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2282:1: ( ( ( rule__SubBroker__NameAssignment_1 ) ) )
            // InternalDsl.g:2283:1: ( ( rule__SubBroker__NameAssignment_1 ) )
            {
            // InternalDsl.g:2283:1: ( ( rule__SubBroker__NameAssignment_1 ) )
            // InternalDsl.g:2284:2: ( rule__SubBroker__NameAssignment_1 )
            {
             before(grammarAccess.getSubBrokerAccess().getNameAssignment_1()); 
            // InternalDsl.g:2285:2: ( rule__SubBroker__NameAssignment_1 )
            // InternalDsl.g:2285:3: rule__SubBroker__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubBroker__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubBrokerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__1__Impl"


    // $ANTLR start "rule__SubBroker__Group__2"
    // InternalDsl.g:2293:1: rule__SubBroker__Group__2 : rule__SubBroker__Group__2__Impl rule__SubBroker__Group__3 ;
    public final void rule__SubBroker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2297:1: ( rule__SubBroker__Group__2__Impl rule__SubBroker__Group__3 )
            // InternalDsl.g:2298:2: rule__SubBroker__Group__2__Impl rule__SubBroker__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__SubBroker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__2"


    // $ANTLR start "rule__SubBroker__Group__2__Impl"
    // InternalDsl.g:2305:1: rule__SubBroker__Group__2__Impl : ( '(' ) ;
    public final void rule__SubBroker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2309:1: ( ( '(' ) )
            // InternalDsl.g:2310:1: ( '(' )
            {
            // InternalDsl.g:2310:1: ( '(' )
            // InternalDsl.g:2311:2: '('
            {
             before(grammarAccess.getSubBrokerAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSubBrokerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__2__Impl"


    // $ANTLR start "rule__SubBroker__Group__3"
    // InternalDsl.g:2320:1: rule__SubBroker__Group__3 : rule__SubBroker__Group__3__Impl rule__SubBroker__Group__4 ;
    public final void rule__SubBroker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2324:1: ( rule__SubBroker__Group__3__Impl rule__SubBroker__Group__4 )
            // InternalDsl.g:2325:2: rule__SubBroker__Group__3__Impl rule__SubBroker__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__SubBroker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__3"


    // $ANTLR start "rule__SubBroker__Group__3__Impl"
    // InternalDsl.g:2332:1: rule__SubBroker__Group__3__Impl : ( ( rule__SubBroker__IdAssignment_3 ) ) ;
    public final void rule__SubBroker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2336:1: ( ( ( rule__SubBroker__IdAssignment_3 ) ) )
            // InternalDsl.g:2337:1: ( ( rule__SubBroker__IdAssignment_3 ) )
            {
            // InternalDsl.g:2337:1: ( ( rule__SubBroker__IdAssignment_3 ) )
            // InternalDsl.g:2338:2: ( rule__SubBroker__IdAssignment_3 )
            {
             before(grammarAccess.getSubBrokerAccess().getIdAssignment_3()); 
            // InternalDsl.g:2339:2: ( rule__SubBroker__IdAssignment_3 )
            // InternalDsl.g:2339:3: rule__SubBroker__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SubBroker__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubBrokerAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__3__Impl"


    // $ANTLR start "rule__SubBroker__Group__4"
    // InternalDsl.g:2347:1: rule__SubBroker__Group__4 : rule__SubBroker__Group__4__Impl rule__SubBroker__Group__5 ;
    public final void rule__SubBroker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2351:1: ( rule__SubBroker__Group__4__Impl rule__SubBroker__Group__5 )
            // InternalDsl.g:2352:2: rule__SubBroker__Group__4__Impl rule__SubBroker__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__SubBroker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__4"


    // $ANTLR start "rule__SubBroker__Group__4__Impl"
    // InternalDsl.g:2359:1: rule__SubBroker__Group__4__Impl : ( ',' ) ;
    public final void rule__SubBroker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2363:1: ( ( ',' ) )
            // InternalDsl.g:2364:1: ( ',' )
            {
            // InternalDsl.g:2364:1: ( ',' )
            // InternalDsl.g:2365:2: ','
            {
             before(grammarAccess.getSubBrokerAccess().getCommaKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubBrokerAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__4__Impl"


    // $ANTLR start "rule__SubBroker__Group__5"
    // InternalDsl.g:2374:1: rule__SubBroker__Group__5 : rule__SubBroker__Group__5__Impl rule__SubBroker__Group__6 ;
    public final void rule__SubBroker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2378:1: ( rule__SubBroker__Group__5__Impl rule__SubBroker__Group__6 )
            // InternalDsl.g:2379:2: rule__SubBroker__Group__5__Impl rule__SubBroker__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__SubBroker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__5"


    // $ANTLR start "rule__SubBroker__Group__5__Impl"
    // InternalDsl.g:2386:1: rule__SubBroker__Group__5__Impl : ( ( rule__SubBroker__ConfigurationPathAssignment_5 ) ) ;
    public final void rule__SubBroker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2390:1: ( ( ( rule__SubBroker__ConfigurationPathAssignment_5 ) ) )
            // InternalDsl.g:2391:1: ( ( rule__SubBroker__ConfigurationPathAssignment_5 ) )
            {
            // InternalDsl.g:2391:1: ( ( rule__SubBroker__ConfigurationPathAssignment_5 ) )
            // InternalDsl.g:2392:2: ( rule__SubBroker__ConfigurationPathAssignment_5 )
            {
             before(grammarAccess.getSubBrokerAccess().getConfigurationPathAssignment_5()); 
            // InternalDsl.g:2393:2: ( rule__SubBroker__ConfigurationPathAssignment_5 )
            // InternalDsl.g:2393:3: rule__SubBroker__ConfigurationPathAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SubBroker__ConfigurationPathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubBrokerAccess().getConfigurationPathAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__5__Impl"


    // $ANTLR start "rule__SubBroker__Group__6"
    // InternalDsl.g:2401:1: rule__SubBroker__Group__6 : rule__SubBroker__Group__6__Impl rule__SubBroker__Group__7 ;
    public final void rule__SubBroker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2405:1: ( rule__SubBroker__Group__6__Impl rule__SubBroker__Group__7 )
            // InternalDsl.g:2406:2: rule__SubBroker__Group__6__Impl rule__SubBroker__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__SubBroker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__6"


    // $ANTLR start "rule__SubBroker__Group__6__Impl"
    // InternalDsl.g:2413:1: rule__SubBroker__Group__6__Impl : ( ')' ) ;
    public final void rule__SubBroker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2417:1: ( ( ')' ) )
            // InternalDsl.g:2418:1: ( ')' )
            {
            // InternalDsl.g:2418:1: ( ')' )
            // InternalDsl.g:2419:2: ')'
            {
             before(grammarAccess.getSubBrokerAccess().getRightParenthesisKeyword_6()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSubBrokerAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__6__Impl"


    // $ANTLR start "rule__SubBroker__Group__7"
    // InternalDsl.g:2428:1: rule__SubBroker__Group__7 : rule__SubBroker__Group__7__Impl ;
    public final void rule__SubBroker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2432:1: ( rule__SubBroker__Group__7__Impl )
            // InternalDsl.g:2433:2: rule__SubBroker__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubBroker__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__7"


    // $ANTLR start "rule__SubBroker__Group__7__Impl"
    // InternalDsl.g:2439:1: rule__SubBroker__Group__7__Impl : ( ';' ) ;
    public final void rule__SubBroker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2443:1: ( ( ';' ) )
            // InternalDsl.g:2444:1: ( ';' )
            {
            // InternalDsl.g:2444:1: ( ';' )
            // InternalDsl.g:2445:2: ';'
            {
             before(grammarAccess.getSubBrokerAccess().getSemicolonKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSubBrokerAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalDsl.g:2455:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2459:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalDsl.g:2460:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalDsl.g:2467:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2471:1: ( ( 'Sensor' ) )
            // InternalDsl.g:2472:1: ( 'Sensor' )
            {
            // InternalDsl.g:2472:1: ( 'Sensor' )
            // InternalDsl.g:2473:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalDsl.g:2482:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2486:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalDsl.g:2487:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalDsl.g:2494:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2498:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalDsl.g:2499:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalDsl.g:2499:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalDsl.g:2500:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalDsl.g:2501:2: ( rule__Sensor__NameAssignment_1 )
            // InternalDsl.g:2501:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalDsl.g:2509:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2513:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalDsl.g:2514:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalDsl.g:2521:1: rule__Sensor__Group__2__Impl : ( 'measures' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2525:1: ( ( 'measures' ) )
            // InternalDsl.g:2526:1: ( 'measures' )
            {
            // InternalDsl.g:2526:1: ( 'measures' )
            // InternalDsl.g:2527:2: 'measures'
            {
             before(grammarAccess.getSensorAccess().getMeasuresKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getMeasuresKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalDsl.g:2536:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2540:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalDsl.g:2541:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalDsl.g:2548:1: rule__Sensor__Group__3__Impl : ( '{' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2552:1: ( ( '{' ) )
            // InternalDsl.g:2553:1: ( '{' )
            {
            // InternalDsl.g:2553:1: ( '{' )
            // InternalDsl.g:2554:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalDsl.g:2563:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2567:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalDsl.g:2568:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalDsl.g:2575:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2579:1: ( ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) ) )
            // InternalDsl.g:2580:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) )
            {
            // InternalDsl.g:2580:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) )
            // InternalDsl.g:2581:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_4()); 
            // InternalDsl.g:2582:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_4 )
            // InternalDsl.g:2582:3: rule__Sensor__SensorMeasuredVariablesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorMeasuredVariablesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalDsl.g:2590:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2594:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalDsl.g:2595:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalDsl.g:2602:1: rule__Sensor__Group__5__Impl : ( ';' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2606:1: ( ( ';' ) )
            // InternalDsl.g:2607:1: ( ';' )
            {
            // InternalDsl.g:2607:1: ( ';' )
            // InternalDsl.g:2608:2: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalDsl.g:2617:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2621:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalDsl.g:2622:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalDsl.g:2629:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__Group_6__0 )* ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2633:1: ( ( ( rule__Sensor__Group_6__0 )* ) )
            // InternalDsl.g:2634:1: ( ( rule__Sensor__Group_6__0 )* )
            {
            // InternalDsl.g:2634:1: ( ( rule__Sensor__Group_6__0 )* )
            // InternalDsl.g:2635:2: ( rule__Sensor__Group_6__0 )*
            {
             before(grammarAccess.getSensorAccess().getGroup_6()); 
            // InternalDsl.g:2636:2: ( rule__Sensor__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:2636:3: rule__Sensor__Group_6__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Sensor__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalDsl.g:2644:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2648:1: ( rule__Sensor__Group__7__Impl )
            // InternalDsl.g:2649:2: rule__Sensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalDsl.g:2655:1: rule__Sensor__Group__7__Impl : ( '}' ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2659:1: ( ( '}' ) )
            // InternalDsl.g:2660:1: ( '}' )
            {
            // InternalDsl.g:2660:1: ( '}' )
            // InternalDsl.g:2661:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group_6__0"
    // InternalDsl.g:2671:1: rule__Sensor__Group_6__0 : rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 ;
    public final void rule__Sensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2675:1: ( rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 )
            // InternalDsl.g:2676:2: rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__0"


    // $ANTLR start "rule__Sensor__Group_6__0__Impl"
    // InternalDsl.g:2683:1: rule__Sensor__Group_6__0__Impl : ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) ) ;
    public final void rule__Sensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2687:1: ( ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) ) )
            // InternalDsl.g:2688:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) )
            {
            // InternalDsl.g:2688:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) )
            // InternalDsl.g:2689:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_6_0()); 
            // InternalDsl.g:2690:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 )
            // InternalDsl.g:2690:3: rule__Sensor__SensorMeasuredVariablesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorMeasuredVariablesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__0__Impl"


    // $ANTLR start "rule__Sensor__Group_6__1"
    // InternalDsl.g:2698:1: rule__Sensor__Group_6__1 : rule__Sensor__Group_6__1__Impl ;
    public final void rule__Sensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2702:1: ( rule__Sensor__Group_6__1__Impl )
            // InternalDsl.g:2703:2: rule__Sensor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__1"


    // $ANTLR start "rule__Sensor__Group_6__1__Impl"
    // InternalDsl.g:2709:1: rule__Sensor__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Sensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2713:1: ( ( ';' ) )
            // InternalDsl.g:2714:1: ( ';' )
            {
            // InternalDsl.g:2714:1: ( ';' )
            // InternalDsl.g:2715:2: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__1__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__0"
    // InternalDsl.g:2725:1: rule__MeasuredVariable__Group__0 : rule__MeasuredVariable__Group__0__Impl rule__MeasuredVariable__Group__1 ;
    public final void rule__MeasuredVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2729:1: ( rule__MeasuredVariable__Group__0__Impl rule__MeasuredVariable__Group__1 )
            // InternalDsl.g:2730:2: rule__MeasuredVariable__Group__0__Impl rule__MeasuredVariable__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MeasuredVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__0"


    // $ANTLR start "rule__MeasuredVariable__Group__0__Impl"
    // InternalDsl.g:2737:1: rule__MeasuredVariable__Group__0__Impl : ( ( rule__MeasuredVariable__NameAssignment_0 ) ) ;
    public final void rule__MeasuredVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2741:1: ( ( ( rule__MeasuredVariable__NameAssignment_0 ) ) )
            // InternalDsl.g:2742:1: ( ( rule__MeasuredVariable__NameAssignment_0 ) )
            {
            // InternalDsl.g:2742:1: ( ( rule__MeasuredVariable__NameAssignment_0 ) )
            // InternalDsl.g:2743:2: ( rule__MeasuredVariable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getNameAssignment_0()); 
            // InternalDsl.g:2744:2: ( rule__MeasuredVariable__NameAssignment_0 )
            // InternalDsl.g:2744:3: rule__MeasuredVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__0__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__1"
    // InternalDsl.g:2752:1: rule__MeasuredVariable__Group__1 : rule__MeasuredVariable__Group__1__Impl rule__MeasuredVariable__Group__2 ;
    public final void rule__MeasuredVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2756:1: ( rule__MeasuredVariable__Group__1__Impl rule__MeasuredVariable__Group__2 )
            // InternalDsl.g:2757:2: rule__MeasuredVariable__Group__1__Impl rule__MeasuredVariable__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__MeasuredVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__1"


    // $ANTLR start "rule__MeasuredVariable__Group__1__Impl"
    // InternalDsl.g:2764:1: rule__MeasuredVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__MeasuredVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2768:1: ( ( '(' ) )
            // InternalDsl.g:2769:1: ( '(' )
            {
            // InternalDsl.g:2769:1: ( '(' )
            // InternalDsl.g:2770:2: '('
            {
             before(grammarAccess.getMeasuredVariableAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__1__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__2"
    // InternalDsl.g:2779:1: rule__MeasuredVariable__Group__2 : rule__MeasuredVariable__Group__2__Impl rule__MeasuredVariable__Group__3 ;
    public final void rule__MeasuredVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2783:1: ( rule__MeasuredVariable__Group__2__Impl rule__MeasuredVariable__Group__3 )
            // InternalDsl.g:2784:2: rule__MeasuredVariable__Group__2__Impl rule__MeasuredVariable__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__MeasuredVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__2"


    // $ANTLR start "rule__MeasuredVariable__Group__2__Impl"
    // InternalDsl.g:2791:1: rule__MeasuredVariable__Group__2__Impl : ( ( rule__MeasuredVariable__UnitAssignment_2 ) ) ;
    public final void rule__MeasuredVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2795:1: ( ( ( rule__MeasuredVariable__UnitAssignment_2 ) ) )
            // InternalDsl.g:2796:1: ( ( rule__MeasuredVariable__UnitAssignment_2 ) )
            {
            // InternalDsl.g:2796:1: ( ( rule__MeasuredVariable__UnitAssignment_2 ) )
            // InternalDsl.g:2797:2: ( rule__MeasuredVariable__UnitAssignment_2 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getUnitAssignment_2()); 
            // InternalDsl.g:2798:2: ( rule__MeasuredVariable__UnitAssignment_2 )
            // InternalDsl.g:2798:3: rule__MeasuredVariable__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getUnitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__2__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__3"
    // InternalDsl.g:2806:1: rule__MeasuredVariable__Group__3 : rule__MeasuredVariable__Group__3__Impl ;
    public final void rule__MeasuredVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2810:1: ( rule__MeasuredVariable__Group__3__Impl )
            // InternalDsl.g:2811:2: rule__MeasuredVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__3"


    // $ANTLR start "rule__MeasuredVariable__Group__3__Impl"
    // InternalDsl.g:2817:1: rule__MeasuredVariable__Group__3__Impl : ( ')' ) ;
    public final void rule__MeasuredVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2821:1: ( ( ')' ) )
            // InternalDsl.g:2822:1: ( ')' )
            {
            // InternalDsl.g:2822:1: ( ')' )
            // InternalDsl.g:2823:2: ')'
            {
             before(grammarAccess.getMeasuredVariableAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalDsl.g:2833:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2837:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDsl.g:2838:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalDsl.g:2845:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2849:1: ( ( ( '-' )? ) )
            // InternalDsl.g:2850:1: ( ( '-' )? )
            {
            // InternalDsl.g:2850:1: ( ( '-' )? )
            // InternalDsl.g:2851:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:2852:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:2852:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalDsl.g:2860:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2864:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDsl.g:2865:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalDsl.g:2872:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2876:1: ( ( ( RULE_INT )? ) )
            // InternalDsl.g:2877:1: ( ( RULE_INT )? )
            {
            // InternalDsl.g:2877:1: ( ( RULE_INT )? )
            // InternalDsl.g:2878:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalDsl.g:2879:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:2879:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalDsl.g:2887:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2891:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDsl.g:2892:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalDsl.g:2899:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2903:1: ( ( '.' ) )
            // InternalDsl.g:2904:1: ( '.' )
            {
            // InternalDsl.g:2904:1: ( '.' )
            // InternalDsl.g:2905:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalDsl.g:2914:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2918:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalDsl.g:2919:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalDsl.g:2926:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2930:1: ( ( RULE_INT ) )
            // InternalDsl.g:2931:1: ( RULE_INT )
            {
            // InternalDsl.g:2931:1: ( RULE_INT )
            // InternalDsl.g:2932:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalDsl.g:2941:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2945:1: ( rule__EDouble__Group__4__Impl )
            // InternalDsl.g:2946:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalDsl.g:2952:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2956:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalDsl.g:2957:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalDsl.g:2957:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalDsl.g:2958:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalDsl.g:2959:2: ( rule__EDouble__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:2959:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalDsl.g:2968:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2972:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalDsl.g:2973:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalDsl.g:2980:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2984:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalDsl.g:2985:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalDsl.g:2985:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalDsl.g:2986:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalDsl.g:2987:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalDsl.g:2987:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalDsl.g:2995:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2999:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalDsl.g:3000:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalDsl.g:3007:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3011:1: ( ( ( '-' )? ) )
            // InternalDsl.g:3012:1: ( ( '-' )? )
            {
            // InternalDsl.g:3012:1: ( ( '-' )? )
            // InternalDsl.g:3013:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDsl.g:3014:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:3014:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalDsl.g:3022:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3026:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalDsl.g:3027:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalDsl.g:3033:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3037:1: ( ( RULE_INT ) )
            // InternalDsl.g:3038:1: ( RULE_INT )
            {
            // InternalDsl.g:3038:1: ( RULE_INT )
            // InternalDsl.g:3039:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDsl.g:3049:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3053:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDsl.g:3054:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDsl.g:3061:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3065:1: ( ( ( '-' )? ) )
            // InternalDsl.g:3066:1: ( ( '-' )? )
            {
            // InternalDsl.g:3066:1: ( ( '-' )? )
            // InternalDsl.g:3067:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:3068:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:3068:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDsl.g:3076:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3080:1: ( rule__EInt__Group__1__Impl )
            // InternalDsl.g:3081:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDsl.g:3087:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3091:1: ( ( RULE_INT ) )
            // InternalDsl.g:3092:1: ( RULE_INT )
            {
            // InternalDsl.g:3092:1: ( RULE_INT )
            // InternalDsl.g:3093:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__TcpIpEndpoint__Group__0"
    // InternalDsl.g:3103:1: rule__TcpIpEndpoint__Group__0 : rule__TcpIpEndpoint__Group__0__Impl rule__TcpIpEndpoint__Group__1 ;
    public final void rule__TcpIpEndpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3107:1: ( rule__TcpIpEndpoint__Group__0__Impl rule__TcpIpEndpoint__Group__1 )
            // InternalDsl.g:3108:2: rule__TcpIpEndpoint__Group__0__Impl rule__TcpIpEndpoint__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__TcpIpEndpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TcpIpEndpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__Group__0"


    // $ANTLR start "rule__TcpIpEndpoint__Group__0__Impl"
    // InternalDsl.g:3115:1: rule__TcpIpEndpoint__Group__0__Impl : ( ( rule__TcpIpEndpoint__IpAddressAssignment_0 ) ) ;
    public final void rule__TcpIpEndpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3119:1: ( ( ( rule__TcpIpEndpoint__IpAddressAssignment_0 ) ) )
            // InternalDsl.g:3120:1: ( ( rule__TcpIpEndpoint__IpAddressAssignment_0 ) )
            {
            // InternalDsl.g:3120:1: ( ( rule__TcpIpEndpoint__IpAddressAssignment_0 ) )
            // InternalDsl.g:3121:2: ( rule__TcpIpEndpoint__IpAddressAssignment_0 )
            {
             before(grammarAccess.getTcpIpEndpointAccess().getIpAddressAssignment_0()); 
            // InternalDsl.g:3122:2: ( rule__TcpIpEndpoint__IpAddressAssignment_0 )
            // InternalDsl.g:3122:3: rule__TcpIpEndpoint__IpAddressAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TcpIpEndpoint__IpAddressAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTcpIpEndpointAccess().getIpAddressAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__Group__0__Impl"


    // $ANTLR start "rule__TcpIpEndpoint__Group__1"
    // InternalDsl.g:3130:1: rule__TcpIpEndpoint__Group__1 : rule__TcpIpEndpoint__Group__1__Impl rule__TcpIpEndpoint__Group__2 ;
    public final void rule__TcpIpEndpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3134:1: ( rule__TcpIpEndpoint__Group__1__Impl rule__TcpIpEndpoint__Group__2 )
            // InternalDsl.g:3135:2: rule__TcpIpEndpoint__Group__1__Impl rule__TcpIpEndpoint__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__TcpIpEndpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TcpIpEndpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__Group__1"


    // $ANTLR start "rule__TcpIpEndpoint__Group__1__Impl"
    // InternalDsl.g:3142:1: rule__TcpIpEndpoint__Group__1__Impl : ( ':' ) ;
    public final void rule__TcpIpEndpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3146:1: ( ( ':' ) )
            // InternalDsl.g:3147:1: ( ':' )
            {
            // InternalDsl.g:3147:1: ( ':' )
            // InternalDsl.g:3148:2: ':'
            {
             before(grammarAccess.getTcpIpEndpointAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTcpIpEndpointAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__Group__1__Impl"


    // $ANTLR start "rule__TcpIpEndpoint__Group__2"
    // InternalDsl.g:3157:1: rule__TcpIpEndpoint__Group__2 : rule__TcpIpEndpoint__Group__2__Impl ;
    public final void rule__TcpIpEndpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3161:1: ( rule__TcpIpEndpoint__Group__2__Impl )
            // InternalDsl.g:3162:2: rule__TcpIpEndpoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TcpIpEndpoint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__Group__2"


    // $ANTLR start "rule__TcpIpEndpoint__Group__2__Impl"
    // InternalDsl.g:3168:1: rule__TcpIpEndpoint__Group__2__Impl : ( ( rule__TcpIpEndpoint__PortAssignment_2 ) ) ;
    public final void rule__TcpIpEndpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3172:1: ( ( ( rule__TcpIpEndpoint__PortAssignment_2 ) ) )
            // InternalDsl.g:3173:1: ( ( rule__TcpIpEndpoint__PortAssignment_2 ) )
            {
            // InternalDsl.g:3173:1: ( ( rule__TcpIpEndpoint__PortAssignment_2 ) )
            // InternalDsl.g:3174:2: ( rule__TcpIpEndpoint__PortAssignment_2 )
            {
             before(grammarAccess.getTcpIpEndpointAccess().getPortAssignment_2()); 
            // InternalDsl.g:3175:2: ( rule__TcpIpEndpoint__PortAssignment_2 )
            // InternalDsl.g:3175:3: rule__TcpIpEndpoint__PortAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TcpIpEndpoint__PortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTcpIpEndpointAccess().getPortAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__Group__2__Impl"


    // $ANTLR start "rule__DataCollector__DroneAssignment_2"
    // InternalDsl.g:3184:1: rule__DataCollector__DroneAssignment_2 : ( ruleDrone ) ;
    public final void rule__DataCollector__DroneAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3188:1: ( ( ruleDrone ) )
            // InternalDsl.g:3189:2: ( ruleDrone )
            {
            // InternalDsl.g:3189:2: ( ruleDrone )
            // InternalDsl.g:3190:3: ruleDrone
            {
             before(grammarAccess.getDataCollectorAccess().getDroneDroneParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getDroneDroneParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__DroneAssignment_2"


    // $ANTLR start "rule__DataCollector__PubBrokerAssignment_3"
    // InternalDsl.g:3199:1: rule__DataCollector__PubBrokerAssignment_3 : ( rulePubBroker ) ;
    public final void rule__DataCollector__PubBrokerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3203:1: ( ( rulePubBroker ) )
            // InternalDsl.g:3204:2: ( rulePubBroker )
            {
            // InternalDsl.g:3204:2: ( rulePubBroker )
            // InternalDsl.g:3205:3: rulePubBroker
            {
             before(grammarAccess.getDataCollectorAccess().getPubBrokerPubBrokerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePubBroker();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getPubBrokerPubBrokerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__PubBrokerAssignment_3"


    // $ANTLR start "rule__DataCollector__SubBrokerAssignment_4"
    // InternalDsl.g:3214:1: rule__DataCollector__SubBrokerAssignment_4 : ( ruleSubBroker ) ;
    public final void rule__DataCollector__SubBrokerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3218:1: ( ( ruleSubBroker ) )
            // InternalDsl.g:3219:2: ( ruleSubBroker )
            {
            // InternalDsl.g:3219:2: ( ruleSubBroker )
            // InternalDsl.g:3220:3: ruleSubBroker
            {
             before(grammarAccess.getDataCollectorAccess().getSubBrokerSubBrokerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSubBroker();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getSubBrokerSubBrokerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__SubBrokerAssignment_4"


    // $ANTLR start "rule__DataCollector__PublishersAssignment_7"
    // InternalDsl.g:3229:1: rule__DataCollector__PublishersAssignment_7 : ( rulePublisher ) ;
    public final void rule__DataCollector__PublishersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3233:1: ( ( rulePublisher ) )
            // InternalDsl.g:3234:2: ( rulePublisher )
            {
            // InternalDsl.g:3234:2: ( rulePublisher )
            // InternalDsl.g:3235:3: rulePublisher
            {
             before(grammarAccess.getDataCollectorAccess().getPublishersPublisherParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getPublishersPublisherParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__PublishersAssignment_7"


    // $ANTLR start "rule__DataCollector__PublishersAssignment_9_0"
    // InternalDsl.g:3244:1: rule__DataCollector__PublishersAssignment_9_0 : ( rulePublisher ) ;
    public final void rule__DataCollector__PublishersAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3248:1: ( ( rulePublisher ) )
            // InternalDsl.g:3249:2: ( rulePublisher )
            {
            // InternalDsl.g:3249:2: ( rulePublisher )
            // InternalDsl.g:3250:3: rulePublisher
            {
             before(grammarAccess.getDataCollectorAccess().getPublishersPublisherParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getPublishersPublisherParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__PublishersAssignment_9_0"


    // $ANTLR start "rule__DataCollector__SubscribersAssignment_13"
    // InternalDsl.g:3259:1: rule__DataCollector__SubscribersAssignment_13 : ( ruleSubscriber ) ;
    public final void rule__DataCollector__SubscribersAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3263:1: ( ( ruleSubscriber ) )
            // InternalDsl.g:3264:2: ( ruleSubscriber )
            {
            // InternalDsl.g:3264:2: ( ruleSubscriber )
            // InternalDsl.g:3265:3: ruleSubscriber
            {
             before(grammarAccess.getDataCollectorAccess().getSubscribersSubscriberParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getSubscribersSubscriberParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__SubscribersAssignment_13"


    // $ANTLR start "rule__DataCollector__SubscribersAssignment_15_0"
    // InternalDsl.g:3274:1: rule__DataCollector__SubscribersAssignment_15_0 : ( ruleSubscriber ) ;
    public final void rule__DataCollector__SubscribersAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3278:1: ( ( ruleSubscriber ) )
            // InternalDsl.g:3279:2: ( ruleSubscriber )
            {
            // InternalDsl.g:3279:2: ( ruleSubscriber )
            // InternalDsl.g:3280:3: ruleSubscriber
            {
             before(grammarAccess.getDataCollectorAccess().getSubscribersSubscriberParserRuleCall_15_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getDataCollectorAccess().getSubscribersSubscriberParserRuleCall_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataCollector__SubscribersAssignment_15_0"


    // $ANTLR start "rule__Drone__NameAssignment_1"
    // InternalDsl.g:3289:1: rule__Drone__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Drone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3293:1: ( ( ruleEString ) )
            // InternalDsl.g:3294:2: ( ruleEString )
            {
            // InternalDsl.g:3294:2: ( ruleEString )
            // InternalDsl.g:3295:3: ruleEString
            {
             before(grammarAccess.getDroneAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__NameAssignment_1"


    // $ANTLR start "rule__Drone__SensorsDroneAssignment_5"
    // InternalDsl.g:3304:1: rule__Drone__SensorsDroneAssignment_5 : ( ruleSensor ) ;
    public final void rule__Drone__SensorsDroneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3308:1: ( ( ruleSensor ) )
            // InternalDsl.g:3309:2: ( ruleSensor )
            {
            // InternalDsl.g:3309:2: ( ruleSensor )
            // InternalDsl.g:3310:3: ruleSensor
            {
             before(grammarAccess.getDroneAccess().getSensorsDroneSensorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getSensorsDroneSensorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__SensorsDroneAssignment_5"


    // $ANTLR start "rule__Drone__SensorsDroneAssignment_6"
    // InternalDsl.g:3319:1: rule__Drone__SensorsDroneAssignment_6 : ( ruleSensor ) ;
    public final void rule__Drone__SensorsDroneAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3323:1: ( ( ruleSensor ) )
            // InternalDsl.g:3324:2: ( ruleSensor )
            {
            // InternalDsl.g:3324:2: ( ruleSensor )
            // InternalDsl.g:3325:3: ruleSensor
            {
             before(grammarAccess.getDroneAccess().getSensorsDroneSensorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getSensorsDroneSensorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__SensorsDroneAssignment_6"


    // $ANTLR start "rule__PubBroker__NameAssignment_1"
    // InternalDsl.g:3334:1: rule__PubBroker__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PubBroker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3338:1: ( ( ruleEString ) )
            // InternalDsl.g:3339:2: ( ruleEString )
            {
            // InternalDsl.g:3339:2: ( ruleEString )
            // InternalDsl.g:3340:3: ruleEString
            {
             before(grammarAccess.getPubBrokerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPubBrokerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__NameAssignment_1"


    // $ANTLR start "rule__PubBroker__IdAssignment_3"
    // InternalDsl.g:3349:1: rule__PubBroker__IdAssignment_3 : ( ruleEndpoint ) ;
    public final void rule__PubBroker__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3353:1: ( ( ruleEndpoint ) )
            // InternalDsl.g:3354:2: ( ruleEndpoint )
            {
            // InternalDsl.g:3354:2: ( ruleEndpoint )
            // InternalDsl.g:3355:3: ruleEndpoint
            {
             before(grammarAccess.getPubBrokerAccess().getIdEndpointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getPubBrokerAccess().getIdEndpointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__IdAssignment_3"


    // $ANTLR start "rule__PubBroker__LogPathAssignment_5"
    // InternalDsl.g:3364:1: rule__PubBroker__LogPathAssignment_5 : ( ruleEString ) ;
    public final void rule__PubBroker__LogPathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3368:1: ( ( ruleEString ) )
            // InternalDsl.g:3369:2: ( ruleEString )
            {
            // InternalDsl.g:3369:2: ( ruleEString )
            // InternalDsl.g:3370:3: ruleEString
            {
             before(grammarAccess.getPubBrokerAccess().getLogPathEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPubBrokerAccess().getLogPathEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubBroker__LogPathAssignment_5"


    // $ANTLR start "rule__Publisher__NameAssignment_1"
    // InternalDsl.g:3379:1: rule__Publisher__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Publisher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3383:1: ( ( ruleEString ) )
            // InternalDsl.g:3384:2: ( ruleEString )
            {
            // InternalDsl.g:3384:2: ( ruleEString )
            // InternalDsl.g:3385:3: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__NameAssignment_1"


    // $ANTLR start "rule__Publisher__IdAssignment_3"
    // InternalDsl.g:3394:1: rule__Publisher__IdAssignment_3 : ( ruleEndpoint ) ;
    public final void rule__Publisher__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3398:1: ( ( ruleEndpoint ) )
            // InternalDsl.g:3399:2: ( ruleEndpoint )
            {
            // InternalDsl.g:3399:2: ( ruleEndpoint )
            // InternalDsl.g:3400:3: ruleEndpoint
            {
             before(grammarAccess.getPublisherAccess().getIdEndpointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getIdEndpointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__IdAssignment_3"


    // $ANTLR start "rule__Publisher__PeriodAssignment_5"
    // InternalDsl.g:3409:1: rule__Publisher__PeriodAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Publisher__PeriodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3413:1: ( ( ruleEDouble ) )
            // InternalDsl.g:3414:2: ( ruleEDouble )
            {
            // InternalDsl.g:3414:2: ( ruleEDouble )
            // InternalDsl.g:3415:3: ruleEDouble
            {
             before(grammarAccess.getPublisherAccess().getPeriodEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getPeriodEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__PeriodAssignment_5"


    // $ANTLR start "rule__Publisher__PublishedMeasuresAssignment_7"
    // InternalDsl.g:3424:1: rule__Publisher__PublishedMeasuresAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__PublishedMeasuresAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3428:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3429:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3429:2: ( ( ruleEString ) )
            // InternalDsl.g:3430:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableCrossReference_7_0()); 
            // InternalDsl.g:3431:3: ( ruleEString )
            // InternalDsl.g:3432:4: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__PublishedMeasuresAssignment_7"


    // $ANTLR start "rule__Publisher__PublishedMeasuresAssignment_8_1"
    // InternalDsl.g:3443:1: rule__Publisher__PublishedMeasuresAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__PublishedMeasuresAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3447:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3448:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3448:2: ( ( ruleEString ) )
            // InternalDsl.g:3449:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableCrossReference_8_1_0()); 
            // InternalDsl.g:3450:3: ( ruleEString )
            // InternalDsl.g:3451:4: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__PublishedMeasuresAssignment_8_1"


    // $ANTLR start "rule__Subscriber__NameAssignment_1"
    // InternalDsl.g:3462:1: rule__Subscriber__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subscriber__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3466:1: ( ( ruleEString ) )
            // InternalDsl.g:3467:2: ( ruleEString )
            {
            // InternalDsl.g:3467:2: ( ruleEString )
            // InternalDsl.g:3468:3: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__NameAssignment_1"


    // $ANTLR start "rule__Subscriber__IdAssignment_3"
    // InternalDsl.g:3477:1: rule__Subscriber__IdAssignment_3 : ( ruleEndpoint ) ;
    public final void rule__Subscriber__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3481:1: ( ( ruleEndpoint ) )
            // InternalDsl.g:3482:2: ( ruleEndpoint )
            {
            // InternalDsl.g:3482:2: ( ruleEndpoint )
            // InternalDsl.g:3483:3: ruleEndpoint
            {
             before(grammarAccess.getSubscriberAccess().getIdEndpointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getIdEndpointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__IdAssignment_3"


    // $ANTLR start "rule__Subscriber__MonitoredMeasureAssignment_5"
    // InternalDsl.g:3492:1: rule__Subscriber__MonitoredMeasureAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__MonitoredMeasureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3496:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:3497:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:3497:2: ( ( ruleEString ) )
            // InternalDsl.g:3498:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getMonitoredMeasureMeasuredVariableCrossReference_5_0()); 
            // InternalDsl.g:3499:3: ( ruleEString )
            // InternalDsl.g:3500:4: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getMonitoredMeasureMeasuredVariableEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getMonitoredMeasureMeasuredVariableEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSubscriberAccess().getMonitoredMeasureMeasuredVariableCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__MonitoredMeasureAssignment_5"


    // $ANTLR start "rule__Subscriber__PeriodAssignment_7"
    // InternalDsl.g:3511:1: rule__Subscriber__PeriodAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Subscriber__PeriodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3515:1: ( ( ruleEDouble ) )
            // InternalDsl.g:3516:2: ( ruleEDouble )
            {
            // InternalDsl.g:3516:2: ( ruleEDouble )
            // InternalDsl.g:3517:3: ruleEDouble
            {
             before(grammarAccess.getSubscriberAccess().getPeriodEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getPeriodEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__PeriodAssignment_7"


    // $ANTLR start "rule__Subscriber__AggregationAssignment_9"
    // InternalDsl.g:3526:1: rule__Subscriber__AggregationAssignment_9 : ( ruleAggregation ) ;
    public final void rule__Subscriber__AggregationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3530:1: ( ( ruleAggregation ) )
            // InternalDsl.g:3531:2: ( ruleAggregation )
            {
            // InternalDsl.g:3531:2: ( ruleAggregation )
            // InternalDsl.g:3532:3: ruleAggregation
            {
             before(grammarAccess.getSubscriberAccess().getAggregationAggregationEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregation();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getAggregationAggregationEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__AggregationAssignment_9"


    // $ANTLR start "rule__SubBroker__NameAssignment_1"
    // InternalDsl.g:3541:1: rule__SubBroker__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SubBroker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3545:1: ( ( ruleEString ) )
            // InternalDsl.g:3546:2: ( ruleEString )
            {
            // InternalDsl.g:3546:2: ( ruleEString )
            // InternalDsl.g:3547:3: ruleEString
            {
             before(grammarAccess.getSubBrokerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubBrokerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__NameAssignment_1"


    // $ANTLR start "rule__SubBroker__IdAssignment_3"
    // InternalDsl.g:3556:1: rule__SubBroker__IdAssignment_3 : ( ruleEndpoint ) ;
    public final void rule__SubBroker__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3560:1: ( ( ruleEndpoint ) )
            // InternalDsl.g:3561:2: ( ruleEndpoint )
            {
            // InternalDsl.g:3561:2: ( ruleEndpoint )
            // InternalDsl.g:3562:3: ruleEndpoint
            {
             before(grammarAccess.getSubBrokerAccess().getIdEndpointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getSubBrokerAccess().getIdEndpointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__IdAssignment_3"


    // $ANTLR start "rule__SubBroker__ConfigurationPathAssignment_5"
    // InternalDsl.g:3571:1: rule__SubBroker__ConfigurationPathAssignment_5 : ( ruleEString ) ;
    public final void rule__SubBroker__ConfigurationPathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3575:1: ( ( ruleEString ) )
            // InternalDsl.g:3576:2: ( ruleEString )
            {
            // InternalDsl.g:3576:2: ( ruleEString )
            // InternalDsl.g:3577:3: ruleEString
            {
             before(grammarAccess.getSubBrokerAccess().getConfigurationPathEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubBrokerAccess().getConfigurationPathEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubBroker__ConfigurationPathAssignment_5"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalDsl.g:3586:1: rule__Sensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3590:1: ( ( ruleEString ) )
            // InternalDsl.g:3591:2: ( ruleEString )
            {
            // InternalDsl.g:3591:2: ( ruleEString )
            // InternalDsl.g:3592:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__SensorMeasuredVariablesAssignment_4"
    // InternalDsl.g:3601:1: rule__Sensor__SensorMeasuredVariablesAssignment_4 : ( ruleMeasuredVariable ) ;
    public final void rule__Sensor__SensorMeasuredVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3605:1: ( ( ruleMeasuredVariable ) )
            // InternalDsl.g:3606:2: ( ruleMeasuredVariable )
            {
            // InternalDsl.g:3606:2: ( ruleMeasuredVariable )
            // InternalDsl.g:3607:3: ruleMeasuredVariable
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasuredVariable();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorMeasuredVariablesAssignment_4"


    // $ANTLR start "rule__Sensor__SensorMeasuredVariablesAssignment_6_0"
    // InternalDsl.g:3616:1: rule__Sensor__SensorMeasuredVariablesAssignment_6_0 : ( ruleMeasuredVariable ) ;
    public final void rule__Sensor__SensorMeasuredVariablesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3620:1: ( ( ruleMeasuredVariable ) )
            // InternalDsl.g:3621:2: ( ruleMeasuredVariable )
            {
            // InternalDsl.g:3621:2: ( ruleMeasuredVariable )
            // InternalDsl.g:3622:3: ruleMeasuredVariable
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasuredVariable();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorMeasuredVariablesAssignment_6_0"


    // $ANTLR start "rule__MeasuredVariable__NameAssignment_0"
    // InternalDsl.g:3631:1: rule__MeasuredVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MeasuredVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3635:1: ( ( ruleEString ) )
            // InternalDsl.g:3636:2: ( ruleEString )
            {
            // InternalDsl.g:3636:2: ( ruleEString )
            // InternalDsl.g:3637:3: ruleEString
            {
             before(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__NameAssignment_0"


    // $ANTLR start "rule__MeasuredVariable__UnitAssignment_2"
    // InternalDsl.g:3646:1: rule__MeasuredVariable__UnitAssignment_2 : ( ruleMeasurementDataUnit ) ;
    public final void rule__MeasuredVariable__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3650:1: ( ( ruleMeasurementDataUnit ) )
            // InternalDsl.g:3651:2: ( ruleMeasurementDataUnit )
            {
            // InternalDsl.g:3651:2: ( ruleMeasurementDataUnit )
            // InternalDsl.g:3652:3: ruleMeasurementDataUnit
            {
             before(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasurementDataUnit();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasuredVariable__UnitAssignment_2"


    // $ANTLR start "rule__TcpIpEndpoint__IpAddressAssignment_0"
    // InternalDsl.g:3661:1: rule__TcpIpEndpoint__IpAddressAssignment_0 : ( ruleEString ) ;
    public final void rule__TcpIpEndpoint__IpAddressAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3665:1: ( ( ruleEString ) )
            // InternalDsl.g:3666:2: ( ruleEString )
            {
            // InternalDsl.g:3666:2: ( ruleEString )
            // InternalDsl.g:3667:3: ruleEString
            {
             before(grammarAccess.getTcpIpEndpointAccess().getIpAddressEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTcpIpEndpointAccess().getIpAddressEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__IpAddressAssignment_0"


    // $ANTLR start "rule__TcpIpEndpoint__PortAssignment_2"
    // InternalDsl.g:3676:1: rule__TcpIpEndpoint__PortAssignment_2 : ( ruleEInt ) ;
    public final void rule__TcpIpEndpoint__PortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3680:1: ( ( ruleEInt ) )
            // InternalDsl.g:3681:2: ( ruleEInt )
            {
            // InternalDsl.g:3681:2: ( ruleEInt )
            // InternalDsl.g:3682:3: ruleEInt
            {
             before(grammarAccess.getTcpIpEndpointAccess().getPortEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTcpIpEndpointAccess().getPortEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TcpIpEndpoint__PortAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});

}