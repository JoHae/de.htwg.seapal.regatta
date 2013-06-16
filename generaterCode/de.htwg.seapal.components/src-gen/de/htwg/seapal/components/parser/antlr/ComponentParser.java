/*
* generated by Xtext
*/
package de.htwg.seapal.components.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.htwg.seapal.components.services.ComponentGrammarAccess;

public class ComponentParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ComponentGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.htwg.seapal.components.parser.antlr.internal.InternalComponentParser createParser(XtextTokenStream stream) {
		return new de.htwg.seapal.components.parser.antlr.internal.InternalComponentParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Component";
	}
	
	public ComponentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ComponentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
