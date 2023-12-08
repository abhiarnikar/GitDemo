package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//dropdown with select tag is called static dropdown
		
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticDropdown);
		
		//Select by index
		dropdown.selectByIndex(2);//AED
		
		Thread.sleep(2000);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//select by VisibleText
		
		dropdown.selectByVisibleText("USD");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//select by Value
		
		dropdown.selectByValue("INR");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//driver.close();
		
	}
}
