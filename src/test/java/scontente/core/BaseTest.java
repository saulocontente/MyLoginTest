package scontente.core;

import org.junit.After;

public class BaseTest {
	
	@After
	public void backdown() {
		if(Propriedades.FECHAR_BROWSER) {
			DriverFactory.killDriver();
		}
	}

}
