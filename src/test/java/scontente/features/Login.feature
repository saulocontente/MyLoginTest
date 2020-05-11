#language: pt

#Criar um projeto de automação utilizando o site
#http://automationpractice.com/index.php 
#efetue um cadastro e que também contenha os cenários (em BDD) a seguir

Funcionalidade: login de usuario
Como um usuario 
Quero poder inserir os dados 
Para registrar meu cadastro 
e efetuar login na aplicacao



Cenario: Login Sucesso (se caso utilizar o login do cadastro, será um diferencial/plus).
Dado que estou na pagina inicial
Quando clickar no botao sign in
Entao visualizo a pagina de sign in
Quando informo o email: contente.saulo@gmail.com
E informo a senha: AmeDesafios
E clickar no botao Sign In
Entao Login sera efetuado com Sucesso na conta de Saulo Contente


Cenario: Login Inválido.
Dado que estou na pagina inicial
Quando clickar no botao sign in
Entao visualizo a pagina de sign in
Quando informo o email: contentesaulo@gmail.com
E informo a senha: AmeDesafio
E clickar no botao Sign In
Entao Devera exibir o erro: Authentication failed.


Cenario: Login em Branco
Dado que estou na pagina inicial
Quando clickar no botao sign in
Entao visualizo a pagina de sign in
Quando clickar no botao Sign In
Entao Devera exibir o erro: An email address required.