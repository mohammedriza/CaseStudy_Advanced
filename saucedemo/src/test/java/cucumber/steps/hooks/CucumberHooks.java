package cucumber.steps.hooks;

import io.cucumber.java.AfterAll;
import cucumber.webDriver.WebDriverInit;
import io.cucumber.java.BeforeAll;
import model.CommonUtils;

public class CucumberHooks extends WebDriverInit {

    @BeforeAll
    public static void before_all() {
        CommonUtils.appUrl = "https://www.saucedemo.com/";
    }

    @AfterAll
    public static void after_all() {
        System.out.println("************ Sauce Demo Test Completed ************");
    }


}
