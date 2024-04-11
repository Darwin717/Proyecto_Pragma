package co.com.certificacion.automatizacionpragma.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonsStepDefinitions {
@Managed
    static WebDriver myDriver;
@Before
    public static void setup(){
    OnStage.setTheStage(Cast.ofStandardActors());
    theActorCalled("darwin").can(BrowseTheWeb.with(myDriver));
}
}