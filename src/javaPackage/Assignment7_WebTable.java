package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_WebTable {

	public static void main(String[] args) {
		
		    WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			List<WebElement> columns=driver.findElements(By.cssSelector("[name=\"courses\"]>tbody>tr:nth-child(1)>th"));
			
			System.out.println(columns.size());
			
            List<WebElement> rows=driver.findElements(By.cssSelector("[name=\"courses\"]>tbody>tr"));
			
			System.out.println(rows.size());
			
			List<WebElement> data=driver.findElements(By.cssSelector("[name=\"courses\"]>tbody>tr:nth-child(3)>td"));
			
			
			for(int i=0;i<data.size();i++) {
				
				System.out.println(data.get(i).getText());
			}

	}

}
