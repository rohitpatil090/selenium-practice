package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {											//mouseover means without click on menus or options showing the next menu.

	public static void main(String[] args) {
		
		//Initiate The Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		
		//Get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");		//login with username
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");	//password
		driver.findElement(By.name("Submit")).click();						//click on login button
		
		//Admin--->User Management--->Users
		
		Actions act=new Actions(driver);							//Actions class is used for mouse over operations
		
		WebElement admin=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/b[1]"));							//Admin
		WebElement usermgmt=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));				//User management
		WebElement user=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));		//Users
		
		act.moveToElement(admin).build().perform();				//mouse will move over to 'admin' menu but won't click
		act.moveToElement(usermgmt).build().perform();			//mouse will move over to 'user management' menu but won't click
		act.moveToElement(user).click().build().perform();		////mouse will move over to 'user' menu and click
		
		
		//instead of using whole code from line 34 to line 36 we can write in single line
		
		//act.moveToElement(admin).moveToElement(usermgmt).moveToElement(user).click().build().perform();
		
	}

}
