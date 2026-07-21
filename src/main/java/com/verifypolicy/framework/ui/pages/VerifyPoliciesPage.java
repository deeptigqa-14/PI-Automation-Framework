package com.verifypolicy.framework.ui.pages;

import com.verifypolicy.framework.ui.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VerifyPoliciesPage extends BasePage{

    @FindBy(xpath = "//button[@data-id='add-policy-icon']//*[local-name()='svg']")
    private WebElement addPolicyButton;

    @FindBy(xpath = "//input[@data-id='search-input']")
    private WebElement searchInput;

    @FindBy(id="content-iframe")
    private WebElement iframeElement;


    public VerifyPoliciesPage(WebDriver driver) {
        super(driver);
    }

    public String getVerifyPoliciesPageTitle() {
        wait.until(ExpectedConditions.titleContains("Verify Policies"));
        return getPageTitle();
    }

    public void clickAddPolicyButton() {
        switchToVerifyPoliciesFrame();
        click(addPolicyButton);
    }

    public void enterSearchText(String searchText) {
        type(searchInput, searchText);
    }

    private By policyTitleByName(String policyName) {
        return By.xpath("//span[contains(normalize-space(@title))='" + policyName + "']");
    }

    public void clickPolicyByName(String policyName) {
        click(policyTitleByName(policyName));
    }

    public void switchToVerifyPoliciesFrame(){
        driver.switchTo().frame(iframeElement);
    }


}
