package widgetsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
		selectMenuPage.verifySelectedOption("Group 1, option 1");

	}

	@After
	public void tearDown() throws Exception {
		// base.closeBrowser();
	}
}
