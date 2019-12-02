package com.cucumber.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;

import com.cucumber.pom.HomePage;
import com.cucumber.testrunner.MytripTestrunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyTripStepdefini extends BaseClass{

	public static WebDriver driver = MytripTestrunner.driver;
	
	HomePage hp1=new HomePage(driver);

@Given("^User launch the make my trip application$")
public void user_launch_the_make_my_trip_application() throws Exception   {
    getUrl("https://www.makemytrip.com/bus-tickets/");
     
}

@When("^Title of the page is 'Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip'$")
public void title_of_the_page_is_Bus_Ticket_Booking_Book_Confirmed_Reservation_Tickets_MakeMyTrip()   {
    String title=driver.getTitle();
    System.out.println(title);
    Assert.assertEquals("Online Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip", title);
      
}

@Then("^User enters 'Mumbai' in from field$") 
public void user_enters_Mumbai_in_from_field() throws Exception   {
   clickonelement(hp1.getFrom_place());
   clickonelement(hp1.getClick_Mumbai());
}

@Then("^User enters 'Delhi' in to field$")
public void user_enters_Delhi_in_to_field() throws Throwable {
	 clickonelement(hp1.getTo_Place());
     clickonelement(hp1.getClick_Delhi());
}


/*

@Then("^User click Login button$")
public void user_click_Login_button() throws Throwable {
     
     
}

@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2) throws Throwable {
     
     
}

@Then("^User click Login button in Login Page$")
public void user_click_Login_button_in_Login_Page() throws Throwable {
     
     
}
*/
@Then("^User enter travel date (\\d+)Sep'(\\d+)$")
public void user_enter_travel_date_Sep(int arg1, int arg2) throws Throwable {
	     clickonelement(hp1.getSelectDate());
	     clickonelement(hp1.getPickDate());
}

@Then("^User click Search button$")
public void user_click_Search_button() throws Throwable {
    clickonelement(hp1.getSearchbutton());
}


@And("^User verify relevant buses is displayed$")
public void user_verify_relevant_buses_is_displayed() throws Exception  {
	String message = gettextfromwebelement(hp1.getVerifyText());
	System.out.println("Header "+message);
	String substring = message.substring(message.length()-5);
    Assert.assertEquals("Found", substring);
    Assert.assertTrue(message.contains("Found"));
   
	
	
	/*Assert.assertEquals(s, hp1.getVerifyText().getText());
	Assert.assertEquals("SortBy: Highest Rating", hp1.getVerifySortBy().getText());*/
	
	
}

}


