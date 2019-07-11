package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.Utils.Utility;

public class SignInPage extends Utility {
	
	 	@FindBy(linkText = "Your trips")
	    protected WebElement yourTripsLink;

	    @FindBy(id = "SignIn")
	    protected WebElement signInLink;

	    @FindBy(id = "signInButton")
	    protected WebElement signInBtn;
	    
	    @FindBy(id = "errors1")
	    protected WebElement errorMsg;

	    
	    protected By errors1By=By.id("errors1");
	    protected By signButtonBy=By.id("signInButton");
	    protected By signInLinkBy=By.id("SignIn");
	    
	   protected By yourTripsLinkBy=By.linkText("Your trips");
	    
	   protected String signInFrame="modal_window";
	    
	    
	    
	    protected By locationToSearch=By.xpath("//a[text()='Indiranagar, Bangalore, Karnataka, India']");
	    

	    
	    public void initElements()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    

}
