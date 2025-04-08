package com.Assignments;

import org.testng.annotations.Test;

import com.APIPOJOClasses.Category;
import com.APIPOJOClasses.SwaggerPojo;
import com.APIPOJOClasses.Tag;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;

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
public class Assignment1 {
  @Test(priority=1)
  public void petByStatus() 
  {
	  Response res=given()
	 .header("accept","application/json")
	  
	  .when().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
	  
	  
	  //get the response
	  res.then().log().body();
  }
  
  @Test
  public void addNewPet()
  {
	  Category cat=new Category();
	  cat.setId(1);
	  cat.setName("animal");
	  
	  Tag t=new Tag();
	  t.setId(11);
	  t.setName("tag1");
	  
	  
	  SwaggerPojo pojo=new SwaggerPojo();
	  pojo.setId(111);
	  pojo.setCategory(cat);
	  pojo.setName("Dog");
	  pojo.setPhotoUrls(Arrays.asList("url"));
	  pojo.setTags(Arrays.asList(t));
	  pojo.setStatus("available");
	  
	  
	  Response res=given()
	  .header("accept","application/json")
	  .header("Content-Type","application/json")
	  .body(pojo)
	 
	  .when().post("https://petstore.swagger.io/v2/pet");
	  
	  res.then().log().body();
	  
	 
	  
	  
  }
}
