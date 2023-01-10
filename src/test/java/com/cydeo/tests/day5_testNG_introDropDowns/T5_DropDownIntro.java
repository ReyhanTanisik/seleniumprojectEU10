package com.cydeo.tests.day5_testNG_introDropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_DropDownIntro {
     WebDriver driver;
     @BeforeMethod
    public void setupMethod(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");


    }


    @Test
    public void simpleDropDownTest(){


        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown= new Select(driver.findElement(By.id("dropdown")));
        WebElement currentlySelectedOption=simpleDropDown.getFirstSelectedOption();
        String actualSimpleDropDownText=currentlySelectedOption.getText();
        System.out.println(actualSimpleDropDownText);
        String expectedSimpleDropDownText="Please select an option";
        Assert.assertEquals(actualSimpleDropDownText,expectedSimpleDropDownText);

        //Expected: “Please select an option”
        //4. Verify “State selection” default selected value is correct

        Select stateDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String expectedStateDropDownText="Select a State";
        String actualStateDropDownText=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStateDropDownText,expectedStateDropDownText);


        //Expected: “Select a State”


    }
}
