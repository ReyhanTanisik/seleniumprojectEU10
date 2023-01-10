package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    this method will accept int ( in seconds) and execute thread.sleep for giving
    duration.
     */

    public static void sleep(int second){
        second *=1000;
        try{
            Thread.sleep(second);

        }catch( InterruptedException e){

        }
    }


    public static void switchWindowAndVerify(WebDriver driver ,String expectedInUrl, String expectedInTitle){
        Set<String > allWindowsHandles=driver.getWindowHandles();// we store here

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);

            System.out.println("Current Url: " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }



        }

        String actualTitle= driver.getTitle();


        Assert.assertTrue(actualTitle.contains(expectedInTitle));




    }

    /*
    this method accepts a string "expectedTitle " and asserts if it is true
     */

    public static void verifyTitle(WebDriver driver , String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);


    }


}
