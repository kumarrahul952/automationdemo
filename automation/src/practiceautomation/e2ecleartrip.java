package practiceautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class e2ecleartrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://browserdrive//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// driver.findElement(By.cssSelector("[placeholder='Any worldwide city or
		// airport']")).sendKeys("ban");
		// Thread.sleep(2000);
		// List<WebElement>
		// options=driver.findElements(By.cssSelector(".to-ellipsis.o-hidden.ws-nowrap.c-inherit
		// fs-3"));
        //	for(WebElement option:options) {
		// if(option.getText().contains("Bangalore")) {
		// option.click();
		// }
		// }
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(//div[@class=\"p-1 day-gridContent flex flex-middle flex-column flex-center flex-top\"]) [22]"))
				.click();
		// driver.findElement(By.cssSelector(".p-1.day-gridContent.flex.flex-middle.flex-column.flex-center.flex-top")).click();
		driver.findElement(By.cssSelector("select.bc-neutral-100.bg-transparent")).click();
		driver.findElement(By.cssSelector("option[value='7']")).click();
		Thread.sleep(2000);
		//(//select[@class='bc-neutral-100 bg-transparent']) [2]
		driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent']) [2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[@value='1']) [2]")).click();
		driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent']) [3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[@value='1']) [3]")).click();
		driver.findElement(By.cssSelector("a[href*='javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent']) [4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='Business']")).click();
		driver.findElement(By.cssSelector("[placeholder='Airline name']")).sendKeys("ind");
		Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.cssSelector(".to-ellipsis.o-hidden.ws-nowrap.c-inherit.fs-3"));
	//driver.manage().window().
	for(WebElement element:options) {
		if(element.getText().contains("IndiGo")) {
			element.click();
		}
	}
	}
}
