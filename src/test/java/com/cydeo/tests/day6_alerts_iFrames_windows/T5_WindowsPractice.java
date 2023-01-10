package com.cydeo.tests.day6_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        //1. Open browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/windows");


    }

    @Test
    public void multiple_window_test(){
        //Storing the main page's window handle as string is
        // good practice for reusable purposes
        String mainHandle= driver.getWindowHandle();

        System.out.println(mainHandle);

        // assert title is "Windows"
        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        // Click to: “Click Here” link
        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        // Switch to new Window.
        for (String each : driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows "+driver.getTitle());

        }

        // Assert: Title is “New Window”
        String expectedTitleAfterClick="New Window";
        actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitleAfterClick);
        System.out.println("Title after click "+actualTitle);


    }
}