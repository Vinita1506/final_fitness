package com.assignment.pageobjectmodel.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends PageObject {

	public Product(WebDriver driver) {
		super(driver);
	}
	//selecting shop section 
	@FindBy(linkText = "SHOP")
	private WebElement shop;

	//click on shop section
	public void clickOnShop() {
		shop.click();
	}

}
