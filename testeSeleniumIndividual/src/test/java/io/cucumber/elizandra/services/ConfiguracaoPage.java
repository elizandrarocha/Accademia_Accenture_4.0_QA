package io.cucumber.elizandra.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConfiguracaoPage {
    
    public static WebDriver browser;
    
    public static void abrir(String url){
        
        if(browser == null){

            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            browser = new ChromeDriver();
            browser.manage().window().maximize();
        }
      
        browser.get(url);
    }

    public static void fechar(){
        browser.close();
        browser = null;
    }

    public static WebElement seletorQueryCss(String seletor) {
        return  ConfiguracaoPage.browser.findElement(By.cssSelector(seletor));
    }
    
    public static WebElement seletorQueryXpath(String seletor) {
        return  ConfiguracaoPage.browser.findElement(By.xpath(seletor));
    }

    public static WebElement seletorClassName(String seletor) {
        return ConfiguracaoPage.browser.findElement(By.className(seletor));
    }
    
}    
 