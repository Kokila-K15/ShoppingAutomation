package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;


public class TC_UpdateAddress_001 extends TestBase {
	
	@Test(dataProvider="getData",priority = 2)
	public void newAddress(String newAdd,String newCity,String newStateval, String newCountryVal,String newPostCode,String newHomePhn, String newMobilePhn,String newAliasAdd) throws InterruptedException {
		
		Login();
		quickViewOR.getClickOnMyAdd().click();
		Thread.sleep(5000);
		
		quickViewOR.getUpdateAdd().click();
		Thread.sleep(5000);
		
		quickViewOR.getNewAddress().sendKeys(newAdd);
		
		quickViewOR.getNewCity().sendKeys(newCity);
		Thread.sleep(5000);

		Select stateVal2 = new Select(quickViewOR.setState());
		stateVal2.selectByVisibleText(newStateval);
		Thread.sleep(5000);
		
		quickViewOR.getNewPostCode().clear();
		quickViewOR.getNewPostCode().sendKeys(newPostCode);
		Thread.sleep(5000);
		
		Select countryVal2 = new Select(quickViewOR.setCountry());
		countryVal2.selectByVisibleText(newCountryVal);
		Thread.sleep(5000);
		
		quickViewOR.getNewHomePhone().clear();
		quickViewOR.getNewHomePhone().sendKeys(newHomePhn);
		Thread.sleep(5000);
		
		quickViewOR.getNewMobilePhone().clear();
		quickViewOR.getNewMobilePhone().sendKeys(newMobilePhn);
		Thread.sleep(5000);
		
		quickViewOR.getNewAliasAdd().clear();
		quickViewOR.getNewAliasAdd().sendKeys(newAliasAdd);
		Thread.sleep(5000);
		
		quickViewOR.getSave().click();
		Thread.sleep(5000);
		
		//delete
		quickViewOR.getDelete().click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
		Thread.sleep(3000);
}

	@DataProvider
	public Object[][] getData() throws IOException {


		Object[][] details = ExcelUtility.getUpdateAddressData("testdata1", "updateaddress");
		return details;
	}
}
