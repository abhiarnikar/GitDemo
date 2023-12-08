package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		
		    String text="Abhijit";
		    
		    String text2="Sachin";
		
		    WebDriver driver =new ChromeDriver();
			
		   
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("name")).sendKeys(text);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("alertbtn")).click();
			
			Thread.sleep(1000);
			
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().accept();
			
			driver.findElement(By.id("name")).sendKeys(text2);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("confirmbtn")).click();
			
			Thread.sleep(1000);
			
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().dismiss();
	}

}
