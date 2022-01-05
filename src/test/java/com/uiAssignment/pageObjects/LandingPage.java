package com.uiAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {

	WebDriver ldriver;
	
	public LandingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="fromPort")
	@CacheLookup
	WebElement departureCity;
	
	@FindBy(name="toPort")
	@CacheLookup
	WebElement destinationCity;

	@FindBy(xpath="//input[@type='submit' and @value='Find Flights']")
	@CacheLookup
	WebElement findFlightsButton;

	@FindBy(xpath = "//h1[contains(text(),'Welcome to the Simple Travel Agency!')]")
	WebElement welcomeMessage;
	
	public void selectDepartureCity(String departureCityName){
		Select departCity = new Select(departureCity);
		departCity.selectByVisibleText(departureCityName);
	}

	public void selectDestinationCity(String destinationCityName){
		Select destCity = new Select(destinationCity);
		destCity.selectByVisibleText(destinationCityName);
	}

	public HomePage clickFindFlights(){
		findFlightsButton.click();
		return new HomePage(ldriver);
	}

	public String getWelcomeMessage(){
		return welcomeMessage.getText();
	}
	
	
	
}









