$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:PACKING/TestMe.feature");
formatter.feature({
  "name": "Register in TestMe app",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome driver and open to testmeapp",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.launch_chrome_driver_and_open_to_testmeapp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on signup button",
  "keyword": "And "
});
formatter.match({
  "location": "Register.click_on_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter USERNAME \"Rashmi1902\" in the field",
  "keyword": "When "
});
formatter.match({
  "location": "Register.i_enter_USERNAME_in_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "first name \"Rashmi\" in first name field",
  "keyword": "When "
});
formatter.match({
  "location": "Register.first_name_in_first_name_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter last name \"Krish\" in the field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_last_name_in_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password  \"Rshmi19021998\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter confirm password \"Rshmi19021998\" in confirm password field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_confirm_password_in_confirm_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter gender female in gender field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_gender_female_in_gender_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter email \"rashmi9876@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_email_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter mobile \"8975985509\" in mobilenumber field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_mobile_in_mobilenumber_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter \"19/02/1998\" in dob field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_in_dob_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter address \"109,ngo colony\" in address field",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_address_in_address_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter security question",
  "keyword": "And "
});
formatter.match({
  "location": "Register.i_enter_security_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter answer",
  "keyword": "And "
});
formatter.match({
  "location": "Register._enter_answer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on Register",
  "keyword": "Then "
});
formatter.match({
  "location": "Register._click_on_Register()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Launch chrome driver and open testme",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks SignIn buttton",
  "keyword": "When "
});
formatter.step({
  "name": "user enters username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "Password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Launch chrome driver and open testme",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.launch_chrome_driver_and_open_testme()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks SignIn buttton",
  "keyword": "When "
});
formatter.match({
  "location": "Register.user_clicks_SignIn_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"Lalitha\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_enters_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
});