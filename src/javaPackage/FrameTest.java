package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		
		    WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			WebElement iframeElement=driver.findElement(By.cssSelector("[class=\"demo-frame\"]"));
			
			driver.switchTo().frame(iframeElement);
			
			Actions act=new Actions(driver);
			
			WebElement sourceElement=driver.findElement(By.id("draggable"));
			
			WebElement targetElement=driver.findElement(By.id("droppable"));
			
			act.dragAndDrop(sourceElement, targetElement).build().perform();
			
			
			

	}

}
