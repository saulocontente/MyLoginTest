package scontente.features.steps_definition;

import static scontente.core.DriverFactory.getDriver;
import static scontente.core.DriverFactory.killDriver;

import org.junit.Assert;

import io.cucumber.java.pt.*;
import scontente.core.BaseTest;
import scontente.page.AccountPage;
import scontente.page.IndexPage;
import scontente.page.LoginPage;

public class LoginSteps extends BaseTest{
    private IndexPage index;
    private LoginPage login;
    private AccountPage account;
    @Dado("^que estou na pagina inicial$")
    public void queEstouNaPaginaInicial() {
        // Write code here that turns the phrase above into concrete actions
        getDriver().get("http://automationpractice.com/index.php");
        index = new IndexPage();
    }
    
    @Quando("^clickar no botao sign in$")
    public void clickNoBotaoSignIn() {
        // Write code here that turns the phrase above into concrete actions
        index.abrirLogin();
        login = new LoginPage();
    }
    
    @Entao("^visualizo a pagina de sign in$")
    public void visualizoAPaginaDeSignIn() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(login.buscaAutenticacao(getDriver()));
    }
    
    @Quando("^informo o email: (.+)$")
    public void informoOEmail(String texto) {
        // Write code here that turns the phrase above into concrete actions
        login.entrarConta(texto);
    }
    @Quando("^informo a senha: (.+)$")
    public void informoASenha(String texto) {
        // Write code here that turns the phrase above into concrete actions
        login.entrarSenha(texto);
    }
    @Quando("^clickar no botao Sign In$")
    public void clickarNoBotaoSignIn() {
        // Write code here that turns the phrase above into concrete actions
        login.efetuarLogin();
        account = new AccountPage();
    }
    @Entao("^Login sera efetuado com Sucesso na conta de (.+)$")
    public void loginSeraEfetuadoComSucessoNaContaDe(String usuario) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(usuario, account.contaLogada(getDriver()));
        killDriver();
    }

    @Entao("^Devera exibir o erro: (.+)$")
    public void deveraExibirOErroAuthenticantionFailed(String erro) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(erro, login.invalido(getDriver()));
        killDriver();
    }
    
}