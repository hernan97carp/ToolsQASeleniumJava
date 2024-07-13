package com.toolsqa.test.gui.elements;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.toolsqa.base.BaseClass;
import com.toolsqa.pages.elements.CheckBoxPage;
public class CheckBoxTest {

    private static WebDriver driver;
    private static CheckBoxPage checkBoxPage;
    private static BaseClass base;

    @Before
   public void setUp() throws Exception {
        base = new BaseClass(driver);
        driver = base.chromeDriveConnection();
        base.maximize();
        base.openUrl("https://demoqa.com/checkbox");
        checkBoxPage = new CheckBoxPage(driver);
    
    }

    @Test
    public void testCheckBox () {
    	checkBoxPage.expand();
    	checkBoxPage.CheckExpandSelect();
    	
    }
  
    @After
    public void tearDown() throws Exception {
        //base.closeBrowser();
    }

   
}
