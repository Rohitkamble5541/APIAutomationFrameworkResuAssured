package org.example.testcases.crud;

import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.testng.annotations.Test;


public class TCCreateBooking extends BaseTest {


    // Step1 - POST
    // URL -> Base URL + Base Path
    // HEADERS
    // BODY
    // Auth - NO



    // Step 2
    // Prepare the Payload (Object -> JSON String )
    // Send the request




    // Step 3
    // Validate Response (JSON String -> Object)
    // FirstName,
    // StatusCode
    // Response time

//@Description("verify that the Create booking with the Valid Payload , Status Code 200")

    @Test
    public void testPositivePOSTReq()
    {
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
        response = RestAssured.given().spec(requestSpecification)
                .when().body(payloadManager.createPayloadGSON()).post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }


}
