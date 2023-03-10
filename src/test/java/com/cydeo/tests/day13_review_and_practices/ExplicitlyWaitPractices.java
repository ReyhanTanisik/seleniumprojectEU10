package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitlyWaitPractices {

    DynamicControlsPage dynamicControlsPage;
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage=new DynamicControlsPage();
    }
    @Test
    public void remove_button_test(){

        //3- Click to “Remove” button


        dynamicControlsPage.removeButton.click();


        //4- Wait until “loading bar disappears”
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        //5- Verify:
        //a. Checkbox is not displayed
        try {

            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());

            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch(NoSuchElementException n){
            Assert.assertTrue(true);
        }
        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
        //
    }

    @Test
    public void enable_button_test(){
        //3- Click to “Enable” button
        //4- Wait until “loading bar disappears”
        //5- Verify:
        //a. Input box is enabled.
        //b. “It’s enabled!” message is displayed.
        //
    }
}
