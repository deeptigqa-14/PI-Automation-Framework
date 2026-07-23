package com.verifypolicy.framework.ui.base;

import com.verifypolicy.framework.ui.flows.AddPolicyFlow;
import com.verifypolicy.framework.ui.utils.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected AddPolicyFlow addPolicyFlow;

    @BeforeTest
    public void setUp() {
        DriverManager.getDriver();
        addPolicyFlow = new AddPolicyFlow();
    }

    @AfterTest
    public void tearDown() {
        DriverManager.quitDriver();
    }
}