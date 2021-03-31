# language: pt

Funcionalidade: Preencher os formulários do site passado

 Cenario: Preencha a aba “Send Quote” e pressione Send
    E digito no campo "EMail" : "elisangeavieira@gmail.com"
    E digito no campo "Phone" : "5531988267130"
    E digito no campo "Username" : "elisangelav"
    E digito no campo "Password" : "T$ST3t$St$"
    E digito no campo "Confirm Password" : "T$ST3t$St$"
    E escrevo no campo "Comments" : "Isso é apenas um Teste!!!"
    Entao clico no botao Next>> "sendemail"
    Entao devo ver a mensagem "Sending e-mail success!" na tela