
# Appium--testng-POM-framework


Highlights:
This is a sample POM framework to automate Storm Android app


## Technology stack:
- TestNG (test runner)
- Appium (mobile testing)
- Selenium (web app testing) [Used as a wrapper for appium]
- Allure (reporting)
- Java (Programming Language)
- Maven (Dependency Manager)
- Page Object Model

### Pre-requisites

- Appium configuration should be up and running (Can use appium-doctor -h to see the configuration)
- Android Device Simulator (The test was done on real Samsung galaxy A 50 device)
### Steps to run the code

* Import the project as maven project preferable in InteeliJ to avoid any issues
* Click Next
* Click Browse and select the folder that is the root of the Maven project (contains the pom.xml file)
* Click Next
* Click Finish

#### Note: 
- Havn't used assertion in the test cases every where except first one which is to verify email
- We can also create the methods in normal call and call these method in the test class to only assert them
- for now I have deleted the test-output folder though allure-resukts folder is still there
- Currently all the elements found have been kept on two pages LandingPageAndroid and same goes for test cases.

