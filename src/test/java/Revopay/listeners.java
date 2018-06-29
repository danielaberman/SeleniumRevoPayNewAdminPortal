package Revopay;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Resources.base;

public class listeners implements ITestListener {
	
	base b=new base();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//b.getScreenShot(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		//b.getScreenShot(result.getName());
		//b.getScreenshot();
//		try {
//			b.getScreenshot(b.driver);
//			System.out.println("OnTestSuccess");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public void onTestFailure(ITestResult result) {
		try {
			b.getScreenshot(b.driver);
			System.out.println("OnTestFailure");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
