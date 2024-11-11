package Scroll_Down_WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Pixel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.wikipedia.org/wiki/Main_Page");
		
		driver.manage().window().maximize();
		
		//Scrolling By Pixel
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		js.executeScript("window.scrollBy(0,1000)"," ");
			
		System.out.println("First Test is passed");
		
		
		//scrolling down till certain element.
		
		WebElement wiki_univ=driver.findElement(By.xpath("//*[@id=\"sister-projects-list\"]/li[10]/div[2]/span/a"));
		
		js.executeScript("arguments[0].scrollIntoView();",wiki_univ);				//argument is [0] because only one element is specified.i.e.'wiki_univ'
		
		System.out.println("Second Test is passed");
		
		
		//scroll down till bottom of page

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		System.out.println("Third Test is passed");
		
	}

}
