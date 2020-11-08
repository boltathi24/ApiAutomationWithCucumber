package com.cucumber.actions;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestApis 
{
  public static Response foodApi(String baseURL,String foodName)
  {
	  return RestAssured.get(baseURL+"&query="+foodName);
  }
}
