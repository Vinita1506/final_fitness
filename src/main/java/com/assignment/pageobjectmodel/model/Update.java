package com.assignment.pageobjectmodel.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Update extends PageObject {

	public Update(WebDriver driver) {
		super(driver);

	}

	//locate quantity tab
	/*
	 * @FindBy(xpath = "//input[@id='cart-1808321-qty']") 
	 * private WebElement qty;
	 * 
	 //locate update cart button
	 * @FindBy(xpath = "//span[contains(text(),'Update Cart')]") 
	 * private WebElement updatecart;
	 * 
	 //locate total button
	 * @FindBy(xpath =
	 * "//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[4]/span/span/span")
	 * private WebElement total;
	 * 
	 */

	
	/*
	 * Integer unitprice; 
	 * Integer quantity = 2;
	 */

	/*
	 * public void getUnitPrice() {
	 * 
	 * unitprice = Integer.valueOf(unit.getText().substring(1));
	 * 
	 * 
	 * 
	 * }
	 */

	/*
	 * public void updateQuantity() {
	 * 
	 * qty.clear(); //qty.sendKeys(String.valueOf(quantity)); JavascriptExecutor
	 * javascript = (JavascriptExecutor) driver; javascript.
	 * executeScript("document.getElementById('cart-1808321-qty').value = '2'"); }
	 * 
	 * public void clickOnUpdate() { updatecart.click(); }
	 * 
	 * public boolean checkTotal() { if (quantity * unitprice ==
	 * Integer.valueOf(total.getText().substring(1))) return false; return true;
	 * 
	 * }
	 */

}
