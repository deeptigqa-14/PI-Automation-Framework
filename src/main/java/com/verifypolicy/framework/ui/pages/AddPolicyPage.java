package com.verifypolicy.framework.ui.pages;

import com.verifypolicy.framework.ui.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PrivateKey;

public class AddPolicyPage extends BasePage {


    @FindBy(xpath="//div[@data-id='name-input']//input")
    private WebElement policyName;

    @FindBy(xpath="//div[@data-id='description-input']/div/input")
    private WebElement policyDescription;

    @FindBy(xpath="//div[@data-id='transaction-timeout']//input")
    private WebElement transactionTimeout;

    @FindBy(xpath="//div[@data-id='data-collection-timeout']//input")
    private WebElement dataCollectionTimeout;

    @FindBy(xpath="//div[@data-id='dataCollectionOnly']//input[contains(@class,'field-control-input')]")
    private WebElement dataCollectionOnlyStatus;

    @FindBy(xpath="//div[@data-id='dataCollectionOnly']")
    private WebElement dataCollectionOnly;

    @FindBy(xpath="//div[@data-id='verify-geolocation']/div[2]/button/span[1]")
    private WebElement geolocationValue;

    @FindBy(xpath="//div[@data-id='verify-geolocation']/div[2]/button")
    private WebElement geolocationBtn;

    @FindBy(xpath="//input[@data-id='document-images-enabled']/parent::div/*[local-name()='svg'][contains(@class,'is-default')]")
    private WebElement enableDocAuthchkScroll;

    @FindBy(xpath="//input[@data-id='document-images-enabled']")
    private WebElement enableDocAuthchk;

    @FindBy(xpath="//div[@data-id='document-authentication-provider']/div[2]/button")
    private WebElement docAuthProviderValue;
/*    @FindBy(xpath="//div[@data-id='document-authentication-provider']/div[2]/button")
    private WebElement docAuthProviderBtn;*/

    @FindBy(xpath="//input[@data-id='gov-id-retry-attempts']")
    private WebElement govIDRetryAttempts;

    @FindBy(xpath="//div[@data-id='enableAamva']//input[contains(@class,'field-control-input')]")
    private WebElement enableAAMVAStatus;
    @FindBy(xpath="//div[@data-id='enableAamva']")
    private WebElement enableAAMVA;

    @FindBy(xpath="//div[@data-id='failedExpiredId']//input[contains(@class,'field-control-input')]")
    private WebElement failExpiredIDStatus;
    @FindBy(xpath="//div[@data-id='failedExpiredId']")
    private WebElement failExpiredID;

    @FindBy(xpath="//input[@data-id='Aadhaar-verification']/parent::div/*[local-name()='svg'][2]")
    private WebElement enableAadhaarVerificationScroll;
    @FindBy(xpath="//input[@data-id='Aadhaar-verification']")
    private WebElement enableAadhaarVerification;

    @FindBy(xpath="//div[@data-id='facial-comparison-verify']//button[contains(@class,'is-default')]")
    private WebElement facialComparisonVerifyBtn;
    @FindBy(xpath = "//div[@data-id='facial-comparison-threshold']//button[contains(@class,'is-default')]")
    private WebElement facialComparisonThreshold;

    @FindBy(xpath="//div[@data-id='liveness-verify']//button[contains(@class,'is-default')]")
    private WebElement livenessVerify;
    @FindBy(xpath = "//div[@data-id='liveness-threshold']//button[contains(@class,'is-default')]")
    private WebElement livenessThreshold;
    @FindBy(xpath="//input[@data-id='selfie-retry-attempts']")
    private WebElement selfieRetryAttempts;

    @FindBy(xpath="//div[@data-id='voice-verify']//button[contains(@class,'is-default')]")
    private WebElement voiceVerification;
    @FindBy(xpath="//div[@data-id='phone-verify']//button[contains(@class,'is-default')]")
    private WebElement phoneVerification;
    @FindBy(xpath="//div[@data-id='email-verify']//button[contains(@class,'is-default')]")
    private WebElement emailVerification;

