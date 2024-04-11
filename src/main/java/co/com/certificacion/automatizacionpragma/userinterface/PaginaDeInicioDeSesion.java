package co.com.certificacion.automatizacionpragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeInicioDeSesion {
    public static final Target BOTON_ACCESO =Target.the("Boton para iniciar el acceso al sistema").located(By.id("login2"));
    public static final Target CAMPO_LOGINUSUARIO =Target.the("Campo para ingresar el nombre de usuario existente ").located(By.id("loginusername"));
    public static final Target CAMPO_LOGINCLAVE =Target.the("Campo para ingresar la clave ").located(By.id("loginpassword"));
    public static final Target BOTON_ACCESOALSISTEMA =Target.the("Boton para ingresar de forma correcta").located(By.xpath("(//*[@class='btn btn-primary'])[3]"));
    public static final Target MENSAJE_BIENVENIDA =Target.the("Mensaje de bienvenida a la pagina").located(By.xpath("(//*[@class='nav-link'])[7]"));



}
