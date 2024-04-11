package co.com.certificacion.automatizacionpragma.tasks;

import co.com.certificacion.automatizacionpragma.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.Random;

import static co.com.certificacion.automatizacionpragma.userinterface.PaginaDeRegistro.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class CrearUsuarioYClave implements Task {

    private final String usuario;
    private final String clave;

    public CrearUsuarioYClave(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    public static CrearUsuarioYClave enDemoBlaze(String usuario, String clave){
        return instrumented(CrearUsuarioYClave.class, usuario, clave);
    }



    Random numAleatorio = new Random();
    int numero = numAleatorio.nextInt(75-2+1) + 3;


    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        WaitUntil.the(BOTON_INSCRIBIRSE, isClickable()).forNoMoreThan(20).seconds(),
        Click.on(BOTON_INSCRIBIRSE),
        WaitUntil.the(CAMPO_NOMBREDEUSUARIO, isClickable()).forNoMoreThan(20).seconds(),
        Enter.theValue(usuario + numero).into(CAMPO_NOMBREDEUSUARIO),
        WaitUntil.the(CAMPO_CLAVE, isClickable()).forNoMoreThan(20).seconds(),
        Enter.theValue(clave + numero).into(CAMPO_CLAVE),
        WaitUntil.the(BOTON_FINALIZARINSCRIPCION, isClickable()).forNoMoreThan(20).seconds(),
        Click.on(BOTON_FINALIZARINSCRIPCION),
        Esperar.unTiempo(2000)




);



    }
}
