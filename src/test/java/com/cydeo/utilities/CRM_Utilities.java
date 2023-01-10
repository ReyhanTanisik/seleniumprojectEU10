package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    /*
    this method will login with helpdesk1 user when it's called
     */

    public static void crm_login(WebDriver driver){
        WebElement usernameBox= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameBox.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password

        WebElement passwordBox=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");
        //5. Click to `Log In` button

        WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

}
