package com.ap.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ap.configuration.PoManager;
import com.ap.configuration.ReaderManager;
import com.ap.pomodel.LoginPom;
import com.ap.runner.LoginRunner;
import com.util.BaseClass;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass {

	public static WebDriver driver = LoginRunner.driver;

	PoManager pom = new PoManager(driver);

	@Given("^user want to launch the application$")
	public void user_want_to_launch_the_application() throws Throwable {
		// url("http://automationpractice.com/index.php");
		url(ReaderManager.getInstance().getPropertyReader().getUrl());

	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		clkElement(pom.getInstanceLogin().getLogin());

	}

	@And("^user enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		sendKeys(pom.getInstanceLogin().getEmail(), ReaderManager.getInstance().getPropertyReader().getEmailID());

	}

	@And("^user enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		sendKeys(pom.getInstanceLogin().getPassword(), ReaderManager.getInstance().getPropertyReader().getPassword());

	}

	@Then("^user varify the valid username and password$")
	public void user_varify_the_valid_username_and_password() throws Throwable {
		clkElement(pom.getInstanceLogin().getSubmitLogin());
	}
}
