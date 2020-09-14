package base;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeSuite;
import screens.androidpageobjects.LandingPageAndroid;
import utils.AppConfigTags;
import utils.CommonUtils;
import utils.Constants;

import java.net.MalformedURLException;

public class TestBase {

    public static AppiumDriver driver;
    public LandingPageAndroid LandingPage;


    @BeforeSuite
    public void setUp() throws MalformedURLException {

        pageObjectConfig();
        System.out.println("Setup TestCase");

        CommonUtils utils = new CommonUtils();
        utils.setup(AppConfigTags.ANDROID, AppConfigTags.MOTOROLA, Constants.ANDROID_URI);
        driver = utils.driver
        ;

    }

    private void pageObjectConfig() {

    }

//	@AfterSuite
//	public void tearDown() {
//
//		driver.quit();
//
//	}

}
