# language: pt

Funcionalidade: Preencher os formulários do site passado

  Cenario: Preencha a aba “Enter Insurant Data” e pressione next

    E digito no campo "First Name" : "Elisangela"
    E digito no campo "Last Name" : "Vieira"
    E digito no calendario "Date of Birth" a data "12/20/1985"
    E escolho a opcao "Female" no campo "Gender"
    E digito no campo "Street Address" : "Rua Anita Barbosa Silva"
    E seleciono a opcao "Brazil" no campo "Country"
    E digito no campo "Zip Code" : "31320240" 
    E digito no campo "City" : "Belo Horizonte"
    E seleciono a opcao "Selfemployed" no campo "Occupation"
    E escolho as opcoes "Speeding", "Skydiving" no campo "Hobbies"
    E digito no campo "Website" : "https://www.testedeperformance.com/"
    E digito no campo "Picture" : "https://arquivo.devmedia.com.br/marketing/img/guia-testes-de-software-34403.png"
    Entao clico no botao Next>> "nextenterproductdata"