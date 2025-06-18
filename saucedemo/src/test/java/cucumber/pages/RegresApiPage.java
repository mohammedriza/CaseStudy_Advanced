package cucumber.pages;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RegresApiPage {
    private static final String baseUrl = "https://reqres.in/api";
    public static String email;
    public static String password;
    public static String apiKey;

    public void callReqresApiAndValidateResponse(String responseCode, String errorMessage) {
        try {
            RestAssured.baseURI = baseUrl;

            String requestBody = "{ \"email\": \"" + email + "\", \"password\": \"" + password + "\" }";
            Header header = new Header("x-api-key", apiKey);

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
