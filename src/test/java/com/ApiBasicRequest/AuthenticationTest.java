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
public class AuthenticationTest
{
  @Test
  public void testBasicAuthentication()
  {
	  //BASE64
	  Response res=given()
	  .auth().basic("postman","password")
	  
	  .when().get("https://postman-echo.com/basic-auth");
	  
	  //assert status code
	  Assert.assertEquals(res.getStatusCode(),200);
	  
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
