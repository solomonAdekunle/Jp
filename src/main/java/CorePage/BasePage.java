package CorePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import MobileJackpot.JackPot247Mobile.TestBase;
import Util.Constant;
import Util.Utility;

public class BasePage {

	protected WebDriver d;
	Properties OR = TestBase.OR;

	// public double currentBalance;

	// Initialising the WebDriver
	public BasePage(WebDriver d) {
		this.d = d;

	}

	/* Creating a Click Method */
	public void click(String identifier) {
		try {

			if (identifier.endsWith("_xpath"))
				d.findElement(By.xpath(OR.getProperty(identifier))).click();
			else if (identifier.endsWith("_id"))
				d.findElement(By.id(OR.getProperty(identifier))).click();
			else if (identifier.endsWith("_name"))
				d.findElement(By.name(OR.getProperty(identifier))).click();
			else if ((identifier.endsWith("_Selector"))) {
				d.findElement(By.cssSelector(OR.getProperty(identifier))).click();
			}
		} catch (Exception e) {
			Utility.takeScreenShot(identifier);
			Assert.fail("Element not found - " + identifier + e.getMessage());

		}
	}

	/* Creating a clear Method */
	public void clear(String identifier) {
		try {
			if (identifier.endsWith("_xpath"))
				d.findElement(By.xpath(OR.getProperty(identifier))).clear();
			else if (identifier.endsWith("_id"))
				d.findElement(By.id(OR.getProperty(identifier))).clear();
			else if (identifier.endsWith("_name"))
				d.findElement(By.name(OR.getProperty(identifier))).clear();
			else if ((identifier.endsWith("_Selector")))
				d.findElement(By.cssSelector(OR.getProperty(identifier))).clear();
		} catch (Exception e) {
			Utility.takeScreenShot(identifier);// take screenshot
			Assert.fail("Element not found - " + identifier + e.getMessage());

		}
	}

	/* Creating a send key methond */
	public void input(String identifier, String data) {
		try {
			if (identifier.endsWith("_xpath"))
				d.findElement(By.xpath(OR.getProperty(identifier))).sendKeys(data);
			else if (identifier.endsWith("_id"))
				d.findElement(By.id(OR.getProperty(identifier))).sendKeys(data);
			else if (identifier.endsWith("_name"))
				d.findElement(By.name(OR.getProperty(identifier))).sendKeys(data);
			else if ((identifier.endsWith("_Selector")))
				d.findElement(By.cssSelector(OR.getProperty(identifier))).sendKeys(data);
		} catch (Exception e) {
			Assert.fail("Element not found - " + identifier + e.getMessage());
			Utility.takeScreenShot(identifier);
		}
	}

	/* Creating Title Verification Method */
	public boolean verifyTitle(String expectedTitleKey) {
		String expectedTitle = OR.getProperty(expectedTitleKey);
		String actualTitle = d.getTitle();
		// Utility.takeScreenshot(expectedTitleKey);
		if (expectedTitle.equals(actualTitle))
			return true;
		else
			return false;
	}

	/* Creating is Element Present method */
	public boolean isElementPresent(String identifier) {
		int size = 0;
		if (identifier.endsWith("_xpath"))
			size = d.findElements(By.xpath(OR.getProperty(identifier))).size();
		else if (identifier.endsWith("_id"))
			size = d.findElements(By.id(OR.getProperty(identifier))).size();
		else if (identifier.endsWith("_name"))
			size = d.findElements(By.name(OR.getProperty(identifier))).size();
		else if ((identifier.endsWith("_Selector")))
			size = d.findElements(By.cssSelector(OR.getProperty(identifier))).size();
		else // not in prop file
			size = d.findElements(By.xpath(identifier)).size();
		Utility.takeScreenShot(identifier);
		if (size > 0)
			return true;
		else
			return false;
	}

