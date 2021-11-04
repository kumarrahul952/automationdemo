package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\browserdrive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys("kumar rahul");
driver.findElement(By.cssSelector("[value='Alert']")).click();
	}

}
