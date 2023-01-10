package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {


    public static void main(String[] args) throws InterruptedException {
        // 1- set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2-Create instance of the driver
        // this line is opening an empty browser

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3- Go to tesla

        driver.get("https://www.tesla.com");
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // stop code execution for 3 seconds


        // use selenium to navigate back

        driver.navigate().back();

        // use selenium to navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);

        // use selenium to refresh

        driver.navigate().refresh();

        // use navigate().to() method

        driver.navigate().to("https://google.com");
        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // get current url
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

       // close the current window
        driver.close();

       // close all opened window

        driver.quit();
    }

}
