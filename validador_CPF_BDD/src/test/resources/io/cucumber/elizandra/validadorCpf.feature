# language: pt
Funcionalidade: Validacao de CPF
  Fizemos no curso um sistema que faz uma valiacao de CPF
  com isso estamos criando um teste para automatizar o processo de validacao.

  Cenario: Testando CPF Valido
    Quando eu acesso o sistema de validacao de CPF
    E digito no campo nome "Jose Carlos"
    E digito um CPF "893.018.820-60" valido
    E clico no botao enviar
    Entao devo ver a mensagem de sucesso "Foi validado com sucesso"

  Cenario: Testando CPF Invalido
    Quando eu acesso o sistema de validacao de CPF
    E digito no campo nome "Daniel Oliveira"
    E digito um CPF "893.018.820-XX" invalido
    E clico no botao enviar
    Entao devo ver a mensagem de sucesso "Não validado com sucesso"

    