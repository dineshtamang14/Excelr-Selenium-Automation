package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class TestBase {
	protected WebDriver driver;
	
	protected TestBase(WebDriver driver) {
		this.driver = driver;
	}
	
	protected void clickSignIn() {
		this.driver.manage().window().maximize();
		this.driver.get("https://onlinelearning.excelr.com/signin");
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
}
