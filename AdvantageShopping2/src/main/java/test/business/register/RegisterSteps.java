package test.business.register;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

import io.cucumber.java.en.Given;

public class RegisterSteps {
	
	RegisterLogic register = new RegisterLogic();
	
	@Given("informo Username de Register")
	public void informo_username_de_register() throws IOException, CsvException {
		register.informarUsername();
	}

	@Given("informo Email")
	public void informo_email() {
		register.informarEmail();
	}

	@Given("informo Password de Register")
	public void informo_password_de_register() {
		register.informarPassword();
	}

	@Given("confirmo Password de Register")
	public void confirmo_password_de_register() {
	    register.confirmarPassword();
	}

	@Given("clico em I Agree")
	public void clico_em_i_agree() {
	   register.clicarEmIAgree();
	}

	@Given("clico em Register")
	public void clico_em_register() {
		register.clicarEmRegister();
	}
}
