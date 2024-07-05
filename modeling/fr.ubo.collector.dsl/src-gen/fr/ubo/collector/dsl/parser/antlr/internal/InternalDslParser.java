package fr.ubo.collector.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ubo.collector.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataCollector'", "'{'", "'Publishers'", "';'", "'}'", "'Subscriptions'", "'Drone'", "'Sensors'", "'PubBroker'", "'('", "','", "')'", "'Publisher'", "'Subscriber'", "'SubBroker'", "'Sensor'", "'measures'", "'-'", "'.'", "'E'", "'e'", "':'", "'METER'", "'METER_PER_SECOND'", "'METER_PER_SECOND_SQUARED'", "'DEGREE_CELSIUS'", "'RADIAN'", "'RADIAN_PER_SECOND'", "'BAR'", "'LITER'", "'GRAM'", "'NONE'", "'MIN'", "'MAX'", "'AVERAGE'", "'FIRST'", "'LAST'", "'ALL'"
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataCollector";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataCollector"
    // InternalDsl.g:65:1: entryRuleDataCollector returns [EObject current=null] : iv_ruleDataCollector= ruleDataCollector EOF ;
    public final EObject entryRuleDataCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataCollector = null;


        try {
            // InternalDsl.g:65:54: (iv_ruleDataCollector= ruleDataCollector EOF )
            // InternalDsl.g:66:2: iv_ruleDataCollector= ruleDataCollector EOF
            {
             newCompositeNode(grammarAccess.getDataCollectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataCollector=ruleDataCollector();

            state._fsp--;

             current =iv_ruleDataCollector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataCollector"


    // $ANTLR start "ruleDataCollector"
    // InternalDsl.g:72:1: ruleDataCollector returns [EObject current=null] : (otherlv_0= 'DataCollector' otherlv_1= '{' ( (lv_drone_2_0= ruleDrone ) ) ( (lv_pubBroker_3_0= rulePubBroker ) ) ( (lv_subBroker_4_0= ruleSubBroker ) ) otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publishers_7_0= rulePublisher ) ) otherlv_8= ';' ( ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';' )* otherlv_11= '}' otherlv_12= 'Subscriptions' otherlv_13= '{' ( (lv_subscribers_14_0= ruleSubscriber ) ) otherlv_15= ';' ( ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';' )* otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleDataCollector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_drone_2_0 = null;

        EObject lv_pubBroker_3_0 = null;

        EObject lv_subBroker_4_0 = null;

        EObject lv_publishers_7_0 = null;

        EObject lv_publishers_9_0 = null;

        EObject lv_subscribers_14_0 = null;

        EObject lv_subscribers_16_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'DataCollector' otherlv_1= '{' ( (lv_drone_2_0= ruleDrone ) ) ( (lv_pubBroker_3_0= rulePubBroker ) ) ( (lv_subBroker_4_0= ruleSubBroker ) ) otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publishers_7_0= rulePublisher ) ) otherlv_8= ';' ( ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';' )* otherlv_11= '}' otherlv_12= 'Subscriptions' otherlv_13= '{' ( (lv_subscribers_14_0= ruleSubscriber ) ) otherlv_15= ';' ( ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';' )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalDsl.g:79:2: (otherlv_0= 'DataCollector' otherlv_1= '{' ( (lv_drone_2_0= ruleDrone ) ) ( (lv_pubBroker_3_0= rulePubBroker ) ) ( (lv_subBroker_4_0= ruleSubBroker ) ) otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publishers_7_0= rulePublisher ) ) otherlv_8= ';' ( ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';' )* otherlv_11= '}' otherlv_12= 'Subscriptions' otherlv_13= '{' ( (lv_subscribers_14_0= ruleSubscriber ) ) otherlv_15= ';' ( ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';' )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'DataCollector' otherlv_1= '{' ( (lv_drone_2_0= ruleDrone ) ) ( (lv_pubBroker_3_0= rulePubBroker ) ) ( (lv_subBroker_4_0= ruleSubBroker ) ) otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publishers_7_0= rulePublisher ) ) otherlv_8= ';' ( ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';' )* otherlv_11= '}' otherlv_12= 'Subscriptions' otherlv_13= '{' ( (lv_subscribers_14_0= ruleSubscriber ) ) otherlv_15= ';' ( ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';' )* otherlv_18= '}' otherlv_19= '}' )
            // InternalDsl.g:80:3: otherlv_0= 'DataCollector' otherlv_1= '{' ( (lv_drone_2_0= ruleDrone ) ) ( (lv_pubBroker_3_0= rulePubBroker ) ) ( (lv_subBroker_4_0= ruleSubBroker ) ) otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publishers_7_0= rulePublisher ) ) otherlv_8= ';' ( ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';' )* otherlv_11= '}' otherlv_12= 'Subscriptions' otherlv_13= '{' ( (lv_subscribers_14_0= ruleSubscriber ) ) otherlv_15= ';' ( ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';' )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataCollectorAccess().getDataCollectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:88:3: ( (lv_drone_2_0= ruleDrone ) )
            // InternalDsl.g:89:4: (lv_drone_2_0= ruleDrone )
            {
            // InternalDsl.g:89:4: (lv_drone_2_0= ruleDrone )
            // InternalDsl.g:90:5: lv_drone_2_0= ruleDrone
            {

            					newCompositeNode(grammarAccess.getDataCollectorAccess().getDroneDroneParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_drone_2_0=ruleDrone();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            					}
            					set(
            						current,
            						"drone",
            						lv_drone_2_0,
            						"fr.ubo.collector.dsl.Dsl.Drone");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:107:3: ( (lv_pubBroker_3_0= rulePubBroker ) )
            // InternalDsl.g:108:4: (lv_pubBroker_3_0= rulePubBroker )
            {
            // InternalDsl.g:108:4: (lv_pubBroker_3_0= rulePubBroker )
            // InternalDsl.g:109:5: lv_pubBroker_3_0= rulePubBroker
            {

            					newCompositeNode(grammarAccess.getDataCollectorAccess().getPubBrokerPubBrokerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_pubBroker_3_0=rulePubBroker();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            					}
            					set(
            						current,
            						"pubBroker",
            						lv_pubBroker_3_0,
            						"fr.ubo.collector.dsl.Dsl.PubBroker");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:126:3: ( (lv_subBroker_4_0= ruleSubBroker ) )
            // InternalDsl.g:127:4: (lv_subBroker_4_0= ruleSubBroker )
            {
            // InternalDsl.g:127:4: (lv_subBroker_4_0= ruleSubBroker )
            // InternalDsl.g:128:5: lv_subBroker_4_0= ruleSubBroker
            {

            					newCompositeNode(grammarAccess.getDataCollectorAccess().getSubBrokerSubBrokerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_subBroker_4_0=ruleSubBroker();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            					}
            					set(
            						current,
            						"subBroker",
            						lv_subBroker_4_0,
            						"fr.ubo.collector.dsl.Dsl.SubBroker");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDataCollectorAccess().getPublishersKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:153:3: ( (lv_publishers_7_0= rulePublisher ) )
            // InternalDsl.g:154:4: (lv_publishers_7_0= rulePublisher )
            {
            // InternalDsl.g:154:4: (lv_publishers_7_0= rulePublisher )
            // InternalDsl.g:155:5: lv_publishers_7_0= rulePublisher
            {

            					newCompositeNode(grammarAccess.getDataCollectorAccess().getPublishersPublisherParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_publishers_7_0=rulePublisher();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            					}
            					add(
            						current,
            						"publishers",
            						lv_publishers_7_0,
            						"fr.ubo.collector.dsl.Dsl.Publisher");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getDataCollectorAccess().getSemicolonKeyword_8());
            		
            // InternalDsl.g:176:3: ( ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:177:4: ( (lv_publishers_9_0= rulePublisher ) ) otherlv_10= ';'
            	    {
            	    // InternalDsl.g:177:4: ( (lv_publishers_9_0= rulePublisher ) )
            	    // InternalDsl.g:178:5: (lv_publishers_9_0= rulePublisher )
            	    {
            	    // InternalDsl.g:178:5: (lv_publishers_9_0= rulePublisher )
            	    // InternalDsl.g:179:6: lv_publishers_9_0= rulePublisher
            	    {

            	    						newCompositeNode(grammarAccess.getDataCollectorAccess().getPublishersPublisherParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_publishers_9_0=rulePublisher();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"publishers",
            	    							lv_publishers_9_0,
            	    							"fr.ubo.collector.dsl.Dsl.Publisher");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_10, grammarAccess.getDataCollectorAccess().getSemicolonKeyword_9_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getDataCollectorAccess().getSubscriptionsKeyword_11());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getDataCollectorAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalDsl.g:213:3: ( (lv_subscribers_14_0= ruleSubscriber ) )
            // InternalDsl.g:214:4: (lv_subscribers_14_0= ruleSubscriber )
            {
            // InternalDsl.g:214:4: (lv_subscribers_14_0= ruleSubscriber )
            // InternalDsl.g:215:5: lv_subscribers_14_0= ruleSubscriber
            {

            					newCompositeNode(grammarAccess.getDataCollectorAccess().getSubscribersSubscriberParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_subscribers_14_0=ruleSubscriber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            					}
            					add(
            						current,
            						"subscribers",
            						lv_subscribers_14_0,
            						"fr.ubo.collector.dsl.Dsl.Subscriber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getDataCollectorAccess().getSemicolonKeyword_14());
            		
            // InternalDsl.g:236:3: ( ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:237:4: ( (lv_subscribers_16_0= ruleSubscriber ) ) otherlv_17= ';'
            	    {
            	    // InternalDsl.g:237:4: ( (lv_subscribers_16_0= ruleSubscriber ) )
            	    // InternalDsl.g:238:5: (lv_subscribers_16_0= ruleSubscriber )
            	    {
            	    // InternalDsl.g:238:5: (lv_subscribers_16_0= ruleSubscriber )
            	    // InternalDsl.g:239:6: lv_subscribers_16_0= ruleSubscriber
            	    {

            	    						newCompositeNode(grammarAccess.getDataCollectorAccess().getSubscribersSubscriberParserRuleCall_15_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_subscribers_16_0=ruleSubscriber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataCollectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subscribers",
            	    							lv_subscribers_16_0,
            	    							"fr.ubo.collector.dsl.Dsl.Subscriber");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_17, grammarAccess.getDataCollectorAccess().getSemicolonKeyword_15_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_18=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getDataCollectorAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataCollector"


    // $ANTLR start "entryRuleEndpoint"
    // InternalDsl.g:273:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalDsl.g:273:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalDsl.g:274:2: iv_ruleEndpoint= ruleEndpoint EOF
            {
             newCompositeNode(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndpoint=ruleEndpoint();

            state._fsp--;

             current =iv_ruleEndpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalDsl.g:280:1: ruleEndpoint returns [EObject current=null] : this_TcpIpEndpoint_0= ruleTcpIpEndpoint ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject this_TcpIpEndpoint_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:286:2: (this_TcpIpEndpoint_0= ruleTcpIpEndpoint )
            // InternalDsl.g:287:2: this_TcpIpEndpoint_0= ruleTcpIpEndpoint
            {

            		newCompositeNode(grammarAccess.getEndpointAccess().getTcpIpEndpointParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TcpIpEndpoint_0=ruleTcpIpEndpoint();

            state._fsp--;


            		current = this_TcpIpEndpoint_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleDrone"
    // InternalDsl.g:298:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalDsl.g:298:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalDsl.g:299:2: iv_ruleDrone= ruleDrone EOF
            {
             newCompositeNode(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrone=ruleDrone();

            state._fsp--;

             current =iv_ruleDrone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalDsl.g:305:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Sensors' otherlv_4= '{' ( (lv_sensorsDrone_5_0= ruleSensor ) ) ( (lv_sensorsDrone_6_0= ruleSensor ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sensorsDrone_5_0 = null;

        EObject lv_sensorsDrone_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:311:2: ( (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Sensors' otherlv_4= '{' ( (lv_sensorsDrone_5_0= ruleSensor ) ) ( (lv_sensorsDrone_6_0= ruleSensor ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalDsl.g:312:2: (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Sensors' otherlv_4= '{' ( (lv_sensorsDrone_5_0= ruleSensor ) ) ( (lv_sensorsDrone_6_0= ruleSensor ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalDsl.g:312:2: (otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Sensors' otherlv_4= '{' ( (lv_sensorsDrone_5_0= ruleSensor ) ) ( (lv_sensorsDrone_6_0= ruleSensor ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalDsl.g:313:3: otherlv_0= 'Drone' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Sensors' otherlv_4= '{' ( (lv_sensorsDrone_5_0= ruleSensor ) ) ( (lv_sensorsDrone_6_0= ruleSensor ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDroneKeyword_0());
            		
            // InternalDsl.g:317:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:318:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:318:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:319:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getSensorsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDsl.g:348:3: ( (lv_sensorsDrone_5_0= ruleSensor ) )
            // InternalDsl.g:349:4: (lv_sensorsDrone_5_0= ruleSensor )
            {
            // InternalDsl.g:349:4: (lv_sensorsDrone_5_0= ruleSensor )
            // InternalDsl.g:350:5: lv_sensorsDrone_5_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getSensorsDroneSensorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_sensorsDrone_5_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					add(
            						current,
            						"sensorsDrone",
            						lv_sensorsDrone_5_0,
            						"fr.ubo.collector.dsl.Dsl.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:367:3: ( (lv_sensorsDrone_6_0= ruleSensor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:368:4: (lv_sensorsDrone_6_0= ruleSensor )
            	    {
            	    // InternalDsl.g:368:4: (lv_sensorsDrone_6_0= ruleSensor )
            	    // InternalDsl.g:369:5: lv_sensorsDrone_6_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getDroneAccess().getSensorsDroneSensorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_sensorsDrone_6_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDroneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensorsDrone",
            	    						lv_sensorsDrone_6_0,
            	    						"fr.ubo.collector.dsl.Dsl.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRulePubBroker"
    // InternalDsl.g:398:1: entryRulePubBroker returns [EObject current=null] : iv_rulePubBroker= rulePubBroker EOF ;
    public final EObject entryRulePubBroker() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePubBroker = null;


        try {
            // InternalDsl.g:398:50: (iv_rulePubBroker= rulePubBroker EOF )
            // InternalDsl.g:399:2: iv_rulePubBroker= rulePubBroker EOF
            {
             newCompositeNode(grammarAccess.getPubBrokerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePubBroker=rulePubBroker();

            state._fsp--;

             current =iv_rulePubBroker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePubBroker"


    // $ANTLR start "rulePubBroker"
    // InternalDsl.g:405:1: rulePubBroker returns [EObject current=null] : (otherlv_0= 'PubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_logPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject rulePubBroker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_logPath_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:411:2: ( (otherlv_0= 'PubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_logPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // InternalDsl.g:412:2: (otherlv_0= 'PubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_logPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalDsl.g:412:2: (otherlv_0= 'PubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_logPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' )
            // InternalDsl.g:413:3: otherlv_0= 'PubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_logPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPubBrokerAccess().getPubBrokerKeyword_0());
            		
            // InternalDsl.g:417:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:418:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:418:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:419:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPubBrokerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPubBrokerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPubBrokerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:440:3: ( (lv_id_3_0= ruleEndpoint ) )
            // InternalDsl.g:441:4: (lv_id_3_0= ruleEndpoint )
            {
            // InternalDsl.g:441:4: (lv_id_3_0= ruleEndpoint )
            // InternalDsl.g:442:5: lv_id_3_0= ruleEndpoint
            {

            					newCompositeNode(grammarAccess.getPubBrokerAccess().getIdEndpointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_id_3_0=ruleEndpoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPubBrokerRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"fr.ubo.collector.dsl.Dsl.Endpoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getPubBrokerAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:463:3: ( (lv_logPath_5_0= ruleEString ) )
            // InternalDsl.g:464:4: (lv_logPath_5_0= ruleEString )
            {
            // InternalDsl.g:464:4: (lv_logPath_5_0= ruleEString )
            // InternalDsl.g:465:5: lv_logPath_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPubBrokerAccess().getLogPathEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_logPath_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPubBrokerRule());
            					}
            					set(
            						current,
            						"logPath",
            						lv_logPath_5_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getPubBrokerAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPubBrokerAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePubBroker"


    // $ANTLR start "entryRulePublisher"
    // InternalDsl.g:494:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalDsl.g:494:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalDsl.g:495:2: iv_rulePublisher= rulePublisher EOF
            {
             newCompositeNode(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublisher=rulePublisher();

            state._fsp--;

             current =iv_rulePublisher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalDsl.g:501:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_period_5_0= ruleEDouble ) ) otherlv_6= ',' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_period_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:507:2: ( (otherlv_0= 'Publisher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_period_5_0= ruleEDouble ) ) otherlv_6= ',' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' ) )
            // InternalDsl.g:508:2: (otherlv_0= 'Publisher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_period_5_0= ruleEDouble ) ) otherlv_6= ',' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )
            {
            // InternalDsl.g:508:2: (otherlv_0= 'Publisher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_period_5_0= ruleEDouble ) ) otherlv_6= ',' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )
            // InternalDsl.g:509:3: otherlv_0= 'Publisher' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_period_5_0= ruleEDouble ) ) otherlv_6= ',' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            // InternalDsl.g:513:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:514:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:514:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:515:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:536:3: ( (lv_id_3_0= ruleEndpoint ) )
            // InternalDsl.g:537:4: (lv_id_3_0= ruleEndpoint )
            {
            // InternalDsl.g:537:4: (lv_id_3_0= ruleEndpoint )
            // InternalDsl.g:538:5: lv_id_3_0= ruleEndpoint
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getIdEndpointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_id_3_0=ruleEndpoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"fr.ubo.collector.dsl.Dsl.Endpoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:559:3: ( (lv_period_5_0= ruleEDouble ) )
            // InternalDsl.g:560:4: (lv_period_5_0= ruleEDouble )
            {
            // InternalDsl.g:560:4: (lv_period_5_0= ruleEDouble )
            // InternalDsl.g:561:5: lv_period_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getPeriodEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_period_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"period",
            						lv_period_5_0,
            						"fr.ubo.collector.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getCommaKeyword_6());
            		
            // InternalDsl.g:582:3: ( ( ruleEString ) )
            // InternalDsl.g:583:4: ( ruleEString )
            {
            // InternalDsl.g:583:4: ( ruleEString )
            // InternalDsl.g:584:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableCrossReference_7_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:598:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:599:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_15); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalDsl.g:603:4: ( ( ruleEString ) )
            	    // InternalDsl.g:604:5: ( ruleEString )
            	    {
            	    // InternalDsl.g:604:5: ( ruleEString )
            	    // InternalDsl.g:605:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPublisherRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPublisherAccess().getPublishedMeasuresMeasuredVariableCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPublisherAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalDsl.g:628:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalDsl.g:628:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalDsl.g:629:2: iv_ruleSubscriber= ruleSubscriber EOF
            {
             newCompositeNode(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscriber=ruleSubscriber();

            state._fsp--;

             current =iv_ruleSubscriber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalDsl.g:635:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_period_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_aggregation_9_0= ruleAggregation ) ) otherlv_10= ')' ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_period_7_0 = null;

        Enumerator lv_aggregation_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:641:2: ( (otherlv_0= 'Subscriber' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_period_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_aggregation_9_0= ruleAggregation ) ) otherlv_10= ')' ) )
            // InternalDsl.g:642:2: (otherlv_0= 'Subscriber' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_period_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_aggregation_9_0= ruleAggregation ) ) otherlv_10= ')' )
            {
            // InternalDsl.g:642:2: (otherlv_0= 'Subscriber' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_period_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_aggregation_9_0= ruleAggregation ) ) otherlv_10= ')' )
            // InternalDsl.g:643:3: otherlv_0= 'Subscriber' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_period_7_0= ruleEDouble ) ) otherlv_8= ',' ( (lv_aggregation_9_0= ruleAggregation ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            // InternalDsl.g:647:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:648:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:648:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:649:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:670:3: ( (lv_id_3_0= ruleEndpoint ) )
            // InternalDsl.g:671:4: (lv_id_3_0= ruleEndpoint )
            {
            // InternalDsl.g:671:4: (lv_id_3_0= ruleEndpoint )
            // InternalDsl.g:672:5: lv_id_3_0= ruleEndpoint
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getIdEndpointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_id_3_0=ruleEndpoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"fr.ubo.collector.dsl.Dsl.Endpoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:693:3: ( ( ruleEString ) )
            // InternalDsl.g:694:4: ( ruleEString )
            {
            // InternalDsl.g:694:4: ( ruleEString )
            // InternalDsl.g:695:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMonitoredMeasureMeasuredVariableCrossReference_5_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getCommaKeyword_6());
            		
            // InternalDsl.g:713:3: ( (lv_period_7_0= ruleEDouble ) )
            // InternalDsl.g:714:4: (lv_period_7_0= ruleEDouble )
            {
            // InternalDsl.g:714:4: (lv_period_7_0= ruleEDouble )
            // InternalDsl.g:715:5: lv_period_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getPeriodEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_period_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"period",
            						lv_period_7_0,
            						"fr.ubo.collector.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getCommaKeyword_8());
            		
            // InternalDsl.g:736:3: ( (lv_aggregation_9_0= ruleAggregation ) )
            // InternalDsl.g:737:4: (lv_aggregation_9_0= ruleAggregation )
            {
            // InternalDsl.g:737:4: (lv_aggregation_9_0= ruleAggregation )
            // InternalDsl.g:738:5: lv_aggregation_9_0= ruleAggregation
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getAggregationAggregationEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_aggregation_9_0=ruleAggregation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"aggregation",
            						lv_aggregation_9_0,
            						"fr.ubo.collector.dsl.Dsl.Aggregation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSubscriberAccess().getRightParenthesisKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleSubBroker"
    // InternalDsl.g:763:1: entryRuleSubBroker returns [EObject current=null] : iv_ruleSubBroker= ruleSubBroker EOF ;
    public final EObject entryRuleSubBroker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubBroker = null;


        try {
            // InternalDsl.g:763:50: (iv_ruleSubBroker= ruleSubBroker EOF )
            // InternalDsl.g:764:2: iv_ruleSubBroker= ruleSubBroker EOF
            {
             newCompositeNode(grammarAccess.getSubBrokerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubBroker=ruleSubBroker();

            state._fsp--;

             current =iv_ruleSubBroker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubBroker"


    // $ANTLR start "ruleSubBroker"
    // InternalDsl.g:770:1: ruleSubBroker returns [EObject current=null] : (otherlv_0= 'SubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_configurationPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleSubBroker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_configurationPath_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:776:2: ( (otherlv_0= 'SubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_configurationPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // InternalDsl.g:777:2: (otherlv_0= 'SubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_configurationPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalDsl.g:777:2: (otherlv_0= 'SubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_configurationPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';' )
            // InternalDsl.g:778:3: otherlv_0= 'SubBroker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_id_3_0= ruleEndpoint ) ) otherlv_4= ',' ( (lv_configurationPath_5_0= ruleEString ) ) otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubBrokerAccess().getSubBrokerKeyword_0());
            		
            // InternalDsl.g:782:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:783:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:783:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:784:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubBrokerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubBrokerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSubBrokerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:805:3: ( (lv_id_3_0= ruleEndpoint ) )
            // InternalDsl.g:806:4: (lv_id_3_0= ruleEndpoint )
            {
            // InternalDsl.g:806:4: (lv_id_3_0= ruleEndpoint )
            // InternalDsl.g:807:5: lv_id_3_0= ruleEndpoint
            {

            					newCompositeNode(grammarAccess.getSubBrokerAccess().getIdEndpointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_id_3_0=ruleEndpoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubBrokerRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_3_0,
            						"fr.ubo.collector.dsl.Dsl.Endpoint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSubBrokerAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:828:3: ( (lv_configurationPath_5_0= ruleEString ) )
            // InternalDsl.g:829:4: (lv_configurationPath_5_0= ruleEString )
            {
            // InternalDsl.g:829:4: (lv_configurationPath_5_0= ruleEString )
            // InternalDsl.g:830:5: lv_configurationPath_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubBrokerAccess().getConfigurationPathEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_configurationPath_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubBrokerRule());
            					}
            					set(
            						current,
            						"configurationPath",
            						lv_configurationPath_5_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSubBrokerAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSubBrokerAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubBroker"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:859:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:859:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:860:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:866:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:872:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:873:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:873:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:874:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:882:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:893:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDsl.g:893:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDsl.g:894:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDsl.g:900:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'measures' otherlv_3= '{' ( (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable ) ) otherlv_5= ';' ( ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';' )* otherlv_8= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sensorMeasuredVariables_4_0 = null;

        EObject lv_sensorMeasuredVariables_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:906:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'measures' otherlv_3= '{' ( (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable ) ) otherlv_5= ';' ( ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';' )* otherlv_8= '}' ) )
            // InternalDsl.g:907:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'measures' otherlv_3= '{' ( (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable ) ) otherlv_5= ';' ( ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';' )* otherlv_8= '}' )
            {
            // InternalDsl.g:907:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'measures' otherlv_3= '{' ( (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable ) ) otherlv_5= ';' ( ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';' )* otherlv_8= '}' )
            // InternalDsl.g:908:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'measures' otherlv_3= '{' ( (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable ) ) otherlv_5= ';' ( ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';' )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDsl.g:912:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:913:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:913:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:914:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getMeasuresKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:939:3: ( (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable ) )
            // InternalDsl.g:940:4: (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable )
            {
            // InternalDsl.g:940:4: (lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable )
            // InternalDsl.g:941:5: lv_sensorMeasuredVariables_4_0= ruleMeasuredVariable
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_sensorMeasuredVariables_4_0=ruleMeasuredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					add(
            						current,
            						"sensorMeasuredVariables",
            						lv_sensorMeasuredVariables_4_0,
            						"fr.ubo.collector.dsl.Dsl.MeasuredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getSemicolonKeyword_5());
            		
            // InternalDsl.g:962:3: ( ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:963:4: ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) ) otherlv_7= ';'
            	    {
            	    // InternalDsl.g:963:4: ( (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable ) )
            	    // InternalDsl.g:964:5: (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable )
            	    {
            	    // InternalDsl.g:964:5: (lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable )
            	    // InternalDsl.g:965:6: lv_sensorMeasuredVariables_6_0= ruleMeasuredVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_sensorMeasuredVariables_6_0=ruleMeasuredVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensorMeasuredVariables",
            	    							lv_sensorMeasuredVariables_6_0,
            	    							"fr.ubo.collector.dsl.Dsl.MeasuredVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FOLLOW_26); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getSemicolonKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleMeasuredVariable"
    // InternalDsl.g:995:1: entryRuleMeasuredVariable returns [EObject current=null] : iv_ruleMeasuredVariable= ruleMeasuredVariable EOF ;
    public final EObject entryRuleMeasuredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasuredVariable = null;


        try {
            // InternalDsl.g:995:57: (iv_ruleMeasuredVariable= ruleMeasuredVariable EOF )
            // InternalDsl.g:996:2: iv_ruleMeasuredVariable= ruleMeasuredVariable EOF
            {
             newCompositeNode(grammarAccess.getMeasuredVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasuredVariable=ruleMeasuredVariable();

            state._fsp--;

             current =iv_ruleMeasuredVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasuredVariable"


    // $ANTLR start "ruleMeasuredVariable"
    // InternalDsl.g:1002:1: ruleMeasuredVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) otherlv_3= ')' ) ;
    public final EObject ruleMeasuredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1008:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) otherlv_3= ')' ) )
            // InternalDsl.g:1009:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) otherlv_3= ')' )
            {
            // InternalDsl.g:1009:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) otherlv_3= ')' )
            // InternalDsl.g:1010:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) otherlv_3= ')'
            {
            // InternalDsl.g:1010:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:1011:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:1011:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:1012:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasuredVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasuredVariableAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:1033:3: ( (lv_unit_2_0= ruleMeasurementDataUnit ) )
            // InternalDsl.g:1034:4: (lv_unit_2_0= ruleMeasurementDataUnit )
            {
            // InternalDsl.g:1034:4: (lv_unit_2_0= ruleMeasurementDataUnit )
            // InternalDsl.g:1035:5: lv_unit_2_0= ruleMeasurementDataUnit
            {

            					newCompositeNode(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_unit_2_0=ruleMeasurementDataUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasuredVariableRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"fr.ubo.collector.dsl.Dsl.MeasurementDataUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasuredVariableAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasuredVariable"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:1060:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:1060:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:1061:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:1067:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:1073:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:1074:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:1074:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:1075:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:1075:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:1076:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1082:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1083:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_29); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_31); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:1103:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=30 && LA11_0<=31)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1104:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:1104:4: (kw= 'E' | kw= 'e' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==30) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==31) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDsl.g:1105:5: kw= 'E'
                            {
                            kw=(Token)match(input,30,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1111:5: kw= 'e'
                            {
                            kw=(Token)match(input,31,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:1117:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==28) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDsl.g:1118:5: kw= '-'
                            {
                            kw=(Token)match(input,28,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:1136:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:1136:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:1137:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:1143:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1149:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:1150:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:1150:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:1151:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:1151:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1152:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTcpIpEndpoint"
    // InternalDsl.g:1169:1: entryRuleTcpIpEndpoint returns [EObject current=null] : iv_ruleTcpIpEndpoint= ruleTcpIpEndpoint EOF ;
    public final EObject entryRuleTcpIpEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTcpIpEndpoint = null;


        try {
            // InternalDsl.g:1169:54: (iv_ruleTcpIpEndpoint= ruleTcpIpEndpoint EOF )
            // InternalDsl.g:1170:2: iv_ruleTcpIpEndpoint= ruleTcpIpEndpoint EOF
            {
             newCompositeNode(grammarAccess.getTcpIpEndpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTcpIpEndpoint=ruleTcpIpEndpoint();

            state._fsp--;

             current =iv_ruleTcpIpEndpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTcpIpEndpoint"


    // $ANTLR start "ruleTcpIpEndpoint"
    // InternalDsl.g:1176:1: ruleTcpIpEndpoint returns [EObject current=null] : ( ( (lv_ipAddress_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_port_2_0= ruleEInt ) ) ) ;
    public final EObject ruleTcpIpEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ipAddress_0_0 = null;

        AntlrDatatypeRuleToken lv_port_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1182:2: ( ( ( (lv_ipAddress_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_port_2_0= ruleEInt ) ) ) )
            // InternalDsl.g:1183:2: ( ( (lv_ipAddress_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_port_2_0= ruleEInt ) ) )
            {
            // InternalDsl.g:1183:2: ( ( (lv_ipAddress_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_port_2_0= ruleEInt ) ) )
            // InternalDsl.g:1184:3: ( (lv_ipAddress_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_port_2_0= ruleEInt ) )
            {
            // InternalDsl.g:1184:3: ( (lv_ipAddress_0_0= ruleEString ) )
            // InternalDsl.g:1185:4: (lv_ipAddress_0_0= ruleEString )
            {
            // InternalDsl.g:1185:4: (lv_ipAddress_0_0= ruleEString )
            // InternalDsl.g:1186:5: lv_ipAddress_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTcpIpEndpointAccess().getIpAddressEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_ipAddress_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTcpIpEndpointRule());
            					}
            					set(
            						current,
            						"ipAddress",
            						lv_ipAddress_0_0,
            						"fr.ubo.collector.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getTcpIpEndpointAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1207:3: ( (lv_port_2_0= ruleEInt ) )
            // InternalDsl.g:1208:4: (lv_port_2_0= ruleEInt )
            {
            // InternalDsl.g:1208:4: (lv_port_2_0= ruleEInt )
            // InternalDsl.g:1209:5: lv_port_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTcpIpEndpointAccess().getPortEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_port_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTcpIpEndpointRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_2_0,
            						"fr.ubo.collector.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTcpIpEndpoint"


    // $ANTLR start "ruleMeasurementDataUnit"
    // InternalDsl.g:1230:1: ruleMeasurementDataUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'METER' ) | (enumLiteral_1= 'METER_PER_SECOND' ) | (enumLiteral_2= 'METER_PER_SECOND_SQUARED' ) | (enumLiteral_3= 'DEGREE_CELSIUS' ) | (enumLiteral_4= 'RADIAN' ) | (enumLiteral_5= 'RADIAN_PER_SECOND' ) | (enumLiteral_6= 'BAR' ) | (enumLiteral_7= 'LITER' ) | (enumLiteral_8= 'GRAM' ) | (enumLiteral_9= 'NONE' ) ) ;
    public final Enumerator ruleMeasurementDataUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalDsl.g:1236:2: ( ( (enumLiteral_0= 'METER' ) | (enumLiteral_1= 'METER_PER_SECOND' ) | (enumLiteral_2= 'METER_PER_SECOND_SQUARED' ) | (enumLiteral_3= 'DEGREE_CELSIUS' ) | (enumLiteral_4= 'RADIAN' ) | (enumLiteral_5= 'RADIAN_PER_SECOND' ) | (enumLiteral_6= 'BAR' ) | (enumLiteral_7= 'LITER' ) | (enumLiteral_8= 'GRAM' ) | (enumLiteral_9= 'NONE' ) ) )
            // InternalDsl.g:1237:2: ( (enumLiteral_0= 'METER' ) | (enumLiteral_1= 'METER_PER_SECOND' ) | (enumLiteral_2= 'METER_PER_SECOND_SQUARED' ) | (enumLiteral_3= 'DEGREE_CELSIUS' ) | (enumLiteral_4= 'RADIAN' ) | (enumLiteral_5= 'RADIAN_PER_SECOND' ) | (enumLiteral_6= 'BAR' ) | (enumLiteral_7= 'LITER' ) | (enumLiteral_8= 'GRAM' ) | (enumLiteral_9= 'NONE' ) )
            {
            // InternalDsl.g:1237:2: ( (enumLiteral_0= 'METER' ) | (enumLiteral_1= 'METER_PER_SECOND' ) | (enumLiteral_2= 'METER_PER_SECOND_SQUARED' ) | (enumLiteral_3= 'DEGREE_CELSIUS' ) | (enumLiteral_4= 'RADIAN' ) | (enumLiteral_5= 'RADIAN_PER_SECOND' ) | (enumLiteral_6= 'BAR' ) | (enumLiteral_7= 'LITER' ) | (enumLiteral_8= 'GRAM' ) | (enumLiteral_9= 'NONE' ) )
            int alt13=10;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 36:
                {
                alt13=4;
                }
                break;
            case 37:
                {
                alt13=5;
                }
                break;
            case 38:
                {
                alt13=6;
                }
                break;
            case 39:
                {
                alt13=7;
                }
                break;
            case 40:
                {
                alt13=8;
                }
                break;
            case 41:
                {
                alt13=9;
                }
                break;
            case 42:
                {
                alt13=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1238:3: (enumLiteral_0= 'METER' )
                    {
                    // InternalDsl.g:1238:3: (enumLiteral_0= 'METER' )
                    // InternalDsl.g:1239:4: enumLiteral_0= 'METER'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getMETEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMeasurementDataUnitAccess().getMETEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1246:3: (enumLiteral_1= 'METER_PER_SECOND' )
                    {
                    // InternalDsl.g:1246:3: (enumLiteral_1= 'METER_PER_SECOND' )
                    // InternalDsl.g:1247:4: enumLiteral_1= 'METER_PER_SECOND'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECONDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECONDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1254:3: (enumLiteral_2= 'METER_PER_SECOND_SQUARED' )
                    {
                    // InternalDsl.g:1254:3: (enumLiteral_2= 'METER_PER_SECOND_SQUARED' )
                    // InternalDsl.g:1255:4: enumLiteral_2= 'METER_PER_SECOND_SQUARED'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECOND_SQUAREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMeasurementDataUnitAccess().getMETER_PER_SECOND_SQUAREDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1262:3: (enumLiteral_3= 'DEGREE_CELSIUS' )
                    {
                    // InternalDsl.g:1262:3: (enumLiteral_3= 'DEGREE_CELSIUS' )
                    // InternalDsl.g:1263:4: enumLiteral_3= 'DEGREE_CELSIUS'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getDEGREE_CELSIUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMeasurementDataUnitAccess().getDEGREE_CELSIUSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1270:3: (enumLiteral_4= 'RADIAN' )
                    {
                    // InternalDsl.g:1270:3: (enumLiteral_4= 'RADIAN' )
                    // InternalDsl.g:1271:4: enumLiteral_4= 'RADIAN'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getRADIANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMeasurementDataUnitAccess().getRADIANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1278:3: (enumLiteral_5= 'RADIAN_PER_SECOND' )
                    {
                    // InternalDsl.g:1278:3: (enumLiteral_5= 'RADIAN_PER_SECOND' )
                    // InternalDsl.g:1279:4: enumLiteral_5= 'RADIAN_PER_SECOND'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getRADIAN_PER_SECONDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMeasurementDataUnitAccess().getRADIAN_PER_SECONDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1286:3: (enumLiteral_6= 'BAR' )
                    {
                    // InternalDsl.g:1286:3: (enumLiteral_6= 'BAR' )
                    // InternalDsl.g:1287:4: enumLiteral_6= 'BAR'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getBAREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMeasurementDataUnitAccess().getBAREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1294:3: (enumLiteral_7= 'LITER' )
                    {
                    // InternalDsl.g:1294:3: (enumLiteral_7= 'LITER' )
                    // InternalDsl.g:1295:4: enumLiteral_7= 'LITER'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getLITEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMeasurementDataUnitAccess().getLITEREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1302:3: (enumLiteral_8= 'GRAM' )
                    {
                    // InternalDsl.g:1302:3: (enumLiteral_8= 'GRAM' )
                    // InternalDsl.g:1303:4: enumLiteral_8= 'GRAM'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getGRAMEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMeasurementDataUnitAccess().getGRAMEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1310:3: (enumLiteral_9= 'NONE' )
                    {
                    // InternalDsl.g:1310:3: (enumLiteral_9= 'NONE' )
                    // InternalDsl.g:1311:4: enumLiteral_9= 'NONE'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getNONEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMeasurementDataUnitAccess().getNONEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurementDataUnit"


    // $ANTLR start "ruleAggregation"
    // InternalDsl.g:1321:1: ruleAggregation returns [Enumerator current=null] : ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AVERAGE' ) | (enumLiteral_3= 'FIRST' ) | (enumLiteral_4= 'LAST' ) | (enumLiteral_5= 'ALL' ) ) ;
    public final Enumerator ruleAggregation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDsl.g:1327:2: ( ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AVERAGE' ) | (enumLiteral_3= 'FIRST' ) | (enumLiteral_4= 'LAST' ) | (enumLiteral_5= 'ALL' ) ) )
            // InternalDsl.g:1328:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AVERAGE' ) | (enumLiteral_3= 'FIRST' ) | (enumLiteral_4= 'LAST' ) | (enumLiteral_5= 'ALL' ) )
            {
            // InternalDsl.g:1328:2: ( (enumLiteral_0= 'MIN' ) | (enumLiteral_1= 'MAX' ) | (enumLiteral_2= 'AVERAGE' ) | (enumLiteral_3= 'FIRST' ) | (enumLiteral_4= 'LAST' ) | (enumLiteral_5= 'ALL' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            case 47:
                {
                alt14=5;
                }
                break;
            case 48:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1329:3: (enumLiteral_0= 'MIN' )
                    {
                    // InternalDsl.g:1329:3: (enumLiteral_0= 'MIN' )
                    // InternalDsl.g:1330:4: enumLiteral_0= 'MIN'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getAggregationAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationAccess().getMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1337:3: (enumLiteral_1= 'MAX' )
                    {
                    // InternalDsl.g:1337:3: (enumLiteral_1= 'MAX' )
                    // InternalDsl.g:1338:4: enumLiteral_1= 'MAX'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAggregationAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationAccess().getMAXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1345:3: (enumLiteral_2= 'AVERAGE' )
                    {
                    // InternalDsl.g:1345:3: (enumLiteral_2= 'AVERAGE' )
                    // InternalDsl.g:1346:4: enumLiteral_2= 'AVERAGE'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getAggregationAccess().getAVERAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAggregationAccess().getAVERAGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1353:3: (enumLiteral_3= 'FIRST' )
                    {
                    // InternalDsl.g:1353:3: (enumLiteral_3= 'FIRST' )
                    // InternalDsl.g:1354:4: enumLiteral_3= 'FIRST'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAggregationAccess().getFIRSTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAggregationAccess().getFIRSTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1361:3: (enumLiteral_4= 'LAST' )
                    {
                    // InternalDsl.g:1361:3: (enumLiteral_4= 'LAST' )
                    // InternalDsl.g:1362:4: enumLiteral_4= 'LAST'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAggregationAccess().getLASTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAggregationAccess().getLASTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1369:3: (enumLiteral_5= 'ALL' )
                    {
                    // InternalDsl.g:1369:3: (enumLiteral_5= 'ALL' )
                    // InternalDsl.g:1370:4: enumLiteral_5= 'ALL'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getAggregationAccess().getALLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAggregationAccess().getALLEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000007FE00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});

}