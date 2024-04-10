package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookslearn {
	
	//Before Annotation order to be given in Ascending order, and After Annotation to be given in descending order
	
	@Before (order = 1)
	public void BeforeSnapping() {
		
		System.out.println("Thanos Collecting the Infinity stones");
	}
	
	@After(order = 1)
	public void AfterSnapping() {
		System.out.println("After killing everyone, taking rest on Garden");
		
	}
	
	@Before(order = 0)
	public void BeforebeforeStatement() {
		
		System.out.println("Thanos has to be born");
	}
	
	@After(order = 0)
	public void AfterafterStatement() {
		System.out.println("Thanos also dies");
		
	}

}
