package MetodosDeTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Drivers.Drivers;

public class Metodos extends Drivers {

	public void metodoEscrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void metodoClicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void metodoApagar(By elemento) {
		driver.findElement(elemento).clear();
	}

	public void validarUrl(String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlCapturada, urlEsperada);
		if (urlEsperada.equals(urlCapturada)) {
			System.out.println("As URL´s coicidem");
		} else {
			System.out.println("As URL´s não coincidem, a URL capturada foi " + urlCapturada);
		}

	}

	public void validarAlert(String textoEsperada) {
		String textoCapturado = driver.switchTo().alert().getText();
		assertEquals(textoCapturado, textoEsperada);
	}

	public void pegarTextoNoElemento(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);
		if (textoEsperado.equals(textoCapturado)) {
			System.out.println("Os textos coicidem");
		} else {
			System.out.println("Os textos não coicidem, o texto capturado é " + textoCapturado);
		}
	}

	public void esperarElementoSerClicavel(By elemento, int tempoEspera) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempoEspera));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		element.click();

	}

	public void capturarScreenshot() {

		String diretorio = "C:\\Users\\User_ADM\\Screenshots//";
		String caminho = diretorio + "screenshot_" + System.currentTimeMillis() + ".png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Screenshot salva em: " + caminho);
	}

	public void apagarTexto(By elemento) {
		WebElement campo = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(campo).click().sendKeys(Keys.CONTROL, "a").sendKeys(Keys.BACK_SPACE).perform();

	}

	public void zerarValorJS(By elemento) {

		WebElement campo = driver.findElement(elemento);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '';", campo);

	}

	public void alterarElemento(By elemento) {

		WebElement elementoDesejado = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(elementoDesejado).perform();

	}
}
