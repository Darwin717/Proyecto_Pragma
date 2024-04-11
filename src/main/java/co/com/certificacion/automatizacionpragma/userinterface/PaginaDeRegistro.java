package co.com.certificacion.automatizacionpragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeRegistro {
    public static final Target BOTON_INSCRIBIRSE =Target.the("Boton para inscribirse en la pagina").located(By.xpath("(//*[@class='nav-link'])[8]"));
    public static final Target CAMPO_NOMBREDEUSUARIO =Target.the("Campo para ingresar el nombre de usuario").located(By.id("sign-username"));
    public static final Target CAMPO_CLAVE =Target.the("Campo para ingresar la clave nueva ").located(By.id("sign-password"));
    public static final Target BOTON_FINALIZARINSCRIPCION =Target.the("Boton para finalizar la inscripcion de forma correcta").located(By.xpath("(//*[@class='btn btn-primary'])[2]"));


}
