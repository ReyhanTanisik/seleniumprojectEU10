package com.cydeo.tests.day11_actions_jsExecutor_practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_and_drop_test() {


        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //locate " accept cookies " button and click
        WebElement acceptCookiesButton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();


        //locate small and big circles to be abşe to drag them around

        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.

        Actions actions =new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();




        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        String actualBigCircleText= bigCircle.getText();
        String expectedBigCircleText="You did great!";

        Assert.assertEquals(actualBigCircleText,expectedBigCircleText);
        //
    }
}
