package javaPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws Exception, IOException {
		
		//How to Identify that URL is broken or this is broken link or it is working or not
		
		// In this Section we can identify which link is broken
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(5000);
		
		//Broken URL
		//Step 1- Is to get all urls tied up to the links using selenium
		// Java methods call the URLs and gets you the status code
		// if status code is >400 then that url is not working-link which tied to url is broken
		
		//We can find all links and there status code and if any one of them is broken then test will fail
		List<WebElement> links=driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
		
		SoftAssert a=new SoftAssert();
		
		for(WebElement link:links) {
			
			String url=link.getAttribute("href");
			
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int statusCode=conn.getResponseCode();
			
			System.out.println(statusCode);
			
			a.assertTrue(statusCode>400, "The link with text "+link.getText()+"is broken with code "+statusCode);
			
			
			
		}
		a.assertAll();
		
		//Below code is for Broken link it is working
//		String url=driver.findElement(By.xpath("(//li[@class=\"gf-li\"]/a)[5]")).getAttribute("href");
//		
//		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
//		
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		
//		int statusCode=conn.getResponseCode();
//		
//		System.out.println(statusCode);

	}

}
