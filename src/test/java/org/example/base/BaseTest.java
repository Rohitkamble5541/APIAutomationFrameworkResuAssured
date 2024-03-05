package org.example.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.Modules.PayloadManager;
import org.example.actions.AssertActions;
import org.example.endpoints.APIConstants;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    //common uitilities


    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath ;
    public Response response;

    public ValidatableResponse validatableResponse;


    @BeforeMethod
    public void setConfig()
    {
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type","application/json")
                .build().log().all();

    }





}
