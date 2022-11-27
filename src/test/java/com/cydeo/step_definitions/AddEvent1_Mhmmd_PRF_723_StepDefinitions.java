package com.cydeo.step_definitions;

import com.cydeo.pages.AddEventPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.GeneralInfoPage;
import com.cydeo.pages.OdometerFilterPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddEvent1_Mhmmd_PRF_723_StepDefinitions {

    GeneralInfoPage generalInfoPage = new GeneralInfoPage();
    AddEventPage addEventPage = new AddEventPage();
    public List<String> list;
    Select select;

    @Given("user logins in as {string}")
    public void userLoginsInAs(String userType) {

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

    @When("The user clicks on Fleet - Vehicles")
    public void theUserClicksOnFleetVehicles() {

        BrowserUtils.sleep(3);
        OdometerFilterPage.waitForVisibility(generalInfoPage.fleet,10);
        OdometerFilterPage.waitClickability(generalInfoPage.fleet,10);
        generalInfoPage.fleet.click();
        OdometerFilterPage.waitForVisibility(generalInfoPage.vehicles,10);
        OdometerFilterPage.waitClickability(generalInfoPage.vehicles,10);
        generalInfoPage.vehicles.click();

    }

    @Then("The user clicks on any raw")
    public void theUserClicksOnAnyRaw() {


        BrowserUtils.sleep(8);


        OdometerFilterPage.waitForVisibility(generalInfoPage.anyRow,10);
        OdometerFilterPage.waitClickability(generalInfoPage.anyRow,10);
        generalInfoPage.anyrow1.click();
       // generalInfoPage.anyRow.click();

        //BrowserUtils.sleep(8);

    }

    @Then("The user should be on the General information page")
    public void theUserShouldBeOnTheGeneralInformationPage() {

        BrowserUtils.sleep(5);

        String expectedHeader = "General Information";
        String actualHeader = addEventPage.GenInfoTitle.getText();

        Assert.assertEquals( expectedHeader, actualHeader);
    }

/*
    @Given("user logins in as {string}")
    public void user_logins_in_as(String userType) {

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
    @When("The user clicks on Fleet - Vehicles")
    public void the_user_clicks_on_fleet_vehicles() {

        BrowserUtils.sleep(3);
        OdometerFilterPage.waitForVisibility(generalInfoPage.fleet,10);
        OdometerFilterPage.waitClickability(generalInfoPage.fleet,10);
        generalInfoPage.fleet.click();
        OdometerFilterPage.waitForVisibility(generalInfoPage.vehicles,10);
        OdometerFilterPage.waitClickability(generalInfoPage.vehicles,10);
        generalInfoPage.vehicles.click();

    }
    @Then("The user clicks on any raw")
    public void the_user_clicks_on_any_raw() {

        BrowserUtils.sleep(8);
        OdometerFilterPage.waitForVisibility(generalInfoPage.anyRow,10);
        OdometerFilterPage.waitClickability(generalInfoPage.anyRow,10);
        generalInfoPage.anyRow.click();

    }
    @Then("The user should be on the General information page")
    public void the_user_should_be_on_the_general_information_page() {

        String expectedHeader = "General Information";
        String actualHeader = addEventPage.GenInfoTitle.getText();

        Assert.assertEquals( expectedHeader, actualHeader);


    }
    
 */

    //-------------------------------------------------------
    /*

    @Given("user {string} is on the Add Event page")
    public void user_is_on_the_add_event_page(String userType ) {

        userLoginsInAs(userType);
        theUserClicksOnFleetVehicles();
        theUserClicksOnAnyRaw();
        theUserShouldBeOnTheGeneralInformationPage();
    }

     */

    @Given("user {string} is on the Add Event page")
    public void userIsOnTheAddEventPage(String userType) {

        userLoginsInAs(userType);
        theUserClicksOnFleetVehicles();
        theUserClicksOnAnyRaw();
        theUserShouldBeOnTheGeneralInformationPage();

    }

    @When("Sales Manager should see Add Event button")
    public void sales_manager_should_see_add_event_button() {




       // Assert.assertTrue( addEventPage.addEventBtn.isDisplayed() );
       // BrowserUtils.sleep(5);



    }

    @When("Store Manager should see Add Event button")
    public void store_manager_should_see_add_event_button() {


       // Assert.assertTrue( addEventPage.addEventBtn.isDisplayed() );
        //BrowserUtils.sleep(5);

    }

    @Then("Driver should not see Add Event button")
    public void driver_should_not_see_add_event_button() {


       // Assert.assertFalse( addEventPage.addEventBtn.isDisplayed() );
        // BrowserUtils.sleep(5);

    }

    //-------------------------------------------------------

    @Given("User is clicked Add Event button")
    public void userIsClickedAddEventButton() {

        BrowserUtils.sleep(5);
        addEventPage.addEventBtn.click();
        
    }

    @When("Sales Manager should see Add Event page")
    public void salesManagerShouldSeeAddEventPage() {

        BrowserUtils.sleep(8);
        String expectedTitle = "Add Event";
        String actualHeader = addEventPage.addEventTitle.getText();

        Assert.assertEquals( expectedTitle , actualHeader );
        
    }

/*
    @Then("Store Manager should see Add Event page")
    public void storeManagerShouldSeeAddEventPage() {

        BrowserUtils.sleep(8);
        String expectedTitle = "Add Event";
        String actualHeader = addEventPage.addEventTitle.getText();

        Assert.assertEquals( expectedTitle , actualHeader );
    }


/*
    @When("The user should see Add Event page")
    public void the_user_should_see_add_event_page() {

        BrowserUtils.sleep(8);
        String expectedTitle = "Add Event";
        String actualHeader = addEventPage.addEventTitle.getText();

        Assert.assertEquals( expectedTitle , actualHeader );

    }

 */


    @When("The user should see Add Event page")
    public void theUserShouldSeeAddEventPage() {

        BrowserUtils.sleep(8);
        String expectedTitle = "Add Event";
        String actualHeader = addEventPage.addEventTitle.getText();

        Assert.assertEquals(  actualHeader , expectedTitle );


    }

/*
    @When("{string} should see Add Event page")
    public void shouldSeeAddEventPage(String userType) {

        BrowserUtils.sleep(8);
        String expectedTitle = "Add Event";
        String actualHeader = addEventPage.addEventTitle.getText();

        Assert.assertEquals( expectedTitle , actualHeader );
    }

 */

    @Then("Compulsory fields should show on the pop page")
    public void compulsoryFieldsShouldShowOnThePopPage() {

        BrowserUtils.sleep(8);

        Assert.assertTrue(addEventPage.popUpTitle.isDisplayed());
        Assert.assertTrue(addEventPage.popUpOwner.isDisplayed());
        Assert.assertTrue(addEventPage.popUpOrganizer.isDisplayed());
        Assert.assertTrue(addEventPage.popUpOrganizerEmail.isDisplayed());
        Assert.assertTrue(addEventPage.popUpStartDate.isDisplayed());
        Assert.assertTrue(addEventPage.popUpEndDate.isDisplayed());
    }



    // -------------------------------------------------------

/*
    @Given("The user {string} is on the Add Event  pop up page")
    public void the_user_is_on_the_add_event_pop_up_page(String userType ) {

        userLoginsInAs(userType);
        theUserClicksOnFleetVehicles();
        theUserClicksOnAnyRaw();
        theUserShouldBeOnTheGeneralInformationPage();
        userIsClickedAddEventButton();

    }
    @When("The user fills out compulsory areas")
    public void the_user_fills_out_compulsory_areas() {

       addEventPage.fillOutCompulsoryAreas();

    }
    @Then("The user clicks save button")
    public void the_user_clicks_save_button() {

        addEventPage.saveButton.click();

    }
    @Then("The user should see warning message")
    public void the_user_should_see_warning_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


 */

    @Given("The user {string} is on the Add Event  pop up page")
    public void theUserIsOnTheAddEventPopUpPage(String userType ) {
        userLoginsInAs(userType);
        theUserClicksOnFleetVehicles();
        theUserClicksOnAnyRaw();
        theUserShouldBeOnTheGeneralInformationPage();
        userIsClickedAddEventButton();

    }

    @When("The user fills out compulsory areas and save click")
    public void theUserFillsOutCompulsoryAreasAndSaveClick() {

        addEventPage.fillOutCompulsoryAreas();
        addEventPage.saveButton.click();
    }
/*
    @When("The user fills out compulsory areas")
    public void theUserFillsOutCompulsoryAreas() {

        addEventPage.fillOutCompulsoryAreas();

    }

 */

    @Then("The user can not fill any compulsory areas")
    public void theUserCanNotFillAnyCompulsoryAreas() {

        addEventPage.fillNotOutCompulsoryAreas1();

        addEventPage.saveButton.click();
        BrowserUtils.sleep(2);
        addEventPage.cancel.click();

        BrowserUtils.sleep(5);

        addEventPage.fillNotOutCompulsoryAreas2();

        addEventPage.saveButton.click();
        BrowserUtils.sleep(2);


        BrowserUtils.sleep(5);

        addEventPage.fillNotOutCompulsoryAreas3();

        addEventPage.saveButton.click();
        BrowserUtils.sleep(2);

    }


    @Then("The user clicks save button")
    public void theUserClicksSaveButton() {

        addEventPage.saveButton.click();

    }



    @Then("The user should see warning message")
    public void theUserShouldSeeWarningMessage() {
    }



}
