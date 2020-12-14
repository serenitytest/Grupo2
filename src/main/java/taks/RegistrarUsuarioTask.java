package taks;

import actions.SelectDrownDropListText;
import actions.SelectDrownDropListValue;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import ui.FormularioCreateAccount;

public class RegistrarUsuarioTask implements Task {
    String title;
    String firstName;
    String lastName;
    String correo;
    String password;
    String dayBirth;
    String monthBirth;
    String yearBirth;
    String sign;
    String receive;
    String firtsAddress;
    String lastAddress;
    String company;
    String address;
    String addressDos;
    String city;
    String state;
    String postalCode;
    String country;
    String additionalInformation;
    String homePhone;
    String mobilePhone;

    public RegistrarUsuarioTask(String title, String firstName, String lastName, String correo, String password, String dayBirth, String monthBirth, String yearBirth, String sign, String receive, String firtsAddress, String lastAddress, String company, String address, String addressDos, String city, String state, String postalCode, String country, String additionalInformation, String homePhone, String mobilePhone) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.correo = correo;
        this.password = password;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.sign = sign;
        this.receive = receive;
        this.firtsAddress = firtsAddress;
        this.lastAddress = lastAddress;
        this.company = company;
        this.address = address;
        this.addressDos = addressDos;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.additionalInformation = additionalInformation;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }

    public static RegistrarUsuarioTask con(String title, String firstName, String lastName, String correo, String password, String dayBirth, String monthBirth, String yearBirth, String sign, String receive, String firtsAddress, String lastAddress, String company, String address, String addressDos, String city, String state, String postalCode, String country, String additionalInformation, String homePhone, String mobilePhone) {
        return new RegistrarUsuarioTask(title, firstName, lastName, correo, password, dayBirth, monthBirth, yearBirth,
                sign, receive, firtsAddress, lastAddress, company, address, addressDos, city, state, postalCode, country, additionalInformation, homePhone, mobilePhone);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (this.title.equalsIgnoreCase("Mr.")){
            actor.attemptsTo(
                    Click.on(FormularioCreateAccount.RBT_MR)
            );
        }
        else{
            actor.attemptsTo(
                    Click.on(FormularioCreateAccount.RBT_MRS)
            );
        }


        actor.attemptsTo(
                Enter.theValue(this.firstName).into(FormularioCreateAccount.TXT_FIRTS_NAME),
                Enter.theValue(this.lastName).into(FormularioCreateAccount.TXT_LAST_NAME),
                Enter.theValue(this.correo).into(FormularioCreateAccount.TXT_EMAIL),
                Enter.theValue(this.password).into(FormularioCreateAccount.TXT_PASSWORD),

                //Seleccionar Day, Month, Year
                //(new SelectByValueFromTarget(FormularioCreateAccount.DRB_BIRTH_DAY, this.dayBirth)).performAs(actor),
                SelectDrownDropListValue.valueTarget(FormularioCreateAccount.DRB_BIRTH_DAY, this.dayBirth),
                SelectDrownDropListText.textTarget(FormularioCreateAccount.DRB_BIRTH_MONTH, this.monthBirth),
                SelectDrownDropListValue.valueTarget(FormularioCreateAccount.DRB_BIRTH_YEAR, this.yearBirth),


                Enter.theValue(this.firtsAddress).into(FormularioCreateAccount.TXT_FIRTS_ADDRESS),
                Enter.theValue(this.lastAddress).into(FormularioCreateAccount.TXT_LAST_ADDRESS),
                Enter.theValue(this.company).into(FormularioCreateAccount.TXT_COMPANY),
                Enter.theValue(this.address).into(FormularioCreateAccount.TXT_ADDRESS),
                Enter.theValue(this.addressDos).into(FormularioCreateAccount.TXT_ADDRESS_DOS),
                Enter.theValue(this.city).into(FormularioCreateAccount.TXT_CITY),

                //Seleccionar state
                //(new SelectByVisibleTextFromTarget(FormularioCreateAccount.DRB_STATE, this.state)).performAs(actor),
                SelectDrownDropListText.textTarget(FormularioCreateAccount.DRB_STATE, this.state),


                Enter.theValue(this.postalCode).into(FormularioCreateAccount.TXT_POSTAL_CODE),


                //Seleccionar country -> "21"
                SelectDrownDropListValue.valueTarget(FormularioCreateAccount.DRB_COUNTRY, "21"),


                Enter.theValue(this.additionalInformation).into(FormularioCreateAccount.TXT_ADDITIONAL),
                Enter.theValue(this.homePhone).into(FormularioCreateAccount.TXT_HOME_PHONE),
                Enter.theValue(this.mobilePhone).into(FormularioCreateAccount.TXT_MOBILE_PHONE),

                Enter.theValue(String.valueOf(Math.random())).into(FormularioCreateAccount.TXT_ALIAS),

                Click.on(FormularioCreateAccount.BTN_REGISTER)
        );
    }
}
