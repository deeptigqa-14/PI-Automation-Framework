package com.verifypolicy.framework.ui.utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.verifypolicy.framework.ui.listeners.ExtentReportListener;
import org.testng.Reporter;

public class ReportLogger {

    public static void logStep(String message) {
        String currentTestName = Reporter.getCurrentTestResult().getMethod().getMethodName();
        ExtentTest test = ExtentReportListener.testMap.get(currentTestName);
        if (test != null) {
            test.log(Status.INFO, message);
        }
        System.out.println("STEP: " + message);  // also print to console
    }

    public static void logPass(String message) {
        String currentTestName = Reporter.getCurrentTestResult().getMethod().getMethodName();
        ExtentTest test = ExtentReportListener.testMap.get(currentTestName);
        if (test != null) {
            test.log(Status.PASS, message);
        }
    }

    public static void logFail(String message) {
        String currentTestName = Reporter.getCurrentTestResult().getMethod().getMethodName();
        ExtentTest test = ExtentReportListener.testMap.get(currentTestName);
        if (test != null) {
            test.log(Status.FAIL, message);
        }
    }
}