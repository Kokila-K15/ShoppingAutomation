package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;


public class TC_QuickView_001 extends TestBase {

	//Quick More for selected Product
	@Test(dataProvider="getData")
	public void quickView(String searchField,String size,String quantity) throws InterruptedException {

		//WebElement ele = ap.getDresses();
		/*act.moveToElement(ele).build().perform();
					Thread.sleep(2000);
					ap.getEveDresses().click();*/

		Login();
		
		quickViewOR.getSearchField().sendKeys(searchField);

		quickViewOR.getSearchBtn().click();

		js.executeScript("window.scrollBy(0,700)");
		WebElement ele2 = quickViewOR.getPrintedDress();


		act.moveToElement(ele2).build().perform();
		Thread.sleep(5000);
		quickViewOR.getQuickView().click();
		Thread.sleep(5000);


		WebElement framePage = quickViewOR.getFrames();
		driver.switchTo().frame(framePage);

		int num = Integer.parseInt(quantity);
		for(int i = 1; i < num-1; i++) {
			quickViewOR.getQuantity().click();
		}


		Select size1 = new Select(quickViewOR.setSize());
		size1.selectByVisibleText(size);
		Thread.sleep(5000);
		quickViewOR.getColor().click();
		Thread.sleep(5000);
		quickViewOR.getWishList().click();
		Thread.sleep(3000);
		quickViewOR.getClose().click();
		Thread.sleep(5000);

	}
	@DataProvider
	public Object[][] getData() throws IOException {


		Object[][] details = ExcelUtility.getQuickViewData("testdata1", "quickview");
		return details;
	}
}
