package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseCategoryPages {
	WebDriver driver;

	public ChooseCategoryPages(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="WOMEN")
	WebElement categ_women;
	
	public WebElement setCateg() {
		return categ_women;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[1]/div[2]")
	WebElement filterBlock;
	
	public WebElement getFilterBlock() {
		return filterBlock;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/div[2]/ul/li[1]/div[1]/a")
	WebElement filterTop;
	
	public WebElement setFilterTop() {
		return filterTop;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/span[1]/input[1]")
	WebElement size;
	
	public WebElement setSize() {
		return size;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/span[1]/input[1]")
	WebElement composition;
	
	public WebElement setComposition() {
		return composition;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/ul[1]/li[1]/div[1]/span[1]/input[1]")
	WebElement styles;
	
	public WebElement setStyles() {
		return styles;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[6]/ul[1]/li[1]/div[1]/span[1]/input[1]")
	WebElement properties;
	
	public WebElement setProperties() {
		return properties;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/div[3]/div[1]/form/div")
	WebElement sortEle;
	
	public WebElement setSortEle() {
		return sortEle;
	}
	
	@FindBy(xpath="//option[contains(text(),'Price: Highest first')]")
	WebElement sortPrice;
	
	public WebElement setSortPrice() {
		return sortPrice;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]")
	WebElement selectPro;
	
	public WebElement setSelectPro() {
		return selectPro;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]")
	WebElement addToCart;
	
	public WebElement setAddTocart() {
		return addToCart;
	}

	@FindBy(xpath="//span[@title='Continue shopping']")
	WebElement contShop;
	
	public WebElement setContshop() {
		return contShop;
	}
	
	@FindBy(xpath="//div[@id='layer_cart']")
	WebElement addToCartPopUp;

	public boolean checkAddToCart() {
		if(addToCartPopUp!=null)
			return true;
		return false;
	}

}
