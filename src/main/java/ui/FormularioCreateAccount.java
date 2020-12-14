package ui;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioCreateAccount {
    public static final Target RBT_MR = Target.the("RadioButton para seleccionar el genero Mr.").locatedBy("//div[@id='uniform-id_gender1']");
    public static final Target RBT_MRS = Target.the("RadioButton para seleccionar el genero Mrs.").locatedBy("//div[@id='uniform-id_gender2']");

    public static final Target TXT_FIRTS_NAME = Target.the("Textbox para ingresar el primer nombre").locatedBy("//input[@id='customer_firstname']");
    public static final Target TXT_LAST_NAME = Target.the("Textbox para ingresar el apellido").locatedBy("//input[@id='customer_lastname']");

    public static final Target TXT_EMAIL = Target.the("Textbox para ingresar el email").locatedBy("//input[@id='email']");
    public static final Target TXT_PASSWORD = Target.the("Textbox para ingresar el password").locatedBy("#passwd");


    public static final Target DRB_BIRTH_DAY = Target.the("Dropdoplist para seleccionar el dia de nacimiento").locatedBy("#days");
    public static final Target DRB_BIRTH_MONTH = Target.the("Dropdoplist para seleccionar el mes de nacimiento").locatedBy("#months");
    public static final Target DRB_BIRTH_YEAR = Target.the("Dropdoplist para seleccionar el año de nacimiento").locatedBy("#years");

    public static final Target CHK_NEWSLETTER = Target.the("Checkbox para tildar newsletter").locatedBy("//input[@id='newsletter']");
    public static final Target CHK_PROMO = Target.the("Dropdoplist para tildar promociones").locatedBy("#optin");


    public static final Target TXT_FIRTS_ADDRESS = Target.the("Textbox para ingresar el nombre de la calle").locatedBy("#firstname");
    public static final Target TXT_LAST_ADDRESS = Target.the("Textbox para ingresar el apellido de la calle").locatedBy("//input[@id='lastname']");


    public static final Target TXT_COMPANY = Target.the("Textbox para ingresar el nombre de la compañia").locatedBy("#company");
    public static final Target TXT_ADDRESS = Target.the("Textbox para ingresar la direccion").locatedBy("//input[@id='address1']");
    public static final Target TXT_ADDRESS_DOS = Target.the("Textbox para ingresar la direccion").locatedBy("//input[@id='address2']");
    public static final Target TXT_CITY = Target.the("Textbox para ingresar la ciudad").locatedBy("#city");


    public static final Target DRB_STATE = Target.the("Dropdoplist para seleccionar el estado").locatedBy("#id_state");

    public static final Target TXT_POSTAL_CODE = Target.the("Textbox para ingresar el codigo postal").locatedBy("#postcode");

    public static final Target DRB_COUNTRY = Target.the("Dropdoplist para seleccionar el country").locatedBy("#id_country");

    public static final Target TXT_ADDITIONAL = Target.the("Textbox para ingresar informacion adicional").locatedBy("#other");

    public static final Target TXT_HOME_PHONE = Target.the("Textbox para ingresar el numero de su hogar").locatedBy("#phone");
    public static final Target TXT_MOBILE_PHONE = Target.the("Textbox para ingresar el numero de celular").locatedBy("#phone_mobile");
    public static final Target TXT_ALIAS = Target.the("Textbox para ingresar el alias").locatedBy("#alias");

    public static final Target BTN_REGISTER = Target.the("Button para finalizar la registracion").locatedBy("//button[@id='submitAccount']");



}
