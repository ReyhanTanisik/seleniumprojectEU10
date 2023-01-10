package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {


    public static void main(String[] args) {

        // set up google driver
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // go to the given page
        driver.get("https://login1.nextbasecrm.com/");


        // Enter incorrect username

        WebElement inputUsername=driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect"+ Keys.ENTER);


        // enter incorrect password
        // to auto generate local variable  mac : option +enter
        WebElement inputPassword= driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect"+Keys.ENTER);


        //click login button

        WebElement loginButton=driver.findElement(By.className("login-btn"));
        loginButton.click();


        //error message
         WebElement errorMessage=driver.findElement(By.className("errortext"));

         String expectedErrorMessage= "Incorrect login or password";
         String actualErrorMessage=errorMessage.getText();

         if (actualErrorMessage.equals(expectedErrorMessage)){
             System.out.println("Error message verification PASSED");
         }else{
             System.out.println("Error message verification FAİLED");
         }





    }




}
