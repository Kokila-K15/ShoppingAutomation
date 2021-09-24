package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.SearchPages;
import com.qa.utility.ExcelUtility;

public class TC_SearchItem_001 extends TestBase{
	
  SearchPages searchOR;
	
	@Test(priority=1,dataProvider="getDatas")
	public void searchItem(String Item_Name)throws Exception{
		
		searchOR = new SearchPages(driver);
		searchOR.setSearchBox(Item_Name);
		Thread.sleep(3000);
	    searchOR.setMagnifierButton();
	    Thread.sleep(2000);
	    
	    //select the type of Dresses
	   System.out.println("Dress Type : "+Item_Name);
	   if(Item_Name.equalsIgnoreCase("Summer Dress"))
	   {   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,1000)");
		   Thread.sleep(2000);
		   Actions Tshirt = new Actions(driver);
		   Tshirt.moveToElement(searchOR.setTMouseOver()).perform();
		   searchOR.setTshirtCompare().click();
		   Thread.sleep(3000);
	   }
	     
	  else if(Item_Name.equalsIgnoreCase("Evening Dress"))
	   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,500)");
	   Thread.sleep(2000);
	   Actions action = new Actions(driver);
	   action.moveToElement(searchOR.setMouseOver()).perform();
	   searchOR.setTprintedCompare().click();
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,-200)");
	   Thread.sleep(5000);
	   searchOR.setTotalCompare().click();
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,600)");
	   Thread.sleep(2000);
	   searchOR.setDeleteCompareProduct();
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,500)");
	   Thread.sleep(2000);
	   searchOR.setViewButton();
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,300)");
	   Thread.sleep(2000);
	  
	   //Select same product with different colour(PINK)
	    searchOR.setPinkColour();
	    Thread.sleep(3000);
	   
	   //Product to be added in addCart
	   searchOR.setAddCart().click();
	   Thread.sleep(6000);
	   //select continue Shopping Button
	   searchOR.setContinueShopping();
	   Thread.sleep(5000);
	   js.executeScript("window.scrollBy(0,-200)");
	   Thread.sleep(1000);
	   action.moveToElement(searchOR.setViewMouseOver()).perform();
	   Thread.sleep(5000);
	   //Product is on Checkout progress
	   searchOR.setCheckOut();
	   Thread.sleep(5000);
	   }
	   else
	   {
		System.out.println("Oops!!!!...Something is missing.Try Again");  
	   }
	}
	 
	@DataProvider
	public Object[][] getDatas() throws IOException {
		
		Object[][] details = ExcelUtility.getSearchData("testdata1", "searchdata");
		return details;
  }
}