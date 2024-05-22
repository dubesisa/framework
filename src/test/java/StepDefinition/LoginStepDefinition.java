package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import Pages.LoginPage;

public class LoginStepDefinition {
    public WebDriver driver;
    private LoginPage LoginPage;

    public LoginStepDefinition(WebDriver driver){
        this.driver=driver;
        LoginPage= new LoginPage(driver);
    }
    @Given("User Enter Credentials")
    public void userEnterCredentials(){
        LoginPage.EnterCredentials("student","Password123 ");

    }
    @When("User Clicks on Loginbutton")
    public void userclicksSubbmitbutton(){
        LoginPage.ClickSubmitButton();
    }@Then("User logged in successfully")
    public void userLoggeninSuccessful(){

    }

}
