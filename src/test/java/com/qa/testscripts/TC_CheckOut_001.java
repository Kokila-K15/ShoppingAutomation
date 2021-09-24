package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_CheckOut_001 extends TC_SearchItem_001{

	@Test(dataProvider="getSummaryData",priority=2,dependsOnMethods="searchItem")
	public void Summary(String productName, String deleteStatus , String quantity) throws InterruptedException, IOException {
		
		if(driver.getCurrentUrl().contains("order"))
			Assert.assertTrue(true);
		else {
			captureScreenshot(driver,"checkOut_Summary");
			Assert.assertTrue(false);
		}

		//update the product details
		
		List<WebElement> prodList=checkOutOR.getProductList();
		for(WebElement list:prodList) {
			{
				if(list.getText().equalsIgnoreCase(productName));
				{

					if(deleteStatus.equals("No")) {
//					checkOutOR.setProdnum().clear();
//					checkOutOR.setProdnum().sendKeys(quantity);
						Thread.sleep(5000);

						int val=Integer.parseInt(quantity);
						for(int i=0;i<val-1;i++)
							checkOutOR.setProductPlus().click();
						
						Thread.sleep(5000);

					}
					else if(deleteStatus.equals("Yes")) {
						checkOutOR.setProductTrash().click();
						Thread.sleep(5000);
					}
				}
			}
		}
		checkOutOR.getProceedcheckOutLink().click();
		Thread.sleep(5000);
	}
	
	
	@DataProvider
	public Object[][] getSummaryData() throws IOException {

		Object[][] details = ExcelUtility.getSummaryData("testdata1", "summary");
		return details;
	}

}
