package com.verifypolicy.framework.auth;

import com.verifypolicy.framework.api.clients.AuthTokenClient;
import com.verifypolicy.framework.api.models.response.token.clientcredential.TokenResponse;

import java.time.Instant;

public class TokenManager {
    private static String accessToken;
    private static Instant expiryTime;


    public static String getValidToken() {
        if (accessToken == null || expiryTime == null || isTokenExpired()) {
            System.out.println("Token is null or expired. Generating a new token.");
            generateNewToken();
        }
        return accessToken;
    }

    private static boolean isTokenExpired() {
        return Instant.now().isAfter(expiryTime.minusSeconds(30));
    }

    private static void generateNewToken() {
        // Logic to generate a new token and set the accessToken and expiryTime
        AuthTokenClient authTokenClient = new AuthTokenClient();
        TokenResponse tokenResponse = authTokenClient.generateToken();
        accessToken = tokenResponse.getAccess_token();
        expiryTime = Instant.now().plusSeconds(tokenResponse.getExpires_in());
    }
}
