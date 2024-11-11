package Zoom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom_In_out {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/learning/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//zooming to 150% level
		
		js.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(3000);
		
		//zooming to 50% level
		
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		
		//zooming to default level
		
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		
		System.out.println("Test is passed");

	}

}
