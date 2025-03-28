package com.amadeus.page;

import com.amadeus.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PracticeFormPage extends BaseModel{

    WebDriver driver;

    public PracticeFormPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    public boolean isResultSubmit(){
        List<WebElement> webElements = driver.findElements(By.cssSelector("#example-modal-sizes-title-lg"));
        return !webElements.isEmpty();
    }
}

