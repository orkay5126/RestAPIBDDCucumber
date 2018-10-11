package com.qa.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetBookStepDef {
    private Response response;
    private RequestSpecification request;
    private String url = "https://www.googleapis.com/books/v1/volumes";
    
        
    @Given("^a book exists with the ISBN XXXXX$")
	public void a_book_exists_with_the_ISBN_XXXXX(){
    	request = given().param("q", "9781451648546");
    	
    	System.out.println("Param   : "+ request);
	}

	@When("^user retreives a book by ISNB XXXXX$")
	public void user_retreives_a_book_by_ISNB_XXXXX(){
		response = request.when().get(url);
		System.out.println("Response Json : " + response.getBody().asString());
	}

	@Then("^Status code will be 200$")
	public void status_code_will_be_200(){
		response.then().
		assertThat().
		statusCode(200).and().body(containsString("totalItems"));
	}

//	@Then("^book name is YYYYY$")
//	public void book_name_is_YYYYY() {
//		responseCode.body("title", "Steve Jobs - 101 Amazing Facts You Didn't Know");
//		
//	}


}
