package scontente.page;

import org.openqa.selenium.By;
import scontente.core.BasePage;

public class AccountPage extends BasePage {

    public String confereContaLogada() {
        return dsl.esperaPresencaDoElemento(By.xpath("//body[@id='my-account']//div/a[@class='account']/span"), 15).getText();
    }

}
