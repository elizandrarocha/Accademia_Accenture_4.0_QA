package io.cucumber.elizandra;

import io.cucumber.elizandra.services.ConfiguracaoPage;
import io.cucumber.java.pt.*;

public class EnterVehicleDataPage extends ConfiguracaoPage {

  @Dado("que eu estou no site {string}")
  public void que_eu_estou_no_site(String string) {
    ConfiguracaoPage.abrir(string);
  }

  @Dado("escolho o check {string} no campo {string}")
  public void escolho_o_check_no_campo(String string, String string2) {

    if(string2.equals("Right Hand Drive")){

      switch(string){
        case "Yes": 
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]/span").click();
        break;
        case "No":
          ConfiguracaoPage.seletorQueryXpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]/span").click();
        break;
      }  

    }

   }
  
}
