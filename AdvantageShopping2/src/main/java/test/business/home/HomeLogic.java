package test.business.home;

import static org.junit.Assert.assertEquals;

import core.utils.csv.ReaderCSV;
import core.webDriver.WebDriverLogic;

public class HomeLogic {
	
	WebDriverLogic driver = new WebDriverLogic();
	HomePage page = new HomePage();
	ReaderCSV csv = new ReaderCSV();
	
	public void AcessarSite() {
		driver.abrirnavegador("http://advantageonlineshopping.com/#/", "chrome", "abrir navegador");
		driver.pausa(5000);
	}
	
	public void clicarEmUsuario() {
		driver.clicar(page.getMenuUser(), "clicar em Usuario");
		driver.pausa(3000);
	}
	
	public void validarUsuarioLogado() throws Exception {
		driver.pausa(2000);
		assertEquals(csv.getUsername() ,driver.pegarTexto(page.getLoggedUser()));
		driver.screenShot("Usuario logado");
		driver.pausa(2000);
		//driver.fecharNavegador();
	}

	public void clicarSpeakers() {
		driver.clicar(page.getSpeakers(), "Clicar em speakers");
	}

	public void clicarCarrinho() {
		driver.clicar(page.getCarrinho(), "Clicar no carrinho");
	}
	
	
}
