package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionDefinition {
	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer count) {
		
		System.out.println("Laptop count is : " +count);
	    
	}
	
	@Given("i have a {double} cgpa")
	public void i_have_a_cgpa(Double Cgpa) {
		
		System.out.println("Cgpa Got is : " +Cgpa);
	    
	}
	
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String Meenu, String Sri, String Ram) {
		
		System.out.println(Meenu + " is elder than "+ Sri + " and " +Ram);    
	}

}
