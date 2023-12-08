package javaPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("[id=\"password\"]")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		
		Select dropDown=new Select(staticDropdown);
		
		dropDown.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class=\"navbar-brand\"])[2]")));
		
		driver.findElement(By.xpath("(//a[@class=\"navbar-brand\"])[2]")).isEnabled();
		
		List<WebElement> addButton=driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]"));
		
		for(int i=0;i<addButton.size();i++) {
			
			addButton.get(i).click();
		}
		
		driver.findElement(By.cssSelector("[class=\"nav-link btn btn-primary\"]")).click();
		
		driver.findElement(By.cssSelector("[class=\"btn btn-success\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Purchase\"]")).click();
		
		String successMsg=driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
		
		System.out.println(successMsg);
	}
}
