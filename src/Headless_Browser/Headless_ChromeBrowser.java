package Headless_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		

	}

}
