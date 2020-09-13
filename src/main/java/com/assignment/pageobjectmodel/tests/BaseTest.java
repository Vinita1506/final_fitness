package com.assignment.pageobjectmodel.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver WEB_DRIVER;

	@BeforeTest
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		WEB_DRIVER = new ChromeDriver();
		WEB_DRIVER.get("https://eu.wahoofitness.com/");
		WEB_DRIVER.manage().window().maximize();
		WEB_DRIVER.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	/*
	 * @AfterTest public void tearDown() { WEB_DRIVER.quit(); }
	 */

}
