package starter.navigation;
/*
 **@Autor: gequintero
 */
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theBanColombiaHomePage() {
        return Task.where("opens",
                Open.browserOn().the(BanColombiaHomePage.class));
    }
}