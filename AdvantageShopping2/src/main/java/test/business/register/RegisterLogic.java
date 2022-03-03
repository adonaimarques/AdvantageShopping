package test.business.register;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

import core.utils.csv.ReaderCSV;
import core.utils.csv.WritterCSV;
import core.webDriver.WebDriverLogic;

public class RegisterLogic {
	
	WebDriverLogic driver = new WebDriverLogic();
	RegisterPage page = new RegisterPage();
	ReaderCSV rcsv = new ReaderCSV();
	WritterCSV wcsv = new WritterCSV();
	
	public void informarUsername() throws IOException, CsvException {
		wcsv.gravacaoCSV();
		rcsv.leitura();
		driver.pausa(1000);
	    driver.preencher(page.getRegisterUsername(), rcsv.getUsername(), "Informar username");
	    
	}

	public void informarEmail() {
		driver.pausa(1000);
		driver.preencher(page.getRegisterEmail(), rcsv.getEmail(), "Informar Email");
	}

	public void informarPassword() {
		driver.pausa(1000);
		driver.preencher(page.getRegisterPassword(), rcsv.getPassword(), "Informar Password");
	}

	public void confirmarPassword() {
		driver.pausa(1000);
		driver.preencher(page.getRegisterConfirmPassword(), rcsv.getPassword(), "Informar confirmar Password");
	}

	public void clicarEmIAgree() {
		driver.pausa(3000);
		driver.clicar(page.getIagree(), "Clicar em I Agree");
	}

	public void clicarEmRegister() {
		driver.pausa(1000);
		driver.clicar(page.getRegister(), "Clicar em Register");
	}
}
