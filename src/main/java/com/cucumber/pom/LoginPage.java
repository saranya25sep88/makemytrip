package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en_lol.WEN;

public class LoginPage {
	
	public WebDriver driver;
	
	public void Loginpage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//p[text()=' Login or Create Account']")
    private WebElement clickLogin;

    @FindBy(id="username")
    private WebElement userName;
    
    @FindBy(id="password")
    private WebElement passWord;
   
    @FindBy(xpath="//button[@class='capText font16']")
    private WebElement enterLogin;

	public WebElement getClickLogin() {
		return clickLogin;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getEnterLogin() {
		return enterLogin;
	}
    
    
    
}
