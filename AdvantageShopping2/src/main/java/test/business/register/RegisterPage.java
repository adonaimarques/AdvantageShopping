package test.business.register;

import org.openqa.selenium.By;

public class RegisterPage {
	private By registerUsername = By.name("usernameRegisterPage");
	private By registerEmail = By.name("emailRegisterPage");
	private By registerPassword = By.name("passwordRegisterPage");
	private By registerConfirmPassword = By.name("confirm_passwordRegisterPage");
	private By iAgree = By.name("i_agree");
	private By register = By.id("register_btnundefined");
	private By errorRegister = By.cssSelector("#registerPage > article > sec-form > div.center > label.center.block.smollMargin.invalid");
		
	
	public By getRegisterUsername() {
		return registerUsername;
	}
	public By getRegisterEmail() {
		return registerEmail;
	}
	public By getRegisterPassword() {
		return registerPassword;
	}
	public By getRegisterConfirmPassword() {
		return registerConfirmPassword;
	}
	public By getIagree() {
		return iAgree;
	}
	public By getRegister() {
		return register;
	}
	public By getErrorRegister() {
		return errorRegister;
	}

}
