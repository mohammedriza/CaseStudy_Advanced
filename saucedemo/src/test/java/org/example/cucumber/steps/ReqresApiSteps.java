package org.example.cucumber.steps;

import io.cucumber.java.en.Given;
import org.example.cucumber.pages.RegresApiPage;

public class ReqresApiSteps extends RegresApiPage {
    @Given("I call the reqres API invalid credentials and validate the response code is {string} and error message is {string}")
    public void iCallTheReqresAPIInvalidCredentialsAndValidateTheResponseCodeIsResponseCodeAndErrorMessageIs(String responseCode, String errorMessage) {
        super.validateReqresApiSuccessPath(responseCode, errorMessage);
    }

    @Given("I call the reqres API with missing API key and validate the response code is {string} and error message is {string}")
    public void iCallTheReqresAPIWithMissingAPIKeyAndValidateTheResponseCodeIsResponseCodeAndErrorMessageIs(String responseCode, String errorMessage) {
        super.validateReqresApiWithMissingApiKey(responseCode, errorMessage);
    }

    @Given("I call the reqres API with invalid API key and validate the response code is {string} and error message is {string}")
    public void iCallTheReqresAPIWithInvalidAPIKeyAndValidateTheResponseCodeIsResponseCodeAndErrorMessageIs(String responseCode, String errorMessage) {
        super.validateReqresApiWithInvalidApiKey(responseCode, errorMessage);
    }
}
