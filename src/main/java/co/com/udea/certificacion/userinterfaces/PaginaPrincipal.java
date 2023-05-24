package co.com.udea.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static final Target BOTON_CERRAR = Target.the("Botón cerrar").located(By.xpath("//*[@id='closeModalBtn']/span"));
    public static final Target BOTON_SABER_MAS = Target.the("Botón Saber más").located(By.xpath("//a[@href='/personas/creditos/consumo']"));
}
