package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.pages.LoginPage;
import model.CommonUtils;
import org.testng.annotations.Listeners;

@Listeners
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
        commonUtils.takeScreenshot();
        super.loginToSauceDemoApplication(username, password);
        commonUtils.takeScreenshot();
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        commonUtils.takeScreenshot();
        commonUtils.closeDriver();
        commonUtils.quitDriver();
    }
}
