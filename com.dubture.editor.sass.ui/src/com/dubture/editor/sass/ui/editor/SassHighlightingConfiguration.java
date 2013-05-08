package com.dubture.editor.sass.ui.editor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SassHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String WORD_ID			= "word";
	public static final String VARIABLE_ID		= "variable";
	public static final String SELECTOR_ID		= "selector";
	public static final String BRACE_LEFT		= "brace_left";
	public static final String BRACE_RIGHT		= "brace_right";
	public static final String HASH_ID			= "hash";
	public static final String MIXIN_ID			= "mixin";
	public static final String INCLUDE_ID		= "include";
	public static final String HEX_COLOR_ID 	= "hex_color"; 
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		
		acceptor.acceptDefaultHighlighting(WORD_ID, "Word", wordTextStyle());
		acceptor.acceptDefaultHighlighting(VARIABLE_ID, "Variable", variableTextStyle());
		acceptor.acceptDefaultHighlighting(SELECTOR_ID, "Selector", selectorTextStyle());
		acceptor.acceptDefaultHighlighting(BRACE_LEFT, "Braces", braceTextStyle());
		acceptor.acceptDefaultHighlighting(BRACE_RIGHT, "Braces", braceTextStyle());
		acceptor.acceptDefaultHighlighting(HASH_ID, "Hash", sharpTextStyle());
		acceptor.acceptDefaultHighlighting(HEX_COLOR_ID, "Hex Color", hexColorTextStyle());
		acceptor.acceptDefaultHighlighting(MIXIN_ID, "Mixin", mixinTextStyle());
		acceptor.acceptDefaultHighlighting(INCLUDE_ID, "Include", includeTextStyle());
		
	}
	
	public TextStyle wordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 127));
		return textStyle;
	}
	
	public TextStyle variableTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(127, 0, 127));
		return textStyle;
	}
	
	public TextStyle selectorTextStyle() {
		
		//63, 127, 127
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 127, 127));
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
	
	public TextStyle mixinTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(63, 127, 127));
		return textStyle;
	}
	
	public TextStyle includeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(127, 0, 127));
		return textStyle;
	}	
	
	public TextStyle hexColorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 127));
		return textStyle;
	}	
}
