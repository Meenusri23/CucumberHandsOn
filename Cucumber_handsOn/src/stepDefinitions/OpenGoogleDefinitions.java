package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("user is entering Google.com url in search box")
	public void user_is_entering_google_com_url_in_search_box() {
	    
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	}
	@When("user is entering the search term {string}")
	public void user_is_entering_the_search_term(String SearchTerm) {
	 WebElement SearchText =  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	 SearchText.sendKeys(SearchTerm);
	    
	}
	@When("presses the Enter key")
	public void presses_the_enter_key() {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.RETURN);
	    
	}
	@Then("the user should be able to see search results")
	public void the_user_should_be_able_to_see_search_results() {
	 boolean status =  driver.findElement(By.partialLinkText("trichy")).isDisplayed();
	 if(status) {
		 System.out.println("Results Displayed!!");
	 }
	 driver.quit();
	    
	}


}
