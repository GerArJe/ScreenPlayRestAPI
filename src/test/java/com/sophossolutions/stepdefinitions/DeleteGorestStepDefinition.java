package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.ExecutionDeleteToken;
import com.sophossolutions.tasks.ExecutionGetToken;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteGorestStepDefinition {
    @When("consulta en el endpoint {string}  y eliminda el usuario por id {string}")
    public void consultaEnElEndpointYElimindaElUsuarioPorId(String endpoint, String id) {
        theActorInTheSpotlight().attemptsTo(ExecutionDeleteToken.deleteUser(endpoint, id));
    }

    @Then("valida que el estatus code sea {int} y la respuesta contenga null")
    public void validaQueElEstatusCodeSeaYLaRespuestaContengaNull(Integer status) {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(status)));
    }
}
