package co.com.udea.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(   features = "src/test/resources/features/simulacion_credito.feature",
        glue = "co.com.udea.certificacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class SimulacionCredito {
}
