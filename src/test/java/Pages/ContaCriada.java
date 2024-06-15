package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ContaCriada extends PageBase{
    public ContaCriada(WebDriver navegador) {
        super(navegador);
        Assert
                .assertTrue(navegador
                        .getPageSource()
                        .contains("Congratulations! Your new account has been successfully created!"
                        )
                );
    }




}
