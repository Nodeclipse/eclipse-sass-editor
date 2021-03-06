/**
 * generated by Xtext
 */
package com.dubture.editor.sass.ui.contentassist;

import com.dubture.editor.sass.ui.contentassist.AbstractSassProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class SassProposalProvider extends AbstractSassProposalProvider {
  public void complete_VARIABLE(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_VARIABLE(model, ruleCall, context, acceptor);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("$foo", context);
    acceptor.accept(_createCompletionProposal);
  }
}
