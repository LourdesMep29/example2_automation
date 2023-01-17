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


  Scenario Outline: Creacion de cuenta exitosa con varios registros
    Given que la web esté disponible
    And ingresar a la opcion de creación de cuenta
    When ingresar un correo "<correo>"
    And seleccionar el genero "<genero>"
    And ingresar nombre "<nombre>"
    And ingresar apellidos "<apellido>"
    And validar el correo "<correo>"
    And ingresar clave "<clave>"
    And ingresar fecha de nacimiento "<fecha_nacimiento>"
    And "<newsletter>" permitir envio de newslater
    And seleccionar opcion "<option>"
    And escribir empresa "<empresa>"
    And escribir primera dirección "<direccion1>"
    And escribir segunda dirección "<direccion2>"
    And escribir ciudad "<ciudad>"
    And seleccionar estado "<estado>"
    And escribir codigo postal "<codigo_postal>"
    And seleccionar pais "<pais>"
    And escribir info "<info>"
    And escribir telefono "<telefono>"
    And escribir celular "<celular>"
    And escribir alias "<alias>"
    And guardar registro

    Examples:
    |correo         |genero |nombre   |apellido |clave   |fecha_nacimiento |newsletter|option|empresa|direccion1|direccion2|ciudad|estado|codigo_postal|pais         |info           |telefono |celular|alias|
    |abc987@mail.com|señor  |Paul     |Gonzales |12345678|12/03/2000       |no        |no    |latam  |grau23    |grau45    |lima  |arizona|00000       |Unides States|mi nueva cuenta|2345678  |345678 |lump |
    |lu123@mail.com |señora  |Paulina |Mendez   |12345678|12/03/2000       |no        |no    |latam  |grau23    |grau45    |lima  |arizona|00000       |Unides States|mi nueva cuenta|2345678  |345678 |lump |

