package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.HighLighter;

public class BaseLogin {

	public void getLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getConfig("URL"));
		driver.manage().window().maximize();

		MasterPageFactory mpf = new MasterPageFactory(driver);

		HighLighter.getColor(driver, mpf.getUsername());
		mpf.getUsername().sendKeys(BaseConfig.getConfig("USER"));
		mpf.getPassword().sendKeys(BaseConfig.getConfig("PASS"));
		mpf.getLogin().click();

	}

}