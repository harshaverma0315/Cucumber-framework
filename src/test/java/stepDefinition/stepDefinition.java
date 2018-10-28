package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^user is on banking landing page$")
    public void user_is_on_banking_landing_page() throws Throwable {
        System.out.println("user is on banking landing page");
    
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String name, String pass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(name);
    	System.out.println(pass);
    }
        
    

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	System.out.println("Homepage is populated");
       
    }

    @Then("^Credit details are \"([^\"]*)\"$")
    public void credit_details_are(String val) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       	System.out.println(val);
    }

}