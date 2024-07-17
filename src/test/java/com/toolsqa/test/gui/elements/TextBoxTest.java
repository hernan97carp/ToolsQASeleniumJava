package com.toolsqa.test.gui.elements;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import com.toolsqa.base.BaseClass;
import com.toolsqa.base.BaseTest;
import com.toolsqa.pages.elements.TextBoxPage;

import static org.junit.Assert.assertEquals;

public class TextBoxTest extends BaseTest  {

    private WebDriver driver;
    private TextBoxPage textBoxPage;
    private BaseClass base;

    @Before
    public void setUp() throws Exception {
    	base = new BaseClass(driver); 
        driver = base.chromeDriveConnection(); 
        base.maximize(); 
        base.openUrl("https://demoqa.com/text-box");
        textBoxPage = new TextBoxPage(driver);
    }

    @Test
    public void testTextBoxForm() {
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String currentAddress = faker.address().fullAddress();
        String permanentAddress = faker.address().fullAddress();

        textBoxPage.fillTextBoxForm(fullName, email, currentAddress, permanentAddress);

        assertEquals("Name:" + fullName, textBoxPage.getNameConfirmation());
        assertEquals("Email:" + email, textBoxPage.getEmailConfirmation());
        assertEquals("Current Address :" + currentAddress, textBoxPage.getCurrentAddressConfirmation());
        assertEquals("Permananet Address :" + permanentAddress, textBoxPage.getPermanentAddressConfirmation());
    }

}