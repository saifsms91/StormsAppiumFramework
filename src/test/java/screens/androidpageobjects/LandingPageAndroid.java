package screens.androidpageobjects;

import base.ScreenBase;
import org.openqa.selenium.By;
import utils.CommonUtils;

import java.io.IOException;
import java.util.Properties;

public class LandingPageAndroid extends ScreenBase {

    String USERNAME = "";
    String PASSWORD = "";
    By account;
    By username;
    By password;
    By storm_in;
    By hamburger;
    By usernametext;

    //constructor

    public LandingPageAndroid() {
        try {
            Properties properties = CommonUtils.read_properties();
            USERNAME = properties.getProperty("email");
            PASSWORD = properties.getProperty("password");
            account = By.xpath(properties.getProperty("account"));
            username = By.xpath(properties.getProperty("username"));
            password = By.xpath(properties.getProperty("passwordl"));
            storm_in = By.xpath(properties.getProperty("storm_in"));
            hamburger = By.xpath(properties.getProperty("hamburger"));
            usernametext = By.xpath(properties.getProperty("usernametext"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void tapAccount() {
        System.out.println("account: " + driver);
        driver.findElement(account).click();
    }

    public void login() {
        driver.findElement(username).sendKeys((USERNAME));
        driver.findElement(password).sendKeys(PASSWORD);
        driver.findElement(storm_in).click();
    }

    public void hamBurger() {
        driver.findElement(hamburger).click();
    }

    public String userNameText() {

        return driver.findElement(usernametext).getText();
    }


}
