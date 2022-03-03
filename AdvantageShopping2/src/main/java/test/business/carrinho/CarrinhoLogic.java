package test.business.carrinho;
import static org.junit.Assert.assertEquals;

import core.webDriver.WebDriverLogic;
import test.business.produtos.ProdutosLogic;

public class CarrinhoLogic {

	WebDriverLogic driver = new WebDriverLogic();
	CarrinhoPage page = new CarrinhoPage();
	ProdutosLogic produtos = new ProdutosLogic();
	
	public void validarProdutoCarrinho() throws Exception {
		driver.pausa(1000);
		String expected = produtos.pName;
		String actual = driver.pegarTexto(page.getProductNameCart());
		assertEquals(expected, actual);
		driver.screenShot("Add Cart");
		driver.pausa(2000);
		driver.fecharNavegador();
	}

}
