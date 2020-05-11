package scontente.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import scontente.core.BasePage;

public class AccountPage extends BasePage {
    public String contaLogada(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[@id='my-account']//div/a[@class='account']/span")));
        return dsl.buscaTexto(By.xpath("//body[@id='my-account']//div/a[@class='account']/span"));
    }
}
