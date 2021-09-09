package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.pt.Dado;
//import cucumber.api.java.pt.Entao;
//import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;

public class Post extends Base{

    private Base base;

    public Post(Base base){
        this.base = base;
    }


//    @Dado("^que acesso o wikipedia$")
//    public void queAcessoOWikipedia() {
//        base.driver.get(base.url);
//    }
//
//    @Quando("^pesquiso por \"([^\"]*)\"$")
//    public void pesquisoPor(String item)  {
//       base.driver.findElement(By.name("search")).sendKeys(item + Keys.ENTER);
//    }
//
//    @Entao("^exibe a pesquisa \"([^\"]*)\" no titulo da pagina$")
//    public void exibeAPesquisaNoTituloDaPagina(String item)  {
//        assertTrue(base.driver.getTitle().contains(item));
@Given("^que acesso o wikipedia$")
public void queAcessoOWikipedia() {
    base.driver.get(base.url);
}

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String item)  {
        base.driver.findElement(By.name("search")).sendKeys(item + Keys.ENTER);
    }

    @Then("^exibe a pesquisa \"([^\"]*)\" no titulo da pagina$")
    public void exibeAPesquisaNoTituloDaPagina(String item)  {
        assertTrue(base.driver.getTitle().contains(item));

    }


}
