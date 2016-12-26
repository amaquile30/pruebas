package scripts;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.MethodDeclaration;

import pages.PaginaPrincipalPrimeFacesPage;
import util.DriverSetup;
import util.TakeScreenShot;
import util.TakeScreenShotSelenium;

public class PrimeFaces extends DriverSetup{
	private WebDriver driver;
	private PaginaPrincipalPrimeFacesPage primeFacesPage;
	
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
    public void validarMenu() {
		primeFacesPage=new PaginaPrincipalPrimeFacesPage(driver);
		String msj = "";
    	try{
    		msj=primeFacesPage.validarElementosMenu();
    		if (msj.equals("Ok")){
				Assert.assertTrue(true);
			}else{
				Assert.fail(msj);
			}
    	}catch(Exception e){
//    		TakeScreenShotSelenium.captureScreenshot(driver, "Menu");
//			TakeScreenShotSelenium.takeScreenShotTest(driver, "menu");
    		Assert.fail("Ocurrio un problema inexperado " +e);
    	}
    }
	@Test (priority=1)
	public void clicMenuInput(){
		primeFacesPage=new PaginaPrincipalPrimeFacesPage(driver);
		String msj = "";
    	try{
    		msj=primeFacesPage.menuInput();
    		if (msj.equals("Ok")){
				Assert.assertTrue(true);
			}else{
//				TakeScreenShotSelenium.captureScreenshot(driver, "clicMenuInput");
//				TakeScreenShotSelenium.takeScreenShotTest(driver, "clicMenuInput");
				Assert.fail(msj);
			}
    	}catch(Exception e){
    		e.printStackTrace();
    		Assert.fail("Ocurrio un problema inexperado " +e);
    	}
	}
	@Test (priority=2)
	public void clicMenuInputEditor(){
		primeFacesPage=new PaginaPrincipalPrimeFacesPage(driver);
		String msj = "";
    	try{
    		msj=primeFacesPage.menuInputEditor();
    		if (msj.equals("Ok")){
				Assert.assertTrue(true);
			}else{
//				TakeScreenShotSelenium.captureScreenshot(driver, "clicMenuInputEditor");
//				TakeScreenShotSelenium.takeScreenShotTest(driver, "clicMenuInputEditor");
				Assert.fail(msj);
				
			}
    	}catch(Exception e){
    		e.printStackTrace();
    		Assert.fail("Ocurrio un problema inexperado " +e);
    	}
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		TakeScreenShot.captureScreenshot(DriverSetup.getDriver(), result.getName());		
		Reporter.setCurrentTestResult(result); 
	
		String url = "../../../../artifact/target/Screenshots/";
		System.out.println(url);
		Reporter.log("<a href ='"+url + result.getName() + ".png'> ");
	    Reporter.log("<br> <img src='"+url + result.getName() + ".png' height='200' width='200'/> <br>");
		// close application
		DriverSetup.getDriver().quit();
	}
	
}
