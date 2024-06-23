package co.com.bdb.automation.stepdefinitions.commons;
import co.com.bdb.automation.task.InputCredentialsTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Open;

import java.util.Map;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.task.Bills.bills;




public class CommonStep {
    private static final String PAGE_NAME_BV = "pages.BancaVirtual";

    @Dado("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed(PAGE_NAME_BV));
    }


    @Cuando("Ingrese sus credenciales de acceso:")
    public void ingreseSusCredencialesDeAcceso(Map<String, String> credentials) {
        COMMON_ACTOR.attemptsTo(InputCredentialsTask.data(credentials));
    }

    @Entonces("entrará a PFM")
    public void seDebeVisualizar() {
        COMMON_ACTOR.attemptsTo(bills());
    }
}




