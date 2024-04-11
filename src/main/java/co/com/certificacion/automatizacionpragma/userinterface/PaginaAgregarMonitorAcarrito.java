package co.com.certificacion.automatizacionpragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAgregarMonitorAcarrito {
    public static final Target BOTON_MONITORES =Target.the("Boton para ver Monitores disponibles").located(By.xpath("(//*[@id='itemc'])[3]"));
    public static final Target MONITOR_APPLE24 =Target.the("Seleccionar monitor apple 24").located(By.xpath("(//*[@class='card-title'])[2]"));
    public static final Target BOTON_AGREGARMONITORACARRITO =Target.the("Boton para agregar monitor al carrito ").located(By.xpath("//*[@class='btn btn-success btn-lg']"));



}
