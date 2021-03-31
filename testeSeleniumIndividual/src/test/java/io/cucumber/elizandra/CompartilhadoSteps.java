package io.cucumber.elizandra;

import io.cucumber.elizandra.services.ConfiguracaoPage;
import io.cucumber.java.pt.*;

public class CompartilhadoSteps {

  @Dado("seleciono a opcao {string} no campo {string}")
  public void seleciono_a_opcao_no_campo(String string, String string2) {

    string2 = string2.replace(" ", "");
    ConfiguracaoPage.seletorQueryXpath("//*[@id='" + string2.toLowerCase() + "']/option[@value='" + string + "']").click();

  }

  @Dado("seleciono a opcao {string} no item {string}")
  public void seleciono_a_opcao_no_item(String string, String string2) {
      
    ConfiguracaoPage.seletorQueryXpath("//*[@name='" + string2 + "']/option[@value='" + string + "']").click();
  }
  /*
  @Dado("escolho a opcao {string} no campo {string}")
  public void escolho_a_opcao_no_campo(String string, String string2) {

    switch(string2) {
      case "Right Hand Drive":
        switch(string){
          case "Yes": 
            ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]/span").click();
          break;
          case "No":
            ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]/span").click();
          break;
        }
        break;
      case "Gender":
        switch(string){
          case "Male":
            ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span").click();
          break;
          case "Female":
            ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span").click();
          break;
        }
      break;
      
    }    

  }*/

  /*

  @Dado("escolho as opcoes {string}, {string} no campo {string}")
  public void escolho_as_opcoes_no_campo(String string, String string2, String string3) {
      
    switch(string3){
      
      case "Hobbies":

        if(string.equals("Speeding"))
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[1]/span").click();
        if(string2.equals("Skydiving"))
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]/span").click();

      break;
      case "Optional Products":

        if(string.equals("Euro Protection")) 
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span").click();
        if(string2.equals("Legal Defense Insurance"))
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[2]/span").click();

      break;  
    }

  }
 */ 
  @Dado("digito no campo {string} : {string}")
  public void digito_no_campo(String string, String string2) {

    string = string.replace(" ", "");
    String splitString[] = string.split("-");
    String id = splitString[0].toLowerCase();
    //System.out.println(id);  
    ConfiguracaoPage.seletorQueryCss("input[id='" + id + "'").sendKeys(string2);

  }

  @Dado("digito no calendario {string} a data {string}")
  public void digito_no_calendario_a_data(String string, String string2) {

    ConfiguracaoPage.seletorQueryCss("input[name='" + string + "'").sendKeys(string2);
    
  }
 
  @Entao("clico no botao Next>> {string}")
  public void clico_no_botao_Next(String string) throws InterruptedException {
    Thread.sleep(2000);
    ConfiguracaoPage.seletorQueryXpath("//*[@id='" + string + "']").click();
  }

}
