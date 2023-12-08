package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws Exception {
		
		    WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
//			driver.findElement(By.xpath("//a[@value=\"AMD\"]")).click(); //Ahmedabad
//			
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click(); //Chennai
			
			// Now we can use Parent child RelationShip Xpath
			
			driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value='BLR']")).click();
			
			Thread.sleep(2000);
			
			// Here we did not use index related formula (//a[@value=\"MAA\"])[2]
			driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']")).click();
			
			
			
			
	}
}
