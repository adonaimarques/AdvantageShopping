package test.business.login;

import org.openqa.selenium.By;

public class LoginPage {
	private By usernameLogin = By.name("username");
	private By passwordLogin = By.name("password");;
	private By signIn = By.id("sign_in_btnundefined");;
	private By createAccount = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > a.create-new-account.ng-scope");
	private By loginError = By.id("signInResultMessage");
			
	public By getCreateAccount() {
		return createAccount;
	}

	public By getSignIn() {
		return signIn;
	}

	public By getPasswordLogin() {
		return passwordLogin;
	}

	public By getUsernameLogin() {
		return usernameLogin;
	}

	public By getLoginError() {
		return loginError;
	}
}
