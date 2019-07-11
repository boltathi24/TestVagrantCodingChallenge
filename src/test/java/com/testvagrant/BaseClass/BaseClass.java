package com.testvagrant.BaseClass;

import java.io.File;

import com.sun.javafx.PlatformUtil;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver=null;
	
	@BeforeSuite
	public void setDriver()
	{
		setDriverPath();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
	}
	
	 
	 public void setDriverPath() {
      if (PlatformUtil.isMac()) {
          System.setProperty("webdriver.chrome.driver", "chromedriver");
      }
      if (PlatformUtil.isWindows()) {
          System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      }
      if (PlatformUtil.isLinux()) {
  	
          System.setProperty("webdriver.chrome.driver", new File("chromedriver_linux").getAbsolutePath() );
      }
  }
	 
	 @AfterSuite
	 public void clearAll()
	 {
		 driver.quit();
	 }
	
}
