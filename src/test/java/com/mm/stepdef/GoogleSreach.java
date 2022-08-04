package com.mm.stepdef;

import com.mm.common.GoogleSearchBase;
import com.mm.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSreach extends GoogleSearchBase {
	
	HomePage hp;
	
	/* there are 8 locators
	 * 1. id	2. name		3. class	4. html tag		5. link text
	 * 6. partial linktext	7. css		8.xpath*/
	
	/*	Finding relative xpath: //html tag[@attribute='value']
	 * 	Absolute xpath -> / (location dependent--locate it by location)
	 * 	Relative xpath -> // (location independent--locateit by attributes/properties)
	 * 	Always use relative xpath, never use absolute xpath*/

	@Given("I am on Google homepage")
	public void i_am_on_google_homepage() {

		launchBrowser();

	}

	@When("I enter the technical single {string}")
	public void i_enter_the_technical_single(String string) {

		hp = new HomePage(driver);
		hp.enterSearch(string);

	}

	@When("I enter Google search button")
	public void i_enter_google_search_button() {
		hp.clickSearch();
		// searchButton = driver.findElement(By.name("btnK"));
		// searchButton.click();
	}

	@Then("I see relevant results")
	public void i_see_relevant_results() {
		hp.captureResult();
		
		closeBrowser();

		//WebElement results = driver.findElement(By.id("result-stats"));

		//String displayResults = results.getText();
		//System.out.println("********************************************************");
		//System.out.println(displayResults);
		//System.out.println("********************************************************");

		// String title;
		// title = driver.getTitle();
		// System.out.println(title);
		// driver.close(); //closes active browser
		// driver.quit(); //closes all browser

	}
	
	


}
