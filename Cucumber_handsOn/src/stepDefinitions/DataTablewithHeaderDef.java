package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataTablewithHeaderDef {
	
	WebDriver driver;
	
	@Given("You are on Login page of TestAutomation Online")
	public void you_are_on_login_page_of_test_automation_online() {
		
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	    
	}
	@When("You should be able to enter the Valid Username and Password")
	public void you_should_be_able_to_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String, String>>  credentials = dataTable.asMaps(String.class, String.class);
		
		String UN = credentials.get(0).get("username");
		String PW = credentials.get(0).get("password");
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys(UN);
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys(PW);
	    
	}
	@When("click on the Login button")
	public void click_on_the_login_button() {
		
		WebElement login_btn = driver.findElement(By.id("submit"));
		login_btn.click();
	}
	

}
