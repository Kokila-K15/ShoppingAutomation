package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class QuickViewPages {
	WebDriver driver;
	public QuickViewPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//LOGIN
	@FindBy(className="login")
	WebElement Login;
	public WebElement getLogin() {
		return Login;
	}
	@FindBy(id="email")
	WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="passwd")
	WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	//CLICKS
	@FindBy(id="SubmitLogin")
	WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(linkText="My addresses")
	WebElement clickOnMyAdd;
	public WebElement getClickOnMyAdd() {
		return clickOnMyAdd;
	}
	@FindBy(xpath="//ul[@class='first_item item box']//a[@title='Update']")
	WebElement update;
	public WebElement getUpdate() {
		return update;
	}
	@FindBy(id="submitAddress")
	WebElement save;
	public WebElement getSave() {
		return save;
	}
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[2]/span[1]")
	WebElement delete;
	public WebElement getDelete() {
		return delete;
	}
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/a[1]/span[1]")
	WebElement createNewAddress;
	public WebElement getCreateNewAddress() {
		return createNewAddress;
	}
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]/span[1]")
	WebElement updateAdd;
	public WebElement getUpdateAdd() {
		return updateAdd;
	}
	
	//ADDRESS
	@FindBy(id="address1")
	WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(id="alias")
	WebElement aliasAdd;
	public WebElement getAliasAdd() {
		return aliasAdd;
	}
	
	//NewAddess
	@FindBy(id="address1")
	WebElement newAddress;
	public WebElement getNewAddress() {
		return newAddress;
	}
	@FindBy(id="alias")
	WebElement newaliasAdd;
	public WebElement getNewAliasAdd() {
		return newaliasAdd;
	}
	//PLACES
	@FindBy(id="city")
	WebElement city;
	public WebElement getCity() {
		return city;
	}
	@FindBy(id="id_state")
	WebElement state;
	public WebElement setState() {
		return state;
	}
	@FindBy(id="id_country")
	WebElement country;
	public WebElement setCountry() {
		return country;
	}
	
	//NewPlaces
	@FindBy(id="city")
	WebElement newCity;
	public WebElement getNewCity() {
		return newCity;
	}
	@FindBy(id="id_state")
	WebElement newState;
	public WebElement setNewState() {
		return newState;
	}
	@FindBy(id="id_country")
	WebElement newCountry;
	public WebElement setNewCountry() {
		return newCountry;
	}
	
	//NUMBERS
	@FindBy(id="postcode")
	WebElement postCode;
	public WebElement getPostCode() {
		return postCode;
	}
	@FindBy(id="phone")
	WebElement homePhone;
	public WebElement getHomePhone() {
		return homePhone;
	}
	@FindBy(id="phone_mobile")
	WebElement mobilePhone;
	public WebElement getMobilePhone() {
		return mobilePhone;
	}
	
	//New Numbers
	@FindBy(id="postcode")
	WebElement newPostCode;
	public WebElement getNewPostCode() {
		return newPostCode;
	}
	@FindBy(id="phone")
	WebElement newHomePhone;
	public WebElement getNewHomePhone() {
		return newHomePhone;
	}
	@FindBy(id="phone_mobile")
	WebElement newMobilePhone;
	public WebElement getNewMobilePhone() {
		return newMobilePhone;
	}
	
	//searching and quick view
	@FindBy(id="search_query_top")
	WebElement searchField;
	public WebElement getSearchField() {
		return searchField;
	}
	
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")
	WebElement searchBtn;
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement printedDress;
	public WebElement getPrintedDress() {
		return printedDress;
	}
	@FindBy(linkText="Quick view")
	WebElement quickView;
	public WebElement getQuickView() {
		return quickView;
	}
	@FindBy(tagName="iframe")
	WebElement frames;
	public WebElement getFrames() {
		return frames;
	}
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]/i[1]")
	WebElement quantity;
	public WebElement getQuantity() {
		return quantity;
	}
	@FindBy(name="group_1")
	WebElement size;
	public WebElement setSize() {
		return size;
	}
	@FindBy(name="Pink")
	WebElement color;
	public WebElement getColor() {
		return color;
	}
	@FindBy(id="wishlist_button")
	WebElement wishList;
	public WebElement getWishList() {
		return wishList;
	}
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/a[1]")
	WebElement close;
	public WebElement getClose() {
		return close;
	}
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/a[1]")
	WebElement closeMain;
	public WebElement getCloseMain() {
		return closeMain;
	}
	
	//WishList
	@FindBy(xpath="//span[contains(text(),'My wishlists')]")
	WebElement myWishList;
	public WebElement getMyWishList() {
		return myWishList;
	}
	@FindBy(className="icon-remove")
	WebElement remove;
	public WebElement getRemove() {
		return remove;
	}
}
