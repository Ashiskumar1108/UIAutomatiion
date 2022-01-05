package com.uiAssignment.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uiAssignment.pageObjects.LandingPage;

public class LandingPageTest extends BaseClass
{
	@Test
	public void landingPageTest() {
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getWelcomeMessage(),"Welcome to the Simple Travel Agency!","welcome message is not correct");

	}
	
	
}
