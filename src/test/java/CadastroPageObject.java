import Pages.PaginaCadastro;
import Pages.PreCadastro;
import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CadastroPageObject {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createDriver();
    }

    @Test
    public void cadastro (){
        new PreCadastro(navegador)
                .login("testePaginaPreCadastro")
                .email("testeemailemail@mymail.org.com")
                .pagina()
                .genero()
                .senha("123456")
                .dia("10")
                .mes("12")
                .ano("1987")
                .newsletter()
                .optin()
                .firstName("Jose")
                .lastName("Augurio")
                .company("it talent")
                .address1("rua teste")
                .address2("rua teste 2")
                .country("United States")
                .state("Oregon")
                .city("Atlanta")
                .zipCode("3400000")
                .mobileNumber("3990090034")
                .pagina();
    }

    //@After
    public void tearDown(){
        navegador.quit();
    }
}
