package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import io.cucumber.java.en.Given;

public class Login_StepDefinitions {

    @Given("User logs in as {string}")
    public void userLogsInAs(String userType) {
        switch (userType){
            case "driver":
                BasePage.loginAsDriver();
                break;
            case "salesmanager":
                BasePage.loginAsSalesManager();
                break;
            case "storemanager":
                BasePage.loginAsStoreManager();
                break;
        }
    }


}
