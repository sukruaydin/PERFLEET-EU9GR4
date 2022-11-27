package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GridSettings extends Vehicles{

    public GridSettings(){

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsButton;

    @FindBy(xpath = "//input[@data-role='column-manager-search']")
    public WebElement quickSearchInputBox;

    @FindBy(xpath = "//a[@data-role='column-manager-show-all']")
    public WebElement allButton;

    @FindBy(xpath = "//a[@data-role='column-manager-show-selected']")
    public WebElement selectedButton;

    @FindBy(xpath = "//a[@data-role='column-manager-select-all']")
    public WebElement selectAllButton;

    @FindBy(xpath = "//th[@style='width: 163.547px;']/span")
    public WebElement nameElementOnGridSettingsPage;

    @FindBy(xpath = "//th[@style='width: 50.7031px;']/span")
    public WebElement sortElementOnGridSettingsPage;

    @FindBy(xpath = "//th[@style='width: 50.7031px;']/following-sibling::th[1]/span")
    public WebElement showElementOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1764']")
    public WebElement OnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1766']")
    public WebElement tagsOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1765']")
    public WebElement licensePlateOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1767']")
    public WebElement driverOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1768']")
    public WebElement locationOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1769']")
    public WebElement chassisNumberOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1770']")
    public WebElement modelYearOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1771']")
    public WebElement lastOdometerOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1772']")
    public WebElement immatriculationDateOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1773']")
    public WebElement firstContractDateOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1774']")
    public WebElement CatalogValueOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1775']")
    public WebElement seatsNumberOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1776']")
    public WebElement doorsNumberOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1777']")
    public WebElement colorOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1778']")
    public WebElement transmissionOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1779']")
    public WebElement fuelTypeOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1780']")
    public WebElement cO2EmissionsOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1781']")
    public WebElement horsepowerOnGridSettingsPage;


    @FindBy(xpath = "//label[@for='column-c1782']")
    public WebElement horsepowerTaxationOnGridSettingsPage;

    @FindBy(xpath = "//label[@for='column-c1783']")
    public WebElement powerOnGridSettingsPage;




    @FindBy(xpath = "//tr//label")
    public List<WebElement> namesOnGridSettings;

    @FindBy(xpath = "//span[@title='Move column']")
    public List<WebElement> sortOnGridSettings;

    @FindBy(xpath = "//td[@class='visibility-cell']")
    public List<WebElement> showOnGridSettings;





}
