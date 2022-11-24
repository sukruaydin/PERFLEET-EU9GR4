package com.cydeo.step_definitions;

import com.cydeo.pages.OdometerFilterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class OdometerFilter_serdar_PRF721_StepDefinitions {

    private OdometerFilterPage odometerFilterPage = new OdometerFilterPage();

    @Given("the user navigates to {string} - {string} module")
    public void the_user_navigates_to_vehicles_module(String module,String subModule) {
        OdometerFilterPage.navigateToModule("Fleet","Vehicles");
    }
    @Given("the user clicks on {string} button from the top right menu")
    public void the_user_clicks_on_button_from_the_top_right_menu(String filters) {
        odometerFilterPage.clickRightTopButtons(filters);
    }
    @Given("Manage filters showed up")
    public void manage_filters_showed_up() {
        odometerFilterPage.isManageFilterDisplayed();
    }
    @Given("the user clicks manage filters button")
    public void the_user_clicks_manage_filters_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user selects {string} filter")
    public void the_user_selects_filter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user clicks on methods")
    public void the_user_clicks_on_methods() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user must see the methods below")
    public void the_user_must_see_the_methods_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }













}
