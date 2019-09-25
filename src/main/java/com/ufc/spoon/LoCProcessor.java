package com.ufc.spoon;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;

public class LoCProcessor extends AbstractProcessor<CtClass<?>> {

	public void process(CtClass<?> element) {
		int startLine = element.getPosition().getLine();
		int endLine = element.getPosition().getEndLine();
		int loc = endLine - startLine;
		
		System.out.println(element.getQualifiedName()+"- Metrica LoC: "+loc);
		
	}
	

}
