package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCadastro extends PageBase {
    public PaginaCadastro(WebDriver navegador) {
        super(navegador);
    }

    public PaginaCadastro genero(){
        navegador.findElement(By.id("id_gender1")).click();
        return this;
    }

    public PaginaCadastro senha(String senha){
        navegador.findElement(By
                .id("password"))
                .sendKeys(senha);
        return this;
    }

    public PaginaCadastro dia(String dia){
        navegador.findElement(By
                .id("days"))
                .sendKeys(dia);
        return this;
    }

    public PaginaCadastro mes(String mes){
        navegador.findElement(By
                .id("months"))
                .sendKeys(mes);
        return this;
    }

    public PaginaCadastro ano(String ano){
        navegador.findElement(By
                .id("years"))
                .sendKeys(ano);
        return this;
    }

    public PaginaCadastro newsletter(){
        navegador.findElement(By
                .id("newsletter"))
                .click();
        return this;
    }

    public PaginaCadastro optin(){
        navegador.findElement(By
                .id("optin"))
                .click();
        return this;
    }

    public PaginaCadastro firstName(String firstName){
        navegador.findElement(By
                .id("first_name"))
                .sendKeys(firstName);
        return this;
    }

    public PaginaCadastro lastName(String lastName){
        navegador.findElement(By
                .id("last_name"))
                .sendKeys(lastName);
        return this;
    }

    public PaginaCadastro company(String company){
        navegador.findElement(By
                .id("company"))
                .sendKeys(company);
        return this;
    }

    public PaginaCadastro address1(String address1){
        navegador.findElement(By
                .id("address1"))
                .sendKeys(address1);
        return this;
    }

    public PaginaCadastro address2(String address2){
        navegador.findElement(By
                .id("address2"))
                .sendKeys(address2);
        return this;
    }

    public PaginaCadastro country(String country){
        navegador.findElement(By
                .id("country"))
                .sendKeys(country);
        return this;
    }

    public PaginaCadastro state (String state){
        navegador.findElement(By
                .id("state"))
                .sendKeys(state);
        return this;
    }

    public PaginaCadastro city (String city){
        navegador.findElement(By
                .id("city"))
                .sendKeys(city);
        return this;
    }

    public PaginaCadastro zipCode (String zipCode){
        navegador.findElement(By
                .id("zipcode"))
                .sendKeys(zipCode);
        return this;
    }

    public PaginaCadastro mobileNumber(String mobileNumber){
        navegador.findElement(By
                .id("mobile_number"))
                .sendKeys(mobileNumber);
        return this;
    }

    public ContaCriada pagina(){
        navegador.findElement(By
                .xpath("/html/body/section/div/div/div/div[1]/form/button"))
                .click();
        return new ContaCriada(navegador);
    }


}
