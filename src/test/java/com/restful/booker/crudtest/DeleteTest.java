package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase {


    @Test
    public void deleteSingleBookingID() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=7208a55089dd634")
                .pathParam("id", 809)
                .when().delete("{id}");

        response.then().statusCode(201);
        response.prettyPrint();

    }
}
