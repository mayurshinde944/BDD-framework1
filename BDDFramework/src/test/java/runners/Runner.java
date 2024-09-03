package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"}, 
		glue = {"stepDefinations","Utilities"},
		tags="",
		dryRun =false,
		monochrome = true,
		plugin= {"pretty","html:target/HTMLReports.html","json:target/JSON/cucumber.json",
				"junit:target/cucumber-report/Cucumber.xml","rerun:target/rerun.txt"}
		)

public class Runner {

}
