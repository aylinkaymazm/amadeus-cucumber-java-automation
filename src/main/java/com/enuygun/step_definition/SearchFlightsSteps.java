package com.enuygun.step_definition;

import com.enuygun.page.FlightListingPage;
import com.enuygun.page.FlightTicketPage;
import com.enuygun.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;

import java.util.concurrent.TimeUnit;

public class SearchFlightsSteps {

    WebDriver driver;
    FlightTicketPage flightTicketPage = new FlightTicketPage();
    FlightListingPage flightListingPage = new FlightListingPage();

    @Given("Go to Enuygun Flight Ticket Selection Page")
    public void goToEnuygunFlightTicketSelectionPage() throws InterruptedException {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.enuygun.com/ucak-bileti");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @Given("Choose from which point to board the plane {string} to {string}")
    public void chooseFromRoundTripToBoardThePlane(String location1, String location2) {
        flightTicketPage.clickDepartureFlightPoint();
        flightTicketPage.clickFirstPopularCity();
    }

    @Given("Select departure date {string}")
    public void selectDepartureDate(){
        flightTicketPage.clickDestinationDate();
        flightTicketPage.pickDepartureDateValue();
    }

    @When("Click on find tickets")
    public void clickOnFindTickets() {
        flightTicketPage.clickOnFindTicket();
    }

    @When("Click on find THY tickets")
    public void clickOnFindTHYTickets() {
        flightTicketPage.clickOnFindTicket();
    }

    @Then("Verify page listing roundtrip flight tickets 10:00 and 18:00.")
    public void verifyPageListingRoundTripFlightTickets() throws InterruptedException {
        Thread.sleep(3000);
        Assert.isTrue(flightListingPage.isSearchResultDepartureOnlyExist(), "Search results not listed.");
    }

    @And("Select return date {string}")
    public void selectReturnDate() {
        flightTicketPage.clickReturnDate();
        flightTicketPage.pickReturnDateValue();
    }

    @Then("Verify page ascending order THY listing return flight tickets")
    public void verifyPageListingReturnFlightTickets() {
        Assert.isTrue(flightListingPage.isSearchResultReturnExist(),"Return flights cannot be listed.");
    }

    @After
    public void driverQuit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.quitDriver();
    }
}
