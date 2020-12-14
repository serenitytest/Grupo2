package ui.Authentication;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioRegistered {
    public static final Target TXT_EMAIL = Target.the("Textbox para ingresar el mail de inicio de sesion").locatedBy("//input[@id='email']");
    public static final Target TXT_PASS = Target.the("Textbox para ingresar el password de inicio de sesion").locatedBy("//input[@id='passwd']");

    public static final Target BTN_SIGN_IN = Target.the("Button para comenzar el inicio de sesion").locatedBy("#SubmitLogin");

}
