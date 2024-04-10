package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTablewithExampleDef {
	
	WebDriver driver;
	
	@Given("Login page in demo site")
	public void login_page_in_demo_site() {
	  
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@When("Enter valid {string} and {string}")
	public void enter_valid_and(String UN, String PW) {
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys(UN);
		WebElement Password = driver.findElement(By.id("password")); 
		Password.sendKeys(PW);
	    
	}
	@When("click on the submit button")
	public void click_on_the_submit_button() {
		
		WebElement login_btn = driver.findElement(By.id("submit"));
		login_btn.click();
		driver.quit();
	   

	}
}
