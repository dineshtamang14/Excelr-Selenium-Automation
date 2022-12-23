package testCases;

import org.testng.annotations.Test;

import bsh.Console;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.BeforeClass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ExcelrAutomation {
	WebDriver driver;
	String emailID;
	String password;
	
  @Test(priority = 1)
  public void login() {
	  LoginPage login = new LoginPage(driver);
	  login.signIn(emailID, password);
  }
  
  @Test(priority = 2, dependsOnMethods = {"login"})
  public void homePage() {
	  HomePage home = new HomePage(driver);
	  home.clickJoin();
  }
  
  @BeforeClass
  public void beforeClass() {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter your EmailID: ");
	  emailID = scan.next();
	  System.out.println();
	  System.out.print("Enter your password: ");
	  password = scan.next();
	  scan.close();
	  
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
