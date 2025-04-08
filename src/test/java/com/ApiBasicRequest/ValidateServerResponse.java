package com.ApiBasicRequest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateServerResponse 
{
  @Test(enabled=false)
  public void testSingleUserResponse()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  System.out.println(res.asPrettyString());
	  
	  //to validate any json payload we have method jsonPath()
	  
	  //validate id is 2
	  int id=res.jsonPath().getInt("data.id");
	  Assert.assertEquals(id,2,"Id is not mathced");
	  System.out.println("Id matched!.."+id);
	  
	  //validate "first_name": "Janet"
	  
	  String fname=res.jsonPath().getString("data.first_name");
	  Assert.assertEquals(fname,"Janet");
	  System.out.println("First name matched....");
	  
	  
	  //validate status code
	  int actCode=res.getStatusCode();
	  Assert.assertEquals(actCode,200);
	  System.out.println("Status code matched...: "+actCode);
	  
	  //validate text from support object have social media
	  String actText=res.jsonPath().getString("support.text");
	  Assert.assertTrue(actText.contains("social media"));
	  System.out.println("Expected text is found: "+actText);
	  
	   
  }
  
  
  
  @Test
  public void testListOfUserRequest()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  
	  System.out.println(res.asPrettyString());
	  
	  //validate page number should be 2
	  int pageno=res.jsonPath().getInt("page");
	  
	  AssertJUnit.assertEquals(pageno,2);
	  System.out.println("Page number is matched..:"+pageno);
	  
	  //validate id for 3rd record which should be 9
	  int id=res.jsonPath().getInt("data[2].id");
	  AssertJUnit.assertEquals(id,9);
	  System.out.println("3rd Record id matched to 9");
	  
	  //validate total ids are 6
	  
	 List<Integer> allIds= res.jsonPath().getList("data.id");
	 System.out.println("Total Ids are: "+allIds.size());
	 
	 System.out.println("All Ids are");
	 for(Integer i:allIds)
	 {
		 System.out.println(i);
	 }
	 
	 
	 
	  
  }
  
  
  
  
}
