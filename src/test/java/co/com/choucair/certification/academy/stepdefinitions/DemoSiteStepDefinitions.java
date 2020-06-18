package co.com.choucair.certification.academy.stepdefinitions;


import co.com.choucair.certification.academy.model.RegitroPage;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class DemoSiteStepDefinitions {
@Before
public void setStage(){OnStage.setTheStage(new OnlineCast());}
@Given("^Carlos quiere acceder a la Web Automation Demo Site$")
public void carlosQuiereAccederALaWebAutomationDemoSite()   {
    OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());

}

    @When("^el realiza el registro en la página$")
    public void elRealizaElRegistroEnLaPágina(List<RegitroPage> regitropages) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onthePage(regitropages));

    //OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(regitropages.get(0).getName()));
        //OnStage.theActorInTheSpotlight().attemptsTo(Login.the(registropages).get(0).getName());
     //   Login.onThePage(registroPages.get(0).getName()));
    }

    @Then("^verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row$")
    public void verificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow()   {

    }

}
