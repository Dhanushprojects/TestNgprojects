package org.TestngPrograms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		
		IRetryAnalyzer r = annotation.getRetryAnalyzer();
		
		if(r==null) {
			annotation.setRetryAnalyzer(Failed.class);
		}
		
		
		
		
		//annotation.setRetryAnalyzer(Failed.class);
		
		
	
	}

}
