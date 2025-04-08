package com.ApiBasicRequest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
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
public class CreateRequestUsingPathAndQueryParam {
  @Test
  public void testQueryPathOParameter()
  {
	  
	  //https://api.restful-api.dev/objects?id=3&id=5&id=10
	  
	 Response res= given()
	  .pathParam("path","objects")
	  .queryParam("id",3)
	  .queryParam("id",5)
	  .queryParam("id",10)
	  
	  .when().get("https://api.restful-api.dev/{path}");
	  
	 
	 //assertion
	 
	 AssertJUnit.assertEquals(res.getStatusCode(),200);
	 System.out.println("Status code matched...");
	 
	 //log the payload
	 res.then().log().body();
	  
	  
	  
	  
  }
  
  
  @Test
  public void testQuerypathparamWithBaseURI()
  {
	  //https://api.restful-api.dev/objects?id=3&id=5&id=10
	  	RestAssured.baseURI="https://api.restful-api.dev/";
	  
		 Response res= given()
		  .pathParam("path","objects")
		  .queryParam("id",3)
		  .queryParam("id",5)
		  .queryParam("id",10)
		  
		  .when().get("{path}");
		  
		 
		 //assertion
		 
		 AssertJUnit.assertEquals(res.getStatusCode(),200);
		 System.out.println("Status code matched...");
		 
		 //log the payload
		 res.then().log().body();
		  
		  
  }
}

