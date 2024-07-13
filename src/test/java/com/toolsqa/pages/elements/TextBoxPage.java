package com.toolsqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.toolsqa.base.BaseClass;

public class TextBoxPage extends BaseClass {

    By fullNameLocator = By.id("userName");
    By emailLocator = By.id("userEmail");
    By currentAddressLocator = By.id("currentAddress");
    By permanentAddressLocator = By.id("permanentAddress");
    By submitButtonLocator = By.id("submit");
    By nameConfirmation = By.xpath("//div[@id='output']//p[@id='name']");
    By emailConfirmation = By.xpath("//div[@id='output']//p[@id='email']");
    By currentAddressConfirmation = By.xpath("//div[@id='output']//p[@id='currentAddress']");
    By permanentAddressConfirmation = By.xpath("//div[@id='output']//p[@id='permanentAddress']");

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public void fillTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress) {
        type(fullNameLocator, fullName);
        type(emailLocator, email);
        type(currentAddressLocator, currentAddress);
        type(permanentAddressLocator, permanentAddress);
        click(submitButtonLocator);
    }

    public String getNameConfirmation() {
        return getText(nameConfirmation);
    }

    public String getEmailConfirmation() {
        return getText(emailConfirmation);
    }

    public String getCurrentAddressConfirmation() {
        return getText(currentAddressConfirmation);
    }

    public String getPermanentAddressConfirmation() {
        return getText(permanentAddressConfirmation);
    }
}