package scontente.page;

import org.openqa.selenium.By;

import scontente.core.BasePage;

public class IndexPage extends BasePage {
    
    public void abrirLogin(){
        dsl.click(By.xpath("//*[@id='header']//a[@class = 'login']"));
    }
}