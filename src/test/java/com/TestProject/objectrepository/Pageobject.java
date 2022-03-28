package com.TestProject.objectrepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestProject.baseclass.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageobject extends Baseclass  {
	
	//WebDriver driver;
   
	public  Pageobject() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	WebElement username;
	 
	@FindBy(id="pass")
	 WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	 WebElement submit;
	
	public  WebElement getUsername() {
		return username;
		
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
}
