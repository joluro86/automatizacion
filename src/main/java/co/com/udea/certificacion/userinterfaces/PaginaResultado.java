package co.com.udea.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaResultado {
    public static final Target BOTON_SOLICITAR_CREDITO = Target.the("Botón solicitar credito").located(By.xpath("//*[@id='visa-solicita-tarjeta-compras']"));
}
