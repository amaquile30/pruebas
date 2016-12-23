package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Function {
	private static long timeout = 60;
	
	public static void scrollTo(WebDriver driver, WebElement element) {
	       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	   }
	
	public static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver wd) {
                //this will tel if page is loaded
                return "complete".equals(((JavascriptExecutor) wd).executeScript("return document.readyState"));
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        //wait for page complete
        wait.until(pageLoadCondition);
        //lower implicitly wait time
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

}
