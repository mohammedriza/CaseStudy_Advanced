package cucumber.pages;

import cucumber.webDriver.WebDriverInit;
import model.CommonUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutPage extends WebDriverInit {

    private By txtFirstName = By.id("first-name");
    private By txtLastName = By.id("last-name");
    private By txtZipCode = By.id("postal-code");
    private By btnCheckout = By.id("checkout");
    private By btnContinue = By.id("continue");
    private By btnFinish = By.id("finish");
    private By lblCheckoutMessage = By.xpath("//h2[@data-test='complete-header']");
    private By missingInfoError = By.xpath("//h3[@data-test='error']");

    private final CommonUtils commonUtils;

    public CheckoutPage() {
        commonUtils = new CommonUtils();
    }

    public void enterCheckoutInformation(String firstName, String lastName, String zipCode) {
        commonUtils.sendKeys(txtFirstName, firstName);
        commonUtils.sendKeys(txtLastName, lastName);
        commonUtils.sendKeys(txtZipCode, zipCode);
        commonUtils.waitFor(3);
    }

    public void clickCheckoutButton() {
        commonUtils.click(btnCheckout);
        commonUtils.waitFor(3);
    }

    public void clickContinueButton() {
        commonUtils.click(btnContinue);
        commonUtils.waitFor(3);
    }

    public void clickFinishButton() {
        commonUtils.click(btnFinish);
        commonUtils.waitFor(3);
    }

    public void assertCheckoutMessage(String checkoutMsg) {
        String actualMsg = commonUtils.findElement(lblCheckoutMessage).getText();
        Assert.assertEquals(checkoutMsg, actualMsg);
    }

    public void validateCheckMissingInfoError(String errorMsg) {
        String actualError = commonUtils.findElement(missingInfoError).getText();
        Assert.assertEquals(errorMsg, actualError);
        System.out.println("Error message validate : " + actualError);
    }


}
