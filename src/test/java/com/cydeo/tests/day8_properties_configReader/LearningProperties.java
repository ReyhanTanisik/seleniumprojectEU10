package com.cydeo.tests.day8_properties_configReader;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test
    public void java_properties_reading_test(){
        //you pass the key it returns you the value
        //key=value
        //os.name= MAC OS X
        //user.name=reyhan
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));


    }
}
