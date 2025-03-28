package com.amadeus.page;

import com.amadeus.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseModel{

    WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "userEmail")
    private WebElement userEmail;
    @FindBy( css= "input[id='gender-radio-2']")
    private WebElement genderOption;
    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthLabel;
    @FindBy(css = ".react-datepicker__month-select")
    private WebElement getDateOfBirthMonthDropdown;
    @FindBy(css = "option[value='3']")
    private WebElement getDateOfBirthMonthDropdownOption;
    @FindBy(css = ".react-datepicker__year-select")
    private WebElement getDateOfBirthYearDropdown;
    @FindBy(css = "option[value='1996']")
    private WebElement getDateOfBirthYearDropdownOption;
    @FindBy(css = "div[aria-label='Choose Tuesday, April 2nd, 1996']")
    private WebElement getDateOfBirthDayDateOption;
    @FindBy(id = "submit")
    private WebElement submitButton;


    public MainPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void clickfirstName() {
        clickFunction(firstName);
    }

    public void clicklastName(){
        clickFunction(lastName);
    }
    public void clickuserEmail(){
        clickFunction(userEmail);
    }
    public void clickgenderOption(){
        clickFunction(genderOption);
    }
    public void clickdateOfBirthLabel(){
        clickFunction(dateOfBirthLabel);
    }
    public void clickgetDateOfBirthMonthDropdown(){
        clickFunction(getDateOfBirthMonthDropdown);
    }
    public void clickgetDateOfBirthMonthDropdownOption(){
        clickFunction(getDateOfBirthMonthDropdownOption);
    }
    public void clickgetDateOfBirthYearDropdown(){
        clickFunction(getDateOfBirthYearDropdown);
    }
    public void clickgetDateOfBirthYearDropdownOption(){
        clickFunction(getDateOfBirthYearDropdownOption);
    }
    public void clickgetDateOfBirthDayDateOption(){
        clickFunction(getDateOfBirthDayDateOption);
    }
    public void clicksubmitButton(){
        clickFunction(submitButton);
    }

}
