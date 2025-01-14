package co.com.certificacion.automatizacionpragma.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


import static co.com.certificacion.automatizacionpragma.utils.Urls.URL_RETO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {

public static AbrirNavegador enLaPagina(){return instrumented(AbrirNavegador.class);

}
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(URL_RETO.toString()));

    }
}
