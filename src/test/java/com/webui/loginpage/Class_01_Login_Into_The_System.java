package com.webui.loginpage;

import java.sql.Driver;
import java.time.Duration;

import org.apache.velocity.convert.WebMacro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPageObject;

public class Class_01_Login_Into_The_System {
	LoginPageObject loginPage;
	WebDriver driver;
	
	@Test
	public void TC_01_Login_With_Incorrect_UserName_And_Passowrd() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		loginPage = new LoginPageObject(driver);
		loginPage.inputToUserName("tomsmith");
		loginPage.inputToPassword("SuperSecretPassword");
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorText().trim(), "Your password is invalid!\n×");
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}
	
}
