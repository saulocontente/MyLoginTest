#language: pt

#Criar um projeto de automação utilizando o site
#http://automationpractice.com/index.php 
#efetue um cadastro e que também contenha os cenários (em BDD) a seguir

Funcionalidade: login de usuario
Como um usuario 
Quero poder inserir os dados 
Para registrar meu cadastro 
e efetuar login na aplicacao

Contexto: Ir para Login
  Dado que estou na pagina inicial
  E acessei o login

Cenario:  Login Sucesso
  Quando informar uma conta valida
  Entao login sera efetuado com Sucesso na conta informada



Esquema do Cenario: Validar Regras de Login
  Quando informar '<email>' e '<senha>' invalidos
  Entao devo receber o erro: '<msg>'
    Exemplos:
    |              email             |      senha      |               msg              |
    |    contentesaulo@gmail.com   |   AmeDesafio   |    Authentication failed.    |
    |                                 |                 |  An email address required.  |