package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdatePersonInfoPages {
	WebDriver driver;
	
	public UpdatePersonInfoPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	WebElement acctSection;
	public WebElement gotoAcctSection() {
		return acctSection;
	}

	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	WebElement myPersonalInfoSection;
	public WebElement gotoMyPersonalInfo() {
		return myPersonalInfoSection;
	}

	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/label[1]/div[1]/span[1]/input[1]")
	WebElement socialTitle;
	
	public WebElement setSocialTitle() {
		return socialTitle;
	}

	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/input[1]")
	WebElement firstName;
	public WebElement setFirstName() {
		return firstName;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/input[1]")
	WebElement lastName;
	public WebElement setLastName() {
		return lastName;
	}
	
	public void setDateofBirth(String dob) {
		
		String[] splitdate = dob.split("/");
		
		Select dayObj = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[5]/div/div[1]/div/select")));
		Select monthObj = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[5]/div/div[2]/div/select")));
		Select yearObj = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[5]/div/div[3]/div/select")));

		dayObj.selectByValue(splitdate[0]);
		monthObj.selectByValue(splitdate[1]);
		yearObj.selectByValue(splitdate[2]);
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[6]/input[1]")
	WebElement currentPass;
	public WebElement setCurrentPass() {
		return currentPass;
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[11]/button[1]")
	WebElement updateSubmit;
	public WebElement clickSubmit() {
		return updateSubmit;
	}

}
