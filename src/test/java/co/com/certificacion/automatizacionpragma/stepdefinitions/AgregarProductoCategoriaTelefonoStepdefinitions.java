package co.com.certificacion.automatizacionpragma.stepdefinitions;


import co.com.certificacion.automatizacionpragma.tasks.AgregarTelefonoACarrito;
import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AgregarProductoCategoriaTelefonoStepdefinitions {
    @Y("^esta en la pagina principal agrega un producto de la categoria telefonos$")
    public void estaEnLaPaginaPrincipalAgregaUnProductoDeLaCategoriaTelefonos() {
        theActorInTheSpotlight().attemptsTo(AgregarTelefonoACarrito.enDemoBlaze());

    }
}
