package com.uiAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

    WebDriver ldriver;

    public ConfirmationPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Thank you for your purchase today!')]")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//*[@class='table']/tbody/tr/td[1]")
    public WebElement confirmationIDField;

    @FindBy(xpath = "//*[@class='table']/tbody/tr/td[2]")
    public WebElement confirmationIDValue;

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }

    public String getConfirmationIDField() {
        return confirmationIDField.getText();
    }

    public String getConfirmationIDValue() {
        return confirmationIDValue.getText();
    }
}
