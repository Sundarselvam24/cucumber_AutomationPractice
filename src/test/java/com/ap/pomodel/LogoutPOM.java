package com.ap.pomodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	
	public static WebDriver driver;
	
	public LogoutPOM(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
