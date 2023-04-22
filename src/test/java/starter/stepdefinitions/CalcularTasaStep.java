package starter.stepdefinitions;
/*
 **@Autor: gequintero
 */
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import starter.navigation.NavigateTo;
import starter.task.InputTasa;
import starter.task.SelectModulofinancier;
import starter.task.SelectTool;
import starter.task.ValidateResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.everyItem;

public class CalcularTasaStep {
    String tasa = "9.54 %";
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) desea ingresar al sitio web")
    public void desea_ingresar_al_sitio_web(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theBanColombiaHomePage());
    }


    @When("^(.*) Valida el ingreso al modulo de calculo de tasa")
    public void Valida_el_ingreso_al_modulo_de_calculo_de_tasa(String actor) {
        theActorCalled(actor).attemptsTo(
                SelectTool.tool(),
                SelectModulofinancier.ModuloFinancier()
        );
    }

    @Then("Ingresa valores y calcula la tasa \"([^\"]*)\"$")
    public void Ingresa_valores_y_calcula_la_tasa(String monto){

        withCurrentActor(
                InputTasa.tasa(monto)
        );
        theActorInTheSpotlight()
                .should(seeThat(ValidateResult.interes(), everyItem(CoreMatchers.equalTo(tasa))));



    }


}
