package Pages;

import org.openqa.selenium.By;

import MetodosDeTeste.Metodos;

public class Pages {
	
	Metodos metodo = new Metodos();
	
	By campoLogin = By.id("user-name");
	By campoSenha = By.id("password");
	By btnLogar = By.id("login-button");
	
	
	public void loginPage(String login, String senha ) {
		metodo.metodoEscrever(this.campoLogin, login);
		metodo.metodoEscrever(this.campoSenha, senha);
		metodo.metodoClicar(this.btnLogar);
		
	}
	
	

}
