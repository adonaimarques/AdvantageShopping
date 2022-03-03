package test.business.carrinho;

import io.cucumber.java.en.Then;

public class CarrinhoSteps {
	
	CarrinhoLogic carrinho = new CarrinhoLogic();
	
	@Then("valido produto no carrinho")
	public void valido_produto_no_carrinho() throws Exception {
		carrinho.validarProdutoCarrinho();
	}
}
