package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TakeScreenShot {
//	static WebDriver driver=null;
	
//	static String filePath = "./target/Screenshots/";
	
	
	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{
	 
	try 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(source, new File("./target/Screenshots/"+screenshotName+".png"));
		 
		System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
		System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	}
	
//    public void onTestFailure(ITestResult result) {
//    	System.out.println("***** Error "+result.getName()+" test has failed *****");
//    	String methodName=result.getName().toString().trim();
//    	takeScreenShot(methodName);
//    }
//    public static void takeScreenShot(String methodName) {
//    	//get the driver
//    	driver=DriverSetup.getDriver();
//    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         //The below method will save the screen shot in d drive with test method name 
//            try {
//				FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
//				System.out.println("***Placed screen shot in "+filePath+" ***");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//    }
//
//	public void onFinish(ITestContext context) {}
//	  
//    public void onTestStart(ITestResult result) {   }
//  
//    public void onTestSuccess(ITestResult result) {   }
//
//    public void onTestSkipped(ITestResult result) {   }
//
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }
//
//    public void onStart(ITestContext context) {   }
}
