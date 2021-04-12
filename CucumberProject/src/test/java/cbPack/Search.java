package cbPack;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	@Given("^I visit the website as guest user$")
	public void I_visit_the_website_as_guest_user()
	{
		System.out.println(">> Given - I visit the website as guest user");
	}
	
	@When("^I select the books option from the dropdown$")
	public void I_select_the_books_option_from_the_dropdown()
	{
		System.out.println(">> When - I select the books option from the dropdown");
	}
	
	@And("^I clicked on search icon$")
	public void I_clicked_on_search_icon()
	{
		System.out.println(">> And - I clicked on search icon");
	}
	
	@Then("^I should see the books page loaded$")
	public void I_should_see_the_books_page_loaded()
	{
		System.out.println(">> Then - I should see the books page loaded");
	}

	@And("^I should see Books At Amazone as heading$")
	public void I_should_see_Books_At_Amazone_as_heading()
	{
		System.out.println(">> And - I should see Books At Amazone as heading");
	}
	
	@But("^I should not see other categories products$")
	public void I_should_not_see_other_categories_products()
	{
		System.out.println(">> But - I should not see other categories products");
	}
	
	@When("^I select baby option from the drop down$")
	public void I_select_baby_option_from_the_drop_down()
	{
		System.out.println(">> When - I select baby option from the drop down");
	}
	
	@Then("^I should see the baby page loaded$")
	public void I_should_see_the_baby_page_loaded()
	{
		System.out.println(">> Then - I should see the baby page loaded ");
	}
	
	@And("^I should see Offers on Baby products as heading$")
	public void I_should_see_Offers_on_Baby_products_as_heading()
	{
		System.out.println(">> And - I should see Offers on Baby products as heading");
	}
	
}
