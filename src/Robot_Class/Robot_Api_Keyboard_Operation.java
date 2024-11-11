package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Api_Keyboard_Operation {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://spreadsheetpage.com/calendar/yearly/");
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Download this template for free']")).click();
		 
		  Robot robot=new Robot();
		  
		  robot.keyPress(KeyEvent.VK_DOWN);			//moves downward
		  robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  
		  //incomplete
		  

	}

}
