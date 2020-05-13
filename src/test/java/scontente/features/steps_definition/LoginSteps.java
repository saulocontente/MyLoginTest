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
        getDriver().get("http://automationpractice.com/index.php");
        index = new IndexPage();
    }
    
    @Quando("^clickar no botao sign in$")
    public void clickNoBotaoSignIn() {
        index.abrirLogin();
        login = new LoginPage();
    }
    
    @Entao("^visualizo a pagina de sign in$")
    public void visualizoAPaginaDeSignIn() {
        Assert.assertTrue(login.buscaAutenticacao(getDriver()));
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
        account = new AccountPage();
    }
    @Entao("^Login sera efetuado com Sucesso na conta de (.+)$")
    public void loginSeraEfetuadoComSucessoNaContaDe(String usuario) {
        Assert.assertEquals(usuario, account.contaLogada(getDriver()));
        killDriver();
    }

    @Entao("^Devera exibir o erro: (.+)$")
    public void deveraExibirOErroAuthenticantionFailed(String erro) {
        Assert.assertEquals(erro, login.invalido(getDriver()));
        killDriver();
    }
    
}