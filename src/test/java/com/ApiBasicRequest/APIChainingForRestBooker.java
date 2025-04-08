package com.ApiBasicRequest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.APIPOJOClasses.AuthPOJO;
import com.APIPOJOClasses.BookingDates;
import com.APIPOJOClasses.BookingDetails;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/*
 * given():Precondition
 * ====================
 * header,cookie,request payload,query and path parameters,authentication
 * 
 * when(): Action-sending request to server
 * =====================================
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then():Response validation
 * =========================
 * status code,message,response time,response payload
 * 
 * 
 */
public class APIChainingForRestBooker 
{
	int bookingId;
	
	String tokenValue;
	
  @Test(priority=1)
  public void createNewBooking() 
  {
	  //Request payload
	  
	  //inner pojo create object
	  BookingDates date=new BookingDates();
	  date.setCheckin("2025-04-07");
	  date.setCheckout("2025-04-08");
	  
	  BookingDetails booking=new BookingDetails();
	  booking.setFirstname("Priyanka");
	  booking.setLastname("Nigade");
	  booking.setTotalprice(99999);
	  booking.setDepositpaid(true);
	  booking.setBookingdates(date);
	  booking.setAdditionalneeds("lunch");
	  
	  
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .body(booking)
	  
			  .when().post("https://restful-booker.herokuapp.com/booking");
	  
	  //Assert status code
	 int statusCode=res.getStatusCode();
	 AssertJUnit.assertEquals(statusCode,200);
	 System.out.println("Status code matched..."+statusCode);
	  
	  //get the reponse body in console
	 res.then().log().body();
	  
	  //json validation -jsonPath()
	 bookingId= res.jsonPath().getInt("bookingid");
	  System.out.println("New Booking created with BookingId: "+bookingId);
	  
	    
  }
  
  @Test(priority=2)
  public void getBookingDetailsForRegisterUser()
  {
	  Response res=given()
			  .when().get("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  
	  AssertJUnit.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is matched...."+res.getStatusCode());
	  
	  //log the result
	  res.then().log().body();
	  
	  System.out.println("Booking details with Booking id: "+bookingId);
	  
	  
  }
  
  @Test(priority=3)
  public void createToken()
  {
	  //Request payload
	  AuthPOJO auth=new AuthPOJO();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
			  
	  
	  
	  	Response res=given()
	  			.header("Content-Type","application/json")
	  			.body(auth)
	  	
	  			.when().post("https://restful-booker.herokuapp.com/auth");
	  	
	  	
	  	AssertJUnit.assertEquals(res.getStatusCode(),200);
	  	System.out.println("Status code matched..");
	  	
	  	//log
	  	res.then().log().body();
	  	
	  	//token
	  	
	  	tokenValue=res.jsonPath().getString("token");
	  	
	  	System.out.println("Using Authentication Token created: "+tokenValue);
	  
	  
	  
	  
  }
  
  
  @Test(priority=4)
  public void testFullUpadateForBooking()
  {
	  //Request payload
	  
	  //inner pojo create object
	  BookingDates date=new BookingDates();
	  date.setCheckin("2025-04-08");
	  date.setCheckout("2025-04-09");
	  
	  BookingDetails booking=new BookingDetails();
	  booking.setFirstname("Jay");
	  booking.setLastname("Nigade");
	  booking.setTotalprice(7777);
	  booking.setDepositpaid(true);
	  booking.setBookingdates(date);
	  booking.setAdditionalneeds("dinner");
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .header("Accept","application/json")
	  		.header("Cookie","token="+tokenValue)
	  		.body(booking)
	  
	  		.when().put("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  	AssertJUnit.assertEquals(res.getStatusCode(),200);
	  	System.out.println("Status code matched..");
	  	
	  	//log
	  	res.then().log().body();
	  
	  System.out.println("Booking update for Id: "+bookingId);
	  
	  
  }
  
  @Test(priority=5)
  public void deleteBooking()
  {
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Cookie","token="+tokenValue)
	  
	  .when().delete("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  
	  //Assertion
	  
	  AssertJUnit.assertEquals(res.getStatusCode(),201);
	  System.out.println("Current booking is deleted for id: "+bookingId);
	  
	  
	  
  }
  
  
  
  
}
