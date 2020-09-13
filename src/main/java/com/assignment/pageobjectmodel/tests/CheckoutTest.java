package com.assignment.pageobjectmodel.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.assignment.pageobjectmodel.model.Checkout;

public class CheckoutTest extends BaseTest {
	static Properties properties;
	static {
		try {
			properties = new Properties();
			FileInputStream ip = new FileInputStream("src/main/resources/application.properties");
			properties.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void Placeorder() {

		Checkout order = new Checkout(WEB_DRIVER);

		order.clickOnProceed();
		order.clickOnPlaceorder();
		order.clickOnExpress();
		order.setEmail(properties.getProperty("order.email"));
		order.setFname(properties.getProperty("order.fname"));
		order.setLname(properties.getProperty("order.lname"));
		order.setStreet(properties.getProperty("street"));
		order.setCity(properties.getProperty("order.city"));
		order.setZip(properties.getProperty("zip"));
		order.setPhone(properties.getProperty("phone"));
		order.setCard(properties.getProperty("card"));
		order.setMonth(properties.getProperty("month"));
		order.setCvc(properties.getProperty("cvc"));
		order.clickOnPlaceorder1();
	}

}
