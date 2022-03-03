package test.business.home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeSteps {
	
	HomeLogic home = new HomeLogic();
	
	@Given("que acesse o site")
	public void que_acesse_o_site() {
		home.AcessarSite();
	}

	@Given("clico na opcao usuario")
	public void clico_na_opcao_usuario() {
	    home.clicarEmUsuario();
	}
	
	@Then("valido usuario logado")
	public void valido_usuario_logado() throws Exception {
		home.validarUsuarioLogado();
	}
	
	@Given("clico em speakers")
	public void clico_em_speakers() {
		home.clicarSpeakers();
	}
	
	@Given("clico em carrinho")
	public void clico_em_carrinho() {
		home.clicarCarrinho();
	}
	
	@Then("Valido usuario logado de Register")
	public void valido_usuario_logado_de_register() throws Exception {
		home.validarUsuarioLogado();
	}
}
