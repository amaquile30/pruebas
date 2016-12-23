package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class DriverSetup {
	private static WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@Parameters({"browserType", "appURL"})
	private static void setupDriver(String browserType, String appURL) {
		if(browserType.equals("firefox")){
			driver = initFirefoxDriver(appURL);
		}else if(browserType.equals("chrome")){
			driver = initChromeDriver(appURL);
		}else {
			throw new RuntimeException("Browser type unsupported");
		}
		
	}
	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
//		System.setProperty("webdriver.chrome.driver", driverPath
//				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setupDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
