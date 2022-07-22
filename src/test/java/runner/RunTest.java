package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
		
		features="src/test/resources/BUSINESSLOGIC",
		tags="@SmokeTest",
		glue="cucumbermap",
		plugin="pretty",
		monochrome=true
		
		)

public class RunTest {

}
