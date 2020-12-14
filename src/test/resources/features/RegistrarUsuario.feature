#language:es
@RegistrarUsuario
Característica: Funcionalidad de Registrar Usuario


  Esquema del escenario: Registracion usuario exitosa
    Dado en la pagina principal para registrarme
    Cuando ingreso el mail <correo> para registarme como usuario nuevo
    Y cargo los datos <title>, <firstName>, <lastName>, <correo>, <password>, <dayBirth>, <monthBirth>, <yearBirth>, <sign>, <receive>, <firtsAddress>, <lastAddress>, <company>, <address>, <addressDos>, <city>, <state>, <postalCode>, <country>, <additionalInformation>, <homePhone>, <mobilePhone>
    Entonces observo que inicie sesion con <firstName>, <lastName>
    Ejemplos:
      | correo                       | title | firstName | lastName | password     | dayBirth | monthBirth | yearBirth | sign | receive | firtsAddress | lastAddress   | company   | address            | addressDos | city      | state   | postalCode | country         | additionalInformation | homePhone   | mobilePhone    |
      | "testing.claro@ggggmail.com" | "Mr." | "Testing" | "Claro"  | "Testing123" | "11"     | "May "      | "2000"    | "Si" | "No"    | "Falsa"      | "Super Falsa" | "Anonima" | "Siempre viva 123" | ""         | "Cordoba" | "Texas" | "75001"    | "United States" | "Nada mas"            | "123441231" | "124123123124" |
