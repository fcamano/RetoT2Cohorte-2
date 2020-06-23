package co.com.choucair.certification.academy.tasks;


import co.com.choucair.certification.academy.model.RegitroCita;
import co.com.choucair.certification.academy.userinterface.DatoCita;
import co.com.choucair.certification.academy.userinterface.DatoDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LoginCitas implements Task {

    List<RegitroCita> regitrocitas;
    public LoginCitas (List<RegitroCita>regitrocitas){this.regitrocitas = regitrocitas;}

    public static LoginCitas onthePage(List<RegitroCita> regitrocitas)
    {
        return Tasks.instrumented(LoginCitas.class,regitrocitas);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(DatoCita.INGREGAR_CITA),
                Enter.theValue(regitrocitas.get(0).getDiacita()).into(DatoCita.INGRESE_FECHA),
                Enter.theValue(regitrocitas.get(0).getCedula()).into(DatoCita.INGRESE_CEDULA),
                Enter.theValue(regitrocitas.get(0).getDoctorid()).into(DatoCita.INGRESE_IDDOCTOR),
                Enter.theValue(regitrocitas.get(0).getObservacion()).into(DatoCita.INGRESE_COMENTARIOS),
                Click.on(DatoCita.GUARDAR));

                //Click.on(DatoDoctor.GUARDAR));*/


    }
}
