package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.PageObject.FrontElementHomePage;

public class SelectTool {
    public static Performable tool() {
        return Task.where("seleccionar herramientas",
                Click.on(FrontElementHomePage.lblNegocios),
                Click.on(FrontElementHomePage.lblHerramientas)
        );

    }
}
