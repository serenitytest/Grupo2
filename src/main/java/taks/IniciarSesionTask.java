package taks;

import navigation.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.Authentication.FormularioAuthentication;
import ui.FormularioPaginaPrincipal;

public class IniciarSesionTask implements Task {
    private String email;
    private String password;

    public IniciarSesionTask(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Pasos que se necesitan para realizar la accion de iniciar sesion
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Pasos para iniciar la sesion
        //1- Hacer click en el boton de sign in
        //2- Ingresar el emial
        //3- Ingresar el password
        //4- Hacer click en iniciar sesion


        actor.attemptsTo(
                Click.on(FormularioPaginaPrincipal.BTN_SIGN_IN),
                Enter.theValue(this.email).into(FormularioAuthentication.REGISTERED.TXT_EMAIL),
                Enter.theValue(this.password).into(FormularioAuthentication.REGISTERED.TXT_PASS),
                Click.on(FormularioAuthentication.REGISTERED.BTN_SIGN_IN)
        );
    }

    public static IniciarSesionTask con(String email, String password){
        return new IniciarSesionTask(email, password);
    }
}