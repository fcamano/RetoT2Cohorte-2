package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatoCita extends PageObject {
    public static final Target INGREGAR_CITA = Target.the("ingregar doctor")
            .located(By.xpath("//div[@id='page-wrapper']/div/div[2]/div/div/div/div/div/div/a[6]"));
    public static final Target INGRESE_FECHA = Target.the("ingresar fecha")
            .located(By.xpath("//input[@id='datepicker']"));
    public static final Target INGRESE_CEDULA = Target.the("ingresar cedula")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input"));
    public static final Target INGRESE_IDDOCTOR = Target.the("ingresar id doctor")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input"));

    public static final Target INGRESE_COMENTARIOS = Target.the("ingresar comentarios")
            .located(By.xpath("//div[@id='page-wrapper']/div/div[3]/div/div[4]/textarea"));

    public static final Target GUARDAR = Target.the("ingresar comentarios")
            .located(By.cssSelector(".btn"));


}
