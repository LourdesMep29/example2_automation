Feature: Funcionalidad de creación de cuenta de cliente
  @regresion
  Scenario: Creación de cuenta exitosa
    Given que la web esté disponible
    And ingresar a la opcion de creación de cuenta
    When ingresar un correo "abc987@mail.com"
    And seleccionar el genero "señor"
    And ingresar nombre "Alexander"
    And ingresar apellidos "Avila"
    And validar el correo "abc987@mail.com"
    And ingresar clave "12345678"
    And ingresar fecha de nacimiento "05/04/1998"
    And "si" permitir envio de newslater
    And seleccionar opcion "no"
    And escribir empresa "mi empresa"
    And escribir primera dirección "mi casa 964"
    And escribir segunda dirección "mi segunda casa 964"
    And escribir ciudad "lima"
    And seleccionar estado "Arizona"
    And escribir codigo postal "00000"
    And seleccionar pais "United States"
    And escribir info "registro de mi cuenta"
    And escribir telefono "78987"
    And escribir celular "98765432"
    And escribir alias "mi cuenta"
    And guardar registro





