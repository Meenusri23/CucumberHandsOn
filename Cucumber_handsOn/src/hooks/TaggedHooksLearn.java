package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooksLearn {
	

	@Before 
	public void BeforeScenario() {
		
		System.out.println("This will run Before Every Scenario");
	}
	
	@After
	public void AfterScenario() {
		System.out.println("This will run After Every Scenario");
		
	}
	

	@Before ("@First") 
	public void BeforeFirst() {
		System.out.println("This will run only Before First Scenario");
	}
	
	@After("@First") 
	public void AfterFirst() {
		System.out.println("This will run After First Scenario");
		
	}
	
	@Before("@Second") 
	public void BeforeSecond() {
		System.out.println("This will run only Before Second Scenario");
	}
	
	@After("@Second") 
	public void AfterSecond() {
		System.out.println("This will run After Second Scenario");
		
	}
	
	@Before("@Third")  
	public void BeforeThird() {
		System.out.println("This will run only Before Third Scenario");
	}
	
	@After("@Third") 
	public void AfterThird() {
		System.out.println("This will run After Third Scenario");
		
	}
	

}
