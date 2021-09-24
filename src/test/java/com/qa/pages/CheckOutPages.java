package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPages {
	
	WebDriver driver;
	
	public CheckOutPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]")
	WebElement productLink;
	
	public WebElement getProductLink() {
		return productLink;
	}
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")
	WebElement addToCartLink;
	
	public WebElement getAddToCartLink() {
		return addToCartLink;
	}
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement checkOutLink;
	
	public WebElement getCheckOutLink() {
		return checkOutLink;
	}

	@FindBy(xpath="//div[@id='order-detail-content']/table/tbody/tr")
    List<WebElement> productList;
	
	public List<WebElement> getProductList() {
		return productList;
	}
	
	@FindBy(xpath="//tbody//input[1]")
	WebElement addProdnum;
	
	public WebElement setProdnum() {
		return addProdnum;
	}
	
	@FindBy(className="icon-minus")
	WebElement productMinus;
	
	public WebElement setProductMinus() {
		return productMinus;
	}
	
	@FindBy(className="icon-plus")
	WebElement productPlus;
	
	public WebElement setProductPlus() {
		return productPlus;
	}
	
	@FindBy(className="icon-trash")
	WebElement productTrash;
	
	public WebElement setProductTrash() {
		return productTrash;
	}
	
	@FindBy(xpath="//input[@name='quantity_1_1_0_0_hidden']")
	WebElement prodValue;
	
	public WebElement setProdValue() {
		return prodValue;
	}
	
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
	WebElement proceedcheckOutLink;
	
	public WebElement getProceedcheckOutLink() {
		return proceedcheckOutLink;
	}
	
	@FindBy(id="addressesAreEquals")
    WebElement addressEqual;
	
	public WebElement setAddressEqual() {
		return addressEqual;
	}
	
	@FindBy(xpath="//ul[@class='address item box']//a[@title='Update']")
    WebElement delivaryAddress;
	
	public WebElement setDelivaryAddress() {
		return delivaryAddress;
	}
	
	@FindBy(xpath="//ul[@class='address alternate_item box']//a[@title='Update']")
    WebElement billingAddress;
	
	public WebElement setBillingAddress() {
		return billingAddress;
	}
	
	@FindBy(xpath="//div[@id='address_invoice_form']//a[@title='Add']")
    WebElement addNewAdd;
	
	public WebElement setNewAddress() {
		return addNewAdd;
	}
	
	@FindBy(name="message")
	WebElement comment;
	
	public WebElement setComment() {
		return comment;
	}
	
	@FindBy(name="processAddress")
    WebElement processAddress;
	
	public WebElement getProcessAddress() {
		return processAddress;
	}
	
	@FindBy(id="cgv")
	WebElement terms;
	
	public WebElement setTerms() {
		return terms;
	}
	
	@FindBy(name="processCarrier")
	WebElement processCarrier;
	
	public WebElement setProcessCarrier() {
		return processCarrier;
	}
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/a[1]")
	WebElement cancelAlert;
	
	public WebElement setCancelAlert() {
		return cancelAlert;
	}
	
	@FindBy(className="bankwire")
	WebElement bankWire;
	
	public WebElement setBankWire() {
		return bankWire;
	}
	
	@FindBy(className="cheque")
    WebElement cheque;
	
	public WebElement setCheque() {
		return cheque;
	}
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	WebElement confirmOrder;
	
	public WebElement setConfirmOrder() {
		return confirmOrder;
	}
	
	@FindBy(xpath="//a[normalize-space()='Other payment methods']")
	WebElement otherPay;
	
	public WebElement setOtherPay() {
		return otherPay;
	}
	
	@FindBy(xpath="//div[@id='address_invoice_form']//a[@title='Add']")
    WebElement addAddress;
	
	public WebElement setAddAddress() {
		return addAddress;
	}
	
	@FindBy(xpath="//div[@class='required form-group form-error']//input[@type='text']")
    WebElement newAddress;
	
	public WebElement setAddNewAddress() {
		return newAddress;
	}
	
	@FindBy(id="submitAddress")
    WebElement submitadd;
	
	public WebElement setSubmitAdd() {
		return submitadd;
	}
	
	@FindBy(id="id_address_delivery")
	WebElement deliveryAdd;
	
	public WebElement setDeliveryAdd() {
		return deliveryAdd;
	}
	
	@FindBy(id="id_address_invoice")
	WebElement invoiceAdd;
	
	public WebElement setInvoiceAdd() {
		return invoiceAdd;
	}
	
}
