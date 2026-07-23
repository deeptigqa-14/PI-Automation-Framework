package com.verifypolicy.framework.ui.listeners;

import com.verifypolicy.framework.ui.utils.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.util.HashMap;
import java.util.Map;

public class ExtentReportListener implements ITestListener {

    public static ExtentReports extent = ExtentManager.getInstance();
    public static Map<String, ExtentTest> testMap = new HashMap<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(
                result.getMethod().getMethodName(),
                result.getMethod().getDescription()
        );
        test.assignCategory(result.getTestContext().getCurrentXmlTest().getName());
        testMap.put(result.getMethod().getMethodName(), test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = testMap.get(result.getMethod().getMethodName());
        test.log(Status.PASS, "Test passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = testMap.get(result.getMethod().getMethodName());
        test.log(Status.FAIL, "Test failed: " + result.getThrowable());

        // Capture screenshot ONLY on failure
        String screenshotPath =ScreenshotUtils.captureScreenshotAsBase64(DriverManager.getDriver()); /* ScreenshotUtils.captureScreenshot(
                DriverManager.getDriver(),
                result.getMethod().getMethodName()
        );*/

        if (screenshotPath != null) {
            try {
                test.addScreenCaptureFromBase64String(screenshotPath);
                        //addScreenCaptureFromPath(screenshotPath);
            } catch (Exception e) {
                test.log(Status.WARNING, "Could not attach screenshot: " + e.getMessage());
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = testMap.get(result.getMethod().getMethodName());
        test.log(Status.SKIP, "Test skipped: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

    private ExtentTest getTest(ITestResult result) {
        return testMap.get(result.getMethod().getMethodName());
    }
}