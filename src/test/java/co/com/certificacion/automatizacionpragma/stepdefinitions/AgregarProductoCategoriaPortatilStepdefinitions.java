package co.com.certificacion.automatizacionpragma.stepdefinitions;


import co.com.certificacion.automatizacionpragma.tasks.AgregarPortatilACarrito;

import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AgregarProductoCategoriaPortatilStepdefinitions {
    @Y("^esta en la pagina principal agrega un producto de la categoria portatiles$")
    public void estaEnLaPaginaPrincipalAgregaUnProductoDeLaCategoriaPortatiles() {

        theActorInTheSpotlight().attemptsTo(AgregarPortatilACarrito.enDemoBlaze());

    }
}
