package co.com.certificacion.automatizacionpragma.tasks;

import co.com.certificacion.automatizacionpragma.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.automatizacionpragma.userinterface.PaginaAgregarTelefonoAcarrito.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AgregarTelefonoACarrito implements Task {

public static AgregarTelefonoACarrito enDemoBlaze(){return instrumented(AgregarTelefonoACarrito.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(BOTON_TELEFONOS, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BOTON_TELEFONOS),
            WaitUntil.the(TELEFONO_SONYZ5, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(TELEFONO_SONYZ5),
            WaitUntil.the(BOTON_AGREGARTELEFONOACARRITO, isClickable()).forNoMoreThan(20).seconds(),
            Click.on(BOTON_AGREGARTELEFONOACARRITO),
            Esperar.unTiempo(2000)
    );


    }
}
