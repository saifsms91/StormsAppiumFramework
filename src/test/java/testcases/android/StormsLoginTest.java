
package testcases.android;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.LandingPageAndroid;

public class StormsLoginTest extends TestBase {
    public LandingPageAndroid LandingPage = new LandingPageAndroid();

    @Test(priority = 1, enabled = true)
    @Description("Verify Valid login for Amazon")
    public void verifyValidLogin() throws Exception {

        System.out.println("verifyValidLogin: " + driver);
        LandingPage.tapAccount();

    }



}