package com.testvagrant.testModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testvagrant.pages.SignInPage;


public class SignInTest extends SignInPage{

   
	@BeforeClass
	public void loadApp() {
		navigate("https://www.cleartrip.com/");
		initElements();
	}


    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws InterruptedException {
    	waitForElement(yourTripsLinkBy);
    	yourTripsLink.click();
        waitForElement(signInLinkBy);
        signInLink.click();

        waitForElement(By.name(signInFrame));
        switchFrame(signInFrame);
        
        signInBtn.click();        
        waitForElement(errors1By);
        String errors1 = errorMsg.getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"),"***Failure: Error message is not displayed");
      
    }

    @AfterClass
    public void windUp()
    {
    	driver.close();
    }
 



}
