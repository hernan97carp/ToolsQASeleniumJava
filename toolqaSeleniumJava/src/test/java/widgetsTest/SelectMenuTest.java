package widgetsTest;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import base.Base;
import widgetsPage.SelectMenuPage;

public class SelectMenuTest {

    private WebDriver driver;
    private SelectMenuPage selectMenuPage;
    private Base base;

    @Before
    public void setUp() throws Exception {
        base = new Base(driver);
        driver = base.chromeDriveConnection();
        base.maximize();
        base.openUrl("https://demoqa.com/select-menu");
        selectMenuPage = new SelectMenuPage(driver);
    }

    @Test
    public void testTextBoxForm() {
        selectMenuPage.selectValueClick();
        selectMenuPage.selectValueOp0();
        
        String expectedOption = "Group 1, option 1";
        String actualOption = selectMenuPage.verifySelectedOption(expectedOption);
        
        assertEquals("The selected option does not match the expected option.", expectedOption, actualOption);
    }

    @Test
    public void testSelectTitle() {
        selectMenuPage.selectTitle();
        selectMenuPage.selectTitleOp1();
    
        String expectedOption = "Mrs.";
        String actualOption = selectMenuPage.verifySelectedTitle(expectedOption);
        
        assertEquals("The selected title does not match the expected title.", expectedOption, actualOption);
    }

    @After
    public void tearDown() throws Exception {
        base.closeBrowser();
    }
}

