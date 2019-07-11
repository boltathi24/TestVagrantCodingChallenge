package com.testvagrant.BaseClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver=null;
	
	@BeforeSuite
	public void setDriver()
	{
		setDriverPath();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	 
	 public void setDriverPath() {
//      if (PlatformUtil.isMac()) {
//          System.setProperty("webdriver.chrome.driver", "chromedriver");
//      }
//      if (PlatformUtil.isWindows()) {
//          System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//      }
//      if (PlatformUtil.isLinux()) {
  	
          System.setProperty("webdriver.chrome.driver", new File("chromedriver_linux").getAbsolutePath() );
//      }
  }
	 
	 @AfterSuite
	 public void clearAll()
	 {
		 driver.quit();
	 }
	
}
