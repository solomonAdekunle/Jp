package Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import MobileJackpot.JackPot247Mobile.TestBase;

public class Utility extends TestBase{

	public Utility() throws IOException {
		super();
		
	}

	
	// store screenshots
				public static void takeScreenShot(String fileName) {
					File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				    try {
						FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+".jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	  
				    
				}
}
