package com.mm.stepdef;

import com.mm.common.GoogleSearchBase;
import com.mm.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeelingLucky extends GoogleSearchBase{
	
	HomePage hp;
	
	@When("I enter search {string}")
	public void i_enter_search(String string) {
		hp = new HomePage(driver);
		hp.enterSearch(string);

	}
	
	@When("I click on the Feeling Lucky button")
	public void i_click_on_the_feeling_lucky_button() {
		
		hp.clickLucky();
	}

	@Then("I see relevant random result")
	public void i_see_relevant_random_result() {
	    hp.captureResult();
	    
	    closeBrowser();
	}

}
