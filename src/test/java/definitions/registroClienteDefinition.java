package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjets.autenticacionPage;
import pageobjets.crearCuentaPage;
import pageobjets.menuPage;

import java.io.IOException;

import static support.util.evidencias;

public class registroClienteDefinition {
    menuPage menu;
    autenticacionPage auth;
    crearCuentaPage cuenta;

    public registroClienteDefinition() {
        menu = new menuPage();
        auth = new autenticacionPage();
        cuenta = new crearCuentaPage();
    }

    @Given("que la web esté disponible")
    public void queLaWebEstéDisponible() throws IOException {
        hooks.driver.get("http://automationpractice.com/index.php");
        evidencias();
    }

    @And("ingresar a la opcion de creación de cuenta")
    public void ingresarALaOpcionDeCreaciónDeCuenta() {
        menu.clickSingin();
    }

    @When("ingresar un correo {string}")
    public void ingresarUnCorreo(String correo) throws IOException {
        auth.ingresarCorreo(correo);
        auth.clickCrearCuenta();
        evidencias();
    }

    @And("seleccionar el genero {string}")
    public void seleccionarElGenero(String genero) {
        cuenta.seleccionarGenero(genero);
    }

    @And("ingresar nombre {string}")
    public void ingresarNombre(String nombre) {
        cuenta.escribirNombre(nombre);
    }

    @And("ingresar apellidos {string}")
    public void ingresarApellidos(String apellido) {
        cuenta.escribirApellido(apellido);
    }

    @And("validar el correo {string}")
    public void validarElCorreo(String correo) {
        cuenta.validarCorreo(correo);
    }

    @And("ingresar clave {string}")
    public void ingresarClave(String pass) {
        cuenta.escribirPassword(pass);
    }

    @And("ingresar fecha de nacimiento {string}")
    public void ingresarFechaDeNacimiento(String valor) throws IOException {
        String[] fecha = valor.split("/");
        cuenta.seleccionarDia(fecha[0]);
        cuenta.seleccioanrMes(fecha[1]);
        cuenta.seleccionarAnio(fecha[2]);
        evidencias();
    }

    @And("{string} permitir envio de newslater")
    public void permitirEnvioDeNewslater(String opcion) {
        cuenta.permitirNewsLetter(opcion);
    }

    @And("seleccionar opcion {string}")
    public void seleccionarOpcion(String opcion) {
        cuenta.permitirReceive(opcion);
    }

    @And("escribir empresa {string}")
    public void escribirEmpresa(String empresa) {
        cuenta.escribirCompania(empresa);
    }

    @And("escribir primera dirección {string}")
    public void escribirPrimeraDirección(String direccion1) {
        cuenta.escribirDireccion1(direccion1);

    }

    @And("escribir segunda dirección {string}")
    public void escribirSegundaDirección(String direccion2) {
        cuenta.escribirDireccion2(direccion2);
    }

    @And("escribir ciudad {string}")
    public void escribirCiudad(String ciudad) {
        cuenta.escribirCity(ciudad);

    }

    @And("seleccionar estado {string}")
    public void seleccionarEstado(String estado) {
        cuenta.seleccionarEstado(estado);
    }

    @And("escribir codigo postal {string}")
    public void escribirCodigoPostal(String postal) {
        cuenta.escribircodigoPostal(postal);
    }

    @And("seleccionar pais {string}")
    public void seleccionarPais(String pais) {
        cuenta.seleccionarCountry(pais);
    }

    @And("escribir info {string}")
    public void escribirInfo(String info) {
        cuenta.escribirInformacion(info);

    }

    @And("escribir telefono {string}")
    public void escribirTelefono(String telefono) {
        cuenta.escribirPhone(telefono);
    }

    @And("escribir celular {string}")
    public void escribirCelular(String celular) {
        cuenta.escribirCelular(celular);
    }

    @And("escribir alias {string}")
    public void escribirAlias(String alias) {
        cuenta.escribirAlias(alias);
    }

    @And("guardar registro")
    public void guardarRegistro() throws IOException {
        cuenta.clickRegistras();
        evidencias();
    }
}
