package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "FeatureFiles/Taggedhook.feature", glue = {"stepDefinitions", "hooks"}, monochrome = true, tags = "@TaggedHooks")
					//plugin = {"html:report/WebReport.html", "json:report/jsonReport.json"})
public class RunnerClass {

	//runner class with combine or map the feature class with step definition
	//dry run is used to check whether all the step definitions are available in def file before execution and it dosent execute the file
}
	