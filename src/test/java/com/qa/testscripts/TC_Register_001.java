package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_Register_001 extends TestBase{
		
		@Test(dataProvider="excelData")
		public void Register(String Email, String FirstName, String LastName,String Password, String Address, String CityName, String PostCode, String AliasAdd, String MobilePhn, String State, String Country ) throws InterruptedException {
			
			registerOR.getSiginInLink().click();
			Thread.sleep(3000);
			registerOR.getSearchTextTab().sendKeys(Email);	
			registerOR.getCreateAccount().click();
			Thread.sleep(5000);
			registerOR.getFirstName().sendKeys(FirstName);
			registerOR.getLastName().sendKeys(LastName);
			Thread.sleep(5000);
			registerOR.getPassword().sendKeys(Password);
			registerOR.getAddressText().sendKeys(Address);
			Thread.sleep(5000);
			registerOR.getCityName().sendKeys(CityName);
			registerOR.getPostCode().sendKeys(PostCode);
			Thread.sleep(5000);
			registerOR.getAliasAdd().clear();
			Thread.sleep(5000);
			registerOR.getAliasAdd().sendKeys(AliasAdd);
			registerOR.getMobilePhn().sendKeys(MobilePhn);
			Thread.sleep(3000);
			Select idState2 = new Select(registerOR.setIdState());
			idState2.selectByVisibleText(State);
			Select idCountry2 = new Select(registerOR.setIdCountry());
			idCountry2.selectByVisibleText(Country);
			Thread.sleep(3000);
			registerOR.getRegister().click();	
		}
		
		@DataProvider(name="excelData")
		public Object[][] getExcelDetails() throws IOException
		{
			Object obj[][]=ExcelUtility.getRegisterData("testdata1","register");
			return obj;
		}
}
