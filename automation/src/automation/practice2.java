package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\browserdrive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://book.spicejet.com/");
driver.findElement(By.cssSelector("input.select_CTXT")).click();
driver.findElement(By.cssSelector("a[value='DHM']")).click();
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
WebDriverWait wait=new WebDriverWait(driver,5);
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today"))));

driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
driver.findElement(By.id("divpaxinfo")).click();
driver.findElement(By.cssSelector("select[id*='DropDownListPassengerType_ADT']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("option[value='6']")).click();
//Select select = new Select();
driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']")).click();
//driver.findElement(By.cssSelector("#custom_date_picker_id_2")).click();
//driver.findElement(By.cssSelector("input[id*=FamilyAndFriends]")).click();
//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=FamilyAndFriends]")).isSelected());
//driver.findElement(By.cssSelector("input[id*=FamilyAndFriends]")).isSelected();
}
	}


