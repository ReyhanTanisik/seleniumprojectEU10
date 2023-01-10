package com.cydeo.tests.day4_findElement_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        // we have to locate checkboxes

        WebElement checkbox1= driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));

        // confirm check box 1 is not selected by default
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        // confirm  check box 2 is selected by default
        System.out.println("checkbox2.isSelected(),expecting true = " + checkbox2.isSelected());

        // click check box 1 to select it
        Thread.sleep(2000);
        checkbox1.click();

        // click check box 2 to deselect it

        Thread.sleep(2000);
        checkbox2.click();


        // CONFİRM check box 1 is  selected
        System.out.println("checkbox1.isSelected() ,expecting true= " + checkbox1.isSelected());

        // confirm check box 2 is unselected
        System.out.println("checkbox2.isSelected() ,expecting false= " + checkbox2.isSelected());

    }
}