	/* Creating get Text Method */
	public String getText(String identifier) {
		String text = "";
		if (identifier.endsWith("_xpath"))
			text = d.findElement(By.xpath(OR.getProperty(identifier))).getText();
		else if (identifier.endsWith("_id"))
			text = d.findElement(By.id(OR.getProperty(identifier))).getText();
		else if (identifier.endsWith("_name"))
			text = d.findElement(By.name(OR.getProperty(identifier))).getText();
		else if ((identifier.endsWith("_Selector")))
			text = d.findElement(By.cssSelector(OR.getProperty(identifier))).getText();
		Utility.takeScreenShot(identifier);
		return text;

	}

	/* Creating Find Element by cssSelector */
	public WebElement getObjectFromSelector(String Selector) {
		try {
			return d.findElement(By.cssSelector(OR.getProperty(Selector)));

		} catch (Throwable t) {
			// report error
			Utility.takeScreenShot(Selector);

			return null ;
		}

	}

	/* Java Auto data generator for specfic string and Speacial Character */
	public String generateStringWithAllobedSplChars(int length, String allowdSplChrs) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890" + // numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}

	/*
	 * Java Auto data Ramdom generator for specfic string and Speacial Character
	 */
	public String generateRandomAlphaNumeric(int lenght, String charcter) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!â€�$%^&*()";
		charcter = RandomStringUtils.random(lenght, characters);
		return charcter;
	}

	/* Screenshot method */
	public void takeScreenshot(String fileName) {
		File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		try {
			if (!TestBase.isUnix()) {
				FileUtils.copyFile(scrFile,
						new File(System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".jpg"));
			} else {
				FileUtils.copyFile(scrFile,
						new File(System.getProperty("user.dir") + "/screenshots/" + fileName + ".jpg"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * Thses below are methods and varblies on the Top Bar of all pages on the
	 * site
	 */
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/* Navigate to the site page */
	public void getSiteAddress(String BaseUrl) {
		this.d.get(BaseUrl + "/");

	}

	/* check if Login button is displayed on the Top Bar of the page */
	public boolean isLoginButtonPresent() {
		WebElement HomePageLoginButton = getObjectFromSelector("LoginButon_Selector");
		return HomePageLoginButton.isDisplayed();

	}

	/* check if Jackpot247 logo is displayed on the Top Bar of the page */
	public boolean isJackpot247LogoPresent() {
		WebElement HomePageLoginJackpotLogo = getObjectFromSelector("hp_jackpot247Logo");
		return HomePageLoginJackpotLogo.isDisplayed();

	}

	/* check if Sidebar menu is displayed on the Top Bar of the page */
	public boolean isSideBarMenuIconPresent() {
		WebElement HomePageLoginSideMenu = getObjectFromSelector("hp_SideBarMenu_Selector");
		return HomePageLoginSideMenu.isDisplayed();

	}

	/* check if Deposit button is didplayed on the Top Bar of the page */
	public boolean isDepositButtonPresent() {
		WebElement TopMenuDepositButton = getObjectFromSelector("hp_DepositButton_Selector");
		return TopMenuDepositButton.isDisplayed();

	}

	/* check if Username is displayed on the Top Bar of the page */
	public String isUserNamePresent(String username) {
		WebDriverWait Wait = new WebDriverWait(d, 60);
		Wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.UserNameText)));
		String UsernameDisplay = getText("hp_UsernameText_Selector");
		// System.out.println(UsernameDisplay);
		return UsernameDisplay;

	}

	/* check if Account Balance is didplayed on the Top Bar of the page */
	public boolean HomePageAccountBalancePresent() {
		WebElement TopBarAccountBalance = getObjectFromSelector("hp_AccountBalanceText_Selector");
		return TopBarAccountBalance.isDisplayed();

	}

	/* Click on the Login button within the Top Bar on the page */
	public void clickLoginButton() {
		this.click("LoginButon_Selector");

	}

	/* Click on the side bar menu within the Top Bar on the page */
	public void clickSideBarMenu() {

	}
}