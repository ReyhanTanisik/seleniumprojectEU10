package com.cydeo.tests.day8_properties_configReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_OrderVerify {
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }



    @Test
    public void order_name_verify_test(){

        // locate the cell that contains  bob martin text in it
        WebElement bobMartinCell=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        //2. Verify Bob’s name is listed as expected.
        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());
        String expectedBobName= "Bob Martin";
        String actualBobName=bobMartinCell.getText();
        Assert.assertEquals(expectedBobName,actualBobName);


        //Expected: “Bob Martin”
        //3. Verify Bob Martin’s order date is as expected

        WebElement BobMartinOrderDateCell= driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedDate="12/31/2021";
        String actualDate=BobMartinOrderDateCell.getText();
        Assert.assertEquals(expectedDate,actualDate);
        //Expected: 12/31/2021

    }

    @Test
    public void order_name_verify_test2(){
       String customerOrderDate1= WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);


    }

    @Test

    public void test3(){
        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");

    }

}
