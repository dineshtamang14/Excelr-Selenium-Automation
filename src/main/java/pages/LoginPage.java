package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class LoginPage extends TestBase {
	private String email;
	private String pass;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		super.clickSignIn();
	}
	
	
	public void signIn(String email, String pass) {		
		this.email = email;
		this.pass = pass;
		super.driver.findElement(By.id("email")).sendKeys(this.email);
		super.driver.findElement(By.id("password")).sendKeys(this.pass);
		super.driver.findElement(By.cssSelector("button[type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(super.driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Good Evening')]")));
	}
}
