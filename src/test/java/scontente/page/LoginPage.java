package scontente.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import scontente.core.BasePage;

public class LoginPage extends BasePage {
    public Boolean buscaAutenticacao(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver , 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[@id='authentication']")));
        return dsl.confereElemento(By.xpath("//body[@id='authentication']"));
    }

    public void entrarConta(String texto){
        dsl.escreve(By.xpath("//div[@class = 'columns-container']//div[@class='col-xs-12 col-sm-6']//input[@id='email']"), texto);
    }

    public void entrarSenha(String texto){
        dsl.escreve(By.xpath("//div[@class = 'columns-container']//div[@class='col-xs-12 col-sm-6']//input[@id='passwd']"), texto);
    }

	public void efetuarLogin() {
        dsl.click(By.xpath("//div[@class = 'columns-container']//div[@class='col-xs-12 col-sm-6']//button[@id='SubmitLogin']"));
    }

	public String invalido(WebDriver driver) {
		return dsl.buscaTexto(By.xpath("//div[@id = 'center_column']/div[@class='alert alert-danger']//li"));
	}
    
}
