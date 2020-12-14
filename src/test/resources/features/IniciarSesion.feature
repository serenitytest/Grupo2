#language:es
@IniciarSesion
Característica: Funcionalidad de Iniciar Sesion
  Como usuario deseo poder loguearme en la pagina para realizar compras

  @Comun
  Escenario: Inicio de sesion exitoso
    Dado en la pagina principal
    Cuando ingreso los valores "test.serenity@gmail.com" y "123456"
    Entonces ingrese correctamente a mi usuario

  @Parametros
  Esquema del escenario: Inicio de sesion exitoso - con parametros
    Dado en la pagina principal
    Cuando ingreso los valores <email> y <pass>
    Entonces ingrese correctamente a mi usuario <nombreUsuario>
    Ejemplos:
      | email                     | pass     | nombreUsuario |
      | "test.serenity@gmail.com" | "123456" | "Serenity"    |


  @Parametros @Pending
  Esquema del escenario: Inicio de sesion fallido - email inexistente
    Dado en la pagina principal
    Cuando ingreso los valores <email> y <pass>
    Entonces muestra el mensaje <mensaje>
    Ejemplos:
      | email                     | pass     | mensaje    |
      | "test.serenity@gmail.com" | "123456" | "Serenity" |