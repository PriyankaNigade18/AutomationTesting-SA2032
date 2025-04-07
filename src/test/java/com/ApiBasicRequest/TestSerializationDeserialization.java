package com.ApiBasicRequest;

import org.testng.annotations.Test;

import com.APIPOJOClasses.AuthPOJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSerializationDeserialization
{
	/*
	 * POJO Object convert into JSON Object= Serialization
	 * JSON Object convert into POJO Object= deserialization
	 */
  @Test
  public void testSerialization() throws JsonProcessingException
  {
	  AuthPOJO auth=new AuthPOJO();
	  auth.setUsername("Priyanka");
	  auth.setPassword("test123");
	
	  ObjectMapper obj=new ObjectMapper();
	  String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(auth);
	  
	  System.out.println(json);
	  
	  }
  
  
  @Test
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  String json="{\n"
	  		+ "  \"username\" : \"Priyanka\",\n"
	  		+ "  \"password\" : \"test123\"\n"
	  		+ "}";
	  
	  ObjectMapper obj=new ObjectMapper();
	  
	  AuthPOJO auth=obj.readValue(json,AuthPOJO.class);
	  
	  System.out.println(auth.getUsername());
	  System.out.println(auth.getPassword());
	  
	  
  }
}
