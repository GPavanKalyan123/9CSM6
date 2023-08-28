package GenericLibraries;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ListenerImplementation implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Test script execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Fail");
		System.out.println("Failure occured due to :"+result.getThrowable());
		
		TakesScreenshot ts =(TakesScreenshot)(BaseClass.driver);
		JavaUtility jutil = new JavaUtility();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+result.getMethod().getMethodName()+""+jutil.getCurrentTime()+".png");
		FileUtils.copyFile(src, dest);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Skipped");
		System.out.println("Skipped due to"+ result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}


	