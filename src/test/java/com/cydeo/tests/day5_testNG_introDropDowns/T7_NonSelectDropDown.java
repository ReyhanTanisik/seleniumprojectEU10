package com.cydeo.tests.day5_testNG_introDropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_NonSelectDropDown {
    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");



    }

     @Test
             public void nonSelectDropDownTask() throws InterruptedException {
         WebElement clickDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
         clickDropdown.click();
         Thread.sleep(1000);
         WebElement facebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
         facebook.click();


         //5. Verify title is “Facebook - Log In or Sign Up”
         String expectedTitle = "Facebook - Log In or Sign Up";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(expectedTitle,actualTitle,"Title verification failed");
     }

     @AfterMethod
    public void tearDown(){
        driver.quit();
     }


}
