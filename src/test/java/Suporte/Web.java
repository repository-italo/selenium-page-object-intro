package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {
    public static WebDriver createDriver(){
        WebDriver navegador = new FirefoxDriver();
        navegador.get("https://automationexercise.com/login");

        return navegador;
    }
}
