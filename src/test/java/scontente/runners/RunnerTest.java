package scontente.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.openqa.selenium.WebDriver;
import scontente.core.DriverFactory;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/scontente/features/Login.feature",
    glue = "scontente.features.steps_definition",
    plugin = {"pretty","html:target/report-html"},
    snippets = SnippetType.CAMELCASE
)
public class RunnerTest {

}