package com.ap.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.util.BaseClass;
import com.ap.configuration.ReaderManager;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\ap\\feature", glue = "com\\ap\\stepdefinition",
plugin= {"pretty"},monochrome=true)
public class LoginRunner {

	public static WebDriver driver = null;

	@BeforeClass
	public static void setUp() throws IOException {

		String browser = ReaderManager.getInstance().getPropertyReader().getbrowser();

		driver = BaseClass.getDriver(browser);

	}

}
