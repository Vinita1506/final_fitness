package com.assignment.pageobjectmodel.tests;

import org.testng.annotations.Test;

import com.assignment.pageobjectmodel.model.Popup;

public class PopupTest extends BaseTest {
	
	@Test
	public void popup() {
		Popup popup = new Popup(WEB_DRIVER);
		
		//popup.clickOnRemove();
		//popup.clickOnpopup();
		popup.clickOnView();
		
		popup.clickonremove();
		 		
	}

}
