package com.cydeo.tests.day6_alerts_iFrames_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;


    @BeforeMethod
    public void setUpMethod() {

        //1. Open browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website:
        driver.get("https://practice.cydeo.com/iframe");

    }
    @Test
    public void iframe_test(){

        // We need to switch driver's focus to iframe
        driver.switchTo().frame("mce_0_ifr");

        // locate the p tag
        WebElement yourContentGoesHereText= driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify "An iframe containing the tinyMCE ...editor

        // to be to verify the header we must  switch back to  "main html"

        driver.switchTo().parentFrame();

        WebElement headerText=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }
}
