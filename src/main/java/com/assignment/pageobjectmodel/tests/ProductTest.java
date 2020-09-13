package com.assignment.pageobjectmodel.tests;

import org.testng.annotations.Test;

import com.assignment.pageobjectmodel.model.Product;

public class ProductTest extends BaseTest {
	// private static final Logger LOG = Logger.getLogger(Product.class);

	@Test
	public void shop() {
		Product product = new Product(WEB_DRIVER);

		product.clickOnShop();
		

	}

	/*
	 * @Test private void product() { product();
	 * 
	 * }
	 */

}
