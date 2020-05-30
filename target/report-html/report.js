$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/scontente/features/Login.feature");
formatter.feature({
  "name": "login de usuario",
  "description": "Como um usuario \nQuero poder inserir os dados \nPara registrar meu cadastro \ne efetuar login na aplicacao",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Login Sucesso (se caso utilizar o login do cadastro, será um diferencial/plus).",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
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
  "name": "clickar no botao sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.clickNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a pagina de sign in",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.visualizoAPaginaDeSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o email: contente.saulo@gmail.com",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informoOEmail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a senha: AmeDesafios",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informoASenha(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickar no botao Sign In",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.clickarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login sera efetuado com Sucesso na conta de Saulo Contente",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.loginSeraEfetuadoComSucessoNaContaDe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Inválido.",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
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
  "name": "clickar no botao sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.clickNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a pagina de sign in",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.visualizoAPaginaDeSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o email: contentesaulo@gmail.com",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informoOEmail(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a senha: AmeDesafio",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.informoASenha(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickar no botao Sign In",
  "keyword": "E "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.clickarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Devera exibir o erro: Authentication failed.",
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
formatter.scenario({
  "name": "Login em Branco",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
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
  "name": "clickar no botao sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.clickNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a pagina de sign in",
  "keyword": "Entao "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.visualizoAPaginaDeSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickar no botao Sign In",
  "keyword": "Quando "
});
formatter.match({
  "location": "scontente.features.steps_definition.LoginSteps.clickarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Devera exibir o erro: An email address required.",
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