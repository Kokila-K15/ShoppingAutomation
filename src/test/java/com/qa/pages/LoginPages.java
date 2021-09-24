package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	
	WebDriver driver;

	public LoginPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Sign")
	WebElement signInLink;
	
	public WebElement setSignInLink() {
		return signInLink;
	}
	
	@FindBy(id="email")
	WebElement email;
	
	public WebElement setEmail() {
		return email;
	}
	
	@FindBy(id="passwd")
	WebElement password;
	
	public WebElement setPassword() {
		return password;
	}
	
	@FindBy(id="SubmitLogin")
    WebElement submitBtn;
	
	public WebElement setSubmitBtn() {
		return submitBtn;
	}
	
	@FindBy(className="logout")
	WebElement logout;
	
    public WebElement setLogout() {
		return logout;
	}
}
