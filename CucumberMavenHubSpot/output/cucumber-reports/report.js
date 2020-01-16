$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/featues/homePage.feature");
formatter.feature({
  "name": "HubSpot Home Page Actions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HubSpot Home Page scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on base page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User quits the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.user_quits_the_browser()"
});
formatter.result({
  "status": "passed"
});
});