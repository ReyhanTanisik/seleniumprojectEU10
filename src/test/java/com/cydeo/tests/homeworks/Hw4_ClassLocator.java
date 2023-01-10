package com.cydeo.tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4_ClassLocator {
    public static void main(String[] args) {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        //3- Click to “Home” link
        //4- Verify title is as expected:
        //Expected: Practice
        // PS: Locate “Home” link using “className” locator

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");
        WebElement homeLink= driver.findElement(By.className("nav-link"));
        homeLink.click();
        String actualTitle= driver.getTitle();
        String expectedTitle="Practice";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAİLED");
        }


    }
}
