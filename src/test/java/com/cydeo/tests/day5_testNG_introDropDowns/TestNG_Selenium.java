package com.cydeo.tests.day5_testNG_introDropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){

         driver= WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod

    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void selenium_test(){

        // do browser driver setup
        // open browser



        // maximize the page

        // implicit wait

        // get https://google.com

        driver.get("https://google.com");
        // Assert : title is google

        Assert.assertEquals(driver.getTitle(),"Google","Title is not matching here.");


    }
}
