package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SellIntroduction {

	public static void main(String[] args) throws Exception {
		
		//ChromeDriver driver =new ChromeDriver();
		
		
		// Here we run test on ChromeDriver
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Neosoft\\\\Desktop\\\\Java_Selenuim\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//WebDriver driver =new ChromeDriver();
		
		//Firefox launch
		//GeckoDriver()
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Neosoft\\Desktop\\Java_Selenuim\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://chromedriver.chromium.org");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();	
		
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();//Close the current window, quitting the browser if it's the last window currently open
//		
//		driver.quit();//Quits this driver, closing every associated window

	}

}
