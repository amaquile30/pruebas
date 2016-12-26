package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShotSelenium {
 
   
   /**
    * Toma una impresion de pantalla y la guarda en un directorio donde quedan
    * todas las evidencias de prueba
    *
    * @param driver
    * @throws IOException
    */
   public static void takeScreenShotTest(WebDriver driver, String imageName) {
      //Directorio donde quedaran las imagenes guardadas
      File directory = new File("Z:\\Macintosh HD\\MVWin10\\workspace\\TestNgPrimeFaces\\target\\screenshot");
 
      try {
         if (directory.isDirectory()) {
            //Toma la captura de imagen
            File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //Mueve el archivo a la carga especificada con el respectivo nombre
            FileUtils.copyFile(imagen, new File(directory.getAbsolutePath()   + "\\" + imageName + ".png"));
         } else {
            //Se lanza la excepcion cuando no encuentre el directorio
            throw new IOException("ERROR : La ruta especificada no es un directorio!");
         }
      } catch (IOException e) {
         //Impresion de Excepciones
         e.printStackTrace();
      }
   }
   
   public static void captureScreenshot(WebDriver driver, String screenshotName){
	   try{
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File source =ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		   System.out.println("Captura realizada");
	   }catch (Exception e){
		   System.out.println("Excepción generada en la toma de captura "+ e.getMessage());
	   }
   }
 
}