package javaPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws Exception {
		
		String name="Abhijit Arnikar";
		
//		    System.setProperty("webdriver.http.factory", "jdk-http-client");
//			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neosoft\\Desktop\\Java_Selenuim\\chromedriver_win32\\chromedriver.exe");
//			
			WebDriver driver =new ChromeDriver();
		
           //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Neosoft\\Desktop\\Java_Selenuim\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		   //WebDriver driver =new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			String password=getPassword(driver);
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
			
			driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys(password);
			
			driver.findElement(By.id("chkboxOne")).click();
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			Thread.sleep(2000);
			
			System.out.println(driver.findElement(By.tagName("p")).getText());
			
		    Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");
		    
		    System.out.println(driver.findElement(By.xpath("//h2")).getText());
		    
		    Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+name+",");
		    
		    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		    
		    driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws Exception {
		
		//Here in this method we extract the Password from string
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray=passwordText.split("'"); //Here we divide the String into 2 Parts and It Automatically save in one passwordArray
		//0th index:- Please use temporary password 
		//1st index:- rahulshettyacademy' to Login.
		
		//Here we want 1st index so we again devide that 1st index into 2 parts
		
		String actualPassowrd=passwordArray[1].split("'")[0];//Here we again devide that 1st index into 2 parts
		//0th index:- rahulshettyacademy
		//1st index:-  to Login.
		// so we have to take 0th index as a Password
		return actualPassowrd;
	}
}
