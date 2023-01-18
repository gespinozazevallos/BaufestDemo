package Com.bdd.Demo.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"Com.bdd.Demo.Web.StepDefinition"},
        tags = {"@Test1"},
        snippets = SnippetType.CAMELCASE
)
public class Runner {
}
