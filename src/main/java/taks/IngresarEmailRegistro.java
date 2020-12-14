package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.Authentication.FormularioAuthentication;
import ui.FormularioPaginaPrincipal;


/**
 * Tarea para ir al formulario de registrar un usuario nuevo.
 * 1- Click en Sing in
 * 2- Ingresar mail
 * 3- Presionar Created
 */
public class IngresarEmailRegistro implements Task {
    private String email;

    public IngresarEmailRegistro(String email) {
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioPaginaPrincipal.BTN_SIGN_IN),
                Enter.theValue(this.email).into(FormularioAuthentication.CREATE.TXT_EMAIL),
                Click.on(FormularioAuthentication.CREATE.BTN_CREATE)
        );
    }

    public static IngresarEmailRegistro con(String email){
        return new IngresarEmailRegistro(email);
    }

}
