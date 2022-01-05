package com.uiAssignment.testCases;

import com.uiAssignment.pageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uiAssignment.pageObjects.LandingPage;

public class HomePageTest extends BaseClass
{

	@Test
	public void flightReserveTest(){
		LandingPage lp=new LandingPage(driver);
		lp.selectDepartureCity(deptCity);
		lp.selectDestinationCity(destCity);
		HomePage homePage = lp.clickFindFlights();
		Assert.assertEquals(homePage.getFlightTableHeaderText(),"Flights from "+deptCity+" to "+destCity+":","Reservation page header is not correct");
		Assert.assertEquals(homePage.getColumnOptionsName().get(0),"Choose");
		Assert.assertEquals(homePage.getColumnOptionsName().get(1),"Flight #");
		Assert.assertEquals(homePage.getColumnOptionsName().get(2),"Airline");
		Assert.assertEquals(homePage.getColumnOptionsName().get(3),"Departs: " + deptCity);
		Assert.assertEquals(homePage.getColumnOptionsName().get(4),"Arrives: " + destCity);
		Assert.assertEquals(homePage.getColumnOptionsName().get(5),"Price");
		Assert.assertTrue(homePage.numberOfFlightDisplayed() >= 1,"No Flight Found!");
	}

	
}
