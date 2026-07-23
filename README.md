# PI-Automation-Framework
Selenium and RestAssured based Framework to verify policies 

Tech/Tool used - Selenium, RestAssured, TestNG, Java, Maven

Architecture Overview
-----------------------------
Created 2 separate packages, one for UI and other for API.

src/main/java/com.verifypolicy/framework

api/

    client/ - flow files to generate request for API
    endpoint/ - generate endpoint for API
    model/ - has request, response, and common POJOs
    spec/- request specification Factory
ui/

    base/- base setup for pages and tests to configure driver
    pages/ - page objects encapsulated locators and actions
    flows/- methods between tests and pages to perform actions
    utils/- common classes used by other classes like driver manager, extent manager, screenshot
    model/- to rest data provider in POJO
    listeners/- ExtentReport Listener

SOLID
--------------
This framework follows SOLID principles.
1. Each class has only one responsibility. For example, each page class contains page-specific Locators and Methods which represent user actions (clicking, typing, reading) on that specific page.
Reason - Easy to maintain.
2. Used Base class and utils like DriverManager, ExtentManager, RequestSpec BasePage, BaseTest. 
Reason - New tests and pages can extend these classes and reuse common features.
3. Page classes extended BasePage and test classes extended BaseTest. Extending does not change or break the base classes (parent). The child classes (page/test) can be used in other classes.
4. Followed abstraction concepts. Test classes does not have implementations. All business logic is written in flow/page classes.

Page Object Model
----------------------
This framework follows POM.
Each page has dedicated page class.
Test classes never call WebDriver/findElement directly.

Design Pattern Used
----------------------
I have used Builder and Singleton design patterns.

Singleton – DriverManager / ExtentReportManager
This framework uses the Singleton pattern to manage shared resources such as WebDriver and ExtentReports. 

Reasons: 
1. It guarantees consistent driver across all tests.
2. Ensures there is only one active WebDriver instance per test run.
3. Centralizes driver creation, configuration, and teardown.

Builder - RequestSpecBuilder
This framework used RequestSpecBuilder for API automation.
Reason:
1. Reusable method, can be used with multiple APIs.

Explicit Waits Only
-------------------
This framework uses Explicit Waits (WebDriverWait + ExpectedConditions) and avoids Thread.sleep() and implicit waits.
All synchronization is done in base page.




 