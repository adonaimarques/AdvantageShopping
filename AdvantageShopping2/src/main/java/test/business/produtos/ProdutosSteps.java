package test.business.produtos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProdutosSteps {
	
	ProdutosLogic produtos = new ProdutosLogic();
	
	@Given("seleciono produto")
	public void seleciono_produto() {
		produtos.selecionarProduto();
	}

	@Then("valido produto selecionado")
	public void valido_produto_selecionado() throws Exception {
		produtos.validarProdutoSelecionado();
	}
	
	@Given("clico em add to cart")
	public void clico_em_add_to_cart() {
		produtos.clicarAddCart();
	}
}
