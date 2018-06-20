package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:/Users/84128/eclipse-workspace/automation/src/test/resources/Feature/automation.feature/" }, glue = {
				"stepDefinition" }, plugin = { "pretty", "html:target/cucumber-reports" },

		tags = { "@qiaoqiao" }

)

public class AutoRunner {

}