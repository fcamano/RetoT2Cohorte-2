package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.interactions.*;
import co.com.choucair.certification.academy.model.RegitroPage;
import co.com.choucair.certification.academy.userinterface.DatoPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
private List<RegitroPage> regitropages;
public Login(List<RegitroPage> regitropages){this.regitropages = regitropages;}

    public static Login onthePage(List<RegitroPage> regitropages) {
        return Tasks.instrumented(Login.class,regitropages);
    }
    //

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(regitropages.get(0).getName()).into(DatoPage.INPUT_FIRSTNAME),
                Enter.theValue(regitropages.get(0).getLast()).into(DatoPage.INPUT_LASTNAME),
                Enter.theValue(regitropages.get(0).getAddress()).into(DatoPage.INPUT_ADDRESS),
                Enter.theValue(regitropages.get(0).getEmail()).into(DatoPage.INPUT_EMAIL),
                Enter.theValue(regitropages.get(0).getNumber()).into(DatoPage.INPUT_NUMBER),
                Click.on(DatoPage.CHECK_GENDER),
                Click.on(DatoPage.CHECK_HOBBIES),
                //Click.on(DatoPage.LIST_LANGUAGE),
                Seleccionar.laLista(DatoPage.CHECK_LANGUAGE1, regitropages.get(0).getLanguage()),
               // Click.on(DatoPage.CHECK_FUERA),
                SeleccSkill.laLista(DatoPage.CHECK_SKILLCLICK, regitropages.get(0).getSkill()),
                SeleccCountry.laLista(DatoPage.CHECK_COUNTRY, regitropages.get(0).getContry()),
                //Click.on(DatoPage.CHECK_SELECTCOUNTRY)),

                SeleccCountry1.laLista(DatoPage.CHECK_SELECTCOUNTRY, regitropages.get(0).getSelecontry()),
                SelectYear.laLista(DatoPage.OPTION_YEAR, regitropages.get(0).getYear()),
        SelectMounth.laLista(DatoPage.OPTION_MONTH, regitropages.get(0).getMonth()),
        SelectDay.laLista(DatoPage.OPTION_DAY, regitropages.get(0).getDay()),
        Enter.theValue(regitropages.get(0).getPassword()).into(DatoPage.INPUT_PASSWORD),
                Enter.theValue(regitropages.get(0).getConfirpassword()).into(DatoPage.INPUT_CONFIRPASSWORD),

                Click.on(DatoPage.ENTER_BUTTON));

    }
}
