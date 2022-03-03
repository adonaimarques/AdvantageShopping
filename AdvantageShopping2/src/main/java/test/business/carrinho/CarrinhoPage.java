package test.business.carrinho;

import org.openqa.selenium.By;

public class CarrinhoPage {
	private By productNameCart = By.cssSelector("#shoppingCart > table > tbody > tr > td:nth-child(2) > label");

	public By getProductNameCart() {
		return productNameCart;
	}
}
