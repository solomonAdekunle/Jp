package CorePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	/* Check if Login pop-up box is displayed when login button is clicked */
	public boolean isLoginPopBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPop = getObjectFromSelector("LoginPopUpBox_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPop));
		return LoginPop.isDisplayed();

	}

	/* Check if Jackpot247 logo is displayed on the Login pop-up box */
	public boolean isJackpot247LogoPresent() {
		WebDriverWait wait = new WebDriverWait(d,45);
		WebElement LoginPopJackpotlogo = getObjectFromSelector("jackpot247Logo_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopJackpotlogo));
		System.out.println(LoginPopJackpotlogo.isDisplayed());
		return LoginPopJackpotlogo.isDisplayed();

	}

	/* Check if Username Input box is displayed on the Login pop-up box */
	public boolean isLoginUserNameInputBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPopUsername = getObjectFromSelector("Username_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopUsername));
		return LoginPopUsername.isDisplayed();

	}

	/* Check if Password Input box is displayed on the Login pop-up box */
	public boolean isLoginPasswordInputBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPopPassword = getObjectFromSelector("Password_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopPassword));
		return LoginPopPassword.isDisplayed();

	}

	/* Check if Forgotten Details link is displayed on the Login pop-up box */
	public boolean isLoginPopUpBoxForgottenLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPopFogottenDetails = getObjectFromSelector("LoginPopForgottenDetails_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopFogottenDetails));
		return LoginPopFogottenDetails.isDisplayed();

	}

	/* Check if Login button is displayed on the Login pop-up box */
	public boolean isLoginPopUpBoxLoginButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPopLoginSubmit = getObjectFromSelector("LoginPopUpBoxLogin_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopLoginSubmit));
		return LoginPopLoginSubmit.isDisplayed();

	}

	/* Check if Register Now Button is displayed on the Login pop-up box */
	public boolean isLoginPopUpBoxRegisterNowButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPopRegisterButton = getObjectFromSelector("LoginPopUpBoxRegisterNow_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopRegisterButton));
		return LoginPopRegisterButton.isDisplayed();
	}

	/* Check if Close Icon is displayed on the Login pop-up box */
	public boolean isLoginPopUpBoxClsoeIconPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement LoginPopUpBoxCloseIcon = getObjectFromSelector("LoginPopUpBoxCloseIcon_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopUpBoxCloseIcon));
		return LoginPopUpBoxCloseIcon.isDisplayed();

	}

	/* Check if Login Error Message is displayed on the Login pop-up box */
	public boolean isLoginPopBoxErrorMessagePresent() {
		WebDriverWait wait = new WebDriverWait(d, 40);
		WebElement LoginPopUpBoxErrorMsg = getObjectFromSelector("LoginError");
		wait.until(ExpectedConditions.visibilityOf(LoginPopUpBoxErrorMsg));
		return LoginPopUpBoxErrorMsg.isDisplayed();

	}

	/* Enter your username */
	public void sendLoginUserName(String username) {
		WebDriverWait wait = new WebDriverWait(d, 40);
		WebElement LoginPopInputBOX = getObjectFromSelector("Username_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopInputBOX));
		input("Username_Selector", username);

	}

	/* Enter your password */
	public void sendLoginPassword(String password) {
		WebDriverWait wait = new WebDriverWait(d, 40);
		WebElement LoginPopInputBOX = getObjectFromSelector("Password_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginPopInputBOX));
		input("Password_Selector", password);
	}

	/* Click on Login button on the Login pop-up box */
	public void clickLoginPopUpBoxLoginButton() {
		WebDriverWait wait = new WebDriverWait(d, 40);
		WebElement LoginButton = getObjectFromSelector("Password_Selector");
		wait.until(ExpectedConditions.visibilityOf(LoginButton));
		click("LoginPopUpBoxLogin_Selector");
	}

	/* Click on ForgottenDetails link on the Login pop-up box */
	public void clickLoginPopUpBoxForgottenDetailsLink() {

	}

	/* Click on Register Now button on the Login pop-up box */
	public void clickLoginPopUpBoxRegisterNowButton() {

	}

	/* Click on Close Icon on the Login pop-up box */
	public void clickLoginPopUpBoxCloseIcon() {

	}
}
