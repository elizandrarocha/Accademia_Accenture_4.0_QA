package io.cucumber.elizandra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.pt.*;

public class validadorItensSteps {

    public WebDriver browser;

    public validadorItensSteps(){

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        browser = new ChromeDriver();
    }
    
    @Dado("que eu estou no site da gama academy {string}")
    public void que_eu_estou_no_site_da_gama_academy(String string) {
        browser.get(string);
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.ESCAPE);
    }

    @Dado("clico na opção {string}")
    public void clico_na_opção(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Então("devo ver o valor e o botão comprar agora")
    public void devo_ver_o_valor_e_o_botão_comprar_agora() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Então("devo ver os seguintes itens")
    public void devo_ver_os_seguintes_itens(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    
}
