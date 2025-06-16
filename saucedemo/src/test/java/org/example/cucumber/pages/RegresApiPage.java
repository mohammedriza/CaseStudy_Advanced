package org.example.cucumber.pages;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RegresApiPage {
    private static final String baseUrl = "https://reqres.in/api";

    public void validateReqresApiSuccessPath(String responseCode, String errorMessage) {
        try {
            RestAssured.baseURI = baseUrl;

            String requestBody = "{ \"email\": \"test@gmail.com\", \"password\": \"test\" }";
            Header header = new Header("x-api-key", "reqres-free-v1");

            ValidatableResponse resp = given()
                    .contentType(ContentType.JSON)
                    .header(header)
                    .body(requestBody)
                    .when()
                    .post("/login")
                    .then()
                    .statusCode(Integer.parseInt(responseCode))
                    .body("error", equalTo(errorMessage));
        } catch (Exception e) {
            System.out.println("ERROR: Failed to call API | " + e.getStackTrace());
        }
    }

    public void validateReqresApiWithMissingApiKey(String responseCode, String errorMessage) {
        try {
            RestAssured.baseURI = baseUrl;

            String requestBody = "{ \"email\": \"test@gmail.com\", \"password\": \"test\" }";

            ValidatableResponse resp = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .when()
                    .post("/login")
                    .then()
                    .statusCode(Integer.parseInt(responseCode))
                    .body("error", equalTo(errorMessage));
        } catch (Exception e) {
            System.out.println("ERROR: Failed to call API | " + e.getStackTrace());
        }
    }

    public void validateReqresApiWithInvalidApiKey(String responseCode, String errorMessage) {
        try {
            RestAssured.baseURI = baseUrl;

            String requestBody = "{ \"email\": \"test@gmail.com\", \"password\": \"test\" }";
            Header header = new Header("x-api-key", "reqres-free-v123");

            ValidatableResponse resp = given()
                    .contentType(ContentType.JSON)
                    .header(header)
                    .body(requestBody)
                    .when()
                    .post("/login")
                    .then()
                    .statusCode(Integer.parseInt(responseCode))
                    .body("error", equalTo(errorMessage));
        } catch (Exception e) {
            System.out.println("ERROR: Failed to call API | " + e.getStackTrace());
        }
    }
}
