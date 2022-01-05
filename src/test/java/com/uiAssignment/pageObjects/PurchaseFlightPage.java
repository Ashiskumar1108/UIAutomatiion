package com.uiAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PurchaseFlightPage {

    WebDriver ldriver;
    public PurchaseFlightPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@class='container']/h2")
    WebElement reservationHeader;

    @FindBy(xpath = "//*[@class='container']/p")
    public List<WebElement> flightDetails;

    @FindBy(id ="inputName")
    WebElement name;

    @FindBy(id="address")
    WebElement address;

    @FindBy(id ="city")
    WebElement city;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "zipCode")
    WebElement zipCode;

    @FindBy(id ="cardType")
    WebElement cardType;

    @FindBy(id = "creditCardNumber")
    WebElement creditCardNumber;

    @FindBy(id = "creditCardMonth")
    WebElement creditCardExpiryMonth;

    @FindBy(id = "creditCardYear")
    WebElement creditCardExpiryYear;

    @FindBy(id = "nameOnCard")
    WebElement nameOnTheCard;

    @FindBy(xpath ="//input[@class='btn btn-primary' and @type='submit']")
    WebElement purchaseFlightButton;

    public String getReservationHeader(){
        return reservationHeader.getText();
    }

    public List<String> getFlightDetails(){
        List<String> fltDetails = new ArrayList<String>();
        for (int i =0 ; i<flightDetails.size(); i++){
            fltDetails.add(flightDetails.get(i).getText());
        }
        return fltDetails;
    }

    public void selectCardType(String ccCardType){
        Select creditCardType = new Select(cardType);
        creditCardType.selectByVisibleText(ccCardType);
    }

    public void setName(String personName) {
       name.sendKeys(personName);
    }

    public void setAddress(String personAddress) {
        address.sendKeys(personAddress);
    }

    public void setCity(String personCity) {
        city.sendKeys(personCity);
    }

    public void setState(String personState) {
        state.sendKeys(personState);
    }

    public void setZipCode(String personZipCode) {
        zipCode.sendKeys(personZipCode);
    }

    public void setCreditCardNumber(String personCreditCardNumber) {
        creditCardNumber.sendKeys(personCreditCardNumber);
    }

    public void setCreditCardExpiryMonth(String personCreditCardExpiryMonth) {
        creditCardExpiryMonth.sendKeys(personCreditCardExpiryMonth);
    }

    public void setCreditCardExpiryYear(String personCreditCardExpiryYear) {
        creditCardExpiryYear.sendKeys(personCreditCardExpiryYear);
    }

    public void setNameOnTheCard(String personNameOnTheCard) {
        nameOnTheCard.sendKeys(personNameOnTheCard);
    }

    public ConfirmationPage clickOnPurchaseFlightButton(){
        purchaseFlightButton.click();
        return new ConfirmationPage(ldriver);
    }
}
