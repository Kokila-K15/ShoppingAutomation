package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPages {

	WebDriver driver;
	
	public OrderHistoryPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Orders']")
	WebElement orderHistory;
	
	public WebElement getOrderHistory() {
		return orderHistory;
	}
	
	@FindBy(xpath="//tbody/tr/td[6]/a[1]")
	WebElement pdf;
	
	public WebElement getPdf() {
		return pdf;
	}
	
	@FindBy(xpath="//tbody/tr/td[7]/a[1]")
    WebElement details;
	
	public WebElement getDeatils() {
		return details;
	}
	
	@FindBy(xpath="//span[normalize-space()='Reorder']")
	WebElement reorder;
	
	public WebElement getReOrder() {
		return reorder;
	}
	
	@FindBy(xpath="//select[@name='id_product']")
	WebElement chooseProduct;

	public WebElement setChooseProduct() {
		return chooseProduct;
	}
	
	@FindBy(name="msgText")
	WebElement message;

	public WebElement setMessage() {
		return message;
	}
	
	@FindBy(xpath="//button[@name='submitMessage']//span")
	WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(className="color-myaccount")
	List<WebElement> orderRef;

	public List<WebElement> getOrderRef() {
		return orderRef;
	}
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	WebElement successMesg;
	
	public WebElement getSuccessMesg() {
		return successMesg;
	}
}
