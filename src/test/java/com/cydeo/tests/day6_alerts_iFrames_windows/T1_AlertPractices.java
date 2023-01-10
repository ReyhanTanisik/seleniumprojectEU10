package com.cydeo.tests.day6_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        //1. Open browser

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");


    }

    @Test
    public void alert_test1(){
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        // to be able to click to alert ok button we need to switch driver's focus to alert itself

        Alert alert=driver.switchTo().alert();

        //4. Click to OK button from the alert

        alert.accept();


        //5. Verify “You successfully clicked an alert” text is displayed.

        WebElement resultText= driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed");

        String expectedText= "You successfully clicked an alert";
        String actualText=resultText.getText();
        Assert.assertEquals(expectedText,actualText);


    }

    @Test
    public void alert_test2(){

        //3. Click to “Click for JS Confirm” button

        WebElement JsConfirmButton= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        JsConfirmButton.click();
        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText2= driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText2.isDisplayed(),"Result text is not displayed");

        String expectedText= "You clicked: Ok";
        String actualText=resultText2.getText();
        Assert.assertEquals(expectedText,actualText);
    }
}
