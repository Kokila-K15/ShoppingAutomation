package com.qa.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_CheckOut_002 extends TC_CheckOut_001{

	@Test(dependsOnMethods="Summary",dataProvider="getData",priority=3)
	public void checkOut(String addressStatus, String billAddress,String invoiceAddress,String comment,String payMethod) throws InterruptedException, IOException {

		//login
		loginOR.setEmail().sendKeys(prop.getProperty("username"));
		Thread.sleep(1500);
		loginOR.setPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(1500);

		loginOR.setSubmitBtn().click();
		Thread.sleep(2000);
				
		if(driver.getCurrentUrl().contains("shipping"))
			Assert.assertTrue(true);
		else {
			captureScreenshot(driver,"checkOut_Login");
			Assert.assertTrue(false);
		}

		// verify the address

        if(addressStatus.equals("equal")) {
		if(!checkOutOR.setAddressEqual().isSelected())
			checkOutOR.setNewAddress().click();
        }
        else {
        	Select billAdd=new Select(checkOutOR.setBillingAddress());
        	billAdd.selectByVisibleText(billAddress);
        	Select invoiceAdd = new Select(checkOutOR.setInvoiceAdd());
        	invoiceAdd.selectByVisibleText(invoiceAddress);
        }

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//checkOutOR.setDelivaryAddress().click();
		//checkOutOR.setBillingAddress().click();	

		checkOutOR.setComment().sendKeys(comment);
		Thread.sleep(2000);
		checkOutOR.getProcessAddress().click();

		// shipping details

		checkOutOR.setProcessCarrier().click();
		checkOutOR.setCancelAlert().click();
		Thread.sleep(3000);

		checkOutOR.setTerms().click();
		checkOutOR.setProcessCarrier().click();

		//payment 
        String s="Pay by "+payMethod;
		driver.findElement(By.xpath("//a[@title=\"" + s + "\"]")).click();
		
		if(driver.getCurrentUrl().contains("payment"))
			Assert.assertTrue(true);
		else {
			captureScreenshot(driver,"checkOut_Login");
			Assert.assertTrue(false);
		}
		
		checkOutOR.setConfirmOrder().click();

		Thread.sleep(3000);

		loginOR.setLogout().click();
}

	@DataProvider
	public Object[][] getData() throws IOException {

		Object[][] details = ExcelUtility.getCheckOutData("testdata1", "checkout");
		return details;
	}

}
