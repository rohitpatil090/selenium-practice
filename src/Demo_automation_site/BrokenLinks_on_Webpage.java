package Demo_automation_site;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_on_Webpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Initiate the Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		//Get the url of website
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//Wait
		Thread.sleep(3000);
		
		//Maximize Page
		driver.manage().window().maximize();
		
		//Stores all the links which are webelemnt with a linktext
		List <WebElement>links=driver.findElements(By.tagName("a"));
		
		//Number Of Links
		int link_size=links.size();
		
		//To Iterate over all links
		for(int i=0; i<link_size; i++)
		{
			//By using href attribute we can get url of required link
			
			WebElement element=links.get(i);					//get all links of url as a webelement
			String url = element.getAttribute("href");       	//get links by using href attribute and return type is string
			
			URL link=new URL(url);
			
			
			//create connection using URL object link from line 47
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			
			//establish connection
			httpconn.connect();
			
			//to get a response code
			int response_code=httpconn.getResponseCode();
			
			/*
			int count_broken=0;
			int count_valid=0;
			*/
			
			//if response code is above 400 then it is a broken link
			if(response_code>=400)
				
			{
				
				System.out.println(url +"- "+ "is a broken link");
				
			}
			else
			{
				System.out.println(url +"- "+ "is a valid link");
			}
			
			
		}
		
		
		
	}

}
