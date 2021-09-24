package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;


public class TC_CreateNewAddress_001 extends TestBase {

	@Test(dataProvider="datavalue",priority = 2)
	public void newAddress(String newAdd,String newCity,String newStateval,String newPostCode, String newCountryVal,String newHomePhn, String newMobilePhn,String newAliasAdd) throws InterruptedException, IOException {

		Login();

		quickViewOR.getClickOnMyAdd().click();
		Thread.sleep(5000);


		quickViewOR.getCreateNewAddress().click();
		
		String Url = driver.getCurrentUrl();
		if(Url.contains("address")) {
			
			Assert.assertTrue(true);
			Reporter.log("User has landed on correct page");
		} 
		else {
			captureScreenshot(driver,"AddMyAddress");
			Reporter.log("User has landed not on correct page");
			Assert.assertTrue(false);
		}
		
		quickViewOR.getNewAddress().sendKeys(newAdd);

		quickViewOR.getNewCity().sendKeys(newCity);

		Select stateVal2 = new Select(quickViewOR.setState());
		stateVal2.selectByVisibleText(newStateval);
		Thread.sleep(2000);

		quickViewOR.getNewPostCode().sendKeys(newPostCode);


		Select countryVal2 = new Select(quickViewOR.setCountry());
		countryVal2.selectByVisibleText(newCountryVal);
		Thread.sleep(5000);


		quickViewOR.getNewHomePhone().sendKeys(newHomePhn);

		quickViewOR.getNewMobilePhone().sendKeys(newMobilePhn);

		quickViewOR.getNewAliasAdd().sendKeys(newAliasAdd);
		
		quickViewOR.getSave().click();
		Thread.sleep(5000);
	}

	@DataProvider(name="datavalue")
	public Object[][] getDataValue() throws IOException{
		Object datavalue[][] = ExcelUtility.getAddAddressData("testdata1","addAddress");
		return datavalue;
	}
}
