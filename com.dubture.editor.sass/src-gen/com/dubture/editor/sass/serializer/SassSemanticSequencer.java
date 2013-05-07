package com.dubture.editor.sass.serializer;

import com.dubture.editor.sass.sass.Sass;
import com.dubture.editor.sass.sass.SassPackage;
import com.dubture.editor.sass.services.SassGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SassSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SassGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SassPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SassPackage.SASS:
				if(context == grammarAccess.getSassRule()) {
					sequence_Sass(context, (Sass) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (statements+=Rule*)
	 */
	protected void sequence_Sass(EObject context, Sass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
