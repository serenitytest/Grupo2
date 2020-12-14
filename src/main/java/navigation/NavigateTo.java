package navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theHomePage(){
        return Task.where(
                "{0} abre la pagina principal Your Logo",
                Open.browserOn().the(PaginaPrincipal.class)
                );
    }


    public static Performable theGoogle(){
        return Task.where(
                "{0} abre la pagina principal de Google",
                Open.browserOn().the(PaginaGoogle.class)
        );
    }
}
