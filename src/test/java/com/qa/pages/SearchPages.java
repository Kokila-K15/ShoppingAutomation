package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages {

	WebDriver driver;
	public SearchPages(WebDriver d)
	{
	this.driver=d;
	PageFactory.initElements(d, this);
	}
	
	//Search an Item
		@FindBy(id="search_query_top")
		WebElement searchBox;
		public void setSearchBox(String data)
		{
			searchBox.clear();
			searchBox.sendKeys(data);
		}
	//Click Magnifier Button	
		@FindBy(name="submit_search") 
		WebElement magnifierButton;
		public void setMagnifierButton()
		{
		magnifierButton.click();
		}
	//Click T-shirt Mouseover	
		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img") 
		WebElement tMouseOver;
		public WebElement setTMouseOver()
		{
		return tMouseOver;
		}	
	//click t-shirt compare option
		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[3]/div[2]/a") 
		WebElement tshirtCompare;
		public WebElement setTshirtCompare()
		{
		return tshirtCompare;
		}
	//click total compare option
		@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div[2]/form/button/span") 
		WebElement totalCompare;
	    public WebElement setTotalCompare()
		{
		return totalCompare;
		}
	//Delete the comparing product
	    @FindBy(xpath="//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[1]/a/i") 
		WebElement deleteCompareProduct;
		public void setDeleteCompareProduct()
		{
		deleteCompareProduct.click();
		}
	//Click printed dress mouse over
		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img") 
		WebElement mouseOver;
		public WebElement setMouseOver()
		{
		return mouseOver;
		}
	//Click Evening dress Add to compare	
		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[3]/div[2]/a") 
		WebElement PrintedCompare;
		public WebElement setTprintedCompare()
		{
		return PrintedCompare;
		}
	//Click View Option
		@FindBy(xpath="//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[5]/div/div/a[2]/span") 
		WebElement viewButton;
		public void setViewButton()
		{
		viewButton.click();
		}
	// click addcart	
		@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span") 
		WebElement addCart;
		public WebElement setAddCart()
		{
		 return addCart;
		}
	// click Proceed with continue Shopping	
		@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span") 
		WebElement continueShopping;
		public void setContinueShopping()
		{
		continueShopping.click();
		}
	//Mouse over on View Cart	
		@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")
		WebElement viewMouseOver;
		public WebElement setViewMouseOver()
		{
		return viewMouseOver;
		}	
	//Delete the product	
		@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a") 
		WebElement deleteProduct;
		public void setDeleteProduct()
		{
		deleteProduct.click();
		}
	//Update Quantity	
		@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i") 
		WebElement updateQuantity;
		public void setupdateQuantity()
		{
		updateQuantity.click();
		}
	//Select Pink colour product
		@FindBy(xpath="//*[@id=\"color_24\"]") 
		WebElement pinkColour;
		public void setPinkColour()
		{
		pinkColour.click();
		}
	// click checkout Button	
		@FindBy(xpath="//*[@id=\"button_order_cart\"]/span") 
		WebElement checkOut;
		public void setCheckOut()
		{
		checkOut.click();
		}
	}