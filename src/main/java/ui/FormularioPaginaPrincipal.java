package ui;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Elementos web del formulario principal
 */
public class FormularioPaginaPrincipal {
    public static final Target BTN_SIGN_IN = Target.the("Boton para ir al formulario de login").locatedBy("//a[contains(text(),'Sign in')]");

    public static final Target BTN_ACCOUNT = Target.the("Boton con el nombre del usuario que inicio sesion").locatedBy(".account");

    public static final Target BTN_SIGN_OUT = Target.the("Boton cerrar la sesion").locatedBy("//a[@class='logout']");
}
