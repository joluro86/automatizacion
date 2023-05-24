package co.com.udea.certificacion.tasks;

import co.com.udea.certificacion.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

public class SaberMas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(PaginaPrincipal.BOTON_CERRAR),
                Click.on(PaginaPrincipal.BOTON_SABER_MAS));
    }

    public static SaberMas clic() {
        return new SaberMas();
    }
}
