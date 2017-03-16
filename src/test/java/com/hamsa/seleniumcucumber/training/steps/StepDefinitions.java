package com.hamsa.seleniumcucumber.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {

	WebDriver driver = null;

	@Given("^I am on the \"(.*?)\" home page$")
	public void i_am_on_the_home_page(String str) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/hamsa/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		if (str.equals("spice jet")) {
			driver.get("http://www.spicejet.com/");

		}
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets",
				driver.getTitle());
	}

	@When("^I enter \"(.*?)\" and \"(.*?)\" in the origin and destination fields$")
	public void i_enter_and_in_the_origin_and_destination_fields(String origin, String destination) throws Throwable {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		driver.findElement(By
				.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//*[@id='dropdownGroup1']/div/ul[2]/li[4]/a"))
				.click();
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();

		//Assert.assertEquals("BOM", driver.findElement(By.xpath("//a[@value='BOM']")));
		//Assert.assertEquals("GOI",
			//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")));

	}

	@And("^I click on \"(.*?)\"$")
	public void i_click_on(String search) throws Throwable {
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).click();

	}

	@Then("^I should navigate to \"(.*?)\" page$")
	public void i_should_navigate_to_page(String str) throws Throwable {
		Assert.assertEquals(
				"Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines",
				driver.getTitle());
	}
}
