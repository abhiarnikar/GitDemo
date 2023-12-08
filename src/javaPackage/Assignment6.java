package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws Exception {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		Thread.sleep(2000);
		
		String option2Text=driver.findElement(By.xpath("(//div[@id=\"checkbox-example\"]/fieldset/label)[2]")).getText().trim();
		
		System.out.println(option2Text);
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		
		Select DD=new Select(dropdown);

		DD.selectByVisibleText(option2Text);
		
		driver.findElement(By.id("name")).sendKeys(option2Text);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
