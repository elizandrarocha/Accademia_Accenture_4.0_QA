package io.cucumber.elizandra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class validadorManifestoSteps {

    public WebDriver browser;

    public validadorManifestoSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        browser = new ChromeDriver();
    }

    @Dado("que eu estou no site da gama academy {string}")
    public void que_eu_estou_no_site_da_gama_academy(String string) throws InterruptedException {
        browser.get(string);
        Thread.sleep(3000);
        //Actions actions = new Actions(browser);
        //actions.sendKeys(Keys.ESCAPE);
    }

    @Entao("devo fechar o PopUp Inicial que aparece")
    public void devo_fechar_o_PopUp_Inicial_que_aparece() {
        WebElement input = browser.findElement( By.cssSelector("button[type='button']") );
		input.click();
    }


    @Dado("clico na opcao {string}")
    public void clico_na_opcao(String string){
        WebElement input = browser.findElement( By.cssSelector("a[href='/sobre']"));
		input.click();
    }

    @Entao("devo ver o item do {string}")
    public void devo_ver_o_item_do(String string) throws InterruptedException {
        
        WebElement input = browser.findElement( By.cssSelector("div.all.manifesto h1.heading.lado"));
        if(input == null) System.out.println("NOT OK");
        else System.out.println("OK");
        Thread.sleep(1000);
        browser.quit();
        
    }

    
}
