package CucumberPractice.stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import CucumberPractice.CucumberPractice.SampleTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImpl  extends SampleTest {
	
	@Given("I landed on Ecommerce Page")
	public void  I_landed_on_Ecommerce_Page() throws IOException
	{
		
		setup();
		
		System.out.println("launch application and land on Ecommerce page");
		
		System.out.println("Git push pull check");
		
		System.out.println("Git commiting check");
	}
	
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password)
	{
		System.out.println("login to the applicaition with " + username +" and " + password);
		googleSearch();
	
	}
	
	
	@When("^I add product (.+) to Cart$")
	public void i_add_product_to_cart(String productName) throws InterruptedException
	{
		System.out.println("I add the product " + productName+" to the cart");
		
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void checkout_submit_order(String productName)
	{
		
		System.out.println("The product " + productName +" is checked out and the order is submitted");
	}
	
	@Then("{string} message is displayed on ConfirmationPage")
	public void message_displayed_confirmationPage(String string)
	{
		driverQuit();
		System.out.println(string + " is displayed in the confirmation is page");
	}	

}
