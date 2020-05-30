package scontente.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import scontente.core.BasePage;

public class LoginPage extends BasePage {

    public Boolean buscaAutenticacao() {
        return dsl.esperaVisbilidadeDoElemento(By.xpath("//body[@id='authentication']"), 15).isDisplayed();
    }

    public void entrarConta(String texto) {
        dsl.escreve(By.xpath("//div[@class = 'columns-container']//div[@class='col-xs-12 col-sm-6']//input[@id='email']"), texto);
    }

    public void entrarSenha(String texto) {
        dsl.escreve(By.xpath("//div[@class = 'columns-container']//div[@class='col-xs-12 col-sm-6']//input[@id='passwd']"), texto);
    }

	public void efetuarLogin() {
        dsl.click(By.xpath("//div[@class = 'columns-container']//div[@class='col-xs-12 col-sm-6']//button[@id='SubmitLogin']"));
    }

	public String erroLoginInvalido() {
		return dsl.esperaPresencaDoElemento(By.xpath("//div[@id = 'center_column']/div[@class='alert alert-danger']//li"), 10).getText();
	}

	public void fazerLogOut(){
        dsl.click(By.className("logout"));
    }
    
}
