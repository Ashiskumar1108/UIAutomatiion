package com.uiAssignment.testCases;

import com.uiAssignment.pageObjects.HomePage;
import com.uiAssignment.pageObjects.PurchaseFlightPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.uiAssignment.pageObjects.LandingPage;

public class PurchaseFlightTest extends BaseClass {

	@Test
	public void purchaseFlightTest(){
		logger.info("URL is opened");
		LandingPage lp = new LandingPage(driver);
		lp.selectDepartureCity(deptCity);
		lp.selectDestinationCity(destCity);
		HomePage homePage = lp.clickFindFlights();
		PurchaseFlightPage purchaseFlightPage = homePage.selectBestFlight(0);
		Assert.assertEquals(purchaseFlightPage.getReservationHeader(),"Your flight from TLV to SFO has been reserved.");
		Assert.assertTrue(purchaseFlightPage.getFlightDetails().get(0).contains("Airline: United"));
		Assert.assertTrue(purchaseFlightPage.getFlightDetails().get(1).contains("Flight Number: UA954"));
		Assert.assertTrue(purchaseFlightPage.getFlightDetails().get(2).contains("Price: 400"));
		Assert.assertTrue(purchaseFlightPage.getFlightDetails().get(3).contains("Arbitrary Fees and Taxes: 514.76"));
		Assert.assertTrue(purchaseFlightPage.getFlightDetails().get(4).contains("Total Cost"));
		Assert.assertTrue(purchaseFlightPage.getFlightDetails().get(5).contains("Please submit the form below to purchase the flight."));
	}
}
