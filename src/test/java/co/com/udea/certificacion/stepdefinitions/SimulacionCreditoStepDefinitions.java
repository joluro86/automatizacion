package co.com.udea.certificacion.stepdefinitions;

import co.com.udea.certificacion.questions.ValidarCuota;
import co.com.udea.certificacion.tasks.DiligenciarDatos;
import co.com.udea.certificacion.tasks.SaberMas;
import co.com.udea.certificacion.tasks.Simular;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SimulacionCreditoStepDefinitions {
    @Before
    public void doBefore() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("ingreso al sitio web {string}")
    public void ingresoAlSitioWeb(String url) {
        theActorCalled("Cliente").wasAbleTo(Open.url(url));
    }

    @When("doy clic en la opcion saber mas en el bloque creditos")
    public void doyClicEnLaOpcionSaberMasEnElBloqueCreditos() {
        OnStage.theActorInTheSpotlight().attemptsTo(SaberMas.clic());
    }

    @And("selecciono la opcion simular en el apartado credito libre inversion bancolombia")
    public void seleccionoLaOpcionSimularEnElApartadoCreditoLibreInversionBancolombia() {
        OnStage.theActorInTheSpotlight().attemptsTo(Simular.clic());
    }

    @And("diligencio el monto con {string}, el plazo con {string} y la fecha de nacimiento {string}")
    public void diligencioElMontoConElPlazoConYLaFechaDeNacimientoCon(String monto, String plazo, String fechaNacimiento) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarDatos.complete(monto, plazo, fechaNacimiento));
    }

    @Then("el sistema calculara y mostrara la cuota mensual que debo pagar")
    public void elSistemaCalcularaYMostraraLaCuotaMensualQueDeboPagar() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidarCuota.validar(), Matchers.is(true)));
    }
}
