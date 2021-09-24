package com.qa.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.CheckOutPages;
import com.qa.pages.ChooseCategoryPages;
import com.qa.pages.LoginPages;
import com.qa.pages.OrderHistoryPages;
import com.qa.pages.QuickViewPages;
import com.qa.pages.RegisterPages;
import com.qa.pages.SearchPages;
import com.qa.pages.UpdatePersonInfoPages;

import org.testng.annotations.AfterClass;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	    WebDriver driver;
	    
	    LoginPages loginOR;
	    CheckOutPages checkOutOR;
	    UpdatePersonInfoPages pageObj;
	    OrderHistoryPages orderOR;
		QuickViewPages quickViewOR;
		ChooseCategoryPages categoryOR;
		RegisterPages registerOR;
		SearchPages searchOR;

	    JavascriptExecutor js;
	    Actions act;
	    
	    Properties prop;
	    FileInputStream fileLoc;
		
	    @Parameters({"browserName","url"})
		@BeforeClass
		public void setUp(String browserName, String url) throws IOException {
			
			if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			
			else if(browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			
			else if(browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			loginOR = new LoginPages(driver);
			checkOutOR = new CheckOutPages(driver);
			pageObj = new UpdatePersonInfoPages(driver);
			orderOR = new OrderHistoryPages(driver);
			quickViewOR = new QuickViewPages(driver);
			categoryOR = new ChooseCategoryPages(driver);
			registerOR = new RegisterPages(driver);
			searchOR = new SearchPages(driver);
			
			js = (JavascriptExecutor) driver;
			act=new Actions(driver);
			
			fileLoc = new FileInputStream("C:\\Users\\Kokila\\eclipse-workspace\\SeleniumProject\\ShoppingAutomation\\src\\test\\java\\com\\qa\\testdata\\InputData.properties");
			prop = new Properties();
			prop.load(fileLoc);
			
		    driver.manage().window().maximize();
		    driver.get(url);
		}
		

		@AfterClass
		public void tearDown() {
			driver.close();
		}
		
		//screenshot
		public void captureScreenshot(WebDriver driver, String tname) throws IOException{
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File Target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname + ".png");
			FileUtils.copyFile(Source, Target);
			System.out.println("Screenshot captured");
		}
		
		//login
		public void Login() throws InterruptedException {
			
			Thread.sleep(5000);
			loginOR.setSignInLink().click();

			loginOR.setEmail().sendKeys(prop.getProperty("username"));
			Thread.sleep(1500);
			loginOR.setPassword().sendKeys(prop.getProperty("password"));
			Thread.sleep(1500);

			loginOR.setSubmitBtn().click();
			Thread.sleep(2000);
		}
}

