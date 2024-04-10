package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksConceptDef {
	
	@Given("Thanos has infimity stones")
	public void thanos_has_infimity_stones() {
		
		System.out.println("Thanos has infinity stones");
	    
	}
	@When("Thanos snaps his finger")
	public void thanos_snaps_his_finger() {
		
		System.out.println("Thanos snaps his finger");
	    
	}
	@Then("half of the living being dies")
	public void half_of_the_living_being_dies() {
		
		System.out.println("Half of the living being died");
	    
	}


}
