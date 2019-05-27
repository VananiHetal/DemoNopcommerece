package Practice2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resources\\Features",tags = "@login",format = {"pretty","html:target/cucumber-reports"})

public class RunTest {}

