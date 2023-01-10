package com.cydeo.tests.day5_testNG_introDropDowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpMethode(){
        System.out.println("-------Before class is running-----");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-------After class is running------");
    }


    @BeforeMethod // before each test before method is executed one time
    public void setUpMethod(){
        System.out.println("-----Before Method is running ------");


    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("-------After method is running -------");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 is running");

        String actual="apple";
        String expected="apple2";
        Assert.assertEquals( actual, expected);



    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running");

        String actual="apple";
        String expected="apple";
        Assert.assertTrue(actual.equals(expected));


    }

}
