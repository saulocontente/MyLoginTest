package scontente.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/scontente/features/Login.feature",
    glue = "scontente.features.steps_definition",
    plugin = {"pretty","html:target/report-html"},
    snippets = SnippetType.CAMELCASE
)
public class RunnerTest {

}