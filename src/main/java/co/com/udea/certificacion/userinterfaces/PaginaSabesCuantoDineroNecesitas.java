package co.com.udea.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSabesCuantoDineroNecesitas {
    public static final Target RADIO_SI = Target.the("Radio Button SI").located(By.xpath("//label[@for='opcion-si-input']"));
    public static final Target TEXTO_MONTO = Target.the("Texto valor a solicitar").located(By.xpath("//*[@id='valor-simulacion']"));
    public static final Target TEXTO_PLAZO = Target.the("Texto Plazo en meses").located(By.xpath("//*[@id='valor-plazo']"));
    public static final Target TEXTO_FECHA_NACIMIENTO = Target.the("Texto fecha de nacimiento").located(By.xpath("//*[@id='campo-fecha']"));
    public static final Target SELECCION_ANIO = Target.the("ANIO de nacimiento").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target SELECCION_MES = Target.the("MES de nacimiento").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target SELECCION_DIA = Target.the("DIA de nacimiento").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target BOTON_SIMULAR = Target.the("Boton simular").located(By.id("boton-simular"));
}
