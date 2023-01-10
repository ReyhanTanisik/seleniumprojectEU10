package com.cydeo.tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw5_FacebookTitle {

    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook - log in or sign up";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAİLED");
        }




    }
}
