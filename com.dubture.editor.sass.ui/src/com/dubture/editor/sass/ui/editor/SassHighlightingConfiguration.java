package com.dubture.editor.sass.ui.editor;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SassHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String WORD_ID = "word";
	public static final String VARIABLE_ID = "variable";
	public static final String SELECTOR_ID = "selector";
	public static final String BRACE_LEFT = "brace_left";
	public static final String BRACE_RIGHT = "brace_right";
	public static final String SHARP_ID = "sharp"; 
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		
		acceptor.acceptDefaultHighlighting(WORD_ID, "Word", wordTextStyle());
		acceptor.acceptDefaultHighlighting(VARIABLE_ID, "Variable", variableTextStyle());
		acceptor.acceptDefaultHighlighting(SELECTOR_ID, "Selector", selectorTextStyle());
		acceptor.acceptDefaultHighlighting(BRACE_LEFT, "Braces", braceTextStyle());
		acceptor.acceptDefaultHighlighting(BRACE_RIGHT, "Braces", braceTextStyle());
		acceptor.acceptDefaultHighlighting(SHARP_ID, "Sharp", sharpTextStyle());
		
	}
	
	public TextStyle wordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}
	
	public TextStyle variableTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 10, 50));
		return textStyle;
	}	
	public TextStyle selectorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}	
	public TextStyle braceTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(10, 10, 10));
		return textStyle;
	}	
	public TextStyle sharpTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 200));
		return textStyle;
	}	
}
