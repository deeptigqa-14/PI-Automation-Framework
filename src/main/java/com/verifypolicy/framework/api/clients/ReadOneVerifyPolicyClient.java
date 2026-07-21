package com.verifypolicy.framework.api.clients;

import com.verifypolicy.framework.api.endpoints.VerifyPolicyEndpoints;
import com.verifypolicy.framework.api.models.response.readoneverifypolicy.ReadOneVerifyPolicyResponse;
import com.verifypolicy.framework.api.specs.RequestSpecFactory;
import com.verifypolicy.framework.config.ConfigReader;

import static io.restassured.RestAssured.*;

public class ReadOneVerifyPolicyClient {
    private static final ConfigReader configReader = new ConfigReader();
    public ReadOneVerifyPolicyResponse readOneVerifyPolicy(String verifyPolicyId) {
        return given()
                .spec(RequestSpecFactory.getVerifyPolicyRequestSpec())
                .basePath(VerifyPolicyEndpoints.Read_One_Verify_Policy)
                .pathParams("environmentId",configReader.getEnvironmentId())
                .pathParams("verifyPolicyId", verifyPolicyId)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .as(ReadOneVerifyPolicyResponse.class);


    }
}
