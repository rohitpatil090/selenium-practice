package Tool_Tip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_Tip_Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/github");
		
		System.out.println(driver.findElement(By.xpath("/html/body/footer/div[1]/ul[1]/li/a")).getAttribute("title"));

		
	}

}
