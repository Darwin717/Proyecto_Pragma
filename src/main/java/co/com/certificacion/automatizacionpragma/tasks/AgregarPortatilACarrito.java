package co.com.certificacion.automatizacionpragma.tasks;

import co.com.certificacion.automatizacionpragma.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.automatizacionpragma.userinterface.PaginaAgregarPortatilAcarrito.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AgregarPortatilACarrito implements Task {

public static AgregarPortatilACarrito enDemoBlaze(){return instrumented(AgregarPortatilACarrito.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(BOTON_PORTATILES, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BOTON_PORTATILES),
            WaitUntil.the(PORTATIL_MACBOOK_AIR, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(PORTATIL_MACBOOK_AIR),
            WaitUntil.the(BOTON_AGREGARPORTATILACARRITO, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BOTON_AGREGARPORTATILACARRITO),
            Esperar.unTiempo(2000)
    );


    }
}
