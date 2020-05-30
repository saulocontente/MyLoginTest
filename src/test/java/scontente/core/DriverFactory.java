package scontente.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver;

	public static WebDriver startDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void maximizarDriver() {
		if(driver != null) {
		  driver.manage().window().maximize();
		}
	}

	public static void killDriver() {
		if(driver != null) {
				driver.quit();
				driver = null;
		}
	}
	
}
