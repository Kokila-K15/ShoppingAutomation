package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_UpdateMyPersonInfo_001 extends TestBase{

	@Test(dataProvider="personInfo")
	public void personalInfo(String firstname, String lastname, String dob, String pass) throws InterruptedException {

		// login code starts here

		Login();
		Assert.assertTrue(driver.getTitle().contains("My account"));

		//goto account section
		pageObj.gotoAcctSection().click();
		
		//navigate to My personal info
		pageObj.gotoMyPersonalInfo().click();
		Assert.assertTrue(driver.getTitle().contains("Identity"));
		Thread.sleep(3000);
		
		//update social title to Mrs
		js.executeScript("arguments[0].scrollIntoView(true);", pageObj.setSocialTitle());
		pageObj.setSocialTitle().click();
		Assert.assertTrue(pageObj.setSocialTitle().isSelected());
		
		//update firstName
		pageObj.setFirstName().clear();
		pageObj.setFirstName().sendKeys(firstname);
		Thread.sleep(3000);
		
		//update lastName
		pageObj.setLastName().clear();
		pageObj.setLastName().sendKeys(lastname);
		Thread.sleep(3000);
		
		//update Date of birth
		pageObj.setDateofBirth(dob);
		Thread.sleep(3000);
		
		//enter current password
		pageObj.setCurrentPass().sendKeys(pass);

		//save update
		Thread.sleep(3000);
		pageObj.clickSubmit().click();
	}

	@DataProvider
	public Object[][] personInfo() throws IOException {
		
		Object data[][] = ExcelUtility.getPersonInfoData("testdata1", "updateInfo");
		return data;
	}
}
