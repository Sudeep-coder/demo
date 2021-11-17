package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;



public class stepDefinition {


	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	      System.out.println("navigated yo login page");
	    }

	    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	      System.out.println(strArg1); 
	      System.out.println(strArg2); 
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       System.out.println("home page displayed");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	      System.out.println(strArg1);
	    }

	}


