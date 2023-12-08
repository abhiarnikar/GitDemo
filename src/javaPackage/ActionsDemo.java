package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		WebElement move=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		
		act.moveToElement(move).build().perform();
		
		//Enter keyword in Capital with shift and double click on Element to select all
		
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
		.sendKeys("abhijitarnikar").doubleClick().build().perform();
	
		
		//Right click on element with help of Contextclick
		
		act.moveToElement(move).contextClick().build().perform();

	}

}
