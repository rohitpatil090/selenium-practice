package Demo_automation_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_alerts {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 
		 //Alert box with OK button
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();     //Click on Alert with link
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();	  //Click on alert display button
		 
		 String alert_text=driver.switchTo().alert().getText();       //Message on alert display or window box
		 
		 System.out.println(alert_text);
		 
		 driver.switchTo().alert().accept();		// Click on OK button in alert window box
		 
		 

	}

}
