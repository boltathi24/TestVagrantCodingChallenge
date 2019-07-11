package com.testvagrant.Utils;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testvagrant.BaseClass.BaseClass;

public class Utility extends BaseClass
{

	
	public void navigate(String url)
	{
		driver.get(url);
	}
	
	 public void waitForElement(By by) throws InterruptedException 
	 {
     int timeToWait = 25;
	WebDriverWait wait = new WebDriverWait(driver, timeToWait);
	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	 
	 public void selectValue(WebElement element,String value)
	 {
		 new Select(element).selectByVisibleText(value);
	 }
	 
	 public void switchFrame(String frameName)
	 {
		 driver.switchTo().frame("modal_window");
	 }
}
