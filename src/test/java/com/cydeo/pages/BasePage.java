package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BasePage {


    //constructor
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //==================================================================================

    //1.LOCATORS

    @FindBy(id = "prependedInput")
    public static WebElement inputBoxUsername;

    @FindBy(id = "prependedInput2")
    public static WebElement inputBoxPassword;

    @FindBy(id = "_submit")
    public static WebElement loginButton;

    @FindBy(xpath = "//div[@class='loader-mask']")
    public static WebElement loaderMask;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public static WebElement subTitle;

    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public static WebElement userNameDropdown;

    @FindBy(xpath = "//a[@href='/user/logout']")
    public static WebElement logOutButton;

    //==================================================================================

    //2.METHODS

    public static void goToLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public static String getPageTitle(){
        return Driver.getDriver().getTitle();
    }

    public static String getSubTitle(){
        return subTitle.getText();
    }

    public static void loginAsDriver(){
        inputBoxUsername.sendKeys(ConfigurationReader.getProperty("driver_username"));
        inputBoxPassword.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginButton.click();
    }

    public static void loginAsSalesManager(){
        inputBoxUsername.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        inputBoxPassword.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        loginButton.click();
    }

    public static void loginAsStoreManager(){
        inputBoxUsername.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        inputBoxPassword.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        loginButton.click();
    }

    public static void loginWithCredentials(String username, String password){
        inputBoxUsername.sendKeys(username);
        inputBoxPassword.sendKeys(password);
        loginButton.click();
    }

    public static void waitUntilLoaderDisappear(){
        try {
            BrowserUtils.explicitlyWait().until(ExpectedConditions.invisibilityOf(loaderMask));
        }catch (RuntimeException e){
            System.out.println("There is no loader bar");
        }
    }

    public static void logOut(){
        userNameDropdown.click();
        logOutButton.click();
    }



}
