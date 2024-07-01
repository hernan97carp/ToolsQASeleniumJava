package elements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import base.Base;
import elementsPage.TextBoxPage;
import com.github.javafaker.Faker;
import static org.junit.Assert.assertEquals;

public class TextBoxTest {

    private WebDriver driver;
    private TextBoxPage textBoxPage;
    private Base base;

    @Before
    public void setUp() throws Exception {
    	base = new Base(driver); 
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

    @After
    public void tearDown() throws Exception {
        base.closeBrowser();
    }
}