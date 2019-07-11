package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.Utils.Utility;

public class HomePage extends Utility {
	
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
	    
	    @FindBy(xpath = "//a[@class='hotelDetails']")
	    protected WebElement hotelListsElement;
	   
	    
	    protected By hotelLists= By.xpath("//a[@class='hotelDetails']");
	    
	    protected By locationToSearch=By.xpath("//a[text()='Indiranagar, Bangalore, Karnataka, India']");
	    

	    
	    
	    
	    //Flight Booking
	    protected By oneWayRadioBtn= By.id("OneWay");
	    protected By fromTxtBox=By.id("FromTag");
	    protected By toTxtBox=By.id("ToTag");
	    protected  By fromSuggestion=By.xpath("//ul[@id='ui-id-1']//li//a");
	    protected By returnSuggestion=By.xpath("//ul[@id='ui-id-2']//li//a");
	    
	    protected By departDateBox=By.id("DepartDate");
	    protected By searchResultSummary=By.className("searchSummary");
	    protected By activeDate=By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']");
	    protected By searchFlightBtn=By.id("SearchBtn");
	      
	    
	    public void initElements()
	    {
	    	PageFactory.initElements(driver, this);
	    }

}
