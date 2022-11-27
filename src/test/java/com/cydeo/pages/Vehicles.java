package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Vehicles extends BasePage {
    public final int randomId = 4;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "//a[@class='add-filter-button'] ")
    public WebElement manageFilter;

    @FindBy(xpath = "//a[@title='Reset'] ")
    public WebElement resetIcon;

    @FindBy(xpath = "//input[contains(@id,'option-" + randomId + "')]")
    public WebElement manageFilterChoice;

    @FindBy(xpath = "//input[contains(@id,'option-" + randomId + "')]/following-sibling::span")
    public WebElement manageFilterChoiceWithName;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement manageFilterSearchBox;

    @FindAll({@FindBy(xpath = "//span[@class='filter-items']//div[@style='display: inline-block;']")})
    public List<WebElement> sizeOfElement;

    @FindBy(xpath = "//label[contains(.,'Total')]")
    public WebElement totalNumber;
    @FindBy(xpath = "(//a[@href='/' and @title='Fleet Management'])[2]")
    public WebElement appTitle;
    public void goTo(String tab1, String tab2) {
        // fleet - vehicles
        String tabName = "//span[contains(text(),'" + tab1 + "') and @class='title title-level-1']";
        String tabChildName = "//span[@class='title title-level-2' and contains(text(),'" + tab2 + "')]";

        WebElement element1;
        element1= Driver.getDriver().findElement(By.xpath(tabName));
        BrowserUtils.explicitlyWait().until(ExpectedConditions.elementToBeClickable(element1));
        new Actions(Driver.getDriver()).moveToElement(element1).pause(1500).click().perform();


        WebElement element2;
        element2= Driver.getDriver().findElement(By.xpath(tabChildName));
        BrowserUtils.explicitlyWait().until(ExpectedConditions.elementToBeClickable(element2));
        element2.click();
        BrowserUtils.sleep(3);
    }
}
