package com.verifypolicy.framework.ui.pages;

import com.verifypolicy.framework.ui.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PrivateKey;

public class AddPolicyPage extends BasePage {


    @FindBy(xpath="//div[@data-id='name-input']/div/input[@value='New Policy']")
    private WebElement policyName;

    @FindBy(xpath="//div[@data-id='description-input']/div/input")
    private WebElement policyDescription;

    @FindBy(xpath="//div[@data-id='transaction-timeout']//input")
    private WebElement transactionTimeout;

    @FindBy(xpath="//div[@data-id='data-collection-timeout']//input")
    private WebElement dataCollectionTimeout;

    @FindBy(xpath="//div[@data-id='dataCollectionOnly']")
    private WebElement dataCollectionOnly;


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
        if(!transactionTimeout.getText().equals(timeout)) {
            type(transactionTimeout, timeout);
        }
    }

    public void enterDataCollectionTimeout(String timeout) {
        if(!dataCollectionTimeout.getText().equals(timeout)) {
            type(dataCollectionTimeout, timeout);
        }
    }

    public void setDataCollectionOnly(boolean expectedState) {
        if(dataCollectionOnly.isSelected() != expectedState) {
            click(dataCollectionOnly);
        }
    }

}
