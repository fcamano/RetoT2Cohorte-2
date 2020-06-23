package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationLabel extends PageObject {
    public static final Target NAME_LABEL = Target.the("obtener nombre del mesaje guardar")
            .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
