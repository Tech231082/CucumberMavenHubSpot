$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/featues/login.feature");
formatter.feature({
  "name": "HubSpot login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HubSpot login scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Title of the login page is",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_login_page_is()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
});