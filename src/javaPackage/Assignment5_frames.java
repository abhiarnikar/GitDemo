package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_frames {

	public static void main(String[] args) {
		
		  WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/nested_frames");
			
			driver.manage().window().maximize();
			
			System.out.println(driver.findElements(By.tagName("frame")).size());
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("[name=\"frame-top\"]")));
			
			System.out.println(driver.findElements(By.tagName("frame")).size());
			
			driver.switchTo().frame(1);
			
			System.out.println(driver.findElement(By.id("content")).getText());

	}

}
