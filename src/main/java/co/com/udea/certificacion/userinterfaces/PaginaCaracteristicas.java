package co.com.udea.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCaracteristicas {
    private PaginaCaracteristicas() {
        throw new IllegalStateException("Utility class");
    }
    public static final Target BOTON_CONTINUAR = Target.the("Botón Continuar").located(By.id("boton-seleccion-tarjeta"));
}
