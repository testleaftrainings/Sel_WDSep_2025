package week8.day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryTransformer implements IAnnotationTransformer{
	
	 public void transform(
		      ITestAnnotation annotation,
		      Class testClass,
		      Constructor testConstructor,
		      Method testMethod,
		      Class<?> occurringClazz) {
		 annotation.setRetryAnalyzer(week8.day1.RetryAnalyser.class);
		  }

}
