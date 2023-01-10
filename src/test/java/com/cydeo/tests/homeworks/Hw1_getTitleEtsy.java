package com.cydeo.tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1_getTitleEtsy {


    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        //3. Search for “wooden spoon”
        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        WebElement etsySearchBox= driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedTitle="Wooden spoon - Etsy";
        String actualTitle= driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAİLED");
        }




    }
}
