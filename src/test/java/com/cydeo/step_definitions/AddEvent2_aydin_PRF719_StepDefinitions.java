package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddEvent2_aydin_PRF719_StepDefinitions {

    GeneralInfoPage generalInfoPage = new GeneralInfoPage();
    AddEventPage addEventPage = new AddEventPage();
    public List<String> list;
    Select select;

    // -----------------   AC - 1/2    -------------------------
    @Given("user logs in as {string}")
    public void userLogsInAs(String userType) {
        BasePage.goToLoginPage();
        if (userType.equals("salesmanager")){
            BasePage.loginAsSalesManager();
        }else if (userType.equals("storemanager")){
            BasePage.loginAsStoreManager();
        } else if (userType.equals("driver")) {
            BasePage.loginAsDriver();
        }

        try {
            BasePage.waitUntilLoaderDisappear();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        BrowserUtils.sleep(3);

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

    @When("user clicks on Fleet - Vehicles")
    public void userClicksOnFleetVehicles() {
        BrowserUtils.sleep(3);
        OdometerFilterPage.waitForVisibility(generalInfoPage.fleet,10);
        OdometerFilterPage.waitClickability(generalInfoPage.fleet,10);
        generalInfoPage.fleet.click();
        OdometerFilterPage.waitForVisibility(generalInfoPage.vehicles,10);
        OdometerFilterPage.waitClickability(generalInfoPage.vehicles,10);
        generalInfoPage.vehicles.click();
    }

    @Then("user clicks on any raw")
    public void user_clicks_on_any_raw() {
        BrowserUtils.sleep(8);
        OdometerFilterPage.waitForVisibility(generalInfoPage.anyRow,10);
        OdometerFilterPage.waitClickability(generalInfoPage.anyRow,10);
        generalInfoPage.anyRow.click();
    }

    @Then("user clicks on Add Event button")
    public void userClicksOnAddEventButton() {
        BrowserUtils.sleep(5);
        OdometerFilterPage.waitForVisibility(generalInfoPage.addEventButtonInGeneralInfoPage,10);
        OdometerFilterPage.waitClickability(generalInfoPage.addEventButtonInGeneralInfoPage,10);
        generalInfoPage.addEventButtonInGeneralInfoPage.click();
    }

    @Then("Add Event page pops up")
    public void addEventPagePopsUp() {
        OdometerFilterPage.waitForVisibility(generalInfoPage.addEventPopUpPage,10);
        Assert.assertTrue(generalInfoPage.addEventPopUpPage.isDisplayed());
    }

    // -----------------   AC - 3    -------------------------
    @Given("user {string} is on Add Event page")
    public void userIsOnAddEventPage(String userType) {
        userLogsInAs(userType);
        userClicksOnFleetVehicles();
        user_clicks_on_any_raw();
        userClicksOnAddEventButton();
        addEventPagePopsUp();
    }

    @When("user fills out compulsory areas")
    public void userFillsOutCompulsoryAreas() {
        addEventPage.fillOutCompulsoryAreas();
    }

    @And("user picks yellow color and clicks save button")
    public void userPicksYellowColorAndClicksSaveButton() {
        addEventPage.yellowColor.click();
        addEventPage.saveButton.click();
    }

    @Then("user sees the event is added with given color")
    public void userSeesTheEventIsAddedWithGivenColor() {
        Assert.assertTrue(addEventPage.isMeetingExist());
    }



    // -----------------   AC - 4    -------------------------
    @When("user clicks on All-day event checkbox")
    public void user_clicks_on_all_day_event_checkbox() {
        addEventPage.allDayEvent.click();
    }

    @Then("user sees time field disappears")
    public void user_sees_time_field_disappears() {
        try {
            BrowserUtils.sleep(1);
            Assert.assertFalse(addEventPage.startTimeButton.isDisplayed());
        }catch (RuntimeException e){
            Assert.assertTrue(true);
        }
    }



    // -----------------   AC - 5    -------------------------
    @And("user clicks on Repeat checkbox")
    public void userClicksOnRepeatCheckbox() {
        addEventPage.repeat.click();
    }

    @When("user sees all valid options")
    public void user_sees_all_valid_options(List<String> validOptions) {
        list = addEventPage.optionsOfRepeats();
        System.out.println("list = " + list);
        System.out.println("validOptions = " + validOptions);
        Assert.assertEquals(validOptions, list);
    }

    @And("user selects each option respectively and sees each one's own menu")
    public void userSelectsEachOptionRespectivelyAndSeesEachOneSOwnMenu() {
        select = new Select(addEventPage.repeatsDropdown);
        for (String each : list) {
            select.selectByVisibleText(each);
            System.out.println("each = " + each);
            Assert.assertTrue(addEventPage.summary.getText().contains(each));
        }
    }

    // -----------------   AC - 6    -------------------------
    @And("user can end the event by Never, After, By")
    public void userCanEndTheEventByNeverAfterBy() {
        System.out.println("addEventPage.never.getText() = " + addEventPage.never.getText());
        Assert.assertTrue(addEventPage.never.isEnabled());
        Assert.assertTrue(addEventPage.after.isEnabled());
        Assert.assertTrue(addEventPage.by.isEnabled());
    }
}
