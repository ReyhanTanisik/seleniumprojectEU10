package com.cydeo.tests.day11_actions_jsExecutor_practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class task7_scroll_jsExecutor {
    @Test
    public void task7_scroll_test(){

       //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large

        Driver.getDriver().get("https://practice.cydeo.com/large");
        WebElement cydeoLink= Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homelink= Driver.getDriver().findElement(By.linkText("Home"));


        JavascriptExecutor js=(JavascriptExecutor)  Driver.getDriver();
        //3- Scroll down to “Cydeo” link

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
        //4- Scroll up to “Home” link

        js.executeScript("arguments[0].scrollIntoView(true)",homelink);
        //5- Use below provided JS method only
        //
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }
}
