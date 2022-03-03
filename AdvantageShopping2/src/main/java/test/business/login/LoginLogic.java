package test.business.login;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

import core.utils.csv.ReaderCSV;
import core.webDriver.WebDriverLogic;

public class LoginLogic {
	
	WebDriverLogic driver = new WebDriverLogic();
	LoginPage page = new LoginPage();
	ReaderCSV csv = new ReaderCSV();
	
	public void clicarEmCreateAccount() {
		driver.clicar(page.getCreateAccount() , "Clicar em Create");
	}

	public void informarUsernameLogin() throws IOException, CsvException {
		csv.leitura();
		driver.pausa(2000);
		driver.preencher(page.getUsernameLogin(),csv.getUsername(), "informar username");
	}

	public void informarPasswordLogin() {
		driver.preencher(page.getPasswordLogin(),csv.getPassword(), "informar username");
	}

	public void informarSignIn() {
		driver.pausa(1000);
		driver.clicar(page.getSignIn(),"informar username");
	}

	public void informarUsernameLoginInvalido() {
		driver.preencher(page.getUsernameLogin(),"testers980", "informar username invalido");
	}

	public void validarErroLogin() {
		driver.pausa(1000);
		String actual = driver.pegarTexto(page.getLoginError());
		assertEquals("Incorrect user name or password.", actual);
		driver.fecharNavegador();
	}
	
}
