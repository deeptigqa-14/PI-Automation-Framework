package com.verifypolicy.framework.ui.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            System.out.println("Creating driver in thread: " + Thread.currentThread().getId());
            WebDriverManager.chromedriver().setup();
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.manage().window().maximize();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.set(chromeDriver);
        }
        return driver.get();
    }


    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}