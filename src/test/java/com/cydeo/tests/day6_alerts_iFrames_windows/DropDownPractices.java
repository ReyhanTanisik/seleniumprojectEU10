package com.cydeo.tests.day6_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_task5(){
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown


          // we located the dropdown and it 's ready for use


        Select stateDropDown= new Select(driver.findElement(By.id("state")));

        //3. Select Illinois

        stateDropDown.selectByVisibleText("Illinois");


        //4. Select Virginia

        stateDropDown.selectByValue("VA");
        //5. Select California

        stateDropDown.selectByIndex(5);
        //6. Verify final selected option is California.

        String expectedOptionText="California";
        String actualOptionText=stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);
        //Use all Select options. (visible text, value, index)

    }

    @Test
    public void dropdownTask6(){
        //Select “December 1st, 1923” and verify it is selected.

        Select yearDropDown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropDown=new Select(driver.findElement(By.xpath("//select[@id='day']")));




        //Select year using  : visible text
        yearDropDown.selectByVisibleText("1924");
        //Select month using   : value attribute
        monthDropDown.selectByValue("11");
        //Select day using : index number
        dayDropDown.selectByIndex(0);

        // creating expected values

        String expectedYear="1924";
        String expectedMonth="December";
        String expectedDay="1";

        // getting actual values from browsers

        String actualYear=yearDropDown.getFirstSelectedOption().getText();
        String actualMonth= monthDropDown.getFirstSelectedOption().getText();
        String actualDay=dayDropDown.getFirstSelectedOption().getText();

        //create assertions

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));



    }


}
