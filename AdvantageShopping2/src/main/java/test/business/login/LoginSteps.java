package test.business.login;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

	LoginLogic login = new LoginLogic();
	
	@Given("informo Username de login")
	public void informo_username_de_login() throws IOException, CsvException {
		login.informarUsernameLogin();
	    
	}
	
	@Given("informo Password de login")
	public void informo_password_de_login() {
		login.informarPasswordLogin();
	}
	
	@Given("clico em Sign In")
	public void clico_em_sign_in() {
		login.informarSignIn();
	}
	
	@Given("clico em Create New Account")
	public void clico_em_create_new_account() {
	    login.clicarEmCreateAccount();
	}
	
	@Given("informo Username de login invalido")
	public void informo_username_de_login_invalido() {
		login.informarUsernameLoginInvalido();
	}

	@Given("informo Password de login invalido")
	public void informo_password_de_login_invalido() {
	}
	
	@Then("valido erro no login")
	public void valido_erro_no_login() {
		login.validarErroLogin();
	}
	
	

	

	
}
