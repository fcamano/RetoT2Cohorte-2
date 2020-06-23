package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatoDoctor extends PageObject {
    public static final Target INGREGAR_DOCTOR = Target.the("ingregar doctor")
            .located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
    public static final Target INGRESE_NOMBRE = Target.the("ingresar nombre")
            .located(By.id("name"));
    public static final Target INGRESE_APELLIDO = Target.the("ingresar nombre")
            .located(By.id("last_name"));
    public static final Target INGRESE_TELEFONO = Target.the("ingresar nombre")
            .located(By.id("telephone"));
    public static final Target SELECCIONAR_DOCUMEN =Target.the("Seleccion")
            .located(By.id("identification_type"));
    public static final Target SELECCIONAR_DOCUMENTO =Target.the("Seleccion")
            .located(By.xpath("//div[@id='page-wrapper']/div/div[3]/div/div[4]/select"));
    public static final Target INGRESAR_NUMEROIDEN =Target.the("NUMERO CEDULA")
            .located(By.id("identification"));
    public static final Target GUARDAR =Target.the("guardar")
            .located(By.xpath("//div[@id='page-wrapper']/div/div[3]/div/a"));

}
