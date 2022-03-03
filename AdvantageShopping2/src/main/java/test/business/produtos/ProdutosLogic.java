package test.business.produtos;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import core.webDriver.WebDriverLogic;

public class ProdutosLogic {
	
	public static String pName;
	
	WebDriverLogic driver = new WebDriverLogic();
	ProdutosPage page = new ProdutosPage();
		
	public void selecionarProduto() {
		driver.clicar(page.getSelectSpeakers(), "Selecionar Speaker");
	}
	
	public void validarProdutoSelecionado() throws Exception {
		driver.pausa(2000);
		String expected = driver.pegarTexto(page.getProductName());
		Assert.assertThat(expected, CoreMatchers.containsString("SPEAKER"));
		driver.screenShot("Consultar Produto com sucesso");
		driver.fecharNavegador();
		
	}

	public void clicarAddCart() {
		pName = driver.pegarTexto(page.getProductName());
		driver.clicar(page.getAddToCart(), "clicar em add cart");
		
	}

}
