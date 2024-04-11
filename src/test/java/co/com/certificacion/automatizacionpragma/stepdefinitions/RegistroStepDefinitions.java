package co.com.certificacion.automatizacionpragma.stepdefinitions;

import co.com.certificacion.automatizacionpragma.interactions.AbrirNavegador;
import co.com.certificacion.automatizacionpragma.tasks.CrearUsuarioYClave;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @Dado("^que darwin quiere abrir la pagina$")
    public void queDarwinQuiereAbrirLaPagina() {theActorInTheSpotlight().attemptsTo(AbrirNavegador.enLaPagina());

    }

    @Entonces("^se registra con usuario (.*) y clave (.*) exitosamente$")
    public void seRegistraExitosamente(String usuario, String clave)
    {theActorInTheSpotlight().attemptsTo(CrearUsuarioYClave.enDemoBlaze(usuario,clave));

    }
}
