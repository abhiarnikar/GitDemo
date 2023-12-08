package javaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		// 1.Give me the count of link on the entire WebPage
		
		//when the tagname starts with a then this is webelement contains link
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. Give me the link count on footerPage
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. find the count of link from Particular section
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table[@class=\"gf-t\"]/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());;
		
		//4. click on each link in the column check if the pages are opening
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(5000);
			
		}
			Set<String> windows=driver.getWindowHandles(); //[ParentID,ChildID1,ChildID2,ChildID3,ChildID4]
			
			Iterator<String> it=windows.iterator();
			
			while(it.hasNext()) {
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		
		
		driver.close();
		
		

	}

}
