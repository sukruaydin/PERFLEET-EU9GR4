package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.GeneralInfoPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sk.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GeneralInfoPage_emre_PRF722_StepDefinitions {

  GeneralInfoPage x = new GeneralInfoPage();
    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        GeneralInfoPage.goToLoginPage();
        BrowserUtils.sleep(3);

    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        GeneralInfoPage.loginWithCredentials(username,password);
        BrowserUtils.sleep(8);

    }

    @When("user clicks to fleet dropdown")
    public void user_clicks_to_fleet_dropdown() {
      WebElement fleetDropdown= Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]"));
      fleetDropdown.click();
      BrowserUtils.sleep(10);

    }
    @When("user clicks to the vehicles option")
    public void user_clicks_to_the_vehicles_option() {
     WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
     vehicles.click();
     BrowserUtils.sleep(10);

    }
    @When("user clicks on anywhere on one of the rows")
    public void user_clicks_on_anywhere_on_one_of_the_rows() {
        WebElement firstRow = Driver.getDriver().findElement(By.xpath("(//tr[@class='grid-row row-click-action'])[1]"));
        firstRow.click();
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(3);
        WebElement secondRow = Driver.getDriver().findElement(By.xpath("(//tr[@class='grid-row row-click-action'])[2]"));
        secondRow.click();
        BrowserUtils.sleep(3);

    }
    @Then("user should be on the general information page")
    public void user_should_be_on_the_general_information_page() {
        WebElement generalInformationHeader = Driver.getDriver().findElement(By.xpath("//span[.='General Information']"));
        String expectedHeader = "General Information";
        String actualHeader = Driver.getDriver().findElement(By.xpath("//span[.='General Information']")).getText();
        Assert.assertEquals(expectedHeader,actualHeader);
        BrowserUtils.sleep(3);

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
       GeneralInfoPage.inputBoxUsername.sendKeys("user1");
       BrowserUtils.sleep(2);
       GeneralInfoPage.inputBoxPassword.sendKeys("UserUser123");
       BrowserUtils.sleep(2);
       GeneralInfoPage.loginButton.click();
       BrowserUtils.sleep(12);
    }
    @When("user moves to the three dot in the row and user clicks to eye icon in the box")
    public void user_moves_to_the_three_dot_in_the_row_and_user_clicks_to_eye_icon_in_the_box() {

        Driver.getDriver().manage().window().maximize();
        BrowserUtils.sleep(6);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(x.ThreeDotAtTheWndRightOfRow).perform();

        actions.moveToElement(x.eyeIcon).click().perform();
    }

    @When("user clicks the one of the rows")
    public void user_clicks_the_one_of_the_rows() {
        BrowserUtils.sleep(4);
      WebElement row = Driver.getDriver().findElement(By.xpath("(//li[.='Junior'])[1]"));
      row.click();
      BrowserUtils.sleep(5);
    }
    @Then("user should see the add event button")
    public void user_should_see_the_add_event_button() {
        Assert.assertTrue(x.addEventButtonInGeneralInfoPage.isDisplayed());
    }
    @Then("user should see the delete button")
    public void user_should_see_the_delete_button() {
       Assert.assertTrue(x.deleteButtonInGeneralInformationPage.isDisplayed());
       BrowserUtils.sleep(2);
    }
    @Then("user should see the edit button")
    public void user_should_see_the_edit_button() {
       Assert.assertTrue(x.EditButtonInGeneralInformationPage.isDisplayed());
    }



    @Then("user should not see the add event button")
    public void user_should_not_see_the_add_event_button() {
        if(x.addEventButtonInGeneralInfoPage.isDisplayed()) {
            Assert.fail("Driver Should not see the ADD EVENT button");
        }

    }

    @Then("the info in the vehicle page and info in the general info page must be same")
    public void the_info_in_the_vehicle_page_and_info_in_the_general_info_page_must_be_same() {
       int size1 = x.listOfElementsInVehiclePageRow.size();
       x.firstRow.click();
       BrowserUtils.sleep(4);
      int size2 = x.listOfElementsGeneralInfoPage.size();
        System.out.println(size1);
        System.out.println(size2);
      Assert.assertEquals(size1,size2);

    }






}
