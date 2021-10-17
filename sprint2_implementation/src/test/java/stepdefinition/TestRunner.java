package stepdefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/APGORE/eclipse-workspace/sprint2_implementation/src/test/resources/Features/Register_Ebay.feature",
glue= {"stepdefinition"}, plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"}
,publish=true)

public class TestRunner {

	
}
