package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_ChooseCategory_001 extends TestBase{
	

	@Test(priority=1)
	public void chooseCategory() throws InterruptedException, IOException {
		
				// clicking WOMEN category from main page
				categoryOR.setCateg().click();
				Assert.assertTrue(driver.getTitle().contains("Women"));
				//Reporter.log("Category chosen: WOMEN");
				js.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(2000);

				//filtering
				js.executeScript("arguments[0].scrollIntoView(true);", categoryOR.getFilterBlock());
				Thread.sleep(3000);
				categoryOR.setFilterTop().click();
				Thread.sleep(5000);
				
				if(driver.getTitle().contains("Tops"))
			    	Assert.assertTrue(true);
				else {
					captureScreenshot(driver,"chooseCategory");
					Assert.assertTrue(false);
				}
				Thread.sleep(3000);
				
				categoryOR.setSize().click();
				Assert.assertTrue(categoryOR.setSize().isSelected());
		
				categoryOR.setComposition().click();
				Assert.assertTrue(categoryOR.setComposition().isSelected());
		
				categoryOR.setStyles().click();
				Assert.assertTrue(categoryOR.setStyles().isSelected());
		
				categoryOR.setProperties().click();
				Assert.assertTrue(categoryOR.setProperties().isSelected());
				
				// sorting Highest to lowest price
				js.executeScript("arguments[0].scrollIntoView(true);", categoryOR.setSortEle());
				Thread.sleep(3000);
			
				categoryOR.setSortPrice().click();
				Assert.assertTrue(categoryOR.setSortPrice().isSelected());

				// adding product to cart
					// selecting product class				
				WebElement ele = categoryOR.setSelectPro();
				Actions action = new Actions(driver);
				
				//Performing the mouse hover action on the product class
				action.moveToElement(ele).perform();
				categoryOR.setAddTocart().click();
				Thread.sleep(5000);
				Assert.assertTrue(categoryOR.checkAddToCart());
				Thread.sleep(5000);
				
				// continue shopping
				categoryOR.setContshop().click();
				Thread.sleep(3000);
			}
}
