package cucumber;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = { "classpath:features" }, glue = {
"stepDefinitions" },tags="@test_case_1", monochrome = true, dryRun = false, plugin = { "pretty", "html:target/cucumber.html",
		"json:target/cucumber.json" })

public class CucumberRunnerTest extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
}
