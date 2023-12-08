package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		driver.manage().window().maximize();

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(2000);

		List<WebElement> Options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"]"));

		for (WebElement option : Options) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}
}
