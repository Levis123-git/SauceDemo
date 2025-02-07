package Runner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import Drivers.Drivers;

public class Executa extends Drivers {
	
	@BeforeAll
	public void antesDoTeste() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		
	}
	@BeforeEach
	public void depoisDoTeste() {
		driver.quit();
	}

}
