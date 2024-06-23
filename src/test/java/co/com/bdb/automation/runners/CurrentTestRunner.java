package co.com.bdb.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {  "pretty", "rerun:target/rerun.txt", "json:target/destination/cucumber.json"},
        features = {"classpath:features"},
        glue = {"co.com.bdb.automation.stepdefinitions"},
        tags = " @Login ",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CurrentTestRunner {
}
