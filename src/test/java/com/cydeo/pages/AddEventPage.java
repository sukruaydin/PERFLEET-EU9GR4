package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AddEventPage extends GeneralInfoPage{

    Faker faker = new Faker();
    public String bothify;

    @FindBy(name = "oro_calendar_event_form[title]")
    public WebElement title;

    @FindBy(name = "oro_calendar_event_form[organizerDisplayName]")
    public WebElement orgDisplayName;

    @FindBy(name = "oro_calendar_event_form[organizerEmail]")
    public WebElement orgEmail;



    @FindBy(xpath = "//input[contains(@name,'date_selector_oro_calendar_event_form_start')]")
    public WebElement startDateButton;

    @FindBy(xpath = "//a[.='26']")
    public WebElement startSelect26;

    @FindBy(xpath = "//input[contains(@name,'time_selector_oro_calendar_event_form_start')]")
    public WebElement startTimeButton;

    @FindBy(xpath = "//li[contains(text(),'2:30')]")
    public WebElement startSelect2_30;

    @FindBy(xpath = "//span[@title='#FBD75B']")
    public WebElement yellowColor;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;

    @FindBy(name = "oro_calendar_event_form[allDay]")
    public WebElement allDayEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeat;

    @FindBy(xpath = "//select[@data-name='recurrence-repeats']")
    public WebElement repeatsDropdown;

    @FindBy(xpath = "//span[contains(text(),'every 1')]")
    public WebElement summary;

    @FindBy(xpath = "//span[.='Never']")
    public WebElement never;

    @FindBy(xpath = "//span[.='After']")
    public WebElement after;

    @FindBy(xpath = "//span[.='By']")
    public WebElement by;

    //-----------------------------------

    @FindBy(xpath = "//a[@class = 'btn icons-holder-text no-hash']")
    public WebElement addEventBtn;

    @FindBy(xpath = "//span[. = 'General Information']")
    public WebElement GenInfoTitle;

    @FindBy(xpath = "//span[@id='ui-id-6']")
    public WebElement addEventTitle;

    @FindBy(xpath = "//input[@id = 'oro_calendar_event_form_title-uid-63826fcd978c2']")
    public WebElement popUpTitle;

    @FindBy(xpath = "(//label[@class = 'required'])[2]")
    public WebElement popUpOwner;

    @FindBy(xpath = "(//label[@class = 'required'])[3]")
    public WebElement popUpOrganizer;

    @FindBy(xpath = "(//label[@class = 'required'])[4]")
    public WebElement popUpOrganizerEmail;

    @FindBy(xpath = "(//label[@class = 'required'])[5]")
    public WebElement popUpStartDate;

    @FindBy(xpath = "(//label[@class = 'required'])[6]")
    public WebElement popUpEndDate;

    @FindBy(xpath = "//span[@class = 'ui-button-icon-space']")
    public WebElement popUpCloseBtn;



    public void fillOutCompulsoryAreas(){
        BrowserUtils.sleep(1);
        bothify = faker.bothify("Meeting##");
        title.sendKeys(bothify);
        BrowserUtils.sleep(1);
        orgDisplayName.sendKeys(faker.name().firstName());
        BrowserUtils.sleep(1);
        orgEmail.sendKeys(faker.internet().emailAddress());

        BrowserUtils.sleep(1);
        startDateButton.click();
        BrowserUtils.sleep(1);
        startSelect26.click();
        BrowserUtils.sleep(1);
        startTimeButton.click();
        BrowserUtils.sleep(1);
        startSelect2_30.click();
    }

    public void fillNotOutCompulsoryAreas1(){

        addEventBtn.click();

        BrowserUtils.sleep(1);
        bothify = faker.bothify("Meeting##");
         //  title.sendKeys(bothify);
        BrowserUtils.sleep(1);
        orgDisplayName.sendKeys(faker.name().firstName());
        BrowserUtils.sleep(1);
        orgEmail.sendKeys(faker.internet().emailAddress());

        BrowserUtils.sleep(1);
        startDateButton.click();
        BrowserUtils.sleep(1);
        startSelect26.click();
        BrowserUtils.sleep(1);
        startTimeButton.click();
        BrowserUtils.sleep(1);
        startSelect2_30.click();

//        BrowserUtils.sleep(2);
//        saveButton.click();

        BrowserUtils.sleep(3);
      //  popUpCloseBtn.click();

       }

    public void fillNotOutCompulsoryAreas2(){

        addEventBtn.click();


        BrowserUtils.sleep(1);
        bothify = faker.bothify("Meeting##");
        title.sendKeys(bothify);
        BrowserUtils.sleep(1);
        // orgDisplayName.sendKeys(faker.name().firstName());
        BrowserUtils.sleep(1);
        orgEmail.sendKeys(faker.internet().emailAddress());

        BrowserUtils.sleep(1);
        startDateButton.click();
        BrowserUtils.sleep(1);
        startSelect26.click();
        BrowserUtils.sleep(1);
        startTimeButton.click();
        BrowserUtils.sleep(1);
        startSelect2_30.click();

 //       BrowserUtils.sleep(2);
 //       saveButton.click();

        BrowserUtils.sleep(3);
//        popUpCloseBtn.click();

    }

    public void fillNotOutCompulsoryAreas3(){

        addEventBtn.click();


        BrowserUtils.sleep(1);
        bothify = faker.bothify("Meeting##");
        title.sendKeys(bothify);
        BrowserUtils.sleep(1);
        orgDisplayName.sendKeys(faker.name().firstName());
        BrowserUtils.sleep(1);
       // orgEmail.sendKeys(faker.internet().emailAddress());

        BrowserUtils.sleep(1);
        startDateButton.click();
        BrowserUtils.sleep(1);
        startSelect26.click();
        BrowserUtils.sleep(1);
        startTimeButton.click();
        BrowserUtils.sleep(1);
        startSelect2_30.click();

  //     BrowserUtils.sleep(2);
 //      saveButton.click();

       BrowserUtils.sleep(3);
 //      popUpCloseBtn.click();
    }

    public boolean isMeetingExist(){
        System.out.println("bothify = " + bothify);
        WebElement element = Driver.getDriver().findElement(By.xpath("//strong[.='"+bothify+"']"));
        return element.isDisplayed();
    }

    public List<String> optionsOfRepeats(){
        List<String> list = new ArrayList<>();

        Select select = new Select(repeatsDropdown);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            list.add(option.getText());
        }

        return list;
    }


}
