package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/featureFile",
        glue = "com.ui.stepDefinations",
        tags = "@login",
        plugin = {"pretty",
                "html:target/test-output/reports.html"}
)

public class TestCucumberRunner extends AbstractTestNGCucumberTests {

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
