package co.com.certificacion.automatizacionpragma.stepdefinitions;

import co.com.certificacion.automatizacionpragma.interactions.AbrirNavegador;
import co.com.certificacion.automatizacionpragma.tasks.IniciarSesionConUsuarioInexistente;
import co.com.certificacion.automatizacionpragma.tasks.IniciarSesionExitosamente;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioDeSesionUsuarioInexistenteStepDefinitions {
    @Dado("^que darwin quiere iniciar sesion con usuario inexistente$")
    public void queDarwinQuiereIniciarSesionConUsuarioInexistente() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.enLaPagina());

    }

    @Entonces("^ingresa usuario (.*) y clave (.*)$")
    public void ingresaUsuarioCamiloYClave(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IniciarSesionConUsuarioInexistente.enDemoBlaze(usuario, clave));

    }

}
