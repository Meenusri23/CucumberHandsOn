package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookDef {
	
	@Given("This is First Step")
	public void this_is_first_step() {
		
		System.out.println("This is First Step");
	    
	}
	@When("This is Second Step")
	public void this_is_second_step() {
		
		System.out.println("This is Second Step");
	    
	}
	@Then("This is Third Step")
	public void this_is_third_step() {
		
		System.out.println("This is Third Step");
	    
	}

}
