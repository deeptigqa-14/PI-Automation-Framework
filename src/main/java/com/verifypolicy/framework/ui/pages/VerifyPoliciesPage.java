package com.verifypolicy.framework.ui.pages;

import com.verifypolicy.framework.ui.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class VerifyPoliciesPage extends BasePage{

    @FindBy(xpath = "//button[@data-id='add-policy-icon']//*[local-name()='svg']")
    private WebElement addPolicyButton;

    @FindBy(xpath = "//input[@data-id='search-input']")
    private WebElement searchInput;

    @FindBy(id="content-iframe")
    private WebElement iframeElement;

    @FindBy(xpath="//div[@data-id='header-info']/span[2]")
    private WebElement policyID;

    @FindBy(xpath="//div[@data-id='header-actions']//button[@aria-label='policy-actions']")
    private WebElement hamBurgerIcon;

    @FindBy(xpath="//li[@data-key='DELETE']")
    private WebElement deleteBtn;

    @FindBy(xpath = "//div[@data-id='delete-modal']//h3[contains(text(),'Delete Policy')]")
    private WebElement deletePolicyPopup;
    @FindBy(xpath="//div[@data-id='delete-modal']//button[@data-id='delete-button']")
    private WebElement deleteBtnOnPopup;

    @FindBy(id="overviewDashboard")
    private WebElement overView;

    @FindBy(xpath="//div[@data-id='header-actions']//button[@data-id='close-panel-icon']")
    private WebElement closePolicybutton;

    @FindBy(xpath = "//button[@aria-label='create-group-label']//*[local-name()='svg']")
    private WebElement updatePolicyBtn;

    @FindBy(xpath = "//div[@data-id='policy-list']//div[@role='row']")
    private List<WebElement> policyRows;

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

    public boolean isPolicyListEmpty() {
        return policyRows.isEmpty();
    }

    public int getPolicyCount() {
        return policyRows.size();
    }

    private By policyTitleByName(String policyName) {
        return By.xpath("//span[contains(normalize-space(@title),'" + policyName + "')]");
    }

    public void clickPolicy(String policyName) {
        click(policyTitleByName(policyName));
    }

    public void switchToVerifyPoliciesFrame(){
        driver.switchTo().frame(iframeElement);
    }

    public String getPolicyID(){
        return getText(policyID);
    }

    public void clickHamBurgerIcon(){
        click(hamBurgerIcon);
    }
    public boolean isDeletePolicyPopupDisplayed()
    {
        return deletePolicyPopup.isDisplayed();
    }

    public void deletePolicy(){
        clickHamBurgerIcon();
        click(deleteBtn);
        if(isDeletePolicyPopupDisplayed()){

           click(deleteBtnOnPopup);
        }
    }

    public void closeAnyOpenPolicy(){
        if(closePolicybutton.isDisplayed()) {
            click(closePolicybutton);
        }
    }

    public void clickUpdatePolicyBtn(){
        click(updatePolicyBtn);
    }


}
