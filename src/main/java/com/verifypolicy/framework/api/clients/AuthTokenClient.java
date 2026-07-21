package com.verifypolicy.framework.api.clients;

import com.verifypolicy.framework.api.endpoints.TokenGenerationEndPoint;
import com.verifypolicy.framework.api.models.response.token.clientcredential.TokenResponse;
import com.verifypolicy.framework.api.specs.RequestSpecFactory;
import com.verifypolicy.framework.config.ConfigReader;

import static io.restassured.RestAssured.given;

public class AuthTokenClient {

    private static final ConfigReader configReader = new ConfigReader();
    public TokenResponse generateToken() {
        return given()
                .spec(RequestSpecFactory.getAuthTokenRequestSpec())
                .basePath(TokenGenerationEndPoint.Token_Client_Credential)
                .pathParams("environmentId",configReader.getEnvironmentId())
                .formParam("grant_type", "client_credentials")
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .as(TokenResponse.class);

    }

}
