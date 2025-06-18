package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import cucumber.pages.RegresApiPage;

public class ReqresApiSteps extends RegresApiPage {
    @Given("I call the reqres login API with credentials {string} and {string} and {string}")
    public void iCallTheReqresLoginAPIWithCredentialsAndAnd(String email, String password, String apiKey) {
        RegresApiPage.email = email;
        RegresApiPage.password = password;
        RegresApiPage.apiKey = apiKey;
    }

    @Then("I verify the response code is {string} and error message is {string}")
    public void iVerifyTheResponseCodeIsAndErrorMessageIs(String responseCode, String errorMessage) {
        super.callReqresApiAndValidateResponse(responseCode, errorMessage);
    }
}
