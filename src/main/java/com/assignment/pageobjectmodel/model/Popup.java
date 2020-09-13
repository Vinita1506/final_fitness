package com.assignment.pageobjectmodel.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.NoAlertPresentException;

public class Popup extends PageObject {

	public Popup(WebDriver driver) {
		super(driver);

	}
	
	//select remove button in slidebar
	/*
	 * @FindBy(xpath = "//*[@id=\"mini-cart\"]/li[1]/div/div/div[3]/div/a") private
	 * WebElement remove;
	 * 
	 //locate webelement OK button in popup window
	 * @FindBy(xpath = "//button[@class='action-primary action-accept']") private
	 * WebElement popup;
	 */
	
	//locate view and edit cart button
	@FindBy(xpath = "//span[contains(text(),'View and Edit Cart')]")
	private WebElement view;

	//locate remove button for second product
	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody[2]/tr[2]/td/div/a/span")
	private WebElement remove1;

	/*
	 * public void clickOnRemove() {
	 * 
	 * for (int i = 0; i<1; i++) { try {
	 * driver.findElement(By.xpath("//span[contains(text(),'Remove')]")).click();
	 * break; } catch (Exception e) { System.out.println(e.getMessage()); } } }
	 * 
	 * public void clickOnpopup() { JavascriptExecutor javascript =
	 * (JavascriptExecutor) driver;
	 * javascript.executeScript("arguments[0].click();", popup); // popup.click();
	 * Alert popup1 = driver.switchTo().alert(); popup1.accept(); popup1.getText();
	 * 
	 * }
	 */

	public void clickOnView() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", view);

	}

	public void clickonremove() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", remove1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
