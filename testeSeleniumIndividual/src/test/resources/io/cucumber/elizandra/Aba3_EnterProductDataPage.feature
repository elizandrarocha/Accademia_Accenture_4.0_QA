# language: pt

Funcionalidade: Preencher os formulários do site passado

  Cenario: Preencha a aba “Enter Product Data” e pressione next

    E digito no calendario "Start Date" a data "06/16/2021"
    E seleciono a opcao "15000000" no item "Insurance Sum"
    E seleciono a opcao "Bonus 7" no item "Merit Rating"
    E seleciono a opcao "Partial Coverage" no item "Damage Insurance"
    E escolho as opcoes "Euro Protection", "Legal Defense Insurance" no item "Optional Products"
    E seleciono a opcao "Yes" no item "Courtesy Car"
    Entao clico no botao Next>> "nextselectpriceoption"