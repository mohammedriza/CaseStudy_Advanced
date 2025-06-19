package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"cucumber.steps"},
        plugin = {"pretty", "html:target/testng-report.html", "json:target/testng.json"},
        monochrome = true)
public class TestRunner_TestNg extends AbstractTestNGCucumberTests {
    // THIS CLASS IS CONFIGURED IN TESTNG.XML TO TRIGGER THE TESTS
}
