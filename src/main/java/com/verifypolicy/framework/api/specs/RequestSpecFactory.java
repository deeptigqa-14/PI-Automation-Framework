package com.verifypolicy.framework.api.specs;

import com.verifypolicy.framework.auth.TokenManager;
import com.verifypolicy.framework.config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;



public class RequestSpecFactory {
    private static final ConfigReader configReader = new ConfigReader();

    public static RequestSpecification getVerifyPolicyRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(configReader.getBaseUrl())
                .addHeader("Authorization", "Bearer " + TokenManager.getValidToken())
                .build();

    }

    public static RequestSpecification getAuthTokenRequestSpec() {
        String credentials = configReader.getClientId() + ":" + configReader.getClientSecret();
        String encodedCredentials = java.util.Base64.getEncoder().encodeToString(credentials.getBytes());
        return new RequestSpecBuilder()
                .setBaseUri(configReader.getAuthUrl())
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Authorization", "Basic " + encodedCredentials)
                .build();
    }
}
