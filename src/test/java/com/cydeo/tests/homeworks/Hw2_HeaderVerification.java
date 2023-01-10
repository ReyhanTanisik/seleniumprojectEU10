package com.cydeo.tests.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2_HeaderVerification {
    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement headerZone= driver.findElement(By.tagName("h3"));

        String expectedHeaderText="Log in to ZeroBank";
        String actualHeaderText= headerZone.getText();


        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header  text verification  PASSED");
        }else{
            System.out.println("Header text verification  FAİLED");
        }

    }
}
