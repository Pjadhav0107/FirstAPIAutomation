package com.api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseService {

    private static final String BASE_URI = "http://64.227.160.186:8080/";
    private RequestSpecification requestSpecification;

    public BaseService() {
        requestSpecification = given().baseUri(BASE_URI);
    }

    protected Response postRequest(String payload, String endpoint){
        Response response= requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
        return response;
    }
}
