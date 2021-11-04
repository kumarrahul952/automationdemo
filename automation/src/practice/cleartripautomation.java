package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartripautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://browserdrive//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.cleartrip.com");
driver.manage().window().maximize();

driver.findElement(By.cssSelector("[placeholder='Any worldwide city or airport']")).sendKeys("ba");
Thread.sleep(2000);
//List<WebElement> options=driver.findElements(By.cssSelector("[class=fs-2.c-neutral-300.pb-2.pt-2.px-2]"));
List<WebElement> options=driver.findElements(By.cssSelector(".to-ellipsis.o-hidden.ws-nowrap.c-inherit.fs-3"));

for(WebElement option:options) {
if(option.getText().contains("Bangalore")) {
	option.click();
}
}
driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport']) [2]")).sendKeys("ch");
Thread.sleep(2000);
List<WebElement> options1=driver.findElements(By.cssSelector(".to-ellipsis.o-hidden.ws-nowrap.c-inherit.fs-3"));
for(WebElement option:options1) {
if(option.getText().contains("Chennai")) {
	option.click();
}
}
	}

}
