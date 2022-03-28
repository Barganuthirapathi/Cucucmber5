package com.TestProject.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TestProject.baseclass.Baseclass;
import com.TestProject.objectrepository.Pageobject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testproject extends Baseclass{
	
	Pageobject page=new Pageobject();
	Baseclass base =new Baseclass();
	
	
	
	@Given("user wants to login into the page{string}")
	public void user_wants_to_login_into_the_page(String string) {
		base.browserlaunch(string);
	}


	@When("^user entered with(.*)$")
	public  void  user_entered_with_bargan(String username) {
	    System.out.println("+++++done1");
	   
	 WebElement username2 = page.getUsername();
	 base.login_username(username2, username);
	// base.login_username(page.getUsername(), password);
	// driver.findElement(By.id("email")).sendKeys(username);
	// driver.findElement(By.id("pass")).sendKeys(password);
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
		   System.out.println("====done2");
//		   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	


}
