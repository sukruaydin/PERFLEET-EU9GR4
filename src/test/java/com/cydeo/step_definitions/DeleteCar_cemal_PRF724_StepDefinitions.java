package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.DeleteCarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DeleteCar_cemal_PRF724_StepDefinitions {


  DeleteCarPage obj1 = new DeleteCarPage();
    @When("User goes to the login page")
    public void user_goes_to_the_login_page() {
        DeleteCarPage.goToLoginPage();
        BrowserUtils.sleep(3);
    }
    @When("User user enters {string} and {string}")
    public void user_user_enters_and(String username, String password) {
        DeleteCarPage.loginWithCredentials(username,password);
        BrowserUtils.sleep(10);
    }
    @When("user clicks on fleet dropdown")
    public void user_clicks_on_fleet_dropdown() {
        obj1.fleetDropDown.click();
        BrowserUtils.sleep(2);
    }
    @When("user clicks on the vehicles option")
    public void user_clicks_on_the_vehicles_option() {
        obj1.vehiclesDropdown.click();
        BrowserUtils.sleep(15);
    }
    @When("user moves on the three dot in the row and user should see delete icon in the box")
    public void user_moves_on_the_three_dot_in_the_row_and_user_should_see_delete_icon_in_the_box() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtils.sleep(6);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(obj1.ThreeDotAtTheEndRightOfRow).perform();

        Assert.assertTrue(obj1.deleteIcon.isEnabled());


    }

    @And("user moves on the three dot in the row and user clicks delete icon in the box")
    public void userMovesOnTheThreeDotInTheRowAndUserClicksDeleteIconInTheBox() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtils.sleep(6);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(obj1.ThreeDotAtTheEndRightOfRow).perform();
        BrowserUtils.sleep(2);
        obj1.deleteIcon.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see confirmation popup")
    public void userShouldSeeConfirmationPopup() {
        Assert.assertTrue(obj1.confirmationPopup.isDisplayed());
    }

    @When("User logs in as driver")
    public void userLogsInAsDriver() {
        DeleteCarPage.inputBoxUsername.sendKeys("user1");
        BrowserUtils.sleep(2);
        DeleteCarPage.inputBoxPassword.sendKeys("UserUser123");
        BrowserUtils.sleep(2);
        DeleteCarPage.loginButton.click();
        BrowserUtils.sleep(8);

    }

    @And("user should see confirmation popup and clicks yes delete button")
    public void userShouldSeeConfirmationPopupAndClicksYesDeleteButton() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtils.sleep(6);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(obj1.ThreeDotOnUserPage).perform();
        BrowserUtils.sleep(2);
        obj1.deleteIcon.click();
        BrowserUtils.sleep(3);

    }

    @Then("user should see warning message")
    public void userShouldSeeWarningMessage() {
        Assert.assertTrue(obj1.warningMessage.isDisplayed());
    }

    @And("user moves on the three dot in the row and user clicks on delete icon in the box")
    public void userMovesOnTheThreeDotInTheRowAndUserClicksOnDeleteIconInTheBox() {
        Driver.getDriver().manage().window().maximize();
        BrowserUtils.sleep(6);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(obj1.ThreeDotAtTheEndRightOfRow).perform();
        BrowserUtils.sleep(2);
        obj1.deleteIcon.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String arg0) {

        String expectedMessage= "Item deleted";
        Assert.assertEquals(expectedMessage,obj1.ItemDeletedMessage.getText());
    }

    @And("user clicks on yes delete button")
    public void userClicksOnYesDeleteButton() {
        obj1.YesDeleteBTN.click();

    }
}
