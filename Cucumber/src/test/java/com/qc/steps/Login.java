package com.qc.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//@SuppressWarnings("deprecation")
public class Login {
	
	WebDriver driver;
		@Before
		public void setUp() {
			System.out.println("Hello");
			driver=new ChromeDriver();
			driver.get("file:///home/vishal/Downloads/Offline%20Website/index.html");
			driver.manage().window().maximize();
			driver.get("file:///home/vishal/Downloads/Offline%20Website/index.html");
		}
		@Given("to enter valid userName {string}")
		public void to_enter_valid_user_name(String uName) {
			driver.findElement(By.id("email")).sendKeys(uName);
		    
		}

		@Given("to enter valid password {string}")
		public void to_enter_valid_password(String uPass) {
			driver.findElement(By.id("password")).sendKeys(uPass);

		}
		@When("to click on the sign in button")
		public void to_click_on_the_sign_in_button() {
			driver.findElement(By.id("submit")).click();

		}
		@Then("to Validate the dashboard page title  {string}")
		public void to_validate_the_dashboard_page_title(String expResult) {
		    String actResult=driver.getTitle();
		    Assert.assertEquals(actResult, expResult);
		}

@After
public void tearDown() {
	driver.close();
}


}
