package javaPackage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Ecommerceapp {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //This is called Implicit wait
		String[] itemNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		

		driver.manage().window().maximize();
		
		addItems(driver,itemNeeded);
		
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		
		driver.findElement(By.cssSelector("input[class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		
		// Here we cannot find this input[class=\"promoCode\"] locator so to avoid this we can use
		//Implicit wait concept 
		
		driver.findElement(By.cssSelector("button[class=\"promoBtn\"]")).click();
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"promoInfo\"]")));
		
		String codeapplied=driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText();
		
		System.out.println(codeapplied);
		
		//Assert.assertEquals(codeapplied, "Code applied ..!");
		
	}
	
	public static void addItems(WebDriver driver,String [] itemNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			// Here we devide Pruduct name into two Parts
			// Suppose Brocolli - 1 Kg devide 0th index- Brocolli and 1st index :- - 1 Kg
			// so we want 0th index :- Brocolli and in this extra space is coming so we need
			// to remove this extra space we use trim() method
			String[] name = products.get(i).getText().split("-");
			String fromattedName = name[0].trim();// This will remove extra space

			// check wheather name you extratced is present in array or not
			// convert Array into arrayList for easy search

			List itemsNeededList = Arrays.asList(itemNeeded);

			if (itemsNeededList.contains(fromattedName)) {

				// click on AddToCart button
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();

				if (j == itemNeeded.length) {
					break;
				}

			}
		}
		
		
	}

}
