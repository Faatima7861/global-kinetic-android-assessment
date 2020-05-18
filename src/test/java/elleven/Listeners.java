package elleven;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {

	public void onFinish(ITestContext context) {
		System.out.println("Passed Tests" + context.getPassedTests().toString());
		System.out.println("Failed Tests" + context.getFailedTests().toString());
		System.out.println("Skipped Tests" + context.getSkippedTests().toString());

		if (context.getFailedTests().toString().contains("FAILURE")
				|| context.getSkippedTests().toString().contains("SKIP")) {
			System.out.println("Test run - Failed");
			System.out.println("exit code : 1");

		} else {
			System.out.println("Test run - Successful");
			System.out.println("exit code : 0");

		}

	}

	public void onStart(ITestContext result) {
		System.out.println("New Test Suite Started " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed but within success percentage " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed " + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped " + result.getName());

	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successfully Finished" + result.getName());

	}

}
