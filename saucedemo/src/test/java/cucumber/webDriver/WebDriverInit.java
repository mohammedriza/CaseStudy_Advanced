package cucumber.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


public class WebDriverInit {
    private static WebDriver driver;

    protected WebDriver webDriver() {
        if(driver == null) {
            ChromeOptions options = new ChromeOptions();

            // Chrome options to disable Chrome popup for password change or Insecure password
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("profile.password_manager_leak_detection", false);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--password-store=basic");

            driver = new ChromeDriver(options);
        }
        return driver;
    }

}
