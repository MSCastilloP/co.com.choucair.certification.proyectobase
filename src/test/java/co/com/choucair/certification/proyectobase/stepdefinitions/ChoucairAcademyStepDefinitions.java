package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course recursos Atomatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAtomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
    }

    @Then("^he Finds the course called resources Recuross Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecurossAutomatizacionBancolombia() {

    }
}
