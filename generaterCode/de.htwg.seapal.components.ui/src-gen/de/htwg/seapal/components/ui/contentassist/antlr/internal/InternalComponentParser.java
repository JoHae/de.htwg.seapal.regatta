package de.htwg.seapal.components.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.htwg.seapal.components.services.ComponentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "'RootPackage'", "'{'", "'}'", "'package'", "'.'", "'depndency'", "'import'", "'.*'", "'RawType'", "'interface'", "'method'", "'('", "')'", "':'", "','"
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
    public String getGrammarFileName() { return "../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g"; }


     
     	private ComponentGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ComponentGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleComponent"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:60:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:61:1: ( ruleComponent EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:62:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent61);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent68); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:69:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:73:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:74:1: ( ( rule__Component__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:74:1: ( ( rule__Component__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:75:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:76:1: ( rule__Component__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:76:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent94);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleRootpackage"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:88:1: entryRuleRootpackage : ruleRootpackage EOF ;
    public final void entryRuleRootpackage() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:89:1: ( ruleRootpackage EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:90:1: ruleRootpackage EOF
            {
             before(grammarAccess.getRootpackageRule()); 
            pushFollow(FOLLOW_ruleRootpackage_in_entryRuleRootpackage121);
            ruleRootpackage();

            state._fsp--;

             after(grammarAccess.getRootpackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootpackage128); 

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
    // $ANTLR end "entryRuleRootpackage"


    // $ANTLR start "ruleRootpackage"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:97:1: ruleRootpackage : ( ( rule__Rootpackage__Group__0 ) ) ;
    public final void ruleRootpackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:101:2: ( ( ( rule__Rootpackage__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:102:1: ( ( rule__Rootpackage__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:102:1: ( ( rule__Rootpackage__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:103:1: ( rule__Rootpackage__Group__0 )
            {
             before(grammarAccess.getRootpackageAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:104:1: ( rule__Rootpackage__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:104:2: rule__Rootpackage__Group__0
            {
            pushFollow(FOLLOW_rule__Rootpackage__Group__0_in_ruleRootpackage154);
            rule__Rootpackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootpackageAccess().getGroup()); 

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
    // $ANTLR end "ruleRootpackage"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:116:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:117:1: ( rulePackageDeclaration EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:118:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration181);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration188); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:125:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:129:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:131:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:132:1: ( rule__PackageDeclaration__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:132:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration214);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:144:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:145:1: ( ruleAbstractElement EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:146:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement241);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement248); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:153:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:157:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:158:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:158:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:159:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:160:1: ( rule__AbstractElement__Alternatives )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:160:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement274);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:173:1: ( ruleQualifiedName EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:174:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName308); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:187:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:188:1: ( rule__QualifiedName__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:188:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDependency"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:200:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:201:1: ( ruleDependency EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:202:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency361);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency368); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:209:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:213:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:214:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:214:1: ( ( rule__Dependency__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:215:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:216:1: ( rule__Dependency__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:216:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency394);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleImport"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:228:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:229:1: ( ruleImport EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:230:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport421);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport428); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:237:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:241:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:242:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:242:1: ( ( rule__Import__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:243:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:244:1: ( rule__Import__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:244:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport454);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:256:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:257:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:258:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard481);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard488); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:265:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:269:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:270:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:270:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:271:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:272:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:272:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard514);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:284:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:285:1: ( ruleType EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:286:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType541);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType548); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:293:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:297:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:298:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:298:1: ( ( rule__Type__Alternatives ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:299:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:300:1: ( rule__Type__Alternatives )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:300:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType574);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRawType"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:312:1: entryRuleRawType : ruleRawType EOF ;
    public final void entryRuleRawType() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:313:1: ( ruleRawType EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:314:1: ruleRawType EOF
            {
             before(grammarAccess.getRawTypeRule()); 
            pushFollow(FOLLOW_ruleRawType_in_entryRuleRawType601);
            ruleRawType();

            state._fsp--;

             after(grammarAccess.getRawTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRawType608); 

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
    // $ANTLR end "entryRuleRawType"


    // $ANTLR start "ruleRawType"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:321:1: ruleRawType : ( ( rule__RawType__Group__0 ) ) ;
    public final void ruleRawType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:325:2: ( ( ( rule__RawType__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:326:1: ( ( rule__RawType__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:326:1: ( ( rule__RawType__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:327:1: ( rule__RawType__Group__0 )
            {
             before(grammarAccess.getRawTypeAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:328:1: ( rule__RawType__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:328:2: rule__RawType__Group__0
            {
            pushFollow(FOLLOW_rule__RawType__Group__0_in_ruleRawType634);
            rule__RawType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRawTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleRawType"


    // $ANTLR start "entryRuleInterface"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:340:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:341:1: ( ruleInterface EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:342:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface661);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface668); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:349:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:353:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:354:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:354:1: ( ( rule__Interface__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:355:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:356:1: ( rule__Interface__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:356:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface694);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMethod"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:368:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:369:1: ( ruleMethod EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:370:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod721);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod728); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:377:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:381:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:382:1: ( ( rule__Method__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:382:1: ( ( rule__Method__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:383:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:384:1: ( rule__Method__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:384:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod754);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleProperty"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:396:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:397:1: ( ruleProperty EOF )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:398:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty781);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty788); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:405:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:409:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:410:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:410:1: ( ( rule__Property__Group__0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:411:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:412:1: ( rule__Property__Group__0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:412:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty814);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:424:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleDependency ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:428:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleDependency ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 20:
            case 21:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:429:1: ( rulePackageDeclaration )
                    {
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:429:1: ( rulePackageDeclaration )
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:430:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives850);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:435:6: ( ruleType )
                    {
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:435:6: ( ruleType )
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:436:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives867);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:441:6: ( ruleImport )
                    {
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:441:6: ( ruleImport )
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:442:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives884);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:447:6: ( ruleDependency )
                    {
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:447:6: ( ruleDependency )
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:448:1: ruleDependency
                    {
                     before(grammarAccess.getAbstractElementAccess().getDependencyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDependency_in_rule__AbstractElement__Alternatives901);
                    ruleDependency();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDependencyParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:458:1: rule__Type__Alternatives : ( ( ruleRawType ) | ( ruleInterface ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:462:1: ( ( ruleRawType ) | ( ruleInterface ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:463:1: ( ruleRawType )
                    {
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:463:1: ( ruleRawType )
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:464:1: ruleRawType
                    {
                     before(grammarAccess.getTypeAccess().getRawTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRawType_in_rule__Type__Alternatives933);
                    ruleRawType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRawTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:469:6: ( ruleInterface )
                    {
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:469:6: ( ruleInterface )
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:470:1: ruleInterface
                    {
                     before(grammarAccess.getTypeAccess().getInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterface_in_rule__Type__Alternatives950);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getInterfaceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:482:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:486:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:487:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__0980);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__0983);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:494:1: rule__Component__Group__0__Impl : ( 'Name' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:498:1: ( ( 'Name' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:499:1: ( 'Name' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:499:1: ( 'Name' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:500:1: 'Name'
            {
             before(grammarAccess.getComponentAccess().getNameKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Component__Group__0__Impl1011); 
             after(grammarAccess.getComponentAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:513:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:517:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:518:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11042);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11045);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:525:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:529:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:530:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:530:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:531:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:532:1: ( rule__Component__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:532:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1072);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:542:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:546:1: ( rule__Component__Group__2__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:547:2: rule__Component__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21102);
            rule__Component__Group__2__Impl();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:553:1: rule__Component__Group__2__Impl : ( ( rule__Component__RootAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:557:1: ( ( ( rule__Component__RootAssignment_2 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:558:1: ( ( rule__Component__RootAssignment_2 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:558:1: ( ( rule__Component__RootAssignment_2 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:559:1: ( rule__Component__RootAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getRootAssignment_2()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:560:1: ( rule__Component__RootAssignment_2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:560:2: rule__Component__RootAssignment_2
            {
            pushFollow(FOLLOW_rule__Component__RootAssignment_2_in_rule__Component__Group__2__Impl1129);
            rule__Component__RootAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRootAssignment_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Rootpackage__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:576:1: rule__Rootpackage__Group__0 : rule__Rootpackage__Group__0__Impl rule__Rootpackage__Group__1 ;
    public final void rule__Rootpackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:580:1: ( rule__Rootpackage__Group__0__Impl rule__Rootpackage__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:581:2: rule__Rootpackage__Group__0__Impl rule__Rootpackage__Group__1
            {
            pushFollow(FOLLOW_rule__Rootpackage__Group__0__Impl_in_rule__Rootpackage__Group__01165);
            rule__Rootpackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rootpackage__Group__1_in_rule__Rootpackage__Group__01168);
            rule__Rootpackage__Group__1();

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
    // $ANTLR end "rule__Rootpackage__Group__0"


    // $ANTLR start "rule__Rootpackage__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:588:1: rule__Rootpackage__Group__0__Impl : ( 'RootPackage' ) ;
    public final void rule__Rootpackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:592:1: ( ( 'RootPackage' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:593:1: ( 'RootPackage' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:593:1: ( 'RootPackage' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:594:1: 'RootPackage'
            {
             before(grammarAccess.getRootpackageAccess().getRootPackageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Rootpackage__Group__0__Impl1196); 
             after(grammarAccess.getRootpackageAccess().getRootPackageKeyword_0()); 

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
    // $ANTLR end "rule__Rootpackage__Group__0__Impl"


    // $ANTLR start "rule__Rootpackage__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:607:1: rule__Rootpackage__Group__1 : rule__Rootpackage__Group__1__Impl rule__Rootpackage__Group__2 ;
    public final void rule__Rootpackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:611:1: ( rule__Rootpackage__Group__1__Impl rule__Rootpackage__Group__2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:612:2: rule__Rootpackage__Group__1__Impl rule__Rootpackage__Group__2
            {
            pushFollow(FOLLOW_rule__Rootpackage__Group__1__Impl_in_rule__Rootpackage__Group__11227);
            rule__Rootpackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rootpackage__Group__2_in_rule__Rootpackage__Group__11230);
            rule__Rootpackage__Group__2();

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
    // $ANTLR end "rule__Rootpackage__Group__1"


    // $ANTLR start "rule__Rootpackage__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:619:1: rule__Rootpackage__Group__1__Impl : ( ( rule__Rootpackage__NameAssignment_1 ) ) ;
    public final void rule__Rootpackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:623:1: ( ( ( rule__Rootpackage__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:624:1: ( ( rule__Rootpackage__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:624:1: ( ( rule__Rootpackage__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:625:1: ( rule__Rootpackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootpackageAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:626:1: ( rule__Rootpackage__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:626:2: rule__Rootpackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rootpackage__NameAssignment_1_in_rule__Rootpackage__Group__1__Impl1257);
            rule__Rootpackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootpackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rootpackage__Group__1__Impl"


    // $ANTLR start "rule__Rootpackage__Group__2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:636:1: rule__Rootpackage__Group__2 : rule__Rootpackage__Group__2__Impl rule__Rootpackage__Group__3 ;
    public final void rule__Rootpackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:640:1: ( rule__Rootpackage__Group__2__Impl rule__Rootpackage__Group__3 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:641:2: rule__Rootpackage__Group__2__Impl rule__Rootpackage__Group__3
            {
            pushFollow(FOLLOW_rule__Rootpackage__Group__2__Impl_in_rule__Rootpackage__Group__21287);
            rule__Rootpackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rootpackage__Group__3_in_rule__Rootpackage__Group__21290);
            rule__Rootpackage__Group__3();

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
    // $ANTLR end "rule__Rootpackage__Group__2"


    // $ANTLR start "rule__Rootpackage__Group__2__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:648:1: rule__Rootpackage__Group__2__Impl : ( '{' ) ;
    public final void rule__Rootpackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:652:1: ( ( '{' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:653:1: ( '{' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:653:1: ( '{' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:654:1: '{'
            {
             before(grammarAccess.getRootpackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Rootpackage__Group__2__Impl1318); 
             after(grammarAccess.getRootpackageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Rootpackage__Group__2__Impl"


    // $ANTLR start "rule__Rootpackage__Group__3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:667:1: rule__Rootpackage__Group__3 : rule__Rootpackage__Group__3__Impl rule__Rootpackage__Group__4 ;
    public final void rule__Rootpackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:671:1: ( rule__Rootpackage__Group__3__Impl rule__Rootpackage__Group__4 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:672:2: rule__Rootpackage__Group__3__Impl rule__Rootpackage__Group__4
            {
            pushFollow(FOLLOW_rule__Rootpackage__Group__3__Impl_in_rule__Rootpackage__Group__31349);
            rule__Rootpackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rootpackage__Group__4_in_rule__Rootpackage__Group__31352);
            rule__Rootpackage__Group__4();

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
    // $ANTLR end "rule__Rootpackage__Group__3"


    // $ANTLR start "rule__Rootpackage__Group__3__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:679:1: rule__Rootpackage__Group__3__Impl : ( ( rule__Rootpackage__ElementsAssignment_3 )* ) ;
    public final void rule__Rootpackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:683:1: ( ( ( rule__Rootpackage__ElementsAssignment_3 )* ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:684:1: ( ( rule__Rootpackage__ElementsAssignment_3 )* )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:684:1: ( ( rule__Rootpackage__ElementsAssignment_3 )* )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:685:1: ( rule__Rootpackage__ElementsAssignment_3 )*
            {
             before(grammarAccess.getRootpackageAccess().getElementsAssignment_3()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:686:1: ( rule__Rootpackage__ElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||(LA3_0>=17 && LA3_0<=18)||(LA3_0>=20 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:686:2: rule__Rootpackage__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Rootpackage__ElementsAssignment_3_in_rule__Rootpackage__Group__3__Impl1379);
            	    rule__Rootpackage__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootpackageAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Rootpackage__Group__3__Impl"


    // $ANTLR start "rule__Rootpackage__Group__4"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:696:1: rule__Rootpackage__Group__4 : rule__Rootpackage__Group__4__Impl ;
    public final void rule__Rootpackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:700:1: ( rule__Rootpackage__Group__4__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:701:2: rule__Rootpackage__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Rootpackage__Group__4__Impl_in_rule__Rootpackage__Group__41410);
            rule__Rootpackage__Group__4__Impl();

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
    // $ANTLR end "rule__Rootpackage__Group__4"


    // $ANTLR start "rule__Rootpackage__Group__4__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:707:1: rule__Rootpackage__Group__4__Impl : ( '}' ) ;
    public final void rule__Rootpackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:711:1: ( ( '}' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:712:1: ( '}' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:712:1: ( '}' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:713:1: '}'
            {
             before(grammarAccess.getRootpackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Rootpackage__Group__4__Impl1438); 
             after(grammarAccess.getRootpackageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Rootpackage__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:736:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:740:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:741:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01479);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01482);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:748:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:752:1: ( ( 'package' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:753:1: ( 'package' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:753:1: ( 'package' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:754:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl1510); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:767:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:771:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:772:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11541);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11544);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:779:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:783:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:784:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:784:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:785:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:786:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:786:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1571);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:796:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:800:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:801:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21601);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21604);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:808:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:812:1: ( ( '{' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:813:1: ( '{' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:813:1: ( '{' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:814:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Group__2__Impl1632); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:827:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:831:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:832:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31663);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31666);
            rule__PackageDeclaration__Group__4();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:839:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:843:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:844:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:844:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:845:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:846:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||(LA4_0>=17 && LA4_0<=18)||(LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:846:2: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl1693);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:856:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:860:1: ( rule__PackageDeclaration__Group__4__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:861:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41724);
            rule__PackageDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:867:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:871:1: ( ( '}' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:872:1: ( '}' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:872:1: ( '}' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:873:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__PackageDeclaration__Group__4__Impl1752); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:896:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:900:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:901:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01793);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01796);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:908:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:912:1: ( ( RULE_ID ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:913:1: ( RULE_ID )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:913:1: ( RULE_ID )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:914:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1823); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:925:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:929:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:930:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11852);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:936:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:940:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:941:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:941:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:942:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:943:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:943:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1879);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:957:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:961:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:962:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01914);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01917);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:969:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:973:1: ( ( '.' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:974:1: ( '.' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:974:1: ( '.' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:975:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl1945); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:988:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:992:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:993:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11976);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:999:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1003:1: ( ( RULE_ID ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1004:1: ( RULE_ID )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1004:1: ( RULE_ID )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1005:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2003); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1020:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1024:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1025:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02036);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02039);
            rule__Dependency__Group__1();

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
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1032:1: rule__Dependency__Group__0__Impl : ( 'depndency' ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1036:1: ( ( 'depndency' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1037:1: ( 'depndency' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1037:1: ( 'depndency' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1038:1: 'depndency'
            {
             before(grammarAccess.getDependencyAccess().getDepndencyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Dependency__Group__0__Impl2067); 
             after(grammarAccess.getDependencyAccess().getDepndencyKeyword_0()); 

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
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1051:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1055:1: ( rule__Dependency__Group__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1056:2: rule__Dependency__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12098);
            rule__Dependency__Group__1__Impl();

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
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1062:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__NameAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1066:1: ( ( ( rule__Dependency__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1067:1: ( ( rule__Dependency__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1067:1: ( ( rule__Dependency__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1068:1: ( rule__Dependency__NameAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1069:1: ( rule__Dependency__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1069:2: rule__Dependency__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependency__NameAssignment_1_in_rule__Dependency__Group__1__Impl2125);
            rule__Dependency__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1083:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1087:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1088:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02159);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02162);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1095:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1099:1: ( ( 'import' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1100:1: ( 'import' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1100:1: ( 'import' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1101:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl2190); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1114:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1118:1: ( rule__Import__Group__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1119:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12221);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1125:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1129:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1130:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1130:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1131:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1132:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1132:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2248);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1146:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1150:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1151:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02282);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02285);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1158:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1162:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1163:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1163:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1164:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2312);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1175:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1179:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1180:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12341);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1186:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1190:1: ( ( ( '.*' )? ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1191:1: ( ( '.*' )? )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1191:1: ( ( '.*' )? )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1192:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1193:1: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1194:2: '.*'
                    {
                    match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildcard__Group__1__Impl2370); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__RawType__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1209:1: rule__RawType__Group__0 : rule__RawType__Group__0__Impl rule__RawType__Group__1 ;
    public final void rule__RawType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1213:1: ( rule__RawType__Group__0__Impl rule__RawType__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1214:2: rule__RawType__Group__0__Impl rule__RawType__Group__1
            {
            pushFollow(FOLLOW_rule__RawType__Group__0__Impl_in_rule__RawType__Group__02407);
            rule__RawType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RawType__Group__1_in_rule__RawType__Group__02410);
            rule__RawType__Group__1();

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
    // $ANTLR end "rule__RawType__Group__0"


    // $ANTLR start "rule__RawType__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1221:1: rule__RawType__Group__0__Impl : ( 'RawType' ) ;
    public final void rule__RawType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1225:1: ( ( 'RawType' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1226:1: ( 'RawType' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1226:1: ( 'RawType' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1227:1: 'RawType'
            {
             before(grammarAccess.getRawTypeAccess().getRawTypeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__RawType__Group__0__Impl2438); 
             after(grammarAccess.getRawTypeAccess().getRawTypeKeyword_0()); 

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
    // $ANTLR end "rule__RawType__Group__0__Impl"


    // $ANTLR start "rule__RawType__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1240:1: rule__RawType__Group__1 : rule__RawType__Group__1__Impl ;
    public final void rule__RawType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1244:1: ( rule__RawType__Group__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1245:2: rule__RawType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RawType__Group__1__Impl_in_rule__RawType__Group__12469);
            rule__RawType__Group__1__Impl();

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
    // $ANTLR end "rule__RawType__Group__1"


    // $ANTLR start "rule__RawType__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1251:1: rule__RawType__Group__1__Impl : ( ( rule__RawType__NameAssignment_1 ) ) ;
    public final void rule__RawType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1255:1: ( ( ( rule__RawType__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1256:1: ( ( rule__RawType__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1256:1: ( ( rule__RawType__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1257:1: ( rule__RawType__NameAssignment_1 )
            {
             before(grammarAccess.getRawTypeAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1258:1: ( rule__RawType__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1258:2: rule__RawType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RawType__NameAssignment_1_in_rule__RawType__Group__1__Impl2496);
            rule__RawType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRawTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RawType__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1272:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1276:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1277:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02530);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02533);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1284:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1288:1: ( ( 'interface' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1289:1: ( 'interface' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1289:1: ( 'interface' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1290:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Interface__Group__0__Impl2561); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1303:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1307:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1308:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12592);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12595);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1315:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1319:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1320:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1320:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1321:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1322:1: ( rule__Interface__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1322:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl2622);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1332:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1336:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1337:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__22652);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__22655);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1344:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1348:1: ( ( '{' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1349:1: ( '{' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1349:1: ( '{' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1350:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Interface__Group__2__Impl2683); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1363:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1367:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1368:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__32714);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__32717);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1375:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__PropertiesAssignment_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1379:1: ( ( ( rule__Interface__PropertiesAssignment_3 )* ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1380:1: ( ( rule__Interface__PropertiesAssignment_3 )* )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1380:1: ( ( rule__Interface__PropertiesAssignment_3 )* )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1381:1: ( rule__Interface__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getPropertiesAssignment_3()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1382:1: ( rule__Interface__PropertiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1382:2: rule__Interface__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Interface__PropertiesAssignment_3_in_rule__Interface__Group__3__Impl2744);
            	    rule__Interface__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1392:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1396:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1397:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__42775);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__42778);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1404:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__MethodsAssignment_4 )* ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1408:1: ( ( ( rule__Interface__MethodsAssignment_4 )* ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1409:1: ( ( rule__Interface__MethodsAssignment_4 )* )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1409:1: ( ( rule__Interface__MethodsAssignment_4 )* )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1410:1: ( rule__Interface__MethodsAssignment_4 )*
            {
             before(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1411:1: ( rule__Interface__MethodsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1411:2: rule__Interface__MethodsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MethodsAssignment_4_in_rule__Interface__Group__4__Impl2805);
            	    rule__Interface__MethodsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1421:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1425:1: ( rule__Interface__Group__5__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1426:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__52836);
            rule__Interface__Group__5__Impl();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1432:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1436:1: ( ( '}' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1437:1: ( '}' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1437:1: ( '}' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1438:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Interface__Group__5__Impl2864); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1463:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1467:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1468:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02907);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02910);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1475:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1479:1: ( ( 'method' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1480:1: ( 'method' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1480:1: ( 'method' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1481:1: 'method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Method__Group__0__Impl2938); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1494:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1498:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1499:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12969);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12972);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1506:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1510:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1511:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1511:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1512:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1513:1: ( rule__Method__NameAssignment_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1513:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl2999);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1523:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1527:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1528:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23029);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23032);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1535:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1539:1: ( ( '(' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1540:1: ( '(' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1540:1: ( '(' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1541:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Method__Group__2__Impl3060); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1554:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1558:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1559:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33091);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33094);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1566:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1570:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1571:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1571:1: ( ( rule__Method__Group_3__0 )? )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1572:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1573:1: ( rule__Method__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1573:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl3121);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1583:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1587:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1588:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43152);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43155);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1595:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1599:1: ( ( ')' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1600:1: ( ')' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1600:1: ( ')' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1601:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Method__Group__4__Impl3183); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1614:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1618:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1619:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53214);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__6_in_rule__Method__Group__53217);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1626:1: rule__Method__Group__5__Impl : ( ':' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1630:1: ( ( ':' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1631:1: ( ':' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1631:1: ( ':' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1632:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Method__Group__5__Impl3245); 
             after(grammarAccess.getMethodAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1645:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1649:1: ( rule__Method__Group__6__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1650:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__63276);
            rule__Method__Group__6__Impl();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1656:1: rule__Method__Group__6__Impl : ( ( rule__Method__TypeAssignment_6 ) ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1660:1: ( ( ( rule__Method__TypeAssignment_6 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1661:1: ( ( rule__Method__TypeAssignment_6 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1661:1: ( ( rule__Method__TypeAssignment_6 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1662:1: ( rule__Method__TypeAssignment_6 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_6()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1663:1: ( rule__Method__TypeAssignment_6 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1663:2: rule__Method__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_6_in_rule__Method__Group__6__Impl3303);
            rule__Method__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1687:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1691:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1692:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__03347);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__03350);
            rule__Method__Group_3__1();

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
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1699:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ParametersAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1703:1: ( ( ( rule__Method__ParametersAssignment_3_0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1704:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1704:1: ( ( rule__Method__ParametersAssignment_3_0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1705:1: ( rule__Method__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1706:1: ( rule__Method__ParametersAssignment_3_0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1706:2: rule__Method__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_0_in_rule__Method__Group_3__0__Impl3377);
            rule__Method__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_0()); 

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
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1716:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1720:1: ( rule__Method__Group_3__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1721:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__13407);
            rule__Method__Group_3__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1727:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1731:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1732:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1732:1: ( ( rule__Method__Group_3_1__0 )* )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1733:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1734:1: ( rule__Method__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1734:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl3434);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1748:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1752:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1753:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__03469);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__03472);
            rule__Method__Group_3_1__1();

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
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1760:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1764:1: ( ( ',' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1765:1: ( ',' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1765:1: ( ',' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1766:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Method__Group_3_1__0__Impl3500); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1779:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1783:1: ( rule__Method__Group_3_1__1__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1784:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__13531);
            rule__Method__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1790:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1794:1: ( ( ( rule__Method__ParametersAssignment_3_1_1 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1795:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1795:1: ( ( rule__Method__ParametersAssignment_3_1_1 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1796:1: ( rule__Method__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1797:1: ( rule__Method__ParametersAssignment_3_1_1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1797:2: rule__Method__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl3558);
            rule__Method__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1811:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1815:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1816:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03592);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03595);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1823:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1827:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1828:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1828:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1829:1: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1830:1: ( rule__Property__NameAssignment_0 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1830:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__0__Impl3622);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1840:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1844:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1845:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13652);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13655);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1852:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1856:1: ( ( ':' ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1857:1: ( ':' )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1857:1: ( ':' )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1858:1: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Property__Group__1__Impl3683); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1871:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1875:1: ( rule__Property__Group__2__Impl )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1876:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23714);
            rule__Property__Group__2__Impl();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1882:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1886:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1887:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1887:1: ( ( rule__Property__TypeAssignment_2 ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1888:1: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1889:1: ( rule__Property__TypeAssignment_2 )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1889:2: rule__Property__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_2_in_rule__Property__Group__2__Impl3741);
            rule__Property__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1906:1: rule__Component__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1910:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1911:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1911:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1912:1: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Component__NameAssignment_13782);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__RootAssignment_2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1921:1: rule__Component__RootAssignment_2 : ( ruleRootpackage ) ;
    public final void rule__Component__RootAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1925:1: ( ( ruleRootpackage ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1926:1: ( ruleRootpackage )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1926:1: ( ruleRootpackage )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1927:1: ruleRootpackage
            {
             before(grammarAccess.getComponentAccess().getRootRootpackageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRootpackage_in_rule__Component__RootAssignment_23813);
            ruleRootpackage();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRootRootpackageParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Component__RootAssignment_2"


    // $ANTLR start "rule__Rootpackage__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1936:1: rule__Rootpackage__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Rootpackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1940:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1941:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1941:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1942:1: ruleQualifiedName
            {
             before(grammarAccess.getRootpackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Rootpackage__NameAssignment_13844);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRootpackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rootpackage__NameAssignment_1"


    // $ANTLR start "rule__Rootpackage__ElementsAssignment_3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1951:1: rule__Rootpackage__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Rootpackage__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1955:1: ( ( ruleAbstractElement ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1956:1: ( ruleAbstractElement )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1956:1: ( ruleAbstractElement )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1957:1: ruleAbstractElement
            {
             before(grammarAccess.getRootpackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Rootpackage__ElementsAssignment_33875);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getRootpackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rootpackage__ElementsAssignment_3"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1966:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1970:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1971:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1971:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1972:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_13906);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1981:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1985:1: ( ( ruleAbstractElement ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1986:1: ( ruleAbstractElement )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1986:1: ( ruleAbstractElement )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1987:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_33937);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__Dependency__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:1996:1: rule__Dependency__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Dependency__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2000:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2001:1: ( ruleQualifiedName )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2001:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2002:1: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Dependency__NameAssignment_13968);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dependency__NameAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2011:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2015:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2016:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2016:1: ( ruleQualifiedNameWithWildcard )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2017:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_13999);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__RawType__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2026:1: rule__RawType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RawType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2030:1: ( ( RULE_ID ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2031:1: ( RULE_ID )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2031:1: ( RULE_ID )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2032:1: RULE_ID
            {
             before(grammarAccess.getRawTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RawType__NameAssignment_14030); 
             after(grammarAccess.getRawTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RawType__NameAssignment_1"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2041:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2045:1: ( ( RULE_ID ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2046:1: ( RULE_ID )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2046:1: ( RULE_ID )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2047:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_14061); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__PropertiesAssignment_3"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2056:1: rule__Interface__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Interface__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2060:1: ( ( ruleProperty ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2061:1: ( ruleProperty )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2061:1: ( ruleProperty )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2062:1: ruleProperty
            {
             before(grammarAccess.getInterfaceAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Interface__PropertiesAssignment_34092);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getPropertiesPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Interface__PropertiesAssignment_3"


    // $ANTLR start "rule__Interface__MethodsAssignment_4"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2071:1: rule__Interface__MethodsAssignment_4 : ( ruleMethod ) ;
    public final void rule__Interface__MethodsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2075:1: ( ( ruleMethod ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2076:1: ( ruleMethod )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2076:1: ( ruleMethod )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2077:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_44123);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Interface__MethodsAssignment_4"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2086:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2090:1: ( ( RULE_ID ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2091:1: ( RULE_ID )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2091:1: ( RULE_ID )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2092:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_14154); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParametersAssignment_3_0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2101:1: rule__Method__ParametersAssignment_3_0 : ( ruleProperty ) ;
    public final void rule__Method__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2105:1: ( ( ruleProperty ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2106:1: ( ruleProperty )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2106:1: ( ruleProperty )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2107:1: ruleProperty
            {
             before(grammarAccess.getMethodAccess().getParametersPropertyParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Method__ParametersAssignment_3_04185);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersPropertyParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Method__ParametersAssignment_3_0"


    // $ANTLR start "rule__Method__ParametersAssignment_3_1_1"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2116:1: rule__Method__ParametersAssignment_3_1_1 : ( ruleProperty ) ;
    public final void rule__Method__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2120:1: ( ( ruleProperty ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2121:1: ( ruleProperty )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2121:1: ( ruleProperty )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2122:1: ruleProperty
            {
             before(grammarAccess.getMethodAccess().getParametersPropertyParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Method__ParametersAssignment_3_1_14216);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersPropertyParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Method__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Method__TypeAssignment_6"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2131:1: rule__Method__TypeAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2135:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2136:1: ( ( ruleQualifiedName ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2136:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2137:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypeTypeCrossReference_6_0()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2138:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2139:1: ruleQualifiedName
            {
             before(grammarAccess.getMethodAccess().getTypeTypeQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Method__TypeAssignment_64251);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeTypeQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypeTypeCrossReference_6_0()); 

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
    // $ANTLR end "rule__Method__TypeAssignment_6"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2150:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2154:1: ( ( RULE_ID ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2155:1: ( RULE_ID )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2155:1: ( RULE_ID )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2156:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_04286); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2165:1: rule__Property__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2169:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2170:1: ( ( ruleQualifiedName ) )
            {
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2170:1: ( ( ruleQualifiedName ) )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2171:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2172:1: ( ruleQualifiedName )
            // ../de.htwg.seapal.components.ui/src-gen/de/htwg/seapal/components/ui/contentassist/antlr/internal/InternalComponent.g:2173:1: ruleQualifiedName
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Property__TypeAssignment_24321);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootpackage_in_entryRuleRootpackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootpackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__0_in_ruleRootpackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRawType_in_entryRuleRawType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRawType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RawType__Group__0_in_ruleRawType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__AbstractElement__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRawType_in_rule__Type__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Type__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__0980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__0983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Component__Group__0__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11042 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__RootAssignment_2_in_rule__Component__Group__2__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__0__Impl_in_rule__Rootpackage__Group__01165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__1_in_rule__Rootpackage__Group__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rootpackage__Group__0__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__1__Impl_in_rule__Rootpackage__Group__11227 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__2_in_rule__Rootpackage__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__NameAssignment_1_in_rule__Rootpackage__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__2__Impl_in_rule__Rootpackage__Group__21287 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__3_in_rule__Rootpackage__Group__21290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rootpackage__Group__2__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__3__Impl_in_rule__Rootpackage__Group__31349 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__4_in_rule__Rootpackage__Group__31352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rootpackage__ElementsAssignment_3_in_rule__Rootpackage__Group__3__Impl1379 = new BitSet(new long[]{0x0000000000368002L});
    public static final BitSet FOLLOW_rule__Rootpackage__Group__4__Impl_in_rule__Rootpackage__Group__41410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rootpackage__Group__4__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageDeclaration__Group__0__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11541 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21601 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Group__2__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31663 = new BitSet(new long[]{0x000000000036C000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl1693 = new BitSet(new long[]{0x0000000000368002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PackageDeclaration__Group__4__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01793 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1879 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Dependency__Group__0__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__NameAssignment_1_in_rule__Dependency__Group__1__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02282 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildcard__Group__1__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RawType__Group__0__Impl_in_rule__RawType__Group__02407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RawType__Group__1_in_rule__RawType__Group__02410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RawType__Group__0__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RawType__Group__1__Impl_in_rule__RawType__Group__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RawType__NameAssignment_1_in_rule__RawType__Group__1__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface__Group__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12592 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__22652 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__22655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Interface__Group__2__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__32714 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__32717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__PropertiesAssignment_3_in_rule__Interface__Group__3__Impl2744 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__42775 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__42778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodsAssignment_4_in_rule__Interface__Group__4__Impl2805 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__52836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interface__Group__5__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__Group__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12969 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__23029 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__23032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Method__Group__2__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__33091 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__33094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__43152 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__43155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__Group__4__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__53214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__53217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group__5__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__63276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_6_in_rule__Method__Group__6__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__03347 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_0_in_rule__Method__Group_3__0__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__13407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0_in_rule__Method__Group_3__1__Impl3434 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__0__Impl_in_rule__Method__Group_3_1__03469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1_in_rule__Method__Group_3_1__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Method__Group_3_1__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3_1__1__Impl_in_rule__Method__Group_3_1__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_1_1_in_rule__Method__Group_3_1__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03592 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__0__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Property__Group__1__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_2_in_rule__Property__Group__2__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Component__NameAssignment_13782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootpackage_in_rule__Component__RootAssignment_23813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Rootpackage__NameAssignment_13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Rootpackage__ElementsAssignment_33875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_13906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_33937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Dependency__NameAssignment_13968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RawType__NameAssignment_14030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_14061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Interface__PropertiesAssignment_34092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_44123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_14154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Method__ParametersAssignment_3_04185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Method__ParametersAssignment_3_1_14216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Method__TypeAssignment_64251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_04286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Property__TypeAssignment_24321 = new BitSet(new long[]{0x0000000000000002L});

}