    @FindBy(xpath="//div[@data-id='given-name-verify-dropDown']//button[contains(@class,'is-default')]")
    private WebElement givenNameThreshold;
    @FindBy(xpath="//input[@data-id='required-given-name']/parent::div/*[local-name()='svg'][contains(@class,'is-default')][2]")
    private WebElement givenNameRequired;
    @FindBy(xpath="//div[@data-id='family-name-verify-dropDown']//button[contains(@class,'is-default')]")
    private WebElement familyNameThreshold;
    @FindBy(xpath="//input[@data-id='family-given-name']/parent::div/*[local-name()='svg'][contains(@class,'is-default')][2]")
    private WebElement familyNameRequired;
    @FindBy(xpath="//div[@data-id='full-name-verify-dropDown']//button[contains(@class,'is-default')]")
    private WebElement fullNameThreshold;
    @FindBy(xpath="//input[@data-id='required-full-name']/parent::div/*[local-name()='svg'][contains(@class,'is-default')][2]")
    private WebElement fullNameRequired;
    @FindBy(xpath="//div[@data-id='birth-date-verify-dropDown']//button[contains(@class,'is-default')]")
    private WebElement birthDateThreshold;
    @FindBy(xpath="//input[@data-id='required-birth_date']/parent::div/*[local-name()='svg'][contains(@class,'is-default')][2]")
    private WebElement birthDateRequired;
    @FindBy(xpath="//div[@data-id='address-verify-dropDown']//button[contains(@class,'is-default')]")
    private WebElement addressThreshold;
    @FindBy(xpath="//input[@data-id='required-address']/parent::div/*[local-name()='svg'][contains(@class,'is-default')][2]")
    private WebElement addressRequired;

    @FindBy(xpath="//div[@data-id='data-based-identity-verification-verify']//button[contains(@class,'is-default')]")
    private WebElement dataBasesIDVerification;
    @FindBy(xpath="//div[@data-id='data-based-identity-verification-threshold']//button[contains(@class,'is-default')]")
    private WebElement dataBasesIDVerificationThreshold;
    @FindBy(xpath="//input[@data-id='data-based-identity-verification-contractual-obligation']/parent::div/*[local-name()='svg'][contains(@class,'is-default')][2]")
    private WebElement getDataBasesIDObligation;

    @FindBy(xpath="//div[@data-id='device-ownership-check']//button[contains(@class,'is-default')]")
    private WebElement deviceOwnershipCheck;
    @FindBy(xpath="//div[@data-id='device-ownership-phone-number-risk']//button[contains(@class,'is-default')]")
    private WebElement deviceOwnershipPhRisk;
    @FindBy(xpath="//div[@data-id='device-ownership-name-to-phone']//button[contains(@class,'is-default')]")
    private WebElement deviceOwnershipPhToName;
    @FindBy(xpath="//div[@data-id='device-ownership-phone-to-email']//button[contains(@class,'is-default')]")
    private WebElement deviceOwnershipEmailToPh;
    @FindBy(xpath="//div[@data-id='device-ownership-name-to-email']//button[contains(@class,'is-default')]")
    private WebElement deviceOwnershipEmailToName;

    @FindBy(xpath="//button[@data-id='save-button']")
    private WebElement savePolicy;
    @FindBy(xpath="//button[@data-id='cancel-button']")
    private WebElement cancelPolicyForm;


    public AddPolicyPage(WebDriver driver) {
        // Constructor implementation
        super(driver);
    }

    public void enterPolicyName(String name) {
        type(policyName, name);
    }

    public void enterPolicyDescription(String description) {
        type(policyDescription, description);
    }

    public void enterTransactionTimeout(String timeout) {
        if(!getAttribute(transactionTimeout,"value").equals(timeout)) {
            type(transactionTimeout, timeout);
        }
    }

    public void enterDataCollectionTimeout(String timeout) {
        if(!getAttribute(dataCollectionTimeout,"value").equals(timeout)) {
            type(dataCollectionTimeout, timeout);
        }
    }

    public void setDataCollectionOnly(boolean expectedState) {
        if(dataCollectionOnlyStatus.isSelected() != expectedState) {
            click(dataCollectionOnly);
        }
    }

    public void setGeolocationValue(String geolocation){

        if(!getText(geolocationValue).equals(geolocation)){
            click(geolocationBtn);
            click(By.xpath("//li[contains(@id,'"+geolocation.toUpperCase()+"')]"));
        }
    }

    //Government IDs
    public void setEnableDocAuthchk(boolean expectedState){
        scrollIntoView(enableDocAuthchkScroll);
        if(enableDocAuthchk.isSelected() != expectedState) {
            click(enableDocAuthchk);
        }
    }

    public void setDocAuthProviderValue(String docAuthProvider){
        if(!getText(docAuthProviderValue).equals(docAuthProvider)){
            click(docAuthProviderValue);
            click(By.xpath("//li[contains(@id,'"+docAuthProvider.toUpperCase()+"')]"));
        }
    }

    public void setGovIDRetryAttempts(String attempts) {
        if(!getAttribute(govIDRetryAttempts,"value").equals(attempts)) {
            type(govIDRetryAttempts, attempts);
        }
    }

    public void setEnableAAMVA(boolean expectedState) {
        if(enableAAMVAStatus.isSelected() != expectedState) {
            click(enableAAMVA);
        }
    }

    public void setFailExpiredID(boolean expectedState) {
        if(failExpiredIDStatus.isSelected() != expectedState) {
            click(failExpiredID);
        }
    }

    public void setEnableAadhaarVerification(boolean expectedState){
        scrollIntoView(enableAadhaarVerificationScroll);
        if(enableAadhaarVerificationScroll.isSelected() != expectedState) {
            click(enableAadhaarVerificationScroll);
        }
    }

    public void setFacialComparisonVerify(String facialCompVerify){
        if(!getText(facialComparisonVerifyBtn).equals(facialCompVerify)){
            click(facialComparisonVerifyBtn);
            click(By.xpath("//li[contains(@id,'"+facialCompVerify.toUpperCase()+"')]"));
        }
    }

    public void setGetFacialComparisonThreshold(String facialCompThreshold) {
        if (!getText(facialComparisonThreshold).equals(facialCompThreshold)) {
            click(facialComparisonThreshold);
            click(By.xpath("//li[contains(@id,'" + facialCompThreshold.toUpperCase() + "')]"));
        }
    }

    public void setLivenessVerify(String liveVerify){
        scrollIntoView(livenessVerify);
        if(!getText(livenessVerify).equals(liveVerify)){
            click(livenessVerify);
            click(By.xpath("//li[contains(@id,'"+liveVerify.toUpperCase()+"')]"));
        }
    }

    public void setLivenessThreshold(String liveThreshold) {
        if (!getText(livenessThreshold).equals(liveThreshold)) {
            click(livenessThreshold);
            click(By.xpath("//li[contains(@id,'" + liveThreshold.toUpperCase() + "')]"));
        }
    }

    public void setSelfieRetryAttempts(String attempts) {
        if(!getAttribute(selfieRetryAttempts,"value").equals(attempts)) {
            type(selfieRetryAttempts, attempts);
        }
    }

    public void setVoiceVerification(String voiceVerify){
        scrollIntoView(voiceVerification);
        if(!getText(voiceVerification).equals(voiceVerify)){
            click(voiceVerification);
            click(By.xpath("//li[contains(@id,'"+voiceVerify.toUpperCase()+"')]"));
        }
    }

    public void setPhoneVerify(String phoneVerify){
        if(!getText(phoneVerification).equals(phoneVerify)){
            click(phoneVerification);
            click(By.xpath("//li[contains(@id,'"+phoneVerify.toUpperCase()+"')]"));
        }
    }

    public void setEmailVerify(String emailVerify){
        scrollIntoView(emailVerification);
        if(!getText(emailVerification).equals(emailVerify)){
            click(emailVerification);
            click(By.xpath("//li[contains(@id,'"+emailVerify.toUpperCase()+"')]"));
        }
    }

    public void setGivenNameThreshold(String givenName){
        scrollIntoView(givenNameThreshold);
        if(!getText(givenNameThreshold).equals(givenName)){
            click(givenNameThreshold);
            click(By.xpath("//li[contains(@id,'"+givenName.toUpperCase()+"')]"));
        }
    }
    public void isGivenNameRequired(boolean expectedState) {
        if (givenNameRequired.isSelected() != expectedState) {
            click(givenNameRequired);
        }
    }

    public void setFamilyNameThreshold(String familyName){
        if(!getText(familyNameThreshold).equals(familyName)){
                click(familyNameThreshold);
                click(By.xpath("//li[contains(@id,'"+familyName.toUpperCase()+"')]"));
        }
    }

    public void isFamilyNameRequired(boolean expectedState){
        if(familyNameRequired.isSelected() != expectedState) {
            click(familyNameRequired);
        }
    }

    public void setFullNameThreshold(String fullName){
        scrollIntoView(fullNameThreshold);
        if(!getText(fullNameThreshold).equals(fullName)){
            click(fullNameThreshold);
            click(By.xpath("//li[contains(@id,'"+fullName.toUpperCase()+"')]"));
        }
    }

    public void isFullNameRequired(boolean expectedState){
        if(fullNameRequired.isSelected() != expectedState) {
            click(fullNameRequired);
        }
    }

    public void setBirthDateThreshold(String birthDate){
        if(!getText(birthDateThreshold).equals(birthDate)){
            click(birthDateThreshold);
            click(By.xpath("//li[contains(@id,'"+birthDate.toUpperCase()+"')]"));
        }
    }

    public void isBirthDateRequired(boolean expectedState){
        if(birthDateRequired.isSelected() != expectedState) {
            click(birthDateRequired);
        }
    }

    public void setAddressThreshold(String address){
        scrollIntoView(addressThreshold);
        if(!getText(addressThreshold).equals(address)){
            click(addressThreshold);
            click(By.xpath("//li[contains(@id,'"+address.toUpperCase()+"')]"));
        }
    }

    public void isAddressRequired(boolean expectedState){
        if(addressRequired.isSelected() != expectedState) {
            click(addressRequired);
        }
    }

    public void setDataBasedIDVerification(String dbIDVerify){
        scrollIntoView(dataBasesIDVerification);
        if(!getText(dataBasesIDVerification).equals(dbIDVerify)){
            click(dataBasesIDVerification);
            click(By.xpath("//li[contains(@id,'"+dbIDVerify.toUpperCase()+"')]"));
        }
    }

    public void setDataBasedIDVerificationThreshold(String dbIDThreshold){
        if(!getText(dataBasesIDVerificationThreshold).equals(dbIDThreshold)){
            click(dataBasesIDVerificationThreshold);
            click(By.xpath("//li[contains(@id,'"+dbIDThreshold.toUpperCase()+"')]"));
        }
    }

    public void isReqContratObligation(boolean expectedState){
        if(getDataBasesIDObligation.isSelected() != expectedState) {
            click(getDataBasesIDObligation);
        }
    }

    public void setDeviceOwnershipCheck(String ownershipCheck){
        scrollIntoView(deviceOwnershipCheck);
        if(!getText(deviceOwnershipCheck).equals(ownershipCheck)){
            click(deviceOwnershipCheck);
            if(ownershipCheck.equals("ENABLED")) {
                click(By.xpath("//li[contains(@id,'REQUIRED')]"));
            }else {click(By.xpath("//li[contains(@id,'"+ownershipCheck.toUpperCase()+"')]"));}
        }
    }

    public void setPhRiskThreshold(String phRiskThreshold){
        if(!getText(deviceOwnershipPhRisk).equals(phRiskThreshold)){
            click(deviceOwnershipPhRisk);
            click(By.xpath("//li[contains(@id,'"+phRiskThreshold.toUpperCase()+"')]"));
        }
    }

    public void setPhToNameThreshold(String phToNameThreshold){
        if(!getText(deviceOwnershipPhToName).equals(phToNameThreshold)){
            click(deviceOwnershipPhToName);
            click(By.xpath("//li[contains(@id,'"+phToNameThreshold.toUpperCase()+"')]"));
        }
    }

    public void setEmailToPhThreshold(String emailToPhThreshold){
        scrollIntoView(deviceOwnershipEmailToPh);
        if(!getText(deviceOwnershipEmailToPh).equals(emailToPhThreshold)){
            click(deviceOwnershipEmailToPh);
            click(By.xpath("//li[contains(@id,'"+emailToPhThreshold.toUpperCase()+"')]"));
        }
    }

    public void setEmailToNameThreshold(String emailToNameThreshold){
        if(!getText(deviceOwnershipEmailToName).equals(emailToNameThreshold)){
            click(deviceOwnershipEmailToName);
            click(By.xpath("//li[contains(@id,'"+emailToNameThreshold.toUpperCase()+"')]"));
        }
    }

    public void clickSavePolicy(){
        click(savePolicy);
    }



}
