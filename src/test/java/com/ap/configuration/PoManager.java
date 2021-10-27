package com.ap.configuration;

import org.openqa.selenium.WebDriver;

import com.ap.pomodel.LoginPom;
import com.ap.pomodel.LogoutPOM;

public class PoManager {

	public static WebDriver driver;

	private LoginPom lp;
	private LogoutPOM logout;

	public PoManager(WebDriver driver2) {
		this.driver = driver2;
	}
	

	public LoginPom getInstanceLogin() {

		lp = new LoginPom(driver);
		return lp;

	}
	public LogoutPOM getInstanceLogOut() {

		logout = new LogoutPOM(driver);
		return logout;
}
}
