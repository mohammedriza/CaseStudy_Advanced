package org.example.cucumber.pages;

import org.example.cucumber.webDriver.WebDriverInit;
import org.example.model.CommonUtils;
import org.openqa.selenium.By;

public class LoginPage extends WebDriverInit {
    private final By txtLogin = By.id("user-name");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.id("login-button");

    private final CommonUtils commonUtils;

    public LoginPage () {
        commonUtils = new CommonUtils();
    }

    public void gotoApplication() {
        commonUtils.gotoUrl(commonUtils.appUrl);
        commonUtils.waitFor(2);
    }

    public void loginToSauceDemoApplication(String username, String password) {
        commonUtils.maximizeWindow();

        commonUtils.sendKeys(txtLogin, username);
        commonUtils.sendKeys(txtPassword, password);

        commonUtils.click(btnLogin);
        commonUtils.waitFor(2);
        System.out.println("Login successful...");
    }




}
