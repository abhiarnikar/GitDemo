package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Exception {
		
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		
		WebElement myelement=driver.findElement(By.cssSelector("input[placeholder=\"Date of travel\"]"));
		
		myelement.click();
		
		//1. Select month January 2024
		
		
		while(!driver.findElement(By.cssSelector("[class=\"flatpickr-current-month\"]>span[class=\"cur-month\"]")).getText().contains("January")) {
			
			driver.findElement(By.cssSelector("[class=\"flatpickr-next-month\"]")).click();
			Thread.sleep(2000);
			
			
		}
		
		// 2. select Date 26
		List<WebElement>  dates=driver.findElements(By.cssSelector("[class=\"dayContainer\"]>span"));
		
		int count=dates.size();
		
		for(int i=0;i<count;i++) {
			
			String text=dates.get(i).getText();
			
			if(text.equalsIgnoreCase("26")) {
				
				dates.get(i).click();
				break;
			}
		}
		

	}

}
