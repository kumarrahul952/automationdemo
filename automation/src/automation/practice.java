package automation;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\browserdrive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("autosuggest")).sendKeys("in");
List<WebElement> options=driver.findElements(By.cssSelector("a.ui-corner-all"));
for(WebElement option:options) {
	if(option.getText().equalsIgnoreCase("India")) {
	option.click();
	}
	
}

	}

}
