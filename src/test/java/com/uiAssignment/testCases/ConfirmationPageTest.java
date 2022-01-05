package com.uiAssignment.testCases;

import com.uiAssignment.pageObjects.ConfirmationPage;
import com.uiAssignment.pageObjects.HomePage;
import com.uiAssignment.pageObjects.LandingPage;
import com.uiAssignment.pageObjects.PurchaseFlightPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfirmationPageTest extends BaseClass{

    @Test
    public void confirmFlightTest(){
        logger.info("URL is opened");
        LandingPage lp = new LandingPage(driver);
        lp.selectDepartureCity(deptCity);
        lp.selectDestinationCity(destCity);
        HomePage homePage = lp.clickFindFlights();
        PurchaseFlightPage purchaseFlightPage = homePage.selectBestFlight(0);
        purchaseFlightPage.setName(passengerName);
        purchaseFlightPage.setAddress(passengerAddress);
        purchaseFlightPage.setCity(cityName);
        purchaseFlightPage.setState(stateName);
        purchaseFlightPage.setZipCode(passengerzipCode);
        purchaseFlightPage.selectCardType(creditCardType);
        purchaseFlightPage.setCreditCardNumber(creditCardNum);
        purchaseFlightPage.setCreditCardExpiryMonth(creditCardExpiryMonth);
        purchaseFlightPage.setCreditCardExpiryYear(creditCardExpiryYr);
        purchaseFlightPage.setNameOnTheCard(nameOnTheCC);
        ConfirmationPage confirmationPage = purchaseFlightPage.clickOnPurchaseFlightButton();
        Assert.assertEquals(confirmationPage.getConfirmationMessage(),"Thank you for your purchase today!");
        Assert.assertEquals(confirmationPage.getConfirmationIDField(),"Id");
        Assert.assertTrue(confirmationPage.confirmationIDValue.isDisplayed());
    }

}
