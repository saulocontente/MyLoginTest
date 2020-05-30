package scontente.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static scontente.core.DriverFactory.startDriver;


public class DSL {

	public void openUrl(String url){
		startDriver().get(url);
	}

	/*========================Click========================
		-	Metodos para clickar em um elemento da tela
	*/
	public void click(By by) {
		startDriver().findElement(by).click();
	}

	public void click(String idElemento) {
		click(By.id(idElemento));
	}

	/*========================Limpa & Escreve========================
		-	Metodos para limpar e escrever o valor a um elemento de entrada de texto da tela
	*/
	public void limpa(By by) {
		startDriver().findElement(by).clear();
	}

	public void escreve(By by, String texto) {
		limpa(by);
		startDriver().findElement(by).sendKeys(texto);
	}

	public void escreve(String idElemento, String texto) {
		escreve(By.id(idElemento), texto);
	}

	/*========================Leia========================
		-	Metodos para ler o valor de um elemento de entrada de texto da tela
	*/
	public String leia(By by) {
		return startDriver().findElement(by).getAttribute("value");
	}

	public String leia(String idElemento) {
		return leia(By.id(idElemento));
	}

	/*========================Leia========================
		-	Metodos para ler o valor de um elemento de entrada de texto da tela
	*/
	public WebElement esperaVisbilidadeDoElemento(By by, int timeout) {
		WebDriverWait wait = new WebDriverWait(startDriver(), timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement esperaPresencaDoElemento(By by, int timeout) {
		WebDriverWait wait = new WebDriverWait(startDriver(), timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	/*========================BuscaTexto========================
		-	Metodos para Obter o texto de um elemento da tela
	*/
	public String buscaTexto(By by) {
		return startDriver().findElement(by).getText();
	}

	public String buscaTexto(String idElemento) {
		return buscaTexto(By.id(idElemento));
	}

	/*========================Selecionado========================
		-	Metodos para Verificar se um checkbox da tela foi selecionado 
	*/
	public boolean selecionado(String idElemento) {
		return startDriver().findElement(By.id(idElemento)).isSelected();
	}

	/*========================BuscaCombo========================
		-	Metodos para obter um elemento do tipo ComboBox na tela
	*/
	public Select buscaCombo(By by) {
		Select combo = new Select(startDriver().findElement(by));
		return combo;
	}

}