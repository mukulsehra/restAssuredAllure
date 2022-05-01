package com.restAssured.demo.restAssuredAllure;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

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
	@Test(description = "GET the first booking id from the BookingId LIST")
    @Story("GET Request for bookings")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Verify the booking id is not blank")
    public void listFirstBookingId() {
 
      Response res = given().filter(new AllureRestAssured()).when().get(BaseURL + "/booking");
      res.then().log().all();
      String val = String.valueOf(((HashMap<Object, Object>)res.then().extract().body().jsonPath().getList("$").get(0)).get("bookingid"));
      System.out.println(val);
      Assert.assertFalse(val.isBlank(), "The booking id is not blank. It's value is : " + val);
    }
    
    @Test(description = "GET Booking details corresponding to a booking id")
    @Story("GET Request for booking details")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Verify the booking details are not null")
    public void verifyBookingDetails() {
      String bookingId = "3";
      Response res = given().filter(new AllureRestAssured()).when().get(BaseURL + "/booking/" + bookingId);
      res.then().log().all();
      res.then().assertThat().statusCode(HttpStatus.SC_OK);
      Assert.assertNotNull(res.then().extract().body().asString());
    }

}
