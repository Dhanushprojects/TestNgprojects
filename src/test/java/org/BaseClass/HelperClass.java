package org.BaseClass;
import org.openqa.selenium.WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class HelperClass {
	public static WebDriver driver;
	public static  Alert alert;
	public static Actions ac;
	public static  Robot r;
	
	
	
	
	
	public 	static void ChromeBrowser() {
	 driver = new ChromeDriver();
}
	public 	static void MicrosoftBrowser() {
		
		driver = new EdgeDriver();
	}
    public 	static void FirefoxBrowser() {
		
		driver = new FirefoxDriver();
	}	
    public 	static void  GetUrl(String url) {
    	driver.get(url);
    	
    }
    public 	static void Maximize() {
    	driver.manage().window().maximize();
    }
    public 	static void CloseBrowser() {
    	
    	driver.close();
    }
    
     public static void Accept() {
    	 Alert alert = driver.switchTo().alert();
    	 alert.accept();
    }
     
     public static void dismiss() {
    	 alert.dismiss();
    	 
    }
     public static void TakeScreenShot() throws IOException {
    	 
    	File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	Files.copy(scr,new File("C:\\Users\\DELL\\eclipse-workspace\\TestNG Projects\\ScreenShots\\Test.png"));
     }
     
     /*public static void  TestpassScript(WebElement e,String s) {
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	 js.executeScript("arguments[0].setaAttribute=s", e);
    	 js.executeScript(key, args)*/
    
     public static void Click() {
    	 Actions ac = new Actions(driver);
    	 ac.click();
    	 
     }
     
     public static void DoubleClick() {
    	 
    	 ac.doubleClick();
     }
     public static void MovetoElement(WebElement e) {
    	 ac.moveToElement(e);
    	 
     }
     public static void EnterKey() {
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 r.keyRelease(KeyEvent.VK_ENTER);
     }
     
     public static void ControlKey() {
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	 r.keyRelease(KeyEvent.VK_CONTROL);
     }
     
     public static void DownKey() throws AWTException {
    	 Robot r = new Robot();
    	 r.keyPress(KeyEvent.VK_DOWN);
    	 r.keyRelease(KeyEvent.VK_DOWN);
    	 
    	 }
     public static void UpKey() {
    	 r.keyPress(KeyEvent.VK_UP);
    	 r.keyRelease(KeyEvent.VK_UP);
     }
     public static void CopyText() {
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	  r.keyPress(KeyEvent.VK_C);
    	 r.keyRelease(KeyEvent.VK_C);
    	 r.keyRelease(KeyEvent.VK_CONTROL);
     }
     
     public static void CutText() {
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	  r.keyPress(KeyEvent.VK_X);
    	 r.keyRelease(KeyEvent.VK_X);
    	 r.keyRelease(KeyEvent.VK_CONTROL);
     }
     
     public static void PastText() {
    	 r.keyPress(KeyEvent.VK_CONTROL);
    	  r.keyPress(KeyEvent.VK_V);
    	 r.keyRelease(KeyEvent.VK_V);
    	 r.keyRelease(KeyEvent.VK_CONTROL);
     }
     
     
}