package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws Exception {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentID=it.next();
		
		String childID=it.next();
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentID);
		
		System.out.println(driver.findElement(By.xpath("//h3")).getText());

	}

}
