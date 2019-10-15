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
Feature: Title of your feature
  I want to use this template for my feature file

  #@tag1
 #Scenario: Login into the web site
#	Given I am a user
#	And I am on login page
#	When I enter "phamthuy2001@yahoo.com", "p4y+y39Ir5MSxNs1t5lTZQ=="
#	And Hit login button
  #And I search for "Mug The Best Is Yet To Come"
  #Then I select to buy item
  #Then I move to checkout from cart
  
  Scenario: Add 2 products into shopping cart
Given I am a user
And I am on login page
When I enter "phamthuy2001@yahoo.com", "p4y+y39Ir5MSxNs1t5lTZQ==" 
And Hit login button
And I add a product into shopping cart 
|name| price |
|Hummingbird Printed T-shirt| 19.12|
|Mountain Fox Notebook| 12.90|
#And I add searched product into shopping cart

#Then I am able to see 2 added product in shopping cart
#And total price is correct

