package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndFlow {

	public static void main(String[] args) throws Exception {
		
		 WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
            driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value='BLR']")).click();
			
			// Here we did not use index related formula (//a[@value=\"MAA\"])[2]
			driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();
			
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
				System.out.println("Its Disabled");
				Assert.assertFalse(false);
			}
			
			else {
				Assert.assertTrue(true);
			}
			driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).click();
			
			driver.findElement(By.id("divpaxinfo")).click(); 
			
			for(int i=1;i<5;i++) {
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			Select dropdown=new Select(staticDropdown);
			
			//Select by index
			dropdown.selectByIndex(2);//AED
			
			driver.findElement(By.xpath("//input[@name=\"ctl00$mainContent$btn_FindFlights\"]")).click();
	}
}
