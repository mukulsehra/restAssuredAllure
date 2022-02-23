package com.restAssured.demo.restAssuredAllure;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;

public class RestAllureTest {
	String BaseURL = "https://restful-booker.herokuapp.com";
	 
    @SuppressWarnings("unchecked")
	@Test(description = "GET Request Operation")
    @Story("GET Request for bookings")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Verify the booking id is not blank")
    public void verifyUser() {
 
      Response res = given().filter(new AllureRestAssured()).when().get(BaseURL + "/booking");
      res.then().log().all();
      String val = String.valueOf(((HashMap<Object, Object>)res.then().extract().body().jsonPath().getList("$").get(0)).get("bookingid"));
      System.out.println(val);
      Assert.assertTrue(!val.isBlank());
    }

}
