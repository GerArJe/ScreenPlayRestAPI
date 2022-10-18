package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.ExecutePatchToken;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class PatchGorestStepDefinitions {
    @When("proporciona la informacion del usuario {string} con id {string}")
    public void proporcionaLaInformacionDelUsuario(String endpoint, String id, DataTable userInformation) {
        theActorInTheSpotlight().attemptsTo(ExecutePatchToken.updateUser(endpoint, id, userInformation));
    }
}
