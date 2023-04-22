package starter.task;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import starter.PageObject.FormInputPage;

import java.util.Collection;

public class ValidateResult {
    public static Question<Collection<String>> interes() {
        return Text.ofEach(FormInputPage.lblResult).describedAs("El interes generado");
    }

}
