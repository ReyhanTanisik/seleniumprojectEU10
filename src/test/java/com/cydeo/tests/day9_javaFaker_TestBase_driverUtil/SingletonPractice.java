package com.cydeo.tests.day9_javaFaker_TestBase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test( priority = 2)
    public void singleton_understand_test1(){
        String str1= Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2= Singleton.getWord();
        System.out.println("str2 = " + str1);


        String str3= Singleton.getWord();
        System.out.println("str3 = " + str1);
    }

    @Test(priority =1 )
    public void singleton_understanding_test2(){
        String str4=Singleton.getWord();
        System.out.println("str4 = " + str4);
    }
}