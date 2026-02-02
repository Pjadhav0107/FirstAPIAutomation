package com.api.tests;

import com.api.services.AuthService;
import com.api.services.BaseService;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginTest  {

    @Test(description = "test to check if login api working")
    public void loginTest(){

        AuthService authService = new AuthService();
        Response response = authService.login("{\"username\":\"uday12345\",\"password\":\"uday12345\"}");
        System.out.println(response.statusCode());
    }


}
