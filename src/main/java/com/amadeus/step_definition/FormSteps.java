package com.amadeus.step_definition;

import com.amadeus.page.MainPage;
import com.amadeus.page.PracticeFormPage;
import com.amadeus.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;

import java.util.concurrent.TimeUnit;
public class FormSteps {
    WebDriver driver;
    MainPage MainPage = new MainPage();
    PracticeFormPage PracticeFormPage = new PracticeFormPage();

    @Given("Go to Practice Form Page")
    public void goToPracticeFormPage() throws InterruptedException {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
    @Given("Fill the First Name {string}")
    public void filltheFirstName(String firstname){
        MainPage.clickfirstName();
        MainPage.sendKeysFunction(firstName,firstname);
    }
    @Given("Fill the Last Name {string}")
    public void filltheLastName(String lastname){
        MainPage.clicklastName();
        MainPage.sendKeysFunction(lastName,lastname);
    }
    @Given("Fill the Email {string}")
    public void filltheEmail(String email){
        MainPage.clickuserEmail();
        MainPage.sendKeysFunction(Email,email);
    }
    @Given("Select Gender")
    public void selectGender(){
        MainPage.clickgenderOption();
    }
    @Given("Select Date of Birth")
    public void selectDateofBirth(){
        MainPage.clickdateOfBirthLabel();
        MainPage.clickgetDateOfBirthMonthDropdown();
        MainPage.clickgetDateOfBirthMonthDropdownOption();
        MainPage.clickgetDateOfBirthYearDropdown();
        MainPage.clickgetDateOfBirthYearDropdownOption();
        MainPage.clickgetDateOfBirthDayDateOption();
    }
    @When("Click Submit Button")
    public void clickSubmitButton(){
        MainPage.clicksubmitButton();
    }
    @Then("Verify Submit")
    public void verifySubmit() {
        Assert.isTrue(PracticeFormPage.isResultSubmit(),"Thanks for submitting the form");
    }
    @After
    public void driverQuit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.quitDriver();
    }
}
