package com.restAssured.demo.restAssuredAllure;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;

public class RestAllureTest {
	String BaseURL = "https://restful-booker.herokuapp.com";
	 
    @Test(description = "GET Request Operation")
    @Story("GET Request with Valid User")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Verify the details of employee of id-2")
    public void verifyUser() {
 
        // GIVEN
        given()
               .filter(new AllureRestAssured())
 
        // WHEN
        .when()
               .get(BaseURL + "/booking")
                 
        // THEN
          .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK");
        
                 
                 // To verify booking id at index 2
               // .body("data.employee_name", equalTo("Garrett Winters"))
                //.body("message", equalTo("Successfully! Record has been fetched."));
    }

}
