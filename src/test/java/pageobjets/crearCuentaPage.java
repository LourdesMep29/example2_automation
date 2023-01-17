package pageobjets;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class crearCuentaPage extends util {
    @FindBy(id = "id_gender1") protected WebElement rdbmr;
    @FindBy(id = "id_gender1") protected WebElement rdbmrs;
    @FindBy(id = "customer_firstname") protected WebElement txtNombre;
    @FindBy(id = "customer_lastname") protected WebElement txtApellido;
    @FindBy(id = "email") protected WebElement txtCorreo;
    @FindBy(id = "contraseña") protected WebElement txtContraseña;
    @FindBy(id = "days") protected WebElement sltDia;
    @FindBy(id = "month") protected WebElement sltMes;
    @FindBy(id = "years") protected WebElement sltAnio;
    @FindBy(id = "//input[@id='newsletter']") protected WebElement cbSing;
    @FindBy(id = "option") protected WebElement cbReceibe;
    @FindBy(id = "//input[@id='firstname']") protected WebElement txtNombreAddress;
    @FindBy(id = "//input[@id='lastname']") protected WebElement txtApellidoAddress;
    @FindBy(id = "company") protected WebElement txtCompany;
    @FindBy(id = "address1") protected WebElement sltAddress;
    @FindBy(id = "address2") protected WebElement sltAddress2;
    @FindBy(id = "city") protected WebElement txtCity;
    @FindBy(id = "id_state") protected WebElement sltState;
    @FindBy(id = "postcode") protected WebElement txtPostalCode;
    @FindBy(id = "id_country") protected WebElement sltCountry;
    @FindBy(id = "other") protected WebElement txtInformacion;
    @FindBy(id = "phone") protected WebElement txtPhone;
    @FindBy(id = "phone_mobile") protected WebElement txtCelular;
    @FindBy(id = "alias") protected WebElement txtAddressAlias;
    @FindBy(id= "submitAccount") protected WebElement btnRegister;


    public crearCuentaPage() {
        PageFactory.initElements(driver, this);
    }

    public void seleccionarGenero(String genero){
        wait.until(ExpectedConditions.visibilityOf(rdbmr));
        if(genero.toLowerCase().equals("señor")){
            rdbmr.click();
        } else if (genero.toLowerCase().equals("señora")) {
            rdbmrs.click();
        }else{
            System.out.println("valor ivalido, selecciona señor o señora");
        }
    }
    public void escribirNombre(String nombre){
        txtNombre.sendKeys(nombre);
    }
    public void escribirApellido(String apellido){
        txtApellido.sendKeys(apellido);
    }
    public void validarCorreo(String correo){
        String valor = txtCorreo.getAttribute("value");
        Assert.assertEquals(correo,valor);
    }
    public void escribirPassword(String pass){
        txtContraseña.getAttribute("value");
    }
    public void seleccionarDia(String dia){
        new Select( sltDia).selectByValue(dia);
    }
    public void seleccioanrMes(String mes){
        new Select(sltMes).selectByValue(mes);
    }
    public void seleccionarAnio(String anio){
        new Select(sltAnio).selectByValue(anio);
    }
    public void permitirNewsLetter(String estado){
        if (estado.toLowerCase().equals("si")){
            cbSing.click();
            Assert.assertTrue(cbSing.isSelected());
        }else {
            Assert.assertFalse(cbSing.isSelected());
        }
    }

    public void permitirReceive(String estado){
        if (estado.toLowerCase().equals("si")){
            cbReceibe.click();
            Assert.assertTrue(cbReceibe.isSelected());
        }else {
            Assert.assertFalse(cbReceibe.isSelected());
        }
    }

    public void escribirCompania(String compania){
        txtCompany.sendKeys(compania);
    }
    public void escribirDireccion1(String direccion1){
        sltAddress.sendKeys(direccion1);
    }
    public void escribirDireccion2(String direccion2){
        sltAddress2.sendKeys(direccion2);
    }
    public void escribirCity(String city){
        txtCity.sendKeys(city);
    }
    public void seleccionarEstado(String state){
        new Select(sltState).selectByVisibleText(state);
    }
    public void escribircodigoPostal (String codigoPostal){
        txtPostalCode.sendKeys(codigoPostal);
    }
    public void seleccionarCountry(String country){
        new Select(sltCountry).selectByVisibleText(country);
    }
    public void escribirInformacion(String info){
        txtInformacion.sendKeys(info);
    }
    public void escribirPhone(String phone){
        txtPhone.sendKeys(phone);
    }
    public void escribirCelular(String celular){
        txtCelular.sendKeys(celular);
    }
    public void escribirAlias(String alias){
        txtAddressAlias.sendKeys(alias);
    }
    public void clickRegistras(){
        btnRegister.click();
    }

}
