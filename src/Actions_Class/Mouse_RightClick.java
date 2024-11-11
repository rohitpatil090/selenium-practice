package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick {

	public static void main(String[] args) {
		//Initiate The Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
				
		WebDriver driver=new ChromeDriver();
						
		//Get url
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		WebElement right_click_button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));		//find the button 'right click on me'
		
		act.contextClick(right_click_button).build().perform();      		//This will right click on button
		
		driver.findElement(By.xpath("//li[3]/span")).click();				//click the copy option
		
		String alert_text=driver.switchTo().alert().getText();
		System.out.println(alert_text);
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
