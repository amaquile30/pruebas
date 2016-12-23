package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PaginaPrincipalPrimeFacesPage;
import util.DriverSetup;
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
			TakeScreenShotSelenium.takeScreenShotTest(driver, "menu");
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
				TakeScreenShotSelenium.takeScreenShotTest(driver, "clicMenuInput");
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
				TakeScreenShotSelenium.takeScreenShotTest(driver, "clicMenuInputEditor");
				Assert.fail(msj);
				
			}
    	}catch(Exception e){
    		e.printStackTrace();
    		Assert.fail("Ocurrio un problema inexperado " +e);
    	}
	}
}
