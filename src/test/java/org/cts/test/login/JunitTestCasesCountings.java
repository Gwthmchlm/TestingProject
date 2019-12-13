package org.cts.test.login;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTestCasesCountings {
public static void main(String[] args) {
	Result r = JUnitCore.runClasses(JunitAssert.class, JunitFirst.class);
	// to get total run count
	int runCount = r.getRunCount();
	System.out.println(runCount);
	
	// to get failed testcases count
	int failureCount = r.getFailureCount();
	System.out.println(failureCount);
	
	// to get passed test cases
	System.out.println(runCount-failureCount);
	
	// to get ignore count
	int ignoreCount = r.getIgnoreCount();
	System.out.println(ignoreCount);
	
	// to check whether the suite is success or not
	boolean wasSuccessful = r.wasSuccessful();
	System.out.println(wasSuccessful);
	
	// to print the failure method
	List<Failure> failures = r.getFailures();
	for (Failure f : failures) {
		System.out.println(f);
		
	}
}
}
