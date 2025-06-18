package cucumber.steps.hooks;

import io.cucumber.java.Before;
import cucumber.webDriver.WebDriverInit;
import model.CommonUtils;

public class CucumberHooks extends WebDriverInit {
    @Before
    public void beforeSuite() {
        CommonUtils.appUrl = "https://www.saucedemo.com/";
    }


}
