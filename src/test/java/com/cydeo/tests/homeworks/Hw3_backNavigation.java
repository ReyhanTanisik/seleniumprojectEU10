package com.cydeo.tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_backNavigation {


    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //  Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //  Expected: Google


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement gmailZone= driver.findElement(By.className("gb_j"));
        gmailZone.click();


        String actualInTitle= driver.getTitle();
        String expectedInTitle="Gmail";

        if (actualInTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAİLED");
        }


        driver.navigate().back();

        Thread.sleep(1000);
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle="Google";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAİLED");
        }

    }
}
