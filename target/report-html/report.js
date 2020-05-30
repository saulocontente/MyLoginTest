$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/scontente/features/Login.feature");
formatter.feature({
  "name": "login de usuario",
  "description": "Como um usuario \nQuero poder inserir os dados \nPara registrar meu cadastro \ne efetuar login na aplicacao",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Ir para Login",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que estou na pagina inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.queEstouNaPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acessei o login",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.acesseiOLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Sucesso",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "informar uma conta valida",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informarUmaContaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login sera efetuado com Sucesso na conta informada",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.loginSeraEfetuadoComSucessoNaContaInformada()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validar Regras de Login",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "informar \u0027\u003cemail\u003e\u0027 e \u0027\u003csenha\u003e\u0027 invalidos",
  "keyword": "Quando "
});
formatter.step({
  "name": "devo receber o erro: \u0027\u003cmsg\u003e\u0027",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "email",
        "senha",
        "msg"
      ]
    },
    {
      "cells": [
        "contentesaulo@gmail.com",
        "AmeDesafio",
        "Authentication failed."
      ]
    },
    {
      "cells": [
        "",
        "",
        "An email address required."
      ]
    }
  ]
});
formatter.background({
  "name": "Ir para Login",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que estou na pagina inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.queEstouNaPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acessei o login",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.acesseiOLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar Regras de Login",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "informar \u0027contentesaulo@gmail.com\u0027 e \u0027AmeDesafio\u0027 invalidos",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informarInvalidos(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo receber o erro: \u0027Authentication failed.\u0027",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.deveraExibirOErroAuthenticantionFailed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Ir para Login",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que estou na pagina inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.queEstouNaPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acessei o login",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.acesseiOLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar Regras de Login",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "informar \u0027\u0027 e \u0027\u0027 invalidos",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informarInvalidos(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo receber o erro: \u0027An email address required.\u0027",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.deveraExibirOErroAuthenticantionFailed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});