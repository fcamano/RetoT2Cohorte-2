package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.interactions.*;
import co.com.choucair.certification.academy.model.RegitroDatos;
import co.com.choucair.certification.academy.userinterface.DatoDoctor;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
private List<RegitroDatos> regitrodatos;
public Login(List<RegitroDatos> regitrodatos){this.regitrodatos = regitrodatos;}

    public static Login onthePage(List<RegitroDatos> regitrodatos) {
        return Tasks.instrumented(Login.class,regitrodatos);
    }
    //

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(DatoDoctor.INGREGAR_DOCTOR),
               // Enter.theValue(regitrodatos.get(0).getNombre()).into(DatoDoctor.INGREGAR_DOCTOR),
                Enter.theValue(regitrodatos.get(0).getNombre()).into(DatoDoctor.INGRESE_NOMBRE),
                Enter.theValue(regitrodatos.get(0).getApellido()).into(DatoDoctor.INGRESE_APELLIDO),
                Enter.theValue(regitrodatos.get(0).getTelefono()).into(DatoDoctor.INGRESE_TELEFONO),
                Click.on(DatoDoctor.SELECCIONAR_DOCUMEN),
                SeleccionarIdentificacion.laLista(DatoDoctor.SELECCIONAR_DOCUMENTO,regitrodatos.get(0).getTipoidentificaion()),
                Enter.theValue(regitrodatos.get(0).getNumerdoidentificacion()).into(DatoDoctor.INGRESAR_NUMEROIDEN),
                Click.on(DatoDoctor.GUARDAR));


    }
}
