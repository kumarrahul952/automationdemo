package practiceautomation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemoe2ehavingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://browserdrive//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
String[] itemNeeded = {"Sauce Labs Backpack","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket"};
		List<WebElement> allItems = driver.findElements(By.cssSelector(".inventory_item_description"));
//List itemNeededlist=Arrays.asList(itemNeeded);
		for (int i = 0; i < allItems.size(); i++) {
			//List<String> names=Arrays.asList(itemNeeded);
			String[] name = allItems.get(i).getText().split(".");
			String formattedName=name[0];
			List<String> names=Arrays.asList(itemNeeded);
			if (names.contains(formattedName)) {
				//String name = allItems.get(i).getText();
				// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				driver.findElements(By.xpath("//button[text()='Add to cart']")).get(i).click();
			}
		}
	}

}
