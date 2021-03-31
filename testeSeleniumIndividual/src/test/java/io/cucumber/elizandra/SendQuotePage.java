package io.cucumber.elizandra;

import io.cucumber.elizandra.services.ConfiguracaoPage;
import io.cucumber.java.pt.*;

public class SendQuotePage extends ConfiguracaoPage{

  @Dado("escrevo no campo {string} : {string}")
  public void escrevo_no_campo(String string, String string2) {
    ConfiguracaoPage.seletorQueryCss("textarea[id='" + string + "'").sendKeys(string2);
  }

  @Entao("devo ver a mensagem {string} na tela")
  public void devo_ver_a_mensagem_na_tela(String string) throws InterruptedException {

    Thread.sleep(10000);
    String mensagem = ConfiguracaoPage.seletorQueryCss("h2").getText();
    //System.out.println(mensagem);
    if(mensagem.equals(string)) System.out.println("Validado com sucesso!");
    else System.out.println("Existe algum erro na mensagem!");
    Thread.sleep(1000);
    ConfiguracaoPage.fechar();

  }
  
}
