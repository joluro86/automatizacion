package co.com.udea.certificacion.interactions;

import co.com.udea.certificacion.userinterfaces.PaginaSabesCuantoDineroNecesitas;
import net.serenitybdd.core.time.SystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Clock;

import static co.com.udea.certificacion.userinterfaces.PaginaSabesCuantoDineroNecesitas.*;

public class LlenarFormulario {

    public static void complete(Actor actor, String monto, String plazo, String fechaNacimiento) {
        actor.attemptsTo(
                Enter.theValue(monto).into(PaginaSabesCuantoDineroNecesitas.TEXTO_MONTO),
                Enter.theValue(plazo).into(PaginaSabesCuantoDineroNecesitas.TEXTO_PLAZO),
                Click.on(PaginaSabesCuantoDineroNecesitas.TEXTO_FECHA_NACIMIENTO));

        esperarSegundos(2);
        actor.attemptsTo(
                Click.on(SELECCION_ANIO.of(obtenerValorFecha(fechaNacimiento, 3))));

        esperarSegundos(2);
        actor.attemptsTo(
                Click.on(SELECCION_MES.of(obtenerValorFecha(fechaNacimiento, 2))));

        esperarSegundos(2);
        actor.attemptsTo(
                Click.on(SELECCION_DIA.of(obtenerValorFecha(fechaNacimiento, 1))),
                Click.on(PaginaSabesCuantoDineroNecesitas.BOTON_SIMULAR)
        );
    }

    //Método que separa los valores de año, mes y día de la fecha ingresada en la prueba
    public static String obtenerValorFecha(String fecha, int opcion) {
        String[] partes = fecha.split("/");
        if (partes.length == 3) {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anio = Integer.parseInt(partes[2]);

            switch (opcion) {
                case 1:
                    return String.valueOf(dia);
                case 2:
                    return obtenerNombreMes(String.valueOf(mes));
                case 3:
                    return String.valueOf(anio);
                default:
                    throw new IllegalArgumentException("Opción inválida. Debe ser 1, 2 o 3.");
            }
        } else {
            throw new IllegalArgumentException("Formato de fecha incorrecto. Se esperaba dd/mm/yyyy");
        }
    }

    //Método que obtiene los nombres de los meses en la abreviación presentada en la página
    public static String obtenerNombreMes(String mes) {
        String nombreMes;
        switch (mes.toLowerCase()) {
            case "1":
            case "enero":
                nombreMes = "ENE";
                break;
            case "2":
            case "febrero":
                nombreMes = "FEB";
                break;
            case "3":
            case "marzo":
                nombreMes = "MAR";
                break;
            case "4":
            case "abril":
                nombreMes = "ABR";
                break;
            case "5":
            case "mayo":
                nombreMes = "MAY";
                break;
            case "6":
            case "junio":
                nombreMes = "JUN";
                break;
            case "7":
            case "julio":
                nombreMes = "JUL";
                break;
            case "8":
            case "agosto":
                nombreMes = "AGO";
                break;
            case "9":
            case "septiembre":
                nombreMes = "SEPT";
                break;
            case "10":
            case "octubre":
                nombreMes = "OCT";
                break;
            case "11":
            case "noviembre":
                nombreMes = "NOV";
                break;
            case "12":
            case "diciembre":
                nombreMes = "DIC";
                break;
            default:
                throw new IllegalArgumentException("Mes inválido. Debe ser un número del 1 al 12 o el nombre del mes en español.");
        }

        return nombreMes;
    }

    public static void esperarSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
