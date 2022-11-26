package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GeneralInfoPage extends BasePage{

    public GeneralInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.='General']")
    public WebElement GeneralInfoModule;

    @FindBy (xpath = "//a[.='Activity']")
    public WebElement ActivityModule;

    @FindBy (xpath = "//span[.='General Information']")
    public WebElement GeneralInformationPageHeader;

    @FindBy (xpath = "//table/tbody/tr/td[20]")
    public WebElement ThreeDotAtTheWndRightOfRow;

    @FindBy (xpath = "//a[@title='View']")
    public WebElement eyeIcon;

    @FindBy (xpath = "//i[@class='fa-pencil-square-o hide-text']")
    public WebElement EditButtonInGeneralInformationPage;


    @FindBy (xpath = "//a[@title='Delete Car']")
    public WebElement deleteButtonInGeneralInformationPage;

    @FindBy (xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButtonInGeneralInfoPage;


    @FindBy (xpath = "(//tr[@class='grid-row row-click-action'])[1]")
    public WebElement firstRow;


    @FindBy (xpath = "//span[@class='grid-header-cell__label']")
    public  List<WebElement> listOfElementsInVehiclePageRow;

    @FindBy (xpath = "//label[@class='control-label']")
    public  List<WebElement> listOfElementsGeneralInfoPage;

    @FindBy(xpath = "//ul[@class='unstyled options']")
    public WebElement anyRow;

    @FindBy(xpath = "//span[contains(text(),'Fleet') and @class='title title-level-1']")
    public WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

    @FindBy(xpath = "//span[.='Add Event']")
    public WebElement addEventPopUpPage;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancel;






}


