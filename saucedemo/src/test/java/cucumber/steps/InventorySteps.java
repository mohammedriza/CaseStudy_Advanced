package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import cucumber.pages.InventoryPage;
import model.CommonUtils;
import org.testng.annotations.Listeners;

@Listeners
public class InventorySteps extends InventoryPage {
    private final CommonUtils commonUtils;

    public InventorySteps () {
        commonUtils = new CommonUtils();
    }

    @Then("I verify the application url contains {string}")
    public void iVerifyTheApplicationUrlContains(String url) {
        commonUtils.assertAppUrlContains(url);
        commonUtils.takeScreenshot();
    }

    @Then("I add product {string} to shopping cart")
    public void iAddProductToShoppingCart(String productDescription) {
        super.addInventoryItem(productDescription);
        commonUtils.takeScreenshot();
    }

    @And("I click on Shopping cart icon to goto checkout page")
    public void iClickOnShoppingCartIconToGotoCheckoutPage() {
        super.clickOnShoppingCartIcon();
        commonUtils.takeScreenshot();
    }


}
