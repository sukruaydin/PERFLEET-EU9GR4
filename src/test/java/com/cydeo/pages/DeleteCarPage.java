package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCarPage extends BasePage {

    public DeleteCarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement fleetDropDown;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesDropdown;


    @FindBy (xpath = "//table/tbody/tr/td[21]")
    public WebElement ThreeDotAtTheEndRightOfRow;

    @FindBy(xpath = "//table/tbody/tr/td[20]/div/div/ul")
    public WebElement ThreeDotOnUserPage;

    @FindBy (xpath = "//li[@class='launcher-item']//*[@title='Delete']")
    public WebElement deleteIcon;

    @FindBy(xpath = "//div[@class='modal-header']")
    public WebElement confirmationPopup;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement warningMessage;

    @FindBy(xpath = "//div[@class=\"flash-messages-holder\"]")
    public WebElement ItemDeletedMessage;

    @FindBy(xpath = "//a[@class=\"btn ok btn-danger\"]")
    public WebElement YesDeleteBTN;
}
