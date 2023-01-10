package com.cydeo.tests.day4_findElement_checkBoxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // providing extra wait time for our driver before it throws no such element

        driver.get("https://practice.cydeo.com/abtest");

        // locate all the links in the page


        List<WebElement>  allLinks = driver.findElements(By.tagName("a"));

        // print out the number of the links on the page
        System.out.println("allLinks.size() = " + allLinks.size());


        // print out the texts of the links

        for (WebElement each : allLinks){
            System.out.println("Text of link: " + each.getText());

            System.out.println("Href Values : "+ each.getAttribute("href"));
        }

        // print out all href attributes values of each link





    }



}
