package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		
//		 System.setProperty("webdriver.http.factory", "jdk-http-client");
//			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neosoft\\Desktop\\Java_Selenuim\\chromedriver_win32\\chromedriver.exe");
//			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.navigate().back();
			
			driver.navigate().forward();
	}
}
