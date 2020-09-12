
package testcases.android;

import static org.testng.Assert.assertEquals;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.LandingPageAndroid;

public class StormsLoginTest extends TestBase {
    public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public static AppiumDriver driver2;

    @Test(priority = 1, enabled = true)
    @Description("Verify Valid login for Amazon")
    public void verifyValidLogin() throws Exception {

        /*System.out.println("verifyValidLogin: " + driver);
        MobileElement swipeEl = (MobileElement) driver.findElement(MobileBy.id("list_view"));
        int startx = swipeEl.getLocation().getX() + 5;
        int starty = swipeEl.getCenter().getY();
        int endx = swipeEl.getSize().getWidth() - 10;
        int endy = 0;*/
        LandingPage.tapAccount();
//        LandingPage.enterUsername();
//        LandingPage.enterPassword();
//        LandingPage.storm_in1();

        LandingPage.login();

//    new TouchAction(driver).longPress(250, 1200).moveTo(900, 1200).release().perform();

        //new TouchAction(driver2).press(56,1299).moveTo(356,1310).release().perform();
        //new TouchAction().press(el0).moveTo(el1).release()

        System.out.println("touchabove: ");

//        try{
//           // TouchAction touchAction = new TouchAction(driver);
//           // touchAction.press(PointOption.point(10, 20)).moveTo(PointOption.point(200, 200)).release().perform();
//            System.out.println("touchabove: ");
//            Thread.sleep(10000);
//            new TouchAction(driver).press(startx, starty).waitAction(Duration.ofMillis(100)).moveTo(endx, endy).waitAction(Duration.ofMillis(100)).release().perform();
//
//            // TouchAction touchAction = new TouchAction(driver);
//            // touchAction.press(PointOption.point(10, 20)).moveTo(PointOption.point(200, 200)).release().perform();
//            System.out.println("touchabove siuccess: ");
//            sleep(10);
//
//        }
//        catch(InterruptedException ie){
//            System.out.println("touchabove: "+ ie);
//        }





        System.out.println("beloq: ");

        //touchAction.longPress(FirstElement, Duration.ofSeconds(15)).moveTo(endx,
              //  endy).release().perform();

        //new TouchAction(driverObject).tap(PointOption.point(356,1310)).perform();

//        String SIGNOUTTEXT = LandingPage.logOut();
//        assertEquals(SIGNOUTTEXT, "SIGN OUT");



    }


}