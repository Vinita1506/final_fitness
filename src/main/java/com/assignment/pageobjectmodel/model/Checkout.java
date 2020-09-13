package com.assignment.pageobjectmodel.model;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends PageObject {

	public Checkout(WebDriver driver) {
		super(driver);

	}

	//locate proceed to checkout button
	@FindBy(xpath = "//span[.='Proceed to Checkout']")
	private WebElement proceed;

	//locate place order button
	@FindBy(xpath = "//*[@id=\"checkout\"]/div[4]/div[3]/div/div/div[5]/div/div/button")
	private WebElement place;

	//locate shipping details button
	@FindBy(xpath = "//div[@class='checkout-shipping-method']//div[@class='step-content amcheckout-content']")
	private WebElement express;

	//locate email sec
	@FindBy(id = "customer-email")
	private WebElement email;

	//locate first name 
	@FindBy(xpath = "//div[@name='shippingAddress.firstname']//input[@name='firstname']")
	private WebElement fname;

	//locate last name
	@FindBy(xpath = "//div[@name='shippingAddress.lastname']//input[@name='lastname']")
	private WebElement lname;

	//locate street sec
	@FindBy(name = "street[0]")
	private WebElement street;

	//locate city
	@FindBy(xpath = "//div[@name='shippingAddress.city']//input[@name='city']")
	private WebElement city;

	//locate zipcode
	@FindBy(xpath = "//div[@name='shippingAddress.postcode']//input[@name='postcode']")
	private WebElement zip;

	//locate phone 
	@FindBy(xpath = "//div[@name='shippingAddress.telephone']//input[@name='telephone']")
	private WebElement phone;

	//locate credit card radio option
	@FindBy(xpath = "//div[@class='payment-method payment-method-amasty_stripe _active']//div[@class='payment-method-title field choice']")
	private WebElement credit;

	//locate credit card number
	@FindBy(xpath = "//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")
	private WebElement card;

	//locate expiry month
	@FindBy(xpath = "//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input")
	private WebElement month;

	//locate cvc number
	@FindBy(xpath = "//*[@id=\"root\"]/form/div/div[2]/span[3]/span/span/input")
	private WebElement cvc;

	//locate place order button
	@FindBy(xpath = "//*[@id=\"checkout\"]/div[4]/div[3]/div/div/div[5]/div/div/button")
	private WebElement place1;

	public void clickOnPlaceorder() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", place);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickOnExpress() {

		driver.findElement(By.xpath("//input[@name='ko_unique_2']")).click();

	}

	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);

	}

	public void setFname(String fname) {
		this.fname.clear();
		this.fname.sendKeys(fname);
	}

	public void setLname(String lname) {
		this.lname.clear();
		this.lname.sendKeys(lname);
	}

	public void setStreet(String street) {
		this.street.clear();
		this.street.sendKeys(street);
	}

	public void setCity(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}

	public void setZip(String zip) {
		this.zip.clear();
		this.zip.sendKeys(zip);
	}

	public void setPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	public void clickOnCreditcard() {

		driver.findElement(By.xpath("//input[@id='amasty_stripe']']")).click();

	}

	public void setCard(String card) {
		String cardNum = "4111111111111111";
		WebElement inputField = driver.findElement(By.className("cardnumber"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[1].value = arguments[0];", cardNum, inputField);

	}

	public void setMonth(String month) {

		// JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// jsExecutor.executeScript(findElementByclassName('exp-date')).value = month");

		this.card.clear();
		this.card.sendKeys(month);

	}

	public void setCvc(String cvc) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("document.getElementByclassName('cvc')).value = cvc");

		// this.cvc.clear();
		// this.cvc.sendKeys(cvc);
	}

	public void clickOnProceed() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", proceed);

	}

	public void clickOnPlaceorder1() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", place1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
