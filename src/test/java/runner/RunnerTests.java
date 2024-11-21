package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@sanity",
        features = {"src/test/resources/features/"},
        glue = {"definations"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true
)
public class RunnerTests extends AbstractTestNGCucumberTests {


}
