package com.uiAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

	WebDriver ldriver;
	public List<String> columnName = new ArrayList<String>();
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//h3[contains(text(),'Flights from')]")
	@CacheLookup
	WebElement FlightFromAndToHeading;

	@FindBy(how = How.XPATH, using = "//table[@class='table']/thead/tr/th")
	@CacheLookup
	public List<WebElement> columnHeader;

	@FindBy(how = How.XPATH, using = "//table[@class='table']/tbody/tr/td/input")
	@CacheLookup
	public List<WebElement> flightOptions;

	@FindBy(how = How.XPATH, using = "//input[@value='Choose This Flight']")
	public List<WebElement> chooseThisFlightButton;

	public String getFlightTableHeaderText(){
		return FlightFromAndToHeading.getText();
	}

	public List<String> getColumnOptionsName(){
		for(int i=0;i<columnHeader.size();i++){
			columnName.add(columnHeader.get(i).getText());
		}
		return columnName;
	}

	public int numberOfFlightDisplayed(){
		return flightOptions.size();
	}

	public PurchaseFlightPage selectBestFlight(int index){
		chooseThisFlightButton.get(index).click();
		return new PurchaseFlightPage(ldriver);
	}
	

	
	
	
}
