package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // go to the page
        driver.get("https://login1.nextbasecrm.com/");

        // remember me label  text  is as expected

        WebElement rememberMeLabel= driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel= "Remember me on this computer";
        String actualRememberMeLabel= rememberMeLabel.getText();


        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else{
            System.out.println("Label verification FAİLED!");
        }
     // Forgot your password link text is as expected

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));


        String actualForgotPasswordLink= forgotPasswordLink.getText();
        String expectedForgotPasswordLink="FORGOT YOUR PASSWORD?";

        if (actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("Forgot password link verification PASSED!");
        }else{
            System.out.println("Forgot password link verification FAİLED!");
        }


        // Forgot password href attribute 's value contains expected

        String expectedInHref="forgot_password=yes";
        String actualHrefAttributeValue= forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAİLED!");
        }


    }
}
