# language: pt
Funcionalidade: Verificacao de item Manifesto
  Objetivo: verificar se o item acima aparece na pagina 
  ao clicarmos em Quem Somos na pagina principal da Gama Academy.

  Cenario: Validacao do item Manifesto
    Dado que eu estou no site da gama academy "https://www.gama.academy/"
    Entao devo fechar o PopUp Inicial que aparece 
    Quando clico na opcao "Quem somos"
    Entao devo ver o item do "MANIFESTO"