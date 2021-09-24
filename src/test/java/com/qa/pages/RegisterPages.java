package com.qa.pages;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPages {
	
	WebDriver driver;
	
	@FindBy(className="login")
	WebElement siginIn;
	public WebElement getSiginInLink() {
		return siginIn;
	}
	
	//search textbox
	@FindBy(id="email_create")
	WebElement searchTab;
	
	public WebElement getSearchTextTab() {
		return searchTab;
	}
	@FindBy(xpath ="//button[@id='SubmitCreate']")
	WebElement CreateAccount;
	
	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	
	@FindBy(id="city")
	WebElement cityName;
	public WebElement getCityName() {
		return cityName;
	}
	@FindBy(id="postcode")
	WebElement postCode;
	public WebElement getPostCode() {
		return postCode;
	}
	@FindBy(id="phone_mobile")
	WebElement mobilePhn;
	public WebElement getMobilePhn() {
		return mobilePhn;
	}
	
	@FindBy(id="id_state")
	WebElement idState;
	public WebElement setIdState() {
		return idState;
	}
	@FindBy(id="id_country")
	WebElement idCountry;
	public WebElement setIdCountry() {
		return idCountry;
	}
	
	@FindBy(id="alias")
	WebElement aliasAdd;
	public WebElement getAliasAdd() {
		return aliasAdd;
	}
	@FindBy(id="address1")
	WebElement addressText;
	public WebElement getAddressText() {
		return addressText;
	}
	
	@FindBy(id="customer_firstname")
	WebElement FirstName;
	public WebElement getFirstName() {
		return FirstName;
	}
	@FindBy(id="customer_lastname")
	WebElement LastName;
	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(id="passwd")
	WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement Register;
	public WebElement getRegister() {
		return Register;
	}

	public RegisterPages(WebDriver driver) {
		this.driver=driver;
	
		PageFactory.initElements(driver, this);
	}
}
