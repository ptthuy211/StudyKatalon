Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login into the web site
	Given I am a user
	And I am on login page
	When I enter "phamthuy2001@yahoo.com", "p4y+y39Ir5MSxNs1t5lTZQ=="
	And Hit login button
  Then I am able to see "Thuy Pham"

  #Examples:
      #| email  | password | status  |
      #| phamthuy2001@yahoo.com | p4y+y39Ir5MSxNs1t5lTZQ==5 | Thuy Pham |