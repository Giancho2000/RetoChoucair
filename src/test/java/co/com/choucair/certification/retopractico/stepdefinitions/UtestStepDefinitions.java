package co.com.choucair.certification.retopractico.stepdefinitions;

import co.com.choucair.certification.retopractico.task.Join;
import co.com.choucair.certification.retopractico.task.OpenPage;
import co.com.choucair.certification.retopractico.task.Suscribe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {
    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Juan wants to sing up into Utest page$")
    public void thanJuanWantsToSingUpIntoUtestPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenPage.thePage());
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^He click on Join Today$")
    public void heClickOnJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(Join.the());
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^he find a form and put his data into the inputs$")
    public void heFindAFormAndPutHisDataIntoTheInputs() {
        OnStage.theActorInTheSpotlight().attemptsTo(Suscribe.in());
        // Write code here that turns the phrase above into concrete actions
    }
}
