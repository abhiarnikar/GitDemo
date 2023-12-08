package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		
		    WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Abhijit");
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abhi@gmail.com");
			
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("abhi@123");
			
			driver.findElement(By.id("exampleCheck1")).click();
			
			driver.findElement(By.id("exampleFormControlSelect1"));
			
			Select dropdown=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
			
			dropdown.selectByVisibleText("Male");
			
			driver.findElement(By.id("inlineRadio1")).click();
			
			driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("23/06/2023");
			
			driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
			
			System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());
			
			
			
	}
}
