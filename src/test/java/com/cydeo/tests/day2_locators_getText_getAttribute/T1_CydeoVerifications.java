package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        // verify url contains expected : cydeo

        String expectedUrl="cydeo";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification failed");
        }


        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAİLED");
        }

        driver.close();




    }


}
