$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/84128/eclipse-workspace/automation/src/test/resources/Feature/automation.feature");
formatter.feature({
  "line": 1,
  "name": "Blablabla",
  "description": "",
  "id": "blablabla",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "SignIn",
  "description": "",
  "id": "blablabla;signin",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@qiaoqiao"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "OpenBrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Signin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "InsertUserNanme",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "InsetPassWord",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "ClickLogin",
  "keyword": "And "
});
formatter.match({
  "location": "autoSteps.openbrowser()"
});
formatter.result({
  "duration": 9559381210,
  "status": "passed"
});
formatter.match({
  "location": "autoSteps.signin()"
});
formatter.result({
  "duration": 1589893694,
  "status": "passed"
});
formatter.match({
  "location": "autoSteps.insertusernanme()"
});
formatter.result({
  "duration": 178571937,
  "status": "passed"
});
formatter.match({
  "location": "autoSteps.insetpassword()"
});
formatter.result({
  "duration": 133552794,
  "status": "passed"
});
formatter.match({
  "location": "autoSteps.clicklogin()"
});
formatter.result({
  "duration": 1283377623,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "blablabla;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@qiaoqiao"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "PressTshirt",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "SelectSize",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Select Color",
  "keyword": "When "
});
formatter.match({
  "location": "SecAutoSteps.presstshirt()"
});
formatter.result({
  "duration": 797174,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinition.SecAutoSteps.presstshirt(SecAutoSteps.java:14)\r\n\tat ✽.Given PressTshirt(C:/Users/84128/eclipse-workspace/automation/src/test/resources/Feature/automation.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SecAutoSteps.selectsize()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SecAutoSteps.select_Color()"
});
formatter.result({
  "status": "skipped"
});
});