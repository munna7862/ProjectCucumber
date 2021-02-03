package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCucumber {
	
	@Given("I want to write a given statement")
	public void i_want_to_write_a_given_statement() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I want to write a given statement");
	}

	@Given("some other and Statements")
	public void some_other_and_statements() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("some other and Statements");
	    
	}

	@When("I complete the when statement")
	public void i_complete_the_when_statement() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I complete the when statement");
	}

	@Then("I validate the then statement")
	public void i_validate_the_then_statement() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I validate the then statement");
	}

	
}
