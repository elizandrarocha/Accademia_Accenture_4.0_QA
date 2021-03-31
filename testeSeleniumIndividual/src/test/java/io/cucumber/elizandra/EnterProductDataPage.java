package io.cucumber.elizandra;

import io.cucumber.elizandra.services.ConfiguracaoPage;
import io.cucumber.java.pt.*;

public class EnterProductDataPage extends ConfiguracaoPage{
  
  @Dado("escolho as opcoes {string}, {string} no item {string}")
  public void escolho_as_opcoes_no_item(String string, String string2, String string3) {
      
    if(string3.equals("Optional Products")){

      if(string.equals("Euro Protection")) 
        ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span").click();
      if(string2.equals("Legal Defense Insurance"))
        ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[2]/span").click();

    }
  }

}
