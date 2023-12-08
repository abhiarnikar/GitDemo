package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_AutosuggestDD {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.cssSelector("[class=\"ui-menu-item\"]>div"));
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("United Arab Emirates")) {
				
				option.click();
				break;
			}
		}

	}

}
