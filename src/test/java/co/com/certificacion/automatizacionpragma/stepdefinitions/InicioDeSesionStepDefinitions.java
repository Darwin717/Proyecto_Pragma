package co.com.certificacion.automatizacionpragma.stepdefinitions;

import co.com.certificacion.automatizacionpragma.interactions.AbrirNavegador;
import co.com.certificacion.automatizacionpragma.questions.InicioDeSesionExitoso;
import co.com.certificacion.automatizacionpragma.tasks.IniciarSesionExitosamente;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioDeSesionStepDefinitions {

    @Dado("^que darwin quiere iniciar sesion en la pagina de demoblaze$")
    public void queDarwinQuiereIniciarSesionEnLaPaginaDeDemoblaze() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.enLaPagina());
    }

    @Cuando("^ingresa un usuario (.*) y una clave (.*) existentes$")
    public void ingresaUnUsuarioDarwinYUnaClaveExistentes(String usuario, String clave) {
theActorInTheSpotlight().attemptsTo(IniciarSesionExitosamente.enDemoBlaze(usuario, clave));
    }

    @Entonces("^el sistema debe habilitar el boton de (.*)$")
    public void elSistemaDebeHabilitarElBotonDeBienvenido(String demoblaze) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(InicioDeSesionExitoso.toThe(demoblaze)));
    }

}
