package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.GeneralInfoPage;
import com.cydeo.pages.Vehicles;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class FilterMenu_Mustafa_PRF720_StepDefinitions {

    Vehicles vehicles = new Vehicles();
    GeneralInfoPage generalInfoPage=new GeneralInfoPage();
    String totalNumberBeforeClicking="";

    int sizeOfElementBefore=0;
    int sizeOfElementAfter=0;

    @Given("user can be logged in as {string}")
    public void user_can_be_logged_in_as(String userType) {
        BasePage.goToLoginPage();
        if (userType.equals("salesmanager")) {
            BasePage.loginAsSalesManager();
        } else if (userType.equals("storemanager")) {
            BasePage.loginAsStoreManager();
        } else if (userType.equals("driver")) {
            BasePage.loginAsDriver();
        }

        try {
            BasePage.waitUntilLoaderDisappear();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        //BrowserUtils.sleep(3);

        try {
            generalInfoPage.cancel.click();
        }catch (RuntimeException e){
            System.out.println("there is no add event page already in home page");
        }

        try {
            generalInfoPage.cancel.click();
        }catch (RuntimeException e){
            System.out.println("there is no add event page already in home page");
        }
    }

    @Given("goes to fleet-vehicles page")
    public void goes_to_fleet_vehicles_page() {
        BrowserUtils.explicitlyWait().until(ExpectedConditions.elementToBeClickable(vehicles.appTitle));
        vehicles.goTo("Fleet","Vehicles");
    }

    @Given("user clicks to filter icon")
    public void user_clicks_to_filter_icon() {
        vehicles.filterIcon.click();
    }

    @Then("user should see manage filters button")
    public void user_should_see_manage_filters_button() {
        Assert.assertTrue(vehicles.manageFilter.isDisplayed());
    }

    @When("user clicks to manage filters button")
    public void user_clicks_to_manage_filters_button() {
        vehicles.manageFilter.click();
    }

    @When("user clicks randomly one filter name inside the manage filter")
    public void user_clicks_randomly_one_filter_name_inside_the_manage_filter() {
        vehicles.manageFilterChoiceWithName.click();
        totalNumberBeforeClicking=vehicles.totalNumber.getText();
        System.out.println(totalNumberBeforeClicking);
    }

    @Then("user should see changing of the total number")
    public void user_should_see_changing_of_the_total_number() {
        Assert.assertEquals(totalNumberBeforeClicking,vehicles.totalNumber.getText());
    }

    @When("user types name inside the manage filter")
    public void user_types_name_inside_the_manage_filter(String text) {
        BrowserUtils.sleep(2);
        vehicles.manageFilterSearchBox.sendKeys(text);
        String t="//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/ul/li[contains(.,'"+text+"')]";
        WebElement element= Driver.getDriver().findElement(By.xpath(t));
        element.click();
        totalNumberBeforeClicking=vehicles.totalNumber.getText();
        System.out.println(totalNumberBeforeClicking);
    }

    @When("user types name ands clicks to choose filter name randomly inside the manage filter")
    public void user_types_name_ands_clicks_to_choose_filter_name_randomly_inside_the_manage_filter(String text) {
        vehicles.manageFilterChoiceWithName.click();
        BrowserUtils.sleep(2);
        vehicles.manageFilterSearchBox.sendKeys(text);
        String t="//*[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']/ul/li[contains(.,'"+text+"')]";
        WebElement element= Driver.getDriver().findElement(By.xpath(t));
        element.click();
        totalNumberBeforeClicking=vehicles.totalNumber.getText();
        System.out.println(totalNumberBeforeClicking);
    }

    @Then("user clicks the reset icon")
    public void user_clicks_the_reset_icon() {
        BrowserUtils.sleep(1);
        sizeOfElementBefore=vehicles.sizeOfElement.size();
        System.out.println("sizeOfElementBefore = " + sizeOfElementBefore);
        vehicles.resetIcon.click();
    }

    @Then("user should see all filters can be removed")
    public void user_should_see_all_filters_can_be_removed() {
        sizeOfElementAfter=vehicles.sizeOfElement.size();
        System.out.println("sizeOfElementAfter = " + sizeOfElementAfter);
        Assert.assertNotEquals(sizeOfElementAfter,sizeOfElementBefore);
    }


}
