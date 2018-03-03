package com.testologic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactoryPage {

	private WebDriver driver;
	
	
	 @FindBy(how=How.XPATH,using="txtUsername") 
	 private WebElement txtbx_UserName;
	
	 @FindBy(how=How.ID,using="txtPassword") 
	 private WebElement txtbx_UserPassword;
	 
	 @FindBy(how=How.NAME,using="Submit") 
	 private WebElement loginButton;
	 
	@FindBy(how=How.ID,using = "table")
	private WebElement table;
	 
	 public LoginFactoryPage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, LoginFactoryPage.class);
	 }
	 
	 public void login(String userName,String password){
		 
		 txtbx_UserName.sendKeys(userName);
		 txtbx_UserPassword.sendKeys(password);
		 loginButton.click();
	 }
}
