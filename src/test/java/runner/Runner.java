package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue = {"stepdefinitions"},
plugin = {"pretty","html:target/Html_Report/html-report.html","json:target/JSON_Report/json-report.json","junit:target/Junit_Report/junit-report.xml"},
monochrome =true,
tags = "@tag"
		)

public class Runner {

}
