package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_By_Mouse {

	public static void main(String[] args) {
		//Initiate The Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
								
		WebDriver driver=new ChromeDriver();
										
		//Get url
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);        			//only one frame is present so start with 0th index and switch to that frame first
						
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));			//slider is identified in frame by xpath
		
		Actions act=new Actions(driver);				//to perform mouse actions
		
		act.dragAndDropBy(slider, 300, 0).build().perform();		//drag the slider by size 

	}

}
