package co.com.bdb.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonQuestions {
  private CommonQuestions() { }

  public static Question<String> textEquals(String expectedText, Target target) {
    return new TextEqualsQuestion(expectedText, target);
  }

  private static class TextEqualsQuestion implements Question<String> {
    private final String expectedText;
    private final Target target;
    private static final Logger LOGGER = LoggerFactory.getLogger(TextEqualsQuestion.class);

    TextEqualsQuestion(String expectedText, Target target) {
      this.expectedText = expectedText;
      this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
      String actualText = Text.of(target).answeredBy(actor);

      if (!actualText.equals(expectedText)) {
        LOGGER.error("El texto no es igual. Esperado: '{}', Actual: '{}'", expectedText, actualText);
        throw new AssertionError(
                "El texto no es igual. Esperado: '" + expectedText + "', Actual: '" + actualText + "'");
      } else {
        LOGGER.info("El texto es igual: '{}'", expectedText);
      }
      return "El texto es igual: '" + expectedText + "'";
    }
  }
}
