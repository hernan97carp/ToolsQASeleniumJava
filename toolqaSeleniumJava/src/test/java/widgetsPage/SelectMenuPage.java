package widgetsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class SelectMenuPage extends Base {
	
	By selectValue = By.xpath("//div[@id='withOptGroup']");
	By option00 = By.xpath("//div[@id='react-select-2-option-0-0']");
	By singleValue = By.xpath("//div[contains(@class,'-singleValue')]");
	By selectOne = By.xpath("//div[@id='selectOne']");
	By option2 = By.xpath("//div[@id='react-select-3-option-0-2']");
	By oldSelectMenu = By.xpath("//select[@id='oldSelectMenu']");
	public SelectMenuPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
   public void selectValueClick() {
	  click(selectValue);
   }

   
   public void selectValueOp0() {
	   click(option00);
   }
   
   public String verifySelectedOption(String expectedOption) {
       try {
           // Espera explícita para el elemento
           WebDriverWait wait = new WebDriverWait(driver, 10); // Espera hasta 10 segundos
           WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(singleValue));

           // Obtener el texto del elemento
           String text = element.getAttribute("innerText");

           if (text.equals(expectedOption)) {
               return text;
           } else {
               return "Selected option does not match expected option. Selected: " + text;
           }
       } catch (Exception e) {
           return "Error: " + e.getMessage();
       }
   }


}
