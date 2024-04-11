package co.com.certificacion.automatizacionpragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAgregarPortatilAcarrito {
    public static final Target BOTON_PORTATILES =Target.the("Boton para ver portatiles disponibles").located(By.xpath("(//*[@id='itemc'])[2]"));
    public static final Target PORTATIL_MACBOOK_AIR =Target.the("Seleccionar portatil macbook air").located(By.xpath("(//*[@class='card-title'])[3]"));
    public static final Target BOTON_AGREGARPORTATILACARRITO =Target.the("Boton para agregar portatil al carrito ").located(By.xpath("//*[@class='btn btn-success btn-lg']"));



}
