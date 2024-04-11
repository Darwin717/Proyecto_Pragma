package co.com.certificacion.automatizacionpragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAgregarTelefonoAcarrito {
    public static final Target BOTON_TELEFONOS =Target.the("Boton para ver telefonos disponibles").located(By.xpath("(//*[@id='itemc'])[1]"));
    public static final Target TELEFONO_SONYZ5 =Target.the("Seleccionar telefono sonyZ5").located(By.xpath("(//*[@class='card-title'])[6]"));
    public static final Target BOTON_AGREGARTELEFONOACARRITO =Target.the("Boton para agregar telefono al carrito ").located(By.xpath("//*[@class='btn btn-success btn-lg']"));



}
