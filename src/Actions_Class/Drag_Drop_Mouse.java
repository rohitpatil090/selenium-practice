package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Mouse {

	public static void main(String[] args) {
		
		//Initiate The Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
						
		WebDriver driver=new ChromeDriver();
								
		//Get url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
		Actions act=new Actions(driver);
		
		WebElement source_capitals1=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
				
		WebElement target_country1=driver.findElement(By.xpath("//div[@id='box103']"));
		
		
		WebElement source_capitals2=driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement target_country2=driver.findElement(By.xpath("//div[@id='box107']"));
		
		
		
		//Following are the two methods to perform drag and drop operation but both requires Actions class
		
		act.clickAndHold(source_capitals1).moveToElement(target_country1).release().build().perform();		//this will click and hold the option and release 
		
		act.dragAndDrop(source_capitals2, target_country2).build().perform();			//this method is easy and simple for same purpose
		
		
		
		

	}

}
