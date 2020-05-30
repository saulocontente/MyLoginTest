package scontente.features.steps_definition;

import static scontente.core.DriverFactory.startDriver;
import static scontente.core.DriverFactory.killDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.Assert;

import io.cucumber.java.pt.*;

import org.junit.BeforeClass;
import scontente.core.DriverFactory;
import scontente.page.AccountPage;
import scontente.page.IndexPage;
import scontente.page.LoginPage;

public class LoginSteps {

    private IndexPage index = new IndexPage();
    private LoginPage login = new LoginPage();
    private AccountPage account = new AccountPage();
    private String usuario;

    @Dado("que estou na pagina inicial")
    public void queEstouNaPaginaInicial() {
       index.abrirPaginaIndex();
    }
    
    @E("acessei o login")
    public void acesseiOLogIn() {
        index.clickarBotaoLogin();
        Assert.assertTrue(login.buscaAutenticacao());
    }

    @Quando("informar uma conta valida")
    public void informarUmaContaValida() {
        String email = "contente.saulo@gmail.com";
        String senha = "AmeDesafios";
        usuario = "Saulo Contente";
        login.entrarConta(email);
        login.entrarSenha(senha);
        login.efetuarLogin();
    }

    @Entao("login sera efetuado com Sucesso na conta informada")
    public void loginSeraEfetuadoComSucessoNaContaInformada() {
        Assert.assertEquals(usuario, account.confereContaLogada());
    }

    @Quando("informar {string} e {string} invalidos")
    public void informarInvalidos(String email, String senha) {
        login.entrarConta(email);
        login.entrarSenha(senha);
        login.efetuarLogin();
    }

    @Entao("devo receber o erro: {string}")
    public void deveraExibirOErroAuthenticantionFailed(String erro) {
        Assert.assertEquals(erro, login.erroLoginInvalido());
    }

    @Before
    public void inicializarDriver() {
        DriverFactory.startDriver();
        DriverFactory.maximizarDriver();
    }

    @After
    public void finalizarDriver() {
        DriverFactory.killDriver();
    }
}