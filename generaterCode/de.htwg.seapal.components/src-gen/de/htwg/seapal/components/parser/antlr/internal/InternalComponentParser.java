package de.htwg.seapal.components.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwg.seapal.components.services.ComponentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "'RootPackage'", "'{'", "'}'", "'package'", "'.'", "'depndency'", "'import'", "'.*'", "'RawType'", "'interface'", "'method'", "'('", "','", "')'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalComponentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentParser.tokenNames; }
    public String getGrammarFileName() { return "../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g"; }



     	private ComponentGrammarAccess grammarAccess;
     	
        public InternalComponentParser(TokenStream input, ComponentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Component";	
       	}
       	
       	@Override
       	protected ComponentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleComponent"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:67:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:68:2: (iv_ruleComponent= ruleComponent EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:69:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent75);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent85); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:76:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Name' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_root_2_0= ruleRootpackage ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:79:28: ( (otherlv_0= 'Name' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_root_2_0= ruleRootpackage ) ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:80:1: (otherlv_0= 'Name' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_root_2_0= ruleRootpackage ) ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:80:1: (otherlv_0= 'Name' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_root_2_0= ruleRootpackage ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:80:3: otherlv_0= 'Name' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_root_2_0= ruleRootpackage ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleComponent122); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getNameKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:86:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleComponent143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:102:2: ( (lv_root_2_0= ruleRootpackage ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:103:1: (lv_root_2_0= ruleRootpackage )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:103:1: (lv_root_2_0= ruleRootpackage )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:104:3: lv_root_2_0= ruleRootpackage
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getRootRootpackageParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRootpackage_in_ruleComponent164);
            lv_root_2_0=ruleRootpackage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_2_0, 
                    		"Rootpackage");
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleRootpackage"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:128:1: entryRuleRootpackage returns [EObject current=null] : iv_ruleRootpackage= ruleRootpackage EOF ;
    public final EObject entryRuleRootpackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootpackage = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:129:2: (iv_ruleRootpackage= ruleRootpackage EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:130:2: iv_ruleRootpackage= ruleRootpackage EOF
            {
             newCompositeNode(grammarAccess.getRootpackageRule()); 
            pushFollow(FOLLOW_ruleRootpackage_in_entryRuleRootpackage200);
            iv_ruleRootpackage=ruleRootpackage();

            state._fsp--;

             current =iv_ruleRootpackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootpackage210); 

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
    // $ANTLR end "entryRuleRootpackage"


    // $ANTLR start "ruleRootpackage"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:137:1: ruleRootpackage returns [EObject current=null] : (otherlv_0= 'RootPackage' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleRootpackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:140:28: ( (otherlv_0= 'RootPackage' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:141:1: (otherlv_0= 'RootPackage' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:141:1: (otherlv_0= 'RootPackage' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:141:3: otherlv_0= 'RootPackage' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleRootpackage247); 

                	newLeafNode(otherlv_0, grammarAccess.getRootpackageAccess().getRootPackageKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:145:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:146:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:146:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:147:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getRootpackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRootpackage268);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootpackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRootpackage280); 

                	newLeafNode(otherlv_2, grammarAccess.getRootpackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:167:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:168:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:168:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:169:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootpackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleRootpackage301);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootpackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRootpackage314); 

                	newLeafNode(otherlv_4, grammarAccess.getRootpackageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRootpackage"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:197:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:198:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:199:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration350);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration360); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:206:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:209:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:210:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:210:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:210:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePackageDeclaration397); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:214:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:215:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:215:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:216:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration418);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration430); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:236:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||(LA2_0>=17 && LA2_0<=18)||(LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:237:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:237:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:238:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration451);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration464); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:266:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:267:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:268:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement500);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement510); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:275:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Dependency_3= ruleDependency ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;

        EObject this_Dependency_3 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:278:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Dependency_3= ruleDependency ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:279:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Dependency_3= ruleDependency )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:279:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Dependency_3= ruleDependency )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 20:
            case 21:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:280:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement557);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:290:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement584);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:300:5: this_Import_2= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement611);
                    this_Import_2=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:310:5: this_Dependency_3= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getDependencyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleAbstractElement638);
                    this_Dependency_3=ruleDependency();

                    state._fsp--;

                     
                            current = this_Dependency_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:326:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:327:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:328:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName674);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName685); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:335:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:338:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:339:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:339:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:339:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName725); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:346:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:347:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName744); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName759); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDependency"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:367:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:368:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:369:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency806);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency816); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:376:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'depndency' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:379:28: ( (otherlv_0= 'depndency' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:380:1: (otherlv_0= 'depndency' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:380:1: (otherlv_0= 'depndency' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:380:3: otherlv_0= 'depndency' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDependency853); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDepndencyKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:384:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:385:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:385:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:386:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency874);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleImport"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:410:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:411:2: (iv_ruleImport= ruleImport EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:412:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport910);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport920); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:419:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:422:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:423:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:423:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:423:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport957); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:427:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:428:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:428:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:429:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport978);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:453:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:454:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:455:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1015);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1026); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:462:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:465:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:466:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:466:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:467:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1073);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:477:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:478:2: kw= '.*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildcard1092); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:491:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:492:2: (iv_ruleType= ruleType EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:493:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1134);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1144); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:500:1: ruleType returns [EObject current=null] : (this_RawType_0= ruleRawType | this_Interface_1= ruleInterface ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_RawType_0 = null;

        EObject this_Interface_1 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:503:28: ( (this_RawType_0= ruleRawType | this_Interface_1= ruleInterface ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:504:1: (this_RawType_0= ruleRawType | this_Interface_1= ruleInterface )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:504:1: (this_RawType_0= ruleRawType | this_Interface_1= ruleInterface )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:505:5: this_RawType_0= ruleRawType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRawTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRawType_in_ruleType1191);
                    this_RawType_0=ruleRawType();

                    state._fsp--;

                     
                            current = this_RawType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:515:5: this_Interface_1= ruleInterface
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterface_in_ruleType1218);
                    this_Interface_1=ruleInterface();

                    state._fsp--;

                     
                            current = this_Interface_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRawType"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:531:1: entryRuleRawType returns [EObject current=null] : iv_ruleRawType= ruleRawType EOF ;
    public final EObject entryRuleRawType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawType = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:532:2: (iv_ruleRawType= ruleRawType EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:533:2: iv_ruleRawType= ruleRawType EOF
            {
             newCompositeNode(grammarAccess.getRawTypeRule()); 
            pushFollow(FOLLOW_ruleRawType_in_entryRuleRawType1253);
            iv_ruleRawType=ruleRawType();

            state._fsp--;

             current =iv_ruleRawType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRawType1263); 

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
    // $ANTLR end "entryRuleRawType"


    // $ANTLR start "ruleRawType"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:540:1: ruleRawType returns [EObject current=null] : (otherlv_0= 'RawType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRawType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:543:28: ( (otherlv_0= 'RawType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:544:1: (otherlv_0= 'RawType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:544:1: (otherlv_0= 'RawType' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:544:3: otherlv_0= 'RawType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRawType1300); 

                	newLeafNode(otherlv_0, grammarAccess.getRawTypeAccess().getRawTypeKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:548:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:549:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:549:1: (lv_name_1_0= RULE_ID )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:550:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRawType1317); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRawTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRawTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRawType"


    // $ANTLR start "entryRuleInterface"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:574:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:575:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:576:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1358);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1368); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:583:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_properties_3_0 = null;

        EObject lv_methods_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:586:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:587:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:587:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:587:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* ( (lv_methods_4_0= ruleMethod ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInterface1405); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:591:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:592:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:592:1: (lv_name_1_0= RULE_ID )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:593:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1422); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleInterface1439); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:613:1: ( (lv_properties_3_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:614:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:614:1: (lv_properties_3_0= ruleProperty )
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:615:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleInterface1460);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:631:3: ( (lv_methods_4_0= ruleMethod ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:632:1: (lv_methods_4_0= ruleMethod )
            	    {
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:632:1: (lv_methods_4_0= ruleMethod )
            	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:633:3: lv_methods_4_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleInterface1482);
            	    lv_methods_4_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_4_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInterface1495); 

                	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMethod"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:661:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:662:2: (iv_ruleMethod= ruleMethod EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:663:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1531);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1541); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:670:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:673:28: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:674:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:674:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:674:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleMethod1578); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:678:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:679:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:679:1: (lv_name_1_0= RULE_ID )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:680:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1595); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleMethod1612); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:700:1: ( ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:700:2: ( (lv_parameters_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )*
                    {
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:700:2: ( (lv_parameters_3_0= ruleProperty ) )
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:701:1: (lv_parameters_3_0= ruleProperty )
                    {
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:701:1: (lv_parameters_3_0= ruleProperty )
                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:702:3: lv_parameters_3_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersPropertyParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_ruleMethod1634);
                    lv_parameters_3_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:718:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:718:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMethod1647); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:722:1: ( (lv_parameters_5_0= ruleProperty ) )
                    	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:723:1: (lv_parameters_5_0= ruleProperty )
                    	    {
                    	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:723:1: (lv_parameters_5_0= ruleProperty )
                    	    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:724:3: lv_parameters_5_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getParametersPropertyParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleMethod1668);
                    	    lv_parameters_5_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleMethod1684); 

                	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleMethod1696); 

                	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:748:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:749:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:749:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:750:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getTypeTypeCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod1719);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleProperty"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:771:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:772:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:773:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1755);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1765); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:780:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:783:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:784:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:784:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:784:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:784:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:785:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:785:1: (lv_name_0_0= RULE_ID )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:786:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1807); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleProperty1824); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:806:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:807:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:807:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components/src-gen/de/htwg/seapal/components/parser/antlr/internal/InternalComponent.g:808:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProperty1847);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleComponent122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponent143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleRootpackage_in_ruleComponent164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootpackage_in_entryRuleRootpackage200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootpackage210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRootpackage247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRootpackage268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRootpackage280 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleRootpackage301 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_14_in_ruleRootpackage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration418 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration430 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration451 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleAbstractElement638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName725 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName759 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDependency853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1073 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildcard1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRawType_in_ruleType1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleType1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRawType_in_entryRuleRawType1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRawType1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRawType1300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRawType1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInterface1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1422 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInterface1439 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleInterface1460 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleInterface1482 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleInterface1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMethod1578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1595 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMethod1612 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMethod1634 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleMethod1647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMethod1668 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleMethod1684 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMethod1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1807 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProperty1824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProperty1847 = new BitSet(new long[]{0x0000000000000002L});

}