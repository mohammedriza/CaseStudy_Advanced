package org.example.cucumber.pages;

import org.example.cucumber.webDriver.WebDriverInit;
import org.example.model.CommonUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutPage extends WebDriverInit {

    private By txtFirstName = By.id("first-name");
    private By txtLastName = By.id("last-name");
    private By txtZipCode = By.id("postal-code");
    private By btnCheckout = By.id("checkout");
    private By btnContinue = By.id("continue");
    private By btnFinish = By.id("finish");
    private By lblCheckoutMessage = By.xpath("//h2[@data-test='complete-header']");

    private final CommonUtils commonUtils;

    public CheckoutPage() {
        commonUtils = new CommonUtils();
    }

    public void enterCheckoutInformation(String firstName, String lastName, String zipCode) {
        commonUtils.sendKeys(txtFirstName, firstName);
        commonUtils.sendKeys(txtLastName, lastName);
        commonUtils.sendKeys(txtZipCode, zipCode);
        commonUtils.click(btnContinue);
        commonUtils.waitFor(3);
    }

    public void clickCheckoutButton() {
        commonUtils.click(btnCheckout);
    }

    public void clickContinueButton() {
        commonUtils.click(btnContinue);
    }

    public void clickFinishButton() {
        commonUtils.click(btnFinish);
    }

    public void assertCheckoutMessage(String checkoutMsg) {
        String actualMsg = commonUtils.findElement(lblCheckoutMessage).getText();
        Assert.assertEquals(checkoutMsg, actualMsg);
    }


}
