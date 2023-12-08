package javaPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {

//		        System.setProperty("webdriver.http.factory", "jdk-http-client");
//		
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neosoft\\Desktop\\Java_Selenuim\\chromedriver_win32\\chromedriver.exe");
//				
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.manage().window().maximize();

		driver.findElement(By.id("inputUsername")).sendKeys("Abhijit");

		driver.findElement(By.name("inputPassword")).sendKeys("Abhi@123");

		driver.findElement(By.className("signInBtn")).click();

		String ErrorText = driver.findElement(By.cssSelector("p.error")).getText();

		System.out.println(ErrorText);

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Abhijit Arnikar");

		// driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("abhi@gmail.com");

		// Another way to Handling the locators of this Email with respect to index
		// method

		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys("abhi@gmail.com");

		// Now we can Handle the xpath with the help of Parent to child and index method

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7507853623");// Phone number

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// Now we can Handle the csslocators with the help of Parent to child we use
		// space from parent to child

		String TempPassword = driver.findElement(By.cssSelector("form p")).getText();

		System.out.println(TempPassword);

		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Abhijit Arnikar");

		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}