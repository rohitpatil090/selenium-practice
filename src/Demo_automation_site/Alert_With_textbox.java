package Demo_automation_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_textbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		
		//FOR OK BUTTON
	
		driver.switchTo().alert().sendKeys("Rohit Patil");
		
		driver.switchTo().alert().accept();
		
		String ActText=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/p[1]")).getText();
		
		String ExpTextOK="Hello Rohit Patil How are you today";
		
		if(ExpTextOK.equals(ActText)==true) {
			
			System.out.println("test is passed with ok button by giving input in textbox ");
		}
		
		
		
		
	}

}
