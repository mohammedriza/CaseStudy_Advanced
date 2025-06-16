package org.example.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.cucumber.pages.InventoryPage;
import org.example.model.CommonUtils;

public class InventorySteps extends InventoryPage {
    private final CommonUtils commonUtils;

    public InventorySteps () {
        commonUtils = new CommonUtils();
    }

    @Then("I verify the application url contains {string}")
    public void iVerifyTheApplicationUrlContains(String url) {
        commonUtils.assertAppUrlContains(url);
    }

    @Then("I add product {string} to shopping cart")
    public void iAddProductToShoppingCart(String productDescription) {
        super.addInventoryItem(productDescription);
    }

    @And("I click on Shopping cart icon to goto checkout page")
    public void iClickOnShoppingCartIconToGotoCheckoutPage() {
        super.clickCheckoutButton();
    }
}
