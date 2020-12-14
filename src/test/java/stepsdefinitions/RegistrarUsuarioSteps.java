package stepsdefinitions;

import io.cucumber.java.es.*;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import questions.PaginaPrincipalQuestion;
import questions.SignOutVisibleQuestion;
import taks.IngresarEmailRegistro;
import taks.RegistrarUsuarioTask;

public class RegistrarUsuarioSteps {
    private String nombre;

    @Dado("en la pagina principal para registrarme")
    public void en_la_pagina_principal_para_registrarme(){
        OnStage.setTheStage(new OnlineCast());

        this.nombre = "Roberto Carlos";

        OnStage.theActorCalled(this.nombre).attemptsTo(
                NavigateTo.theHomePage()
        );
    }


    @Cuando("ingreso el mail {string} para registarme como usuario nuevo")
    public void ingreso_el_mail_para_registarme_como_usuario_nuevo(String email) {
        OnStage.theActorCalled(this.nombre).attemptsTo(
                IngresarEmailRegistro.con(email)
        );
    }

    @Cuando("cargo los datos {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void cargo_los_datos(String title, String firstName, String lastName, String correo, String password, String dayBirth, String monthBirth,
                                String yearBirth, String sign,
                                String receive, String firtsAddress, String lastAddress, String company, String address, String addressDos,
                                String city, String state, String postalCode, String country, String additionalInformation, String homePhone, String mobilePhone) {

        OnStage.theActorCalled(this.nombre).attemptsTo(
                RegistrarUsuarioTask.con(title, firstName, lastName, correo, password, dayBirth, monthBirth, yearBirth, sign, receive,
                                        firtsAddress, lastAddress, company, address, addressDos, city, state, postalCode, country, additionalInformation, homePhone, mobilePhone)
        );

    }

    @Entonces("observo que inicie sesion con {string}, {string}")
    public void observo_que_inicie_sesion_con(String firstName, String lastName) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El nombre del usuario que recien se registra como que inicio la sesion",
                        PaginaPrincipalQuestion.nombreUsuario(),
                        IsEqual.equalTo(firstName + " " + lastName)),

                GivenWhenThen.seeThat("El boton Sign Out esta visible",
                        new SignOutVisibleQuestion(),
                        IsEqual.equalTo(Boolean.TRUE))
        );
    }

 }
