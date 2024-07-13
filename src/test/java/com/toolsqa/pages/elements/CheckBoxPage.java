package com.toolsqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.toolsqa.base.BaseClass;

public class CheckBoxPage extends BaseClass{
	By expandButton = By.xpath("//button[@title='Expand all']");
	By allToggleCollapse = By.className("rct-collapse");
	By collapseButton = By.xpath("//button[@title='Collapse all']");
	By resultText = By.xpath("//*[@id='result']");
	public CheckBoxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void expand() {
		click(expandButton);
	}
	public Boolean CheckExpandSelect() {
		return isDisplayed(expandButton);
		
	}
	
	

}
