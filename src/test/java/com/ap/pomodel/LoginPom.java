package com.ap.pomodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;

public class LoginPom extends BaseClass {

	public static WebDriver driver;

	@FindBy(className = "login")
	private WebElement login;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(name = "SubmitLogin")
	private WebElement SubmitLogin;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitLogin() {
		return SubmitLogin;
	}

	public LoginPom(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
