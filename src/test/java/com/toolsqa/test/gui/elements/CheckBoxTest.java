package com.toolsqa.test.gui.elements;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.toolsqa.base.BaseTest;
import com.toolsqa.base.BaseClass;
import com.toolsqa.pages.elements.CheckBoxPage;
import static org.junit.Assert.assertEquals;

public class CheckBoxTest extends BaseTest{

	private WebDriver driver;
    private CheckBoxPage checkBoxPage;
    private BaseClass base;

    @Before
    public void setUp() throws Exception {
        base = new BaseClass(driver);
        driver = base.initializeChromeDriver();
        base.openUrl("https://demoqa.com/checkbox");
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Test 
    public void testExpandAndCollapseAll() {
        checkBoxPage.expandAndCheck();
        assertEquals(17, checkBoxPage.elementslength());
        checkBoxPage.collapseAndCheck();
        assertEquals(1, checkBoxPage.elementslength());
    }

}
