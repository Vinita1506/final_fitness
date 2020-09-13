package com.assignment.pageobjectmodel.tests;

import org.testng.annotations.Test;

import com.assignment.pageobjectmodel.model.AddtoCart;
import com.assignment.pageobjectmodel.model.Product;

public class AddtoCartTest extends BaseTest {

	@Test
	public void addtocart() {
		
		AddtoCart addtocart = new AddtoCart(WEB_DRIVER);

		addtocart.clickOnBuletooth();
		addtocart.clickOncolor();
		addtocart.clickOnCart();
		WEB_DRIVER.navigate().to("https://eu.wahoofitness.com/devices");
		addtocart.clickOnSensor();
		addtocart.clickOnAdd();
		

	}

}
