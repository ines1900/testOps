package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/TalanJenkins.feature", 
		glue= {"StepsDef"},
		strict=true,                   
		monochrome=true,
		plugin = {"pretty","html:target/HtmlReports","json:target/ines.json" }
		)

public class Tests_Runner {

}

