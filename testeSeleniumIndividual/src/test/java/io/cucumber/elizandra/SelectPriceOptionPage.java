package io.cucumber.elizandra;

import io.cucumber.elizandra.services.ConfiguracaoPage;
import io.cucumber.java.pt.*;

public class SelectPriceOptionPage extends ConfiguracaoPage{

  @Dado("seleciono a opcao {string}")
  public void seleciono_a_opcao(String string) throws InterruptedException {

    Thread.sleep(2000);
    switch(string){
      case "Silver":
        ConfiguracaoPage.seletorQueryXpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[1]/span").click();
      break;
      case "Gold":
        ConfiguracaoPage.seletorQueryXpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[2]/span").click();
      break;
      case "Platinum":
        ConfiguracaoPage.seletorQueryXpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[3]/span").click();
      break;
      case "Ultimate":
        ConfiguracaoPage.seletorQueryXpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]/span").click();
      break;
    }
     
  }
  
}
