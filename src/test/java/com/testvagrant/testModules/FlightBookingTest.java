package com.testvagrant.testModules;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testvagrant.pages.HomePage;

public class FlightBookingTest extends HomePage{

	@BeforeClass
	public void loadApp() {
		navigate("https://www.cleartrip.com/");
		initElements();
	}

    @Test
    public void testThatResultsAppearForAOneWayJourney() throws InterruptedException 
    {      
       element(oneWayRadioBtn).click();
       element(fromTxtBox).clear();
       element(fromTxtBox).click();
       element(fromTxtBox).sendKeys("Bangalore");
       waitForElement(fromSuggestion);
       elementList(fromSuggestion).get(0).click();
       element(toTxtBox).clear();
       element(toTxtBox).click();
       element(toTxtBox).sendKeys("Delhi");
       waitForElement(returnSuggestion);
       elementList(returnSuggestion).get(0).click();
//       element(departDateBox).click();
       element(activeDate).click();      
       element(searchFlightBtn).click();
       waitForElement(searchResultSummary);
       Assert.assertTrue(isElementPresent(searchResultSummary),"***Failure: Search Summary is not displayed");
    }

    @AfterClass
	public void windUp() {
		
		driver.close();
	}


 


    

}
