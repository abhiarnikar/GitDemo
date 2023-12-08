package stream;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeNewWindow {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWindow=it.next();
		
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String title=driver.findElement(By.xpath("//a[text()='Cypress-Modern Automation Testing from Scratch + Framework']")).getText();
		
		driver.switchTo().window(parentWindow);
		
		WebElement nameTextBox=driver.findElement(By.xpath("(//input[@name=\"name\"])[1]"));
		
		nameTextBox.sendKeys(title);
		
		//Get screenshot
		
//		File file= nameTextBox.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(file, new File("logo.png"));
		
		//Get Height and width of the element
		
		System.out.println(nameTextBox.getRect().getDimension().getHeight());
		
		System.out.println(nameTextBox.getRect().getDimension().getWidth());
		

	}

}
