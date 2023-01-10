package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_YahooTitleVerification {


    public static void main(String[] args) {


        // do set up for browser driver
        WebDriverManager.chromedriver().setup();

        // open chrome browser

        WebDriver driver = new ChromeDriver();


        // go to yahoo.com

        driver.get("https://www.yahoo.com");

        // verify title

        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


    }
}
