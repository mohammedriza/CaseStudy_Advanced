package org.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.cucumber.pages.LoginPage;
import org.example.model.CommonUtils;

public class LoginSteps extends LoginPage {

    private final CommonUtils commonUtils;

    public LoginSteps() {
        commonUtils = new CommonUtils();
    }

    @Given("I goto SauceDemo application")
    public void iGotoSauceDemoApplication() {
        super.gotoApplication();
    }

    @When("I login to the application using the app credentials")
    public void iLoginToTheApplicationUsingTheAppCredentials() {
        super.loginToSauceDemoApplication(commonUtils.appUsername, commonUtils.appPassword);
    }
}
