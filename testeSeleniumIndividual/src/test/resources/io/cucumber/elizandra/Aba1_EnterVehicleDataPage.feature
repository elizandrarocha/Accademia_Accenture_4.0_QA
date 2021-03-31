# language: pt

Funcionalidade: Preencher os formulários do site passado

  Cenario: Preencha a aba “Enter Vehicle Data” e pressione next

    Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
    E seleciono a opcao "Honda" no campo "Make"
    E seleciono a opcao "Scooter" no campo "Model"
    E digito no campo "Cylinder Capacity-[ccm]" : "745.00"
    E digito no campo "Engine Performance-[kW]" : "40.3" 
    E digito no calendario "Date of Manufacture" a data "11/10/2020"
    E seleciono a opcao "5" no campo "Number of Seats"
    E escolho o check "Yes" no campo "Right Hand Drive"
    E seleciono a opcao "3" no item "Number of Seats Motorcycle"
    E seleciono a opcao "Diesel" no item "Fuel Type" 
    E digito no campo "Payload-[kg]" : "10"
    E digito no campo "Total Weight-[kg]" : "238"
    E digito no campo "List Price-[$]" : "10000"
    E digito no campo "License Plate Number" : "PT114B"
    E digito no campo "Annual Mileage-[mi]" : "100"
    Entao clico no botao Next>> "nextenterinsurantdata"