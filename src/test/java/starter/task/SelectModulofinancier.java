package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.PageObject.FrontElementHomePage;

public class SelectModulofinancier {
    public static Performable ModuloFinancier() {
        return Task.where("seleccionar modulo",
                Click.on(FrontElementHomePage.btnNext),
                Click.on(FrontElementHomePage.btnGestionarFinanzas),
                Click.on(FrontElementHomePage.btnTasaDeInteres),
                Click.on(FrontElementHomePage.btnCalcular)
        );

    }
}
