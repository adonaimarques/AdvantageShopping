package test.business.home;

import org.openqa.selenium.By;

public class HomePage {
	private By menuUser = By.id("menuUser");
	private By loggedUser = By.xpath("//*[@id=\"menuUserLink\"]/span");
	private By speakers = By.id("speakersTxt");
	private By carrinho = By.id("menuCart");

	public By getMenuUser() {
		return menuUser;
	}

	public By getLoggedUser() {
		return loggedUser;
	}


	public By getSpeakers() {
		return speakers;
	}

	public By getCarrinho() {
		return carrinho;
	}
}
