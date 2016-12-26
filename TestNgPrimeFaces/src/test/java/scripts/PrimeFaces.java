package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.PaginaPrincipalPrimeFacesPage;
import util.DriverSetup;
import util.TakeScreenShot;

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
	  if (!result.isSuccess()) {
	   TakeScreenShot.captureScreenshot(DriverSetup.getDriver(), result.getName());
	   Reporter.setCurrentTestResult(result);   
	   String url = System.getenv("jenkins.buildURL");
	   StringBuilder prueba = new StringBuilder();
	   prueba = prueba.insert(prueba.length(),"a");
	   prueba.insert(prueba.length(), "n");
	   System.out.println(prueba);
	   url = url + "artifact/target/Screenshots/";
	   Reporter.log(result.getName());
	   Reporter.log("<a href ='" + url + result.getName() + ".png'> ");
	   Reporter.log("<br> <img src='" + url + result.getName() + ".png' height='200' width='200'/> <br>");
	  }  
	 }
		
	
	
}
