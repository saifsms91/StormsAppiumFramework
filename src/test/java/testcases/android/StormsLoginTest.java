
package testcases.android;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.LandingPageAndroid;

//import java.time.Duration;


public class StormsLoginTest extends TestBase {
    public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public static AppiumDriver driver2;

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