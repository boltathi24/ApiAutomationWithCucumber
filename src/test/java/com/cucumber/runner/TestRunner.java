package com.cucumber.runner;


import org.junit.runner.RunWith;		
import io.cucumber.junit.*;			

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/resources/features/getFood.feature",glue={"com.cucumber.steps"},
tags= "@getFood",
plugin ={"pretty","html:cucumberReport/cucumber-html-report"})						
public class TestRunner 				
{		

}
