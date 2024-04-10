package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginWithDataStepDefinition {
	
	WebDriver driver;
	
	@Given("User is on Login page of TestAutomation Online")
	public void user_is_on_login_page_of_TestAutomation_Online() {
		
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	    
	}
	@When("the user should be able to enter the Valid Username : {string} and Password : {string}")
	public void the_user_should_be_able_to_enter_the_valid_username_and_password(String UN, String PW) {
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys(UN);
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys(PW);
	    
	}
	@When("clicks on the submit button")
	public void clicks_on_the_submit_button() {
		
		WebElement login_btn = driver.findElement(By.id("submit"));
		login_btn.click();
	    
	}
	@Then("user should be able to view the home page once after loggedin.")
	public void user_should_be_able_to_view_the_home_page_once_after_loggedin() {
		
		boolean homepage = driver.findElement(By.partialLinkText("HOME")).isDisplayed();
		Assert.assertTrue(homepage);
		driver.quit();
	    
	}

}
