package webTable;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable {

	public static void main(String[] args) {

		// Web Table sorting using Java streams

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		// driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all WebElements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		// capture all WebElements text into new list
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on original list of step3 --> Sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs Sorted list
		// Assert.assertTrue(originalList.equals(sortedList));

		// scan the vegetable column with text->Rice->print the price of the rice
		List<String> price;
		do {
			List<WebElement> elementList1 = driver.findElements(By.xpath("//tr/td[1]"));

			price = elementList1.stream().filter(s -> s.getText().contains("Cherry")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label=\"Next\"]")).click();
			}
		} while (price.size() < 1);

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return priceValue;
	}

}
