package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_OrderHistory_001 extends TestBase{

	@Test(dataProvider="getData")
	public void checkHistory(String orderRef, String comment) throws InterruptedException, IOException {

		Login();

		try {
			orderOR.getOrderHistory().click();
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			if(url.contains("history"))
				Assert.assertTrue(true);
			else {
				captureScreenshot(driver,"orderHistory");
				Assert.assertTrue(false);
			}

			//view order
			List<WebElement> orderList = orderOR.getOrderRef();
			for(WebElement list : orderList) {

				if(list.getText().equals(orderRef)) {
					//orderOR.getPdf().click();

					orderOR.getDeatils().click();
					Thread.sleep(6000);

					js.executeScript("window.scrollBy(0,600)");
					Thread.sleep(6000);
					Select ele = new Select(orderOR.setChooseProduct());
					ele.selectByIndex(1);
					Thread.sleep(5000);

					orderOR.setMessage().sendKeys(comment);
					Thread.sleep(5000);
					orderOR.getSubmit().click();

					Thread.sleep(5000);
					String msg = orderOR.getSuccessMesg().getText();

					if(msg.contains("successfully sent"))
						Assert.assertTrue(true);
					else {
						captureScreenshot(driver,"Comment Success Message");
						Assert.assertTrue(false);
					}
					Thread.sleep(5000);

					orderOR.getReOrder().click();

					Thread.sleep(5000);
					String orderUrl = driver.getCurrentUrl();
					if(orderUrl.contains("order"))
						Assert.assertTrue(true);
					else {
						captureScreenshot(driver,"ReOrder");
						Assert.assertTrue(false);
					}

				}			
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		Object[][] details = ExcelUtility.getOrderHistoryData("testdata1","orderhistory");
		return details;
	}

}
