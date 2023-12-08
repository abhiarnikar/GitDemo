package stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Relativelocators {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditbox=driver.findElement(By.xpath("(//input[@name=\"name\"])[1]"));
		
		String textName=driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText();
		
		System.out.println(textName);
		
		WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement textIce=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(textIce)).click();
		
		Thread.sleep(2000);
		
		WebElement radioBtn=driver.findElement(By.id("inlineRadio1"));
		
		String stdText=driver.findElement(with(By.tagName("label")).toRightOf(radioBtn)).getText();
		
		System.out.println(stdText);
		
	}

}
