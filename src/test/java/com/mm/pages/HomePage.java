package com.mm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Page Object Model -- page factory
	
	//identifying a web element
	
	@FindBy(name="q")
	WebElement searchBox;
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	//searchButton = driver.findElement(By.name("btnK"));
	//searchButton.click();
	
	public void clickSearch(){
		searchButton.submit();
		
		
	}
	@FindBy(id="result-stats")
	WebElement searchResult;
	
	public void captureResult() {
		String displayResults = searchResult.getText();
		System.out.println("********************************************************");
		System.out.println(displayResults);
		System.out.println("********************************************************");
		
	}
	
	@FindBy(name = "btnI")
	WebElement luckyButton;
	
	public void clickLucky() {
		luckyButton.submit();
	}

}
