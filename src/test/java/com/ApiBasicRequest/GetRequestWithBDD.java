package com.ApiBasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

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




public class GetRequestWithBDD {
  @Test
  public void testSingleUser()
  {
	  given()
	 
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(200)
	  	
	  	//validate id should be 2
	  	.body("data.id",equalTo(2))
	  	
	  	//to print all log from server
	  	//.log().all();
	  
	  	//to print only heders
	  	//.log().headers();
	  
	  	//to print json payload
	  	.log().body();
	  
  }
  
  
  @Test 
  public void testlistofUsers()
  {
	  
	  Response res=given()
	  
			  			.when().get("https://reqres.in/api/users?page=2");
	  
	  
	  //validate  status code
	  int statuscode=res.getStatusCode();
	  Assert.assertEquals(statuscode,200);
	  System.out.println("status code matched...");
	  
	  //log the body
	  res.then().log().body();
	  
	  //jsonvalidation
	  int records=res.jsonPath().getInt("total");
	  Assert.assertEquals(records,12);
	  System.out.println("Records matched..."+records);
	  
  }
  
  
  
  
  
  
  
  
  
  
}
