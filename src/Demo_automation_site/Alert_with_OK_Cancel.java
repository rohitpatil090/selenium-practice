package Demo_automation_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_OK_Cancel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click(); 
		 
		 //FOR OK BUTTON
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		 
		 String ExpActText_OK="You pressed Ok";
		 
		 driver.switchTo().alert().accept();
		 
		 String ActText=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
		 
		if(ExpActText_OK.equals(ActText)==true) 
		{
			
			System.out.println("Test is passed with Ok button");
			
		}
			
		
		 // FOR CANCEL BUTTON 
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		
		 String ExpActText_Cancel="You Pressed Cancel";
		
		driver.switchTo().alert().dismiss();
		 
		 ActText=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
		
		if(ExpActText_Cancel.equals(ActText)==true) 
		{
			
			System.out.println("Test is passed with cancel button");
			
		}
	}

}
