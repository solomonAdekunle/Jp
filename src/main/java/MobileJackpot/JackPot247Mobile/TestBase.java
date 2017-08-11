package MobileJackpot.JackPot247Mobile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public static WebDriver d;
	public static Properties OR;
	Properties Config = null;
	WebDriver mozilla = null;
	WebDriver chrome = null;
	WebDriver ie = null;

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
	}

	public TestBase() throws IOException {
		this.createDriver();
	}

	protected void createDriver() throws IOException {
		try {
			// initialising the properties
			Config = new Properties();
			FileInputStream fs;
			if (!isUnix()) {
				fs = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.Properties");
			} else {
				fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Config/Config.Properties");
			}
			Config.load(fs);
			// OR
			OR = new Properties();
			if (!isUnix()) {
				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.properties");
			} else {
				fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Config/OR.properties");
			}
			OR.load(fs);
		} catch (Exception e) {
			System.out.println("Error on intializing properties files" + e.getMessage());
		}

		if (d == null) {

			// initialised webdriver
			if (Config.getProperty("browser").equals("Firefox")) {
				// File file = new File("lib\\geckodriver.exe");
				System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
				d = new FirefoxDriver();
			} else if (Config.getProperty("browser").equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				// options.addArguments("no-sandbox");
				options.addArguments("--user-agent="
						+ "Mozilla/5.0 (iPhone; CPU iPhone OS 7_0 like Mac OS X; en-us) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53");
				// options.addArguments("--user-agent=" + "Mozilla/5.0 (iPad;
				// CPU OS 8_0 like Mac OS X) AppleWebKit/600.1.3 (KHTML, like
				// Gecko) Version/8.0 Mobile/12A4345d Safari/600.1.4");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				// cap.setCapability(CapabilityType.PROXY, p);
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				d = new ChromeDriver(cap);

			} else if (Config.getProperty("browser").equals("IE")) {
				File file = new File("C:\\QA\\Chrome\\IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				d = new InternetExplorerDriver();

			}
			EventFiringWebDriver dr = new EventFiringWebDriver(d);
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			/* Smalltouch devices such as iPhone, Android and Windows phones */
			Dimension k = new Dimension(320, 568);
			/* Dimension k = new Dimension(768,1024);// ipad or tablet */
			d.manage().window().setSize(k);
		}

	}

	public void navigate(String URLKey) {
		d.get(Config.getProperty(URLKey));
		// Utility.takeScreenshot(URLKey);
	}

	public void quit() {
		if (d != null) {
			d.quit();
			d = null;
		}
	}

}
