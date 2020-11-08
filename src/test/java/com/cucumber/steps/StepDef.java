package com.cucumber.steps;

import org.junit.Assert;

import com.cucumber.actions.TestApis;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class StepDef {
	String baseURL="";
	Response res=null;
	JsonPath js=null;

	@Given("I am setting up the base api url {string}")
	public void i_am_setting_up_the_base_api_url(String baseUrl) {
	    // Write code here that turns the phrase above into concrete actions
		baseURL=baseUrl;
	}




	@When("I hit the api for the {string} food")
	public void i_hit_the_api_for_the_food(String foodName) {
	    // Write code here that turns the phrase above into concrete actions
	  res=TestApis.foodApi(baseURL, foodName);
	}

	


@Then("I verify the {string} in step")
public void i_verify_the_in_step(String status) {
    // Write code here that turns the phrase above into concrete actions
    js=res.jsonPath();
System.out.println(    js.getString("results"));
System.out.println("***************************");
System.out.println(res.getStatusCode());
Assert.assertTrue(res.getStatusCode()==200);
}
	
	


}
