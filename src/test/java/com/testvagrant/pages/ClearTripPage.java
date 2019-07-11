package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.Utils.Utility;

public class ClearTripPage extends Utility {
	
	 	@FindBy(linkText = "Hotels")
	    protected WebElement hotelLink;

	    @FindBy(name = "from")
	    protected WebElement localityTextBox;

	    @FindBy(id = "SearchHotelsButton")
	    protected WebElement searchButton;

	    @FindBy(id = "travellersOnhome")
	    protected WebElement travellerSelection;
	    
	    @FindBy(xpath = "//a[text()='Indiranagar, Bangalore, Karnataka, India']")
	    protected WebElement locationToSeaerchSuggestion;
	    
	    
	    
	    
	    protected By locationToSearch=By.xpath("//a[text()='Indiranagar, Bangalore, Karnataka, India']");
	    

	    
	    public void initElements()
	    {
	    	PageFactory.initElements(driver, this);
	    }

}
