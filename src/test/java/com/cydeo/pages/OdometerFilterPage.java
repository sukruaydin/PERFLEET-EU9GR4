package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class OdometerFilterPage extends BasePage{

    //=============================Methods============================//

    /** waiting clickable conditions*/
    public static void waitClickability (WebElement element, int timeout){

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** waiting visibility conditions*/
    public static void waitForVisibility(WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** waiting visibility and clickability conditions and CLICK element*/

    public static void clickWithWait(WebElement element, int timeOut){
        waitForVisibility(element,timeOut);
        waitClickability(element,timeOut);
        element.click();
    }

    /** hover over and pause and CLICK */

    public static void hoverOver(WebElement element){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element).pause(500).click(element).build().perform();

    }

    /**select filters icon*/
    public void clickRightTopButtons(String button) {
        BrowserUtils.sleep(1);
        switch (button.toLowerCase()) {
            case "reset":
                //clickWithWait(resetBtn, 7);
                break;

            case "grid settings":
                //clickWithWait(gridSettingsBtn, 7);
                break;

            case "filters":
                clickWithWait(filtersBtn, 7);
                break;
        }
    }
    /**manger Filter visibility*/
    public void isManageFilterDisplayed(){
        waitForVisibility(manageFilterBtn,10);
        Assert.assertTrue(manageFilterBtn.isDisplayed());
    }

    /** click the manager filter button*/
    public void clickManagerFilter () {
        clickWithWait(manageFilterBtn , 10);
    }

    /** click filter methods*/
    public void clickFilterMethods(){
        clickWithWait(filterMethodsBtn,10);
    }



    //=============================Located Elements============================//

    /** locate menu module and submodule*/
    public static void navigateToModule(String menuName, String subMenuName) { //Fleet - Vehicles
        WebElement menuLocator = Driver.getDriver().findElement(By.xpath("//span[text()[normalize-space() = '" + menuName + "']]"));
        clickWithWait(menuLocator,10);

        WebElement subMenuLocator = Driver.getDriver().findElement(By.xpath("//span[text()[normalize-space() = '" + subMenuName + "']]"));
        clickWithWait(subMenuLocator,10);
    }

    @FindBy (xpath = "//a[@class = 'action btn mode-icon-only pressed']")
    public WebElement filtersBtn;

    @FindBy (xpath = "//a[@class = 'add-filter-button']")
    private WebElement manageFilterBtn;

    public static void manageFilterMenu (String filters) {
        WebElement selectedFilters = Driver.getDriver().findElement(By.xpath("//label[@title = '" + filters +"']"));
        selectedFilters.click();
    }

    @FindBy (css = "div[class = 'btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    private List<WebElement> allFilterOnThePage;

    @FindBy (xpath = "//button[@class = 'btn dropdown-toggle']")
    private WebElement filterMethodsBtn;

    @FindBy (xpath = "//a[@class= 'dropdown-item choice-value']")
    private List<WebElement> allFilterMethods;

    public List<String> getElementText(List<WebElement> list){

        List<String> elementText = new ArrayList<>();
        for (WebElement each : list){
            elementText.add(each.getText());
        }
        return elementText;
    }
    public List<String> getFilterMethods() {
        List<String> actualMethods = getElementText(allFilterMethods);
        return actualMethods;
    }



    }
