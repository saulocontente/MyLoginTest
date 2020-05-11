package scontente.core;

import static scontente.core.DriverFactory.getDriver;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DSL {

	/*========================Click========================
		-	Metodos para clickar em um elemento da tela
	*/
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	public void click(String idElemento) {
		click(By.id(idElemento));
	}


	/*========================Limpa & Escreve========================
		-	Metodos para limpar e escrever o valor a um elemento de entrada de texto da tela
	*/
	public void limpa(By by) {
		getDriver().findElement(by).clear();
	}
	public void escreve(By by, String texto) {
		limpa(by);
		getDriver().findElement(by).sendKeys(texto);
	}
	public void escreve(String idElemento, String texto) {		
		escreve(By.id(idElemento), texto);
	}
	

	/*========================Leia========================
		-	Metodos para ler o valor de um elemento de entrada de texto da tela
	*/
	public String leia(By by) {
		return getDriver().findElement(by).getAttribute("value");
	}
	public String leia(String idElemento) {
		return leia(By.id(idElemento));
	}
	
	public Boolean confereElemento(By by){
		return getDriver().findElement(by).isDisplayed();
	}
	/*========================BuscaTexto========================
		-	Metodos para Obter o texto de um elemento da tela
	*/
	public String buscaTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	public String buscaTexto(String idElemento) {
		return buscaTexto(By.id(idElemento));
	}

	/*========================Selecionado========================
		-	Metodos para Verificar se um checkbox da tela foi selecionado 
	*/
	public boolean selecionado(String idElemento) {
		return getDriver().findElement(By.id(idElemento)).isSelected();
	}
	

	/*========================BuscaCombo========================
		-	Metodos para obter um elemento do tipo ComboBox na tela
	*/
	public Select buscaCombo(By by){
		Select combo = new Select(getDriver().findElement(by));
		return combo;
	}
	/*========================ObterOpcoesCombo========================
		-	Metodos para Obter o(s) elemento(s) de um ComboBox na tela
	*/
	public List<WebElement> obterOpcoesCombo(String idElemento){
		List<WebElement> options = buscaCombo(By.id(idElemento)).getOptions();
		return options;
	}
	/*========================SelecionarCombo========================
		-	Metodos para Selecionar elemento(s) de um ComboBox na tela
	*/
	public void selecionarComboByVisibleText (String idElemento, String visibleText) {
		buscaCombo(By.id(idElemento)).selectByVisibleText(visibleText);	
	}
	public void deselecionarComboByVisibleText (String idElemento, String visibleText) {
		buscaCombo(By.id(idElemento)).deselectByVisibleText(visibleText);	
	}

	public void selecionarComboByIndex (String idElemento, Integer index) {
		buscaCombo(By.id(idElemento)).selectByIndex(index);	
	}
	public void deselecionarComboByIndex (String idElemento, Integer index) {
		buscaCombo(By.id(idElemento)).deselectByIndex(index);	
	}

	public void selecionarComboByValue (String idElemento, String value) {
		buscaCombo(By.id(idElemento)).selectByValue(value);	
	}
	public void deselecionarComboByValue (String idElemento, String value) {
		buscaCombo(By.id(idElemento)).deselectByValue(value);	
	}
	
	/*========================BuscaSelecionadosCombo========================
		-	Metodos para Obter o(s) elemento(s) selecionado(s) de um ComboBox na tela
	*/
	public List<WebElement> buscaSelecionadosCombo (String idElemento) {
		List<WebElement> selecionados = buscaCombo(By.id(idElemento)).getAllSelectedOptions();
		return selecionados;
	}

	
	
	/*========================Manusear Alertas========================
		-	Metodos para Controlar alertas exibidos na tela
	*/
	public String AlertTextAccept() {
		Alert alerta = getDriver().switchTo().alert();
		String valor = alerta.getText();
		alerta.accept();
		return valor;
	}
	public String AlertTextDismiss() {
		Alert alerta = getDriver().switchTo().alert();
		String valor = alerta.getText();
		alerta.dismiss();
		return valor;
	}
	
	/*========================Frames e Janelas========================
		-	Metodos para Alternar entre Frames ou Janelas exibidas na tela
	*/
	public void entrarFrame(String frame) {
		getDriver().switchTo().frame(frame);
	}
	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}
	public void trocarJanela(String window){
		getDriver().switchTo().window(window);
	}
}
