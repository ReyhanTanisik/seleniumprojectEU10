package com.cydeo.tests.day8_properties_configReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties() throws IOException {
        //1- Create the object of properties

        Properties properties= new Properties();

        //2- we need to open the file in the java memory :FileInputStream

        FileInputStream file=new FileInputStream("configuration.properties");

        //3- load the properties object using FileInputStream object

        properties.load(file);


        // 4- USE " Properties object to read value

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }
}
