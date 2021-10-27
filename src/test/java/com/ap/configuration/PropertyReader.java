package com.ap.configuration;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static Properties pro;

	public PropertyReader() throws IOException {

		File f = new File(
				"E:\\Eclipse Oxyzen\\WebTest Project\\Cucumber_AutomationPractice\\src\\test\\java\\com\\ap\\configuration\\ap.properties");

		FileInputStream fis = new FileInputStream(f);

		pro = new Properties();
		pro.load(fis);
	}
	public String getbrowser() {
		String browser = pro.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}

	public String getEmailID() {
		String email = pro.getProperty("email");
		return email;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;

	}

}
