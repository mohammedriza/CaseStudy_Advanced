package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"org.example.cucumber.steps"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        tags = "@Functional",
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Test Runner
}
