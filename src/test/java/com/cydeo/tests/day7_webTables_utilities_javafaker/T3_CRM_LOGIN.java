package com.cydeo.tests.day7_webTables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {




    @Test
    public void crm_login_test(){
        //1. Create new test and make setups
        //2. Go to : http://login1.nextbasecrm.com/

        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement usernameBox= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameBox.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password

        WebElement passwordBox=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");
        //5. Click to `Log In` button

        WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"My tasks");
    }


    @Test
    public void crm_login_test2(){
        //1. Create new test and make setups
        //2. Go to : http://login1.nextbasecrm.com/

        driver.get("http://login1.nextbasecrm.com/");

        //calling my utility method to login helpdesk


        CRM_Utilities.crm_login(driver);
        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"My tasks");
    }


    @Test
    public void crm_login_test3(){
        //1. Create new test and make setups
        //2. Go to : http://login1.nextbasecrm.com/

        driver.get("http://login1.nextbasecrm.com/");

        //calling my utility method to login helpdesk


        CRM_Utilities.crm_login(driver,"Helpdesk2@cybertekschool.com","UserUser");
        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"(1) Portal");
    }
}
