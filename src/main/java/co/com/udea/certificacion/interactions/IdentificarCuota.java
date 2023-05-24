package co.com.udea.certificacion.interactions;

import co.com.udea.certificacion.userinterfaces.PaginaResultado;
import net.serenitybdd.screenplay.Actor;

public class IdentificarCuota {

    public static boolean identificar (Actor actor){
        boolean elementosVisibles = PaginaResultado.BOTON_SOLICITAR_CREDITO.isVisibleFor(actor);
        return elementosVisibles;
    }


}
