package com.dubture.editor.sass.serializer;

import com.dubture.editor.sass.services.SassGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SassSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SassGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Sass_CharsetParserRuleCall_1_q;
	protected AbstractElementAlias match_Sass_VariableDeclarationParserRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SassGrammarAccess) access;
		match_Sass_CharsetParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getSassAccess().getCharsetParserRuleCall_1());
		match_Sass_VariableDeclarationParserRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCharsetRule())
			return getCharsetToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVariableDeclarationRule())
			return getVariableDeclarationToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Charset:
	 * 	CHARSET_ID STRING SEMI_COLON
	 * ;
	 */
	protected String getCharsetToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@charset \"\";";
	}
	
	/**
	 * VariableDeclaration:
	 * 	VARIABLE COLON WORD SEMI_COLON
	 * ;
	 */
	protected String getVariableDeclarationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$:;";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Sass_CharsetParserRuleCall_1_q.equals(syntax))
				emit_Sass_CharsetParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Sass_VariableDeclarationParserRuleCall_2_a.equals(syntax))
				emit_Sass_VariableDeclarationParserRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     Charset?
	 */
	protected void emit_Sass_CharsetParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VariableDeclaration*
	 */
	protected void emit_Sass_VariableDeclarationParserRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
