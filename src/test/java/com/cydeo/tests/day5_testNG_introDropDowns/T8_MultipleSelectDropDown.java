package com.cydeo.tests.day5_testNG_introDropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_MultipleSelectDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void multipleSelectDropDown(){
        //3. Select all the options from multiple select dropdown.
        Select multipleSelectDropDown= new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> options = multipleSelectDropDown.getOptions();  // we store here all options

        //4. Print out all selected values.
        for (WebElement each:options) {
            each.click();
            System.out.println( each.getText()+" is selected: "+ each.isSelected());

        }


        //5. Deselect all values.
        multipleSelectDropDown.deselectAll();



    }




}
