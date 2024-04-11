package co.com.certificacion.automatizacionpragma.tasks;

import co.com.certificacion.automatizacionpragma.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.automatizacionpragma.userinterface.PaginaAgregarMonitorAcarrito.*;
import static co.com.certificacion.automatizacionpragma.userinterface.PaginaAgregarPortatilAcarrito.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AgregarMonitorACarrito implements Task {

public static AgregarMonitorACarrito enDemoBlaze(){return instrumented(AgregarMonitorACarrito.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(BOTON_MONITORES, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BOTON_MONITORES),
            WaitUntil.the(MONITOR_APPLE24, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(MONITOR_APPLE24),
            WaitUntil.the(BOTON_AGREGARMONITORACARRITO, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BOTON_AGREGARMONITORACARRITO),
            Esperar.unTiempo(2000)
    );


    }
}
