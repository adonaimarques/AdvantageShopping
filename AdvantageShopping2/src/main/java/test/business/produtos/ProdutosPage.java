package test.business.produtos;

import org.openqa.selenium.By;

public class ProdutosPage {
	private By selectSpeakers = By.cssSelector("#\\32 0");
	private By productName = By.cssSelector("body > div.uiview.ng-scope > nav > a.select.ng-binding");
	private By addToCart = By.name("save_to_cart");
	
	public By getSelectSpeakers() {
		return selectSpeakers;
	}


	public By getProductName() {
		return productName;
	}


	public By getAddToCart() {
		return addToCart;
	}	
}
