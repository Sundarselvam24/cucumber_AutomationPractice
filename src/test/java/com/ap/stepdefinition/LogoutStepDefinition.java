package com.ap.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ap.configuration.PoManager;
import com.ap.runner.LoginRunner;
import com.util.BaseClass;

import cucumber.api.java.en.*;

public class LogoutStepDefinition extends BaseClass {
	
	
	public static WebDriver driver = LoginRunner.driver;
	PoManager pm = new PoManager(driver);
	@Given("^user click the logout button$")
	public void user_click_the_logout_button() throws Throwable {
    clkElement(pm.getInstanceLogOut().getLogout());
	}
}
