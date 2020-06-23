package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.RegitroCita;
import co.com.choucair.certification.academy.model.RegitroDatos;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.LoginCitas;
import co.com.choucair.certification.academy.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistroCitaStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}
    @Given("^Luis necesita registrar una nuevo cita$")
    public void luisNecesitaRegistrarUnaNuevoCita() throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }


    @When("^registra la cita en el hospital$")
    public void registraLaCitaEnElHospital(List<RegitroCita> regitrocitas)  {
     //   // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(LoginCitas.onthePage(regitrocitas));

    }

    @Then("^verificar que se guardo - Datos guardados correctamente$")
    public void verificarQueSeGuardoDatosGuardadosCorrectamente(String question) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
