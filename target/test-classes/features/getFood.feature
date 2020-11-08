#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: To Check ytf api
  Validating the ytf open source apis


  @getFood
  Scenario Outline: Test whether get food return available recipe
    Given I am setting up the base api url "<url>"
    When I hit the api for the "<foodname>" food
    Then I verify the "<status>" in step

    Examples: 
      | url  																																											| foodname  | status  |
      | https://api.spoonacular.com/recipes/complexSearch?apiKey=d3501c3a85464ed0ac565c767c9fb44a |     pasta | success |
      | https://api.spoonacular.com/recipes/complexSearch?apiKey=d3501c3a85464ed0ac565c767c9fb44a |     panner | success |
      | https://api.spoonacular.com/recipes/complexSearch?apiKey=d3501c3a85464ed0ac565c767c9fb44a |     chicken | success |
      
      
  