package com.StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTarrfPlans {
	static WebDriver driver;
	@Given("USer is in Telephone Home Page")
	public void user_is_in_Telephone_Home_Page() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govardhan\\Desktop\\Trinath\\cucumberTel\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/telecom/");
		   driver.manage().window().maximize();
	}

	@Given("User click on Add Tarrif Plan")
	public void user_click_on_Add_Tarrif_Plan() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
//	One dimensional List
	@When("user is filling all the fields")
	public void user_is_filling_all_the_fields1(DataTable tarrifplan1) {
		List<String> al = tarrifplan1.asList(String.class);
		
	   driver.findElement(By.id("rental1")).sendKeys(al.get(0));
	   driver.findElement(By.id("local_minutes")).sendKeys(al.get(1));
	   driver.findElement(By.id("inter_minutes")).sendKeys(al.get(2));
	   driver.findElement(By.id("sms_pack")).sendKeys(al.get(3));
	   driver.findElement(By.id("minutes_charges")).sendKeys(al.get(4));
	   driver.findElement(By.id("inter_charges")).sendKeys(al.get(5));
	   driver.findElement(By.id("sms_charges")).sendKeys(al.get(6));
	}
	
//	One Dimensional Map
	
	@When("user is filling all the fields.")
	public void user_is_filling_all_the_fields2(DataTable tarrifplan2) {
		Map<String, String> am = tarrifplan2.asMap(String.class, String.class);
		 driver.findElement(By.id("rental1")).sendKeys(am.get("Mrent"));
		   driver.findElement(By.id("local_minutes")).sendKeys(am.get("Freemin"));
		   driver.findElement(By.id("inter_minutes")).sendKeys(am.get("FreeIM"));
		   driver.findElement(By.id("sms_pack")).sendKeys(am.get("Freesms"));
		   driver.findElement(By.id("minutes_charges")).sendKeys(am.get("Localpmc"));
		   driver.findElement(By.id("inter_charges")).sendKeys(am.get("Ipmc"));
		   driver.findElement(By.id("sms_charges")).sendKeys(am.get("Smspc"));
	   
	}
	
//	Two dimensional List
	@When("user is filling all the fieldss")
	public void user_is_filling_all_the_fieldss3(DataTable TarrifplansL) {
		List<List<String>> all = TarrifplansL.asLists(String.class);
		   driver.findElement(By.id("rental1")).sendKeys(all.get(0).get(0));
		   driver.findElement(By.id("local_minutes")).sendKeys(all.get(0).get(1));
		   driver.findElement(By.id("inter_minutes")).sendKeys(all.get(2).get(0));
		   driver.findElement(By.id("sms_pack")).sendKeys(all.get(2).get(3));
		   driver.findElement(By.id("minutes_charges")).sendKeys(all.get(3).get(2));
		   driver.findElement(By.id("inter_charges")).sendKeys(all.get(1).get(1));
		   driver.findElement(By.id("sms_charges")).sendKeys(all.get(3).get(0));	
	    
	}

//	Two Dimensional Map
	@When("user is filling all the fields..")
	public void user_is_filling_all_the_fields4(DataTable Tarrifplansmm) {
		List<Map<String, String>> amm = Tarrifplansmm.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(amm.get(0).get("Mrent"));
		   driver.findElement(By.id("local_minutes")).sendKeys(amm.get(1).get("Freemin"));
		   driver.findElement(By.id("inter_minutes")).sendKeys(amm.get(1).get("FreeIM"));
		   driver.findElement(By.id("sms_pack")).sendKeys(amm.get(1).get("Freesms"));
		   driver.findElement(By.id("minutes_charges")).sendKeys(amm.get(1).get("Localpmc"));
		   driver.findElement(By.id("inter_charges")).sendKeys(amm.get(1).get("Ipmc"));
		   driver.findElement(By.id("sms_charges")).sendKeys(amm.get(1).get("Smspc"));
	    
	    
	}

//	Scenario Outline
	@When("user is filling all the fieldss..{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_filling_all_the_fieldss(String one, String two, String three, String four, String five, String six, String seven) {
		driver.findElement(By.id("rental1")).sendKeys(one);
		   driver.findElement(By.id("local_minutes")).sendKeys(two);
		   driver.findElement(By.id("inter_minutes")).sendKeys(three);
		   driver.findElement(By.id("sms_pack")).sendKeys(four);
		   driver.findElement(By.id("minutes_charges")).sendKeys(five);
		   driver.findElement(By.id("inter_charges")).sendKeys(six);
		   driver.findElement(By.id("sms_charges")).sendKeys(seven);
	}

	@When("user clicking on submit")
	public void user_clicking_on_submit() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should get display of congratulation you add tariff plan")
	public void user_should_get_display_of_congratulation_you_add_tariff_plan() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

	@Then("user should displayed of home button")
	public void user_should_displayed_of_home_button() {
	    Assert.assertTrue(driver.findElement(By.xpath("//a[@class='button']")).isDisplayed());
		
	}

}
