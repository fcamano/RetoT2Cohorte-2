package co.com.choucair.certification.academy.stepdefinitions;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Brandon wants to lear automation at the academy Choucair$")
    public void thanBrandonWantsToLearAutomationAtTheAcademyChoucair() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThepage()));
    }
    @When("^he search for the Course Recursos Automatizacon Bancolombia on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaconBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }
    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}