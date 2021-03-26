# language: pt

Funcionalidade: Verificacao de itens para aquisicao do curso

  Cenario: Validacao de itens como 'valor' e botao 'proximo passo' 
    Dado que eu estou no site da gama academy "https://pages.gama.academy/curso-de-product-management/"
    E clico na opção "QUERO IR PARA O PRÓXIMO NÍVEL"
    Então devo ver o valor e o botão comprar agora

  Cenario: Validacao de itens na pagina 'Dev Full Stack'
    Dado que eu estou no site da gama academy "https://www.gama.academy/"
    E clico na opção "DEV FULL STACK"
    Então devo ver os seguintes itens 
    |Crie seu portfólio!|
    |Acompanhamento de Carreira|
    |Professores de surf que sabem surfar!|
    |Estude na Melhor Startup de Educação|

