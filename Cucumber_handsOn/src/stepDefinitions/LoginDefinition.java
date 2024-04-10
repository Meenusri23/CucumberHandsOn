package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginDefinition {

	WebDriver driver;


	@Given("User is on the Login page of Orange HRM")
	public void user_is_on_the_login_page_of_TestAutomation_Website() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@When("the user enters the Valid Username and Password")
	public void the_user_enters_the_valid_username_and_password() {
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("student");
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys("Password123");	
	}
	
	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		WebElement login_btn = driver.findElement(By.id("submit"));
		login_btn.click();
		
	}
	
	@Then("user should be able to sucessfully view the home page")
	public void user_should_be_able_to_sucessfully_view_the_home_page() {
		
		boolean homepage = driver.findElement(By.partialLinkText("HOME")).isDisplayed();
		Assert.assertTrue(homepage);
		driver.quit();
	}

}
