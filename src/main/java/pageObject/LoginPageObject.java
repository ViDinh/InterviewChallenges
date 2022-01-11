package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageUI.LoginPageUI;

public class LoginPageObject {
	WebDriver driver; 
	
	public LoginPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public void inputToUserName(String username) {
		driver.findElement(By.xpath(LoginPageUI.USER_NAME_TEXTBOX)).sendKeys(username);
	}
	
	public void inputToPassword(String password) {
		driver.findElement(By.xpath(LoginPageUI.PASSWORD_TEXTBOX)).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(By.xpath(LoginPageUI.LOGIN_BUTTON)).click();
	}
	
	public String getErrorText() {
		return driver.findElement(By.xpath(LoginPageUI.ERROR_MESSAGE)).getText();
	}
	
	public void loginToApplication(String username, String password) {
		inputToUserName(username);
		inputToPassword(password);
		clickLoginButton();
	}

}
