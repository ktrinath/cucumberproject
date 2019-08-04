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


public class AddCustomerStep {
	static WebDriver driver;
	@Given("User is in Telephone Home page")
	public void user_is_in_Telephone_Home_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govardhan\\Desktop\\Trinath\\cucumberTel\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/telecom/");
	   driver.manage().window().maximize();
	}

	@Given("User clicks on add customer details")
	public void user_clicks_on_add_customer_details() {
	   driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	}

//	ONE DIMENSIONAL LIST
	@When("User fill all fields")
	public void user_fill_all_fields1(DataTable custDetail) {
		List<String> alist = custDetail.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(alist.get(0));
		driver.findElement(By.id("lname")).sendKeys(alist.get(1));
		driver.findElement(By.id("email")).sendKeys(alist.get(2));
		driver.findElement(By.name("addr")).sendKeys(alist.get(3));
		driver.findElement(By.name("telephoneno")).sendKeys(alist.get(4));
			    
	}
	
//	ONE DIMENSIONAL MAP
	@When("User fill all fields.")
	public void user_fill_all_fields2(DataTable custDetails) {
		Map<String, String> amap = custDetails.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(amap.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(amap.get("lname"));
		driver.findElement(By.id("email")).sendKeys(amap.get("email"));
		driver.findElement(By.name("addr")).sendKeys(amap.get("addr"));
		driver.findElement(By.name("telephoneno")).sendKeys(amap.get("phno"));
	    
	}
	
//	TWO DIMENSIONAL LIST
	
	@When("User fill all fieldss")
	public void user_fill_all_field3(DataTable custmerDeatil) {
		List<List<String>>tl=custmerDeatil.asLists(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(tl.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(tl.get(0).get(1));
		driver.findElement(By.id("email")).sendKeys(tl.get(0).get(2));
		driver.findElement(By.name("addr")).sendKeys(tl.get(0).get(3));
		driver.findElement(By.name("telephoneno")).sendKeys(tl.get(0).get(4));
		
	    
	}
	
//	TWO DIMENSIONAL MAP
	@When("User fill all fields..")
	public void user_fill_all_fields4(DataTable customerDeails) {
		List<Map<String,String>>am=customerDeails.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(am.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(am.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(am.get(2).get("email"));
		driver.findElement(By.name("addr")).sendKeys(am.get(1).get("addr"));
		driver.findElement(By.name("telephoneno")).sendKeys(am.get(0).get("phno"));
	   
	}

//	Scenario outline
	@When("User fill all fieldss..{string},{string},{string},{string},{string}")
	public void user_fill_all_fieldss(String fn, String ln, String mail, String ad, String no) {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fn);
		driver.findElement(By.id("lname")).sendKeys(ln);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.name("addr")).sendKeys(ad);
		driver.findElement(By.name("telephoneno")).sendKeys(no);
	}
	    

	
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User get unique id of confirmation")
	public void user_get_unique_id_of_confirmation() {
	Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='Home'])[1]")).isDisplayed());
	}
	
}
