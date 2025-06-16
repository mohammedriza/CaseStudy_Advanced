package org.example.cucumber.steps.hooks;

import io.cucumber.java.Before;
import org.example.cucumber.webDriver.WebDriverInit;
import org.example.model.CommonUtils;

public class CucumberHooks extends WebDriverInit {
    @Before
    public void beforeSuite() {
        CommonUtils.appUrl = "https://www.saucedemo.com/";
    }


}
