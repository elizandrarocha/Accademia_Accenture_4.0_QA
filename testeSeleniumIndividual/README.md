# Descrição do desafio individual

### Criar um projeto em selenium webdrive (java) e cucumber usando Page objects com os seguintes cenários:

- [x]<b>Caso de teste 1</b>: Preencher o formulário, aba “Enter Vehicle Data” e pressione next
- [x]<b>Caso de teste 2</b>: Preencher o formulário, aba “Enter Insurant Data” e pressione next
- [x]<b>Caso de teste 3</b>: Preencher o formulário, aba “Enter Product Data” e pressione next
- [x]<b>Caso de teste 4</b>: Preencher o formulário, aba “Select Price Option” e pressione next
- [x]<b>Caso de Teste 5</b>: Preencher o formulário, aba “Send Quote” e pressione Send

<li> Validação: Verificar a mensagem “Sending e-mail success!” na tela </li>

--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java 11</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir a linguagem natural em português para Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser e realizando o teste de comportamento BDD<br>

--------------------------------------------------------------------

## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar JDK
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado corretamente no computador



- Clone do projeto
 ```bash
git clone https://github.com/elizandrarocha/Accademia_Accenture_4.0_QA.git
 ```

- Entrando na pasta do projeto
 ```bash
cd testeSeleniumIndividual
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto (versão conforme seu navegador):<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- elizandra<br>
    |  |  |  |  |  |--services<br>
    |  |  |  |  |  |  |-- ConfiguracaoPage.java -- Inicialização e fechamento do browser juntamente com os métodos de busca de elementos web <br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br> 
    |  |  |  |  |  |-- CompartilhadoSteps.java -- classe que chama os métodos de seleção, entrada de dados e cliques do botão Next em todas as Pages<br>
    |  |  |  |  |  |-- EnterVehicleDataPage.java -- preenchimento da aba inicial do form<br>
    |  |  |  |  |  |-- EnterInsurantDataPage.java -- preenchimento da segunda aba do form<br>
    |  |  |  |  |  |-- EnterProductDataPage.java -- preenchimento da terceira aba do form<br>
    |  |  |  |  |  |-- SelectPriceOptionPage.java -- preenchimento da quarta aba do form<br>
    |  |  |  |  |  |-- SendQuotePage.java -- preenchimento da última aba do form<br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- elizandra<br>
    |  |  |  |  |  |-- Aba1_EnterVehicleDataPage.feature -- Gherkin com os steps do caso de teste 1<br>
    |  |  |  |  |  |-- Aba2_EnterInsurantDataPage.feature -- Gherkin com os steps do caso de teste 2<br>
    |  |  |  |  |  |-- Aba3_EnterProductDataPage.feature -- Gherkin com os steps do caso de teste 3<br>
    |  |  |  |  |  |-- Aba4_SelectPriceOptionPage.feature -- Gherkin com os steps do caso de teste 4<br>  
    |  |  |  |  |  |-- Aba5_SendQuotePage.feature -- Gherkin com os steps do caso de teste 5<br>  
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>