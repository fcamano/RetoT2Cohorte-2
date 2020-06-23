package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.RegitroDatos;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistroDoctorStepDefinitions {
    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}
    @Given("^Carlos necesita registrar un nuevo doctor$")
    public void carlosNecesitaRegistrarUnNuevoDoctor() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
    public void realizaElRegistroDelMismoEnElAplicativoDeAdministraciónDeHospitales(List<RegitroDatos> registrodatos) {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.onthePage(registrodatos));

    }

    @Then("^verifica que se presente en pantalla el mensaje (.*)$")
    public void verificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String question )   {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
