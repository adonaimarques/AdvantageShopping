package test.runners;

import org.junit.runner.RunWith;

import core.utils.setup.JunitCustomTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:features",
		glue = "test",
		tags = "@login",
		plugin = {"pretty", "html:target/relatorio.html"},
		monochrome = true,
		dryRun = false
		)

public class WebRunner {
	
	
}
