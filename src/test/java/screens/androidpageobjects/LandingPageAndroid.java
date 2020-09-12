package screens.androidpageobjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.ScreenBase;
import utils.CommonUtils;

public class LandingPageAndroid extends ScreenBase {

    String USERNAME = "";
    String PASSWORD = "";
    By account;
    By username ;
    By password ;
    By storm_in ;
//
    By Logout;

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
//
            Logout = By.xpath(properties.getProperty("logout"));

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

    public String logOut() {
        return driver.findElement(Logout).getText();
    }



}
