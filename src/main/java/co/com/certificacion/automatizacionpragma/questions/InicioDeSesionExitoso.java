package co.com.certificacion.automatizacionpragma.questions;

import co.com.certificacion.automatizacionpragma.userinterface.PaginaDeInicioDeSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class InicioDeSesionExitoso implements Question<Boolean>{
    private final String demoblaze;

    public InicioDeSesionExitoso(String demoblaze) {
      this.demoblaze=demoblaze;
    }
public static InicioDeSesionExitoso toThe(String demoblaze){
        return new InicioDeSesionExitoso(demoblaze);
}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensaje = Text.of(PaginaDeInicioDeSesion.MENSAJE_BIENVENIDA).viewedBy(actor).asString();
        result = demoblaze.equals(mensaje);
        return result;
    }
}
