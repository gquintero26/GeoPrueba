package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.PageObject.FormInputPage;

public class InputTasa {
    public static Performable tasa(String monto) {
        return Task.where("Ingresar y calcular tasa de interes",
                Enter.theValue(monto).into(FormInputPage.inputInteres),
                Click.on(FormInputPage.selectPeriodicidadSemestrail),
                Click.on(FormInputPage.selectCapitalizacionAnual)
        );

    }
}
