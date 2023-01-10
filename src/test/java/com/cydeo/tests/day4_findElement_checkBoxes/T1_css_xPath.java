package com.cydeo.tests.day4_findElement_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_css_xPath {


    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        // locate all web elements
        // locate home link use only xpath or css selector

        WebElement homeLink1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2= driver.findElement(By.cssSelector("a.nav-link"));

        // forgot password header , locate parent element and move down to h2

        WebElement forgotPasswordHeader1= driver.findElement(By.cssSelector("div.example>h2"));

        //locate with xpath

        WebElement forgotPassword2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // locate e-mail text
        WebElement eMailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        // locate input box
         WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));


          // retrieve password button
        WebElement retrievePasswordButton=driver.findElement(By.xpath("//button[@id='form_submit']"));
        //button[@type='submit']
        //button[@class='radius']


        // powered by cydeo text

        WebElement poweredByCydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //verify all web elements  are displayed

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());

        System.out.println("forgotPasswordHeader1.isDisplayed() = " + forgotPasswordHeader1.isDisplayed());

        System.out.println("eMailLabel.isDisplayed() = " + eMailLabel.isDisplayed());

        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
    }
}
