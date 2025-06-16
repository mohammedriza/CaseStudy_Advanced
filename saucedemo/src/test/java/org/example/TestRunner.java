package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"org.example.cucumber.steps"},
        plugin = "pretty",
        monochrome = true)
public class TestRunner {
    // Test Runner
}
