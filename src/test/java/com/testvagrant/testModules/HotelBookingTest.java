package com.testvagrant.testModules;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testvagrant.pages.ClearTripPage;

public class HotelBookingTest extends ClearTripPage{

    
	
	@BeforeClass
	public void loadApp()
	{
		navigate("https://www.cleartrip.com/");
		initElements();
	}

    @Test
    public void shouldBeAbleToSearchForHotels() throws InterruptedException {
    	
    	hotelLink.click();
    	localityTextBox.sendKeys(" Indiranagar, Bangalore");
    	waitForElement(locationToSearch);
    	locationToSeaerchSuggestion.click();
    	selectValue(travellerSelection, "1 room, 2 adults");
    	searchButton.click();


    }
   
    @AfterClass
    public void windUp()
    {
    	driver.close();
    }

    

}
