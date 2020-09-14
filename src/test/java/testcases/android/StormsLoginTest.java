package testcases.android;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import screens.androidpageobjects.LandingPageAndroid;

import static org.testng.Assert.assertEquals;


public class StormsLoginTest extends TestBase {
    public static AppiumDriver driver2;
    public LandingPageAndroid LandingPage = new LandingPageAndroid();

    @Test(priority = 1, enabled = true)
    @Description("Verify Valid login for Storm")
    public void verifyValidLogin() throws Exception {


        LandingPage.tapAccount();
        LandingPage.login();
        System.out.println("beloq: ");
        LandingPage.hamBurger();
        String USERNAMETEXT = LandingPage.userNameText();
        assertEquals(USERNAMETEXT, "@saif");


    }


}