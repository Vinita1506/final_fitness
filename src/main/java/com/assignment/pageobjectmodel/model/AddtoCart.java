package com.assignment.pageobjectmodel.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart extends PageObject {

	public AddtoCart(WebDriver driver) {
		super(driver);

	}

	// clicking on first product
	@FindBy(xpath = "//li[19]//div[1]//a[1]//img[1]")
	private WebElement bluetooth;

	// select the color option
	@FindBy(xpath = "//select[@name='super_attribute[92]")
	private WebElement color;

	// click on add to cart
	@FindBy(id = "product-addtocart-button")
	private WebElement cart;
	// select the second product
	@FindBy(xpath = "//li[21]//div[1]//a[1]//img[1]")
	private WebElement sensor;
	// click on add to cart
	@FindBy(css = "#product-addtocart-button")
	private WebElement add;

	
	//selecting first product
	public void clickOnBuletooth() {

		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", bluetooth);

	}

	// selecting the first available color from the select-box
	public void clickOncolor() {

		Select dropdown = new Select(driver.findElement(By.id("attribute92")));
		dropdown.selectByIndex(1);
	}

	// selecting second product
	public void clickOnCart() {
		cart.click();
	}
	
	//navigate back to products page 
	public void navigate() {
		navigate();
	}
	
	//selecting second product
	public void clickOnSensor() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", sensor);
	}
	
	//click on add to cart
	public void clickOnAdd() {
		add.click();
	}

}
