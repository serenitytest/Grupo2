package stepsdefinitions;

import io.cucumber.java.es.*;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.StringContains;
import questions.PaginaPrincipalQuestion;
import taks.IniciarSesionTask;

public class IniciarSesionSteps {
    private String nombre;

    @Dado("en la pagina principal")
    public void en_la_pagina_principal() {
        OnStage.setTheStage(new OnlineCast());

        this.nombre = "Alberto";
    }

    @Cuando("ingreso los valores {string} y {string}")
    public void ingreso_los_valores_y(String email, String password) {
        OnStage.theActorCalled(this.nombre).attemptsTo(
                NavigateTo.theHomePage(),
                IniciarSesionTask.con(email, password)
        );
    }

    @Entonces("ingrese correctamente a mi usuario")
    public void ingrese_correctamente_a_mi_usuario() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El nombre del usuario que inicio sesion", PaginaPrincipalQuestion.nombreUsuario(), StringContains.containsString("Serenity")),
                GivenWhenThen.seeThat("El nombre completo del usuario que inicio sesion", PaginaPrincipalQuestion.nombreUsuario(), IsEqual.equalTo("Serenity Test")),
                GivenWhenThen.seeThat("El nombre del usuario que inicio sesion es visible", PaginaPrincipalQuestion.nombreUsuario(), IsNull.notNullValue())
        );
    }

    @Entonces("ingrese correctamente a mi usuario {string}")
    public void ingreseCorrectamenteAMiUsuarioNombreUsuario(String nombreUsuario) {
        OnStage.theActorCalled(this.nombre).should(
                GivenWhenThen.seeThat("El nombre del usuario que inicio sesion",
                        PaginaPrincipalQuestion.nombreUsuario(),
                        StringContains.containsString(nombreUsuario))
        );

        OnStage.theActorCalled(this.nombre).should(
                GivenWhenThen.seeThat("El nombre completo del usuario que inicio sesion", PaginaPrincipalQuestion.nombreUsuario(), IsEqual.equalTo(nombreUsuario))
        );

        OnStage.theActorCalled(this.nombre).should(
                GivenWhenThen.seeThat("El nombre del usuario que inicio sesion es visible", PaginaPrincipalQuestion.nombreUsuario(), IsNull.notNullValue())
        );
    }

    @Entonces("muestra el mensaje {string}")
    public void muestraElMensajeMensaje(String mensaje) {
    }
}
