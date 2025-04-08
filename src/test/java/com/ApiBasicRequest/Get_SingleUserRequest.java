package com.ApiBasicRequest;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_SingleUserRequest
{
  @Test
  public void testSingleUserDetails() 
  {
	  /*
	   * to send request to server use class RestAssured
	   * store response with Response interface Object
	   */
	  
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  System.out.println("Status code is: "+res.getStatusCode());
	  System.out.println("Status line is: "+res.getStatusLine());
	  System.out.println("Total Response time is: "+res.getTimeIn(TimeUnit.MILLISECONDS));
	  System.out.println("Header contenttype is: "+res.header("Content-Type"));
	  
	  System.out.println("Get the Raw (text)Type Response: "+res.asString());
	  System.out.println("Json Response: "+res.asPrettyString());
	  
	  
  }
}
