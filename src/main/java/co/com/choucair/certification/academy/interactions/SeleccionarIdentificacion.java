package co.com.choucair.certification.academy.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionarIdentificacion implements Interaction {
    private Target lista;
    private String opcion;

    public SeleccionarIdentificacion(Target lista,String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.tagName("option"));
        for (int i=0; i < listObjeto.size(); i++){
            if (listObjeto.get(i).getText().equals(opcion)){
                listObjeto.get(i).click();
                break;
            }
        }
    }

    public static SeleccionarIdentificacion laLista(Target lista, String opcion) {
        return new SeleccionarIdentificacion(lista,opcion);
    }
}


