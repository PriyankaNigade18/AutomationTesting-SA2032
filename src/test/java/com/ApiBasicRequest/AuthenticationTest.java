package com.ApiBasicRequest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
  @Test(priority=1)
  public void testBasicAuthentication()
  {
	  //BASE64
	  Response res=given()
	  .auth().basic("postman","password")
	  
	  .when().get("https://postman-echo.com/basic-auth");
	  
	  //assert status code
	  AssertJUnit.assertEquals(res.getStatusCode(),200);
	  
	  res.then().log().body();
	  
	    
	 System.out.println("Basic Authentication is completed!"); 
  }
  
  
  @Test(priority=2)
  public void testDigestAuth()
  {
	 Response res=given()
			 .auth().digest("postman","password")
	  
			 .when().get("https://postman-echo.com/digest-auth");
	  
	 
	 //log the response
	 res.then().log().body();
	 System.out.println("Digest Authentication is completed!"); 

  }
  
  
  @Test
  public void testBearerToken()
  {
	  
	  Response res=given()
	  .header("Authorization","Bearer SA2032")
	  
	  .when().get("https://postman-echo.com/");
	  
	  //log the response
	  res.then().log().body();
	  
	  
	  
	  
  }
  
  
  //@Test
  public void testBearerGithubToken()
  {
	  String token="githubtoken";
	  Response res=given()
	  .header("Authorization","Bearer "+token)
	  
	  .when().get("https://api.github.com/user/repos");
	  
	  //log the response
	  res.then().log().body();
	  
	  
	  
	  
  }

  @Test
  public void oAuth2Request()
  {
	  Response res=given()
	  
			  .auth().oauth2("SA2032")
	  
			  .when().get("https://postman-echo.com/");
	  
	  res.then().log().body();
	  
	  
	  
	  
	  
  }
  
  
}
