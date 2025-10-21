package week8.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	//true-retried
	//false-terminated

	int count=0;
	public boolean retry(ITestResult result) {
		if(count<3) {      //
			count++;       // 3
			return true;   //3
		}
		return false;
	}

}
