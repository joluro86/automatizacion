package co.com.udea.certificacion.tasks;

import co.com.udea.certificacion.userinterfaces.PaginaCaracteristicas;
import co.com.udea.certificacion.userinterfaces.PaginaCreditos;
import co.com.udea.certificacion.userinterfaces.PaginaSabesCuantoDineroNecesitas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.Keys;

public class Simular implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(PaginaCreditos.BOTON_SIMULAR),
                Click.on(PaginaCaracteristicas.BOTON_CONTINUAR),
                Click.on(PaginaSabesCuantoDineroNecesitas.RADIO_SI),
                Hit.the(Keys.TAB).into(PaginaSabesCuantoDineroNecesitas.RADIO_SI));
    }

    public static Simular clic() {
        return new Simular();
    }
}
