package Testes;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;

import MetodosDeTeste.Metodos;
import Pages.Pages;
import Runner.Executa;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTestes {

	Executa executa = new Executa();
	Pages logar = new Pages();
	Metodos metodo = new Metodos();

	@Test
	@Order(1)
	public void loginTest() {
		executa.antesDoTeste();
		logar.loginPage("standard_user", "secret_sauce");
		metodo.validarUrl("https://www.saucedemo.com/v1/inventory.html");
		metodo.capturarScreenshot();
		executa.depoisDoTeste();

	}
	@Test
	@Order(2)
	public void loginUsuárioInválidoTest() {
		executa.antesDoTeste();
		logar.loginPage("inválido", "secret_sauce");
		metodo.pegarTextoNoElemento(By.xpath("//h3[text()='Username and password do not match any user in this service']"), "Epic sadface: Username and password do not match any user in this service");
		metodo.capturarScreenshot();
		executa.depoisDoTeste();

	}
	@Test
	@Order(3)
	public void loginSenhaInválidoTest() {
		executa.antesDoTeste();
		logar.loginPage("standard_user", "inválida");
		metodo.pegarTextoNoElemento(By.xpath("//h3[text()='Username and password do not match any user in this service']"), "Epic sadface: Username and password do not match any user in this service");
		metodo.capturarScreenshot();
		executa.depoisDoTeste();

	}
	@Test
	@Order(4)
	public void loginCamposBrancoTest() {
		executa.antesDoTeste();
		logar.loginPage("", "");
		metodo.pegarTextoNoElemento(By.xpath("//h3[text()='Username is required']"), "Epic sadface: Username is required");
		metodo.capturarScreenshot();
		executa.depoisDoTeste();

	}
	@Test
	@Order(5)
	public void loginUsuárioBlockTest() {
		executa.antesDoTeste();
		logar.loginPage("locked_out_user", "secret_sauce");
		metodo.pegarTextoNoElemento(By.xpath("//h3[text()='Sorry, this user has been locked out.']"), "Epic sadface: Sorry, this user has been locked out.");
		metodo.capturarScreenshot();
		executa.depoisDoTeste();

	}


}
