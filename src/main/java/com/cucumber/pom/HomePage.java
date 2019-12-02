package com.cucumber.pom;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='fromCity']")
     private WebElement From_place;
     
	@FindBy(xpath="//span[text()='Mumbai, Maharashtra']")
	private WebElement Click_Mumbai;
	
     @FindBy(xpath="(//input[@type='text'])[3]")
     private WebElement To_Place;
     
     @FindBy(xpath="//span[contains(text(),'Delhi, Delhi')]")
     private WebElement Click_Delhi;
     
     @FindBy(xpath="//span[contains(text(),'Found')]")
     private WebElement VerifyText;
     
     @FindBy(id="travelDate")
     private WebElement SelectDate;
     
     @FindBy(xpath = "//div[@aria-label='Sat Aug 31 2019']")
     private WebElement PickDate;
       
	@FindBy(id="search_button")
     private WebElement Searchbutton;
	
	@FindBy(xpath="//span[contains(text(),' SortBy:')]")
	private WebElement verifySortBy;
     
	 public WebElement getVerifySortBy() {
		return verifySortBy;
	}

	public WebElement getSelectDate() {
			return SelectDate;
		}

     public WebElement getVerifyText() {
		return VerifyText;
	}

	public WebElement getClick_Mumbai() {
		return Click_Mumbai;
	}

	public WebElement getClick_Delhi() {
		return Click_Delhi;
	}

	

	public WebElement getFrom_place() {
		return From_place;
	}

	public WebElement getTo_Place() {
		return To_Place;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}
	 public WebElement getPickDate() {
			return PickDate;
		}
	
}
