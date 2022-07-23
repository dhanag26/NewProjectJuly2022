package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
                (
                	features="src/test/resources/BUSINESSLOGIC",
                	tags="@SmokeTest",
                	monochrome=true,
                	plugin="pretty",
                	
                	glue="cucumbermap"
                	
                		
                	
                		)

public class RunTest {

}
