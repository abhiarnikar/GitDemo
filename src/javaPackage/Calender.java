package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Exception {
		
		    WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
			
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}
}
