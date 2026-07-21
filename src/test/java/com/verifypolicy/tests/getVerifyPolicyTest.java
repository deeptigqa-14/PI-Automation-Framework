package com.verifypolicy.tests;

import com.verifypolicy.framework.api.models.response.readoneverifypolicy.ReadOneVerifyPolicyResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.*;
import com.verifypolicy.framework.config.ConfigReader;
import com.verifypolicy.framework.api.clients.ReadOneVerifyPolicyClient;

public class getVerifyPolicyTest {

    //TODO: Implement test methods for verifying policy using policy ID
    private static final ConfigReader configReader = new ConfigReader();

    @Test
    public void verifyPolicyUsingPolicyId(){
/*        String token = configReader.getAuthToken();
        String baseUrl = configReader.getBaseUrl();
        String environmentId = configReader.getEnvironmentId();
                //"eyJraWQiOiJmNTlhNmQzMC04MGY0LTExZjEtOTM0Yi1jYmY5OWE0YWIzNzYiLCJhbGciOiJSUzI1NiJ9.eyJjbGllbnRfaWQiOiJkYTIyM2Y4ZS1hMDI0LTRhOWItODY1Ny1jNzIzOTBjZjI4OWUiLCJpc3MiOiJodHRwczovL2F1dGgudGVzdC1vbmUtcGluZ29uZS5jb20vNDY1YzkxODgtMWFjNi00MjE4LTlmYjgtODc0NjAzODNiN2JjL2FzIiwianRpIjoiYjdjN2ZlMzItZTFjMi00ZmE2LTk0YzItZTIxYTQzOWZiZjNhIiwiaWF0IjoxNzg0MzQxNzY5LCJleHAiOjE3ODQzNDUzNjksImF1ZCI6WyJodHRwczovL2FwaS50ZXN0LW9uZS1waW5nb25lLmNvbSJdLCJlbnYiOiI0NjVjOTE4OC0xYWM2LTQyMTgtOWZiOC04NzQ2MDM4M2I3YmMiLCJvcmciOiJmZmM3YTBjZS04Mjk4LTRmMjYtODAwMi0yOTFjMTQ1ZWMzZTYiLCJwMS5yaWQiOiJiN2M3ZmUzMi1lMWMyLTRmYTYtOTRjMi1lMjFhNDM5ZmJmM2EifQ.TwsRZ4I1b47zkkSpjd0UUyC_S8AUc9qEGD8ZAg8lCx12s1QvA0m2jPtoyqH3fRq51j9gB7TdHnmBM7f3oP_dPQvwfM4ewj3XWPXPxd0d4cgHWjQ3VDgVBCDDn3oTOygTBrCUhUflKcfSM_7YL0isKQauoFfdsxMHKU0Vr4nnRnT2xecNGC1y35G3-pGxzqWPeptc8U5Ky_T6z6JLzfJ9QJMuvMHMC77IHoW1kgwHtWMagwBrgM0NZfLyQ_juHYzYLNEaNz2_7fJ2UD3CCSRKspvfmfwTsDBoDuW2sewmOTbDsdzHwsUscsd2loX_JCANTcMhaeCsyxYVJURdMy39qw";

        ReadOneVerifyPolicyResponse response = RestAssured
                .given()
                .baseUri(baseUrl)
                .basePath("/v1/environments/{environmentId}/verifyPolicies/{verifyPolicyId}")
                .pathParam("environmentId", environmentId) // Replace with a valid environment ID
                .pathParam("verifyPolicyId", "9a5a1fde-0900-4f6d-9dfb-a2d842911d72") // Replace with a valid verify policy ID
                .header("Authorization", "Bearer "+ token) // Replace with a valid access token
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .as(ReadOneVerifyPolicyResponse.class);*/

        ReadOneVerifyPolicyClient  client = new ReadOneVerifyPolicyClient();
        ReadOneVerifyPolicyResponse response = client.readOneVerifyPolicy("9a5a1fde-0900-4f6d-9dfb-a2d842911d72");
        Assert.assertEquals(response.getName(), "AutoTest_FullVeriy_DG167");
        System.out.println("Response: " + response.getName());
        Assert.assertEquals(response.getGovernmentId().getVerify(), "REQUIRED");
               /* .response();
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");
        System.out.println("Response: " + response.getBody().asString());
*/
    }
}
