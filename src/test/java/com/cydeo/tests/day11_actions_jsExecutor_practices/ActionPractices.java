package com.cydeo.tests.day11_actions_jsExecutor_practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task4_and_test(){
       //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/

        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”

        // create object of actions and pass our " driver" instance
        Actions actions=new Actions(Driver.getDriver());


        // locating cydeo libk to be able to pass in the actions method
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));


        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();

        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button


        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();


    }
}
