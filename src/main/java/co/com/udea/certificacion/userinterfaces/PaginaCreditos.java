package co.com.udea.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCreditos {
    public static final Target BOTON_SIMULAR = Target.the("Botón Simular").located(By.xpath("//*[@id='creditos']/div/div[1]/div[4]/div/div[2]/div/a[1]"));
}
