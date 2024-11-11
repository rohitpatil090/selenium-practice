package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		//Initiate The Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
										
		WebDriver driver=new ChromeDriver();
												
		//Get url
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);										//swith to 0th index frame as only one frame is present
		
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));		//identifying the square frame which is web element by xpath
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(resize, 50, 60).build().perform();		//slides the square frame by 50(horizontal),(60)vertical
		
		//act.clickAndHold(resize).moveByOffset(50, 60).build().perform();
		Thread.sleep(3000);
				

	}

}
