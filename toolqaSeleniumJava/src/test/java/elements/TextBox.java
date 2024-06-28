package elements;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	private WebDriver driver;

	@Before
	public void SetUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");

	}


	@Test
	public void testTexBoxForm() {
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		WebElement submitButton = driver.findElement(By.id("submit"));

		fullName.click();
		fullName.sendKeys("Hernan Tester");

		email.click();
		email.sendKeys("testingqahernan@gmail.com");

		currentAddress.click();
		currentAddress.sendKeys("Chicago Estados Unidos");

		permanentAddress.click();
		permanentAddress.sendKeys("Texas Estados Unidos");

		submitButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement nameConfirmation = driver.findElement(By.xpath("//div[@id='output']//p[@id='name']"));
		WebElement emailConfirmation = driver.findElement(By.xpath("//div[@id='output']//p[@id='email']"));
		WebElement currentAddressConfirmation = driver.findElement(By.xpath("//div[@id='output']//p[@id='currentAddress']"));
		WebElement permanentAddressConfirmation = driver.findElement(By.xpath("//div[@id='output']//p[@id='permanentAddress']"));

		Assert.assertEquals(fullName,nameConfirmation);
		Assert.assertEquals(fullName,emailConfirmation);
		Assert.assertEquals(fullName,currentAddressConfirmation);
		Assert.assertEquals(fullName,permanentAddressConfirmation);

	}
	
	@After
	public void TearDown() throws Exception {
		if(driver != null) {
			driver.quit();
		}
		
	}
	

}
