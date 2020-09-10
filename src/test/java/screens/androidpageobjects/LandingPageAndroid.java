package screens.androidpageobjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.ScreenBase;
import utils.CommonUtils;

public class LandingPageAndroid extends ScreenBase {

    String USERNAME = "";
    String PASSWORD = "";

    public LandingPageAndroid() {
        try {
            Properties properties = CommonUtils.read_properties();
            USERNAME = properties.getProperty("email");
            PASSWORD = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    By account = By.xpath("//android.widget.TextView[@text='Account']");


    public void tapAccount() {
        System.out.println("account: " + driver);
        driver.findElement(account).click();
    }


}
