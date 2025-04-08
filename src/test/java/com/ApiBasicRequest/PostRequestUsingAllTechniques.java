package com.ApiBasicRequest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.APIPOJOClasses.AuthPOJO;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

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
public class PostRequestUsingAllTechniques {
  @Test
  public void basicPatternForPostRequest() //copy paste
  {
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  .body("{\n"
	  		+ "    \"username\" : \"admin\",\n"
	  		+ "    \"password\" : \"password123\"\n"
	  		+ "}")
	  
			  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  //status code
	  System.out.println("Status code is: "+res.getStatusCode());
	  
	  //log the json response
	  res.then().log().body();
	  
	  
	  
  }
  
  
  @Test
  public void postUsingHashMap()
  {
	  System.out.println("Post request using HashMap");
	  //request payload using HashMap
	  
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("username","admin");
	  map.put("password","password123");
	  
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(map)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	//status code
	  System.out.println("Status code is: "+res.getStatusCode());
	  
	  //log the json response
	  res.then().log().body();
	  
	  
  }
  
  @Test
  public void postrequestUsingPOJO()
  {
	  
	  //payload
	  AuthPOJO auth=new AuthPOJO();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	 Response res=given()
			 .header("Content-Type","application/json")
			 .body(auth)
	 

			  .when().post("https://restful-booker.herokuapp.com/auth");
			  
			//status code
			  System.out.println("Status code is: "+res.getStatusCode());
			  
			  //log the json response
			  res.then().log().body();
	 
			  //valiadation
			  
			 String un= auth.getUsername();
	  AssertJUnit.assertEquals(un,"admin");
	  System.out.println("User name is matched...");
	  
	  
	  
  }
  
  
  
}
