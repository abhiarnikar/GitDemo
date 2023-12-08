package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentCheckbox {

	public static void main(String[] args) throws Exception {
		
		 WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("checkBoxOption1")).click();
			
			Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("checkBoxOption1")).click();
			
			Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
			
			System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
	}
}
