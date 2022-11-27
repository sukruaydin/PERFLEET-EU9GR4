package com.cydeo.step_definitions;

import com.cydeo.pages.GridSettings;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridSettings_PRF_725_StepDefinition {

    GridSettings gridSettings = new GridSettings();

    @Then("user clicks on gear icon")
    public void user_clicks_on_gear_icon() {

        gridSettings.gridSettingsButton.click();
        BrowserUtils.sleep(3);
    }
    @Then("Grid Settings should be visible")
    public void grid_settings_should_be_visible() {
       gridSettings.gridSettingsColumnManagerText.isDisplayed();

    }

    @Then("column names should be visible in order")
    public void column_names_should_be_visible_in_order() {


        String [] expectedColumnNames = {"Id",
                "License Plate",
                "Tags",
                "Driver",
                "Location",
                "Chassis Number",
                "Model Year",
                "Last Odometer",
                "Immatriculation Date",
                "First Contract Date",
                "Catalog Value (VAT Incl.)",
                "Seats Number",
                "Doors Number",
                "Color",
                "Transmission",
                "Fuel Type",
                "CO2 Emissions",
                "Horsepower",
                "Horsepower Taxation",
                "Power (KW)"};
        List<String> columnNamesInOrder = Arrays.asList(expectedColumnNames);

        for (int i = 0; i <= 19; i++) {

            Assert.assertEquals(gridSettings.namesOnGridSettings.get(i).getText(),expectedColumnNames[i]);


        }


    }



    @Then("user types {string} on Quick Search input box and find any column {int}")
    public void user_types_on_quick_search_input_box_and_find_any_column(String string, Integer int1) {

        gridSettings.quickSearchInputBox.sendKeys(string);

        Assert.assertTrue(gridSettings.namesOnGridSettings.get(int1).isDisplayed());


    }

    @When("user click click on select all button")
    public void user_click_click_on_select_all_button() {





    }
    @Then("user can select any column by clicking the column name")
    public void user_can_select_any_column_by_clicking_the_column_name() {


    }






}
