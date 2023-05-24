package co.com.udea.certificacion.tasks;

import co.com.udea.certificacion.interactions.LlenarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DiligenciarDatos implements Task {

    private String monto;
    private String plazo;
    private String fechaNacimiento;

    public DiligenciarDatos(String monto, String plazo, String fechaNacimiento){
        this.monto = monto;
        this.plazo = plazo;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LlenarFormulario.complete(actor, monto, plazo, fechaNacimiento);
    }

    public static DiligenciarDatos complete(String monto, String plazo, String fechaNacimiento){
        return Tasks.instrumented(DiligenciarDatos.class, monto, plazo, fechaNacimiento);
    }
}
