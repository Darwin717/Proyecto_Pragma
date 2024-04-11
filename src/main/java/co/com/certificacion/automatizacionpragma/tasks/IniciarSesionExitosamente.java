package co.com.certificacion.automatizacionpragma.tasks;

import co.com.certificacion.automatizacionpragma.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.certificacion.automatizacionpragma.userinterface.PaginaDeInicioDeSesion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class IniciarSesionExitosamente implements Task {

    private String usuario;
    private String clave;

    public IniciarSesionExitosamente(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IniciarSesionExitosamente enDemoBlaze(String usuario, String clave){
        return instrumented(IniciarSesionExitosamente.class, usuario, clave);
    }





    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        WaitUntil.the(BOTON_ACCESO, isClickable()).forNoMoreThan(20).seconds(),
        Click.on(BOTON_ACCESO),
        WaitUntil.the(CAMPO_LOGINUSUARIO, isClickable()).forNoMoreThan(20).seconds(),
       Enter.theValue(usuario).into(CAMPO_LOGINUSUARIO),
       WaitUntil.the(CAMPO_LOGINCLAVE, isClickable()).forNoMoreThan(20).seconds(),
       Enter.theValue(clave).into(CAMPO_LOGINCLAVE),
       WaitUntil.the(BOTON_ACCESOALSISTEMA, isClickable()).forNoMoreThan(20).seconds(),
       Click.on(BOTON_ACCESOALSISTEMA),
      Esperar.unTiempo(4000)




);



    }
}
