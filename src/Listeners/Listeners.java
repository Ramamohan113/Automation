package Listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("test is passed");
		super.onTestSuccess(tr);
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("test  is faile ");
		super.onTestFailure(tr);
	}


	

}
