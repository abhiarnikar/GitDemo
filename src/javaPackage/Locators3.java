package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
//		    System.setProperty("webdriver.http.factory", "jdk-http-client");
//			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neosoft\\Desktop\\Java_Selenuim\\chromedriver_win32\\chromedriver.exe");
//			
			WebDriver driver =new ChromeDriver();
			
			//Here we are learning Locators using traverse method
			//Sibling to Parents OR child to Parents
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			// There are two types of xpath
			//1.Absolute xpath :-Means we are starting from the begining from html keyword
			//if we use single(/) means we are using Absolute xpath
			
			//2.Relative xpath:- Means we are starting from the middle from other than html keyword
			//if we use single(//) means we are using Relative xpath
			
			//we traverse from parent to child and then sibling to sibling
		
			//  //header/div/button[1]/following-sibling::button[1] Here we start from Practice to Login
			
			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
			
			//  //header/div/button[1]/following-sibling::button[2] Here we start from Practice to Signup
			
			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
			
			//We can traverse from child to Parent also
			
			// //header/div/button[1]/parent::div from Practice to div
			
			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
	}
}
