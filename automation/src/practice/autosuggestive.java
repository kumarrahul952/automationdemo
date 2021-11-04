package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://browserdrive//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("autocomplete")).sendKeys("in");
	Thread.sleep(4000);
	List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
	//Iterator<WebElement> country=options.iterator();
	for(WebElement country1:options) {
		if(country1.getText().equalsIgnoreCase("India")) {
			country1.click();
			break;
		}
	}
	
	
}

}
