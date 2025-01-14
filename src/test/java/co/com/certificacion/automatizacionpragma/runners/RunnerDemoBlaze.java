package co.com.certificacion.automatizacionpragma.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demoblaze.feature",
        glue = "co.com.certificacion.automatizacionpragma.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)

public class RunnerDemoBlaze {
}
