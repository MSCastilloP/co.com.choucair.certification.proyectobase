package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.FinishForm;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class technicalTestStepDefinitions {

//    @Before
//    public void setStage() {
//        OnStage.setTheStage(new OnlineCast());
//    }
//
//    @Given("^than brandon wants to learn automation at the academy choucair$")
//    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
//        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
//    }
//
//    @When("^he search for the course recursos Atomatizacion Bancolombia on the choucair academy platform$")
//    public void heSearchForTheCourseRecursosAtomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
//    }
//
//    @Then("^he Finds the course called resources Recuross Automatizacion Bancolombia$")
//    public void heFindsTheCourseCalledResourcesRecurossAutomatizacionBancolombia() {
//
//    }
@Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Santiago wants to create a user in uTest$")
    public void thanSantiagoWantsToCreateAUserInUTest() {
    OnStage.theActorCalled("Santiago").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^he finishes filling out the form$")
    public void heFinishesFillingOutTheForm() {
    OnStage.theActorCalled("Santiago").wasAbleTo(FinishForm.onThePage());
        // Write code here that turns the phrase above into concrete actions
    }
//Welcome to the world's largest community of freelance software testers!
    @Then("^a text appears that says (.*)$")
    public void aTextAppearsThatSaysWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String question) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        // Write code here that turns the phrase above into concrete actions
    }

}
