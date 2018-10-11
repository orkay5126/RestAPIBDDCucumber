$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/FeatureFiles/GETBookFeature.feature");
formatter.feature({
  "line": 1,
  "name": "WebService for the book search",
  "description": "",
  "id": "webservice-for-the-book-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User calls the web service to GET the book details based on the ISBN",
  "description": "",
  "id": "webservice-for-the-book-search;user-calls-the-web-service-to-get-the-book-details-based-on-the-isbn",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a book exists with the ISBN XXXXX",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user retreives a book by ISNB XXXXX",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Status code will be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "GetBookStepDef.a_book_exists_with_the_ISBN_XXXXX()"
});
formatter.result({
  "duration": 1177930366,
  "status": "passed"
});
formatter.match({
  "location": "GetBookStepDef.user_retreives_a_book_by_ISNB_XXXXX()"
});
formatter.result({
  "duration": 2385002635,
  "status": "passed"
});
formatter.match({
  "location": "GetBookStepDef.status_code_will_be_200()"
});
formatter.result({
  "duration": 105413669,
  "status": "passed"
});
});