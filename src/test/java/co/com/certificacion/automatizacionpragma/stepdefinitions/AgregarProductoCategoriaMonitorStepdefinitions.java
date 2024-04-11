package co.com.certificacion.automatizacionpragma.stepdefinitions;


import co.com.certificacion.automatizacionpragma.tasks.AgregarMonitorACarrito;

import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AgregarProductoCategoriaMonitorStepdefinitions {

    @Y("^esta en la pagina principal agrega un producto de la categoria monitores$")
    public void estaEnLaPaginaPrincipalAgregaUnProductoDeLaCategoriaMonitores() {

        theActorInTheSpotlight().attemptsTo(AgregarMonitorACarrito.enDemoBlaze());

    }
}
