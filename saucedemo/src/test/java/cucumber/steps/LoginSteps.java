package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.pages.LoginPage;
import model.CommonUtils;

public class LoginSteps extends LoginPage {

    private final CommonUtils commonUtils;

    public LoginSteps() {
        commonUtils = new CommonUtils();
    }

    @Given("I goto SauceDemo application")
    public void iGotoSauceDemoApplication() {
        super.gotoApplication();
    }

    @When("I login to the application using the credentials {string} and {string}")
    public void iLoginToTheApplicationUsingTheAppCredentials(String username, String password) {
        super.loginToSauceDemoApplication(username, password);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        commonUtils.closeDriver();
        commonUtils.quitDriver();
    }
}
