package scontente.page;

import org.openqa.selenium.By;

import scontente.core.BasePage;

public class IndexPage extends BasePage {

    public void abrirPaginaIndex() {
        dsl.openUrl("http://automationpractice.com/index.php");
    }

    public void clickarBotaoLogin() {
        dsl.esperaVisbilidadeDoElemento(By.xpath("//*[@id='header']//a[@class = 'login']"), 15).click();
    }

}