package co.com.bdb.automation.stepdefinitions.commons;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;


public class CommonStep {
    private static final String PAGE_NAME_BV = "pages.BancaVirtual";

    @Dado("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(PAGE_NAME_BV)
        );
    }



}




