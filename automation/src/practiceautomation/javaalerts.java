package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://browserdrive//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys("kumar rahul");
driver.findElement(By.id("alertbtn")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();

	}

}
