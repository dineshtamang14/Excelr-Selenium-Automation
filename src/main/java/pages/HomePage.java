package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;

public class HomePage extends TestBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickJoin() {
		super.driver.findElement(By.xpath("//span[contains(text(), 'Join')]")).click();
		super.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		super.driver.findElement(By.linkText("Proceed")).click();
	}

}
