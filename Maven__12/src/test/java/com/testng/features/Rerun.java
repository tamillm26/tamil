package com.testng.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{

	int open = 0;
	int close = 5;
	

	public boolean retry(ITestResult result) {

		if (open<close) {
			open++;
			return true;
		}
		return false;
	}
	
}
