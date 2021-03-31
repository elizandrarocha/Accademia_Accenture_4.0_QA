package io.cucumber.elizandra;

import io.cucumber.elizandra.services.ConfiguracaoPage;
import io.cucumber.java.pt.*;

public class EnterInsurantDataPage extends ConfiguracaoPage {

  @Dado("escolho a opcao {string} no campo {string}")
  public void escolho_a_opcao_no_campo(String string, String string2) {

    if(string2.equals("Gender")){
      switch(string){
        case "Male":
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span").click();
        break;
        case "Female":
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span").click();
        break;
      }
    }

  }

  @Dado("escolho as opcoes {string}, {string} no campo {string}")
  public void escolho_as_opcoes_no_campo(String string, String string2, String string3) {
      
    if(string3.equals("Hobbies")){
      if(string.equals("Speeding"))
        ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[1]/span").click();
      if(string2.equals("Skydiving"))
        ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]/span").click();
    }

  }


}
