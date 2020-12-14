package ui.Authentication;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioCreate {
    public static final Target TXT_EMAIL = Target.the("Textbox ingreso de mail para registrar").locatedBy("//input[@id='email_create']");
    public static final Target BTN_CREATE = Target.the("Button para comenza el registro").locatedBy("//button[@id='SubmitCreate']");

}
