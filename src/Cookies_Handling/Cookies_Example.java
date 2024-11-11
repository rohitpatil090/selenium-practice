package Cookies_Handling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation -Selenium Webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie>cookies=driver.manage().getCookies();								//will get all the cookies present on url
		
		int size=cookies.size();
		System.out.println("Size of cookies on site: " +size);
		System.out.println(" ");
		
		//now get the each cookie from cookies(from all cookies) and is of type Cookie
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());				//this will get name and value of each cookie from cookies set
		}
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
		//to get the cookie by name
		System.out.println(driver.manage().getCookieNamed("ubid-acbin"));				//this will get the specific cookie according to name
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
		
		//to add cookie to browser
		
		Cookie cookie_obj=new Cookie("New Cookie","161494961");							//created new cookie
		driver.manage().addCookie(cookie_obj);											//added new cookie to browser
		
		cookies=driver.manage().getCookies();											//Again get all the cookies
		System.out.println("Size of cookies on site: " +cookies.size());				//size of cookie after adding new cookie
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());				//this will get new name and value of each cookie from cookies set
		}
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
	
		//to delete cookie from browser
		
		driver.manage().deleteCookie(cookie_obj);								//deleting the specific cookie from browser
				
		cookies=driver.manage().getCookies();											//Again get all the cookies
		System.out.println("Size of cookies on site: " +cookies.size());				//size of cookie after adding new cookie
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());				//this will get new name and value of each cookie from cookies set
		}	
		
		//Deleting all the cookies
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
		
		driver.manage().deleteAllCookies();												//deleting all the cookies from browser
		
		cookies=driver.manage().getCookies();											//Again get all the cookies
		System.out.println("Size of cookies on site: " +cookies.size());	
		
		
	}

}
