package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import cucumber.pages.CheckoutPage;
import model.CommonUtils;

public class CheckoutSteps extends CheckoutPage {

    private final CommonUtils commonUtils;

    public CheckoutSteps() {
        commonUtils = new CommonUtils();
    }

    @And("I provide checkout information using {string}, {string}, and {string}")
    public void iProvideCheckoutInformationUsingAnd(String firstName, String lastName, String zipCode) {
        super.enterCheckoutInformation(firstName, lastName, zipCode);
    }

    @Then("I click on Checkout button")
    public void iClickOnCheckoutButton() {
        super.clickCheckoutButton();
    }

    @Then("I click on Continue button")
    public void iClickOnContinueButton() {
        super.clickContinueButton();
    }

    @Then("I click on Finish button")
    public void iClickOnFinishButton() {
        super.clickFinishButton();
    }

    @Then("I verify the checkout message is {string}")
    public void iVerifyTheCheckoutMessageIs(String checkoutMessage) {
        super.assertCheckoutMessage(checkoutMessage);
    }

    @Then("I verify the error message in checkout page is {string}")
    public void iVerifyTheErrorMessageInCheckoutPageIs(String checkoutWErrorMessage) {
        super.validateCheckMissingInfoError(checkoutWErrorMessage);
    }
}
