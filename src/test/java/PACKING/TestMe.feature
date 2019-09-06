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
Feature: Register in TestMe app

  @smoke
  Scenario: Registration 
    Given Launch chrome driver and open to testmeapp
    And click on signup button
    When I enter USERNAME "Rashmiwer1902" in the field
    When first name "Rashmi" in first name field
    And  I enter last name "Krish" in the field
    And I enter password  "Rshmi19021998" in password field
    And I enter confirm password "Rshmi19021998" in confirm password field
    And i enter gender female in gender field
    And i enter email "rashmi9876@gmail.com" in email field
    And i enter mobile "8975985509" in mobilenumber field
    And i enter "19/02/1998" in dob field
    And i enter address "109,ngo colony" in address field
    And i enter security question
    And i enter answer
    Then i click on Register 
    
  
    @sanity
  Scenario Outline: Login 
  Given Launch chrome driver and open testme
    When user clicks SignIn buttton
    And user enters username "<username>" 
    And user enters password "<password>" 
    Then user clicks login button

    Examples: 
      | username         | password       | 
      |  Lalitha         | Password123    | 
      
      @Unit
      Scenario Outline: Add to cart
      Given open chrome driver and testmeapp
      When user clicks signIn button
      And user enters uname "<username>"
      And user enters pwd "<password>" 
      And user put login button
      And search product and type
      And add to cart and click cart
      Then Go to payment page
      
      Examples:
      |username      | password    |
      |Lalitha       | Password123 |
       
    
    
  