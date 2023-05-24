package co.com.udea.certificacion.questions;

import co.com.udea.certificacion.interactions.IdentificarCuota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCuota implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return IdentificarCuota.identificar(actor);
    }

    public static ValidarCuota validar() {
        return new ValidarCuota();
    }
}
