package com.cydeo.utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    //accepts integer in seconds and stops execution by given duration
    //internally uses Thread.sleep
    public static void sleep(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //turns-off implicitly wait, sets-up explicitly wait, returns WebDriverWait object
    public static WebDriverWait explicitlyWait(){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        return wait;
    }

}
