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

    @Dado("^que estou na pagina inicial$")
    public void queEstouNaPaginaInicial() {
       index.abrirPaginaIndex();
    }
    
    @Quando("^clickar no botao sign in$")
    public void clickNoBotaoSignIn() {
        index.clickarBotaoLogin();
    }
    
    @Entao("^visualizo a pagina de sign in$")
    public void visualizoAPaginaDeSignIn() {
        Assert.assertTrue(login.buscaAutenticacao());
    }
    
    @Quando("^informo o email: (.+)$")
    public void informoOEmail(String texto) {
        login.entrarConta(texto);
    }

    @Quando("^informo a senha: (.+)$")
    public void informoASenha(String texto) {
        login.entrarSenha(texto);
    }

    @Quando("^clickar no botao Sign In$")
    public void clickarNoBotaoSignIn() {
        login.efetuarLogin();
    }

    @Entao("^Login sera efetuado com Sucesso na conta de (.+)$")
    public void loginSeraEfetuadoComSucessoNaContaDe(String usuario) {
        Assert.assertEquals(usuario, account.confereContaLogada());
    }

    @Entao("^Devera exibir o erro: (.+)$")
    public void deveraExibirOErroAuthenticantionFailed(String erro) {
        Assert.assertEquals(erro, login.erroLoginInvalido());
    }

    @Before
    public void sairLogin() {
        index.abrirPaginaIndex();
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