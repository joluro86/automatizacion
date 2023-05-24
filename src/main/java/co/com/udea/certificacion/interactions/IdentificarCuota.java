package co.com.udea.certificacion.interactions;

import co.com.udea.certificacion.userinterfaces.PaginaResultado;
import net.serenitybdd.screenplay.Actor;

public class IdentificarCuota {
    private IdentificarCuota() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean identificar (Actor actor){
        return PaginaResultado.BOTON_SOLICITAR_CREDITO.isVisibleFor(actor);
    }

}
