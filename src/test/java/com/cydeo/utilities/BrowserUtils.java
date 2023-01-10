package com.cydeo.utilities;

public class BrowserUtils {

    /*
    this method will accept int ( in seconds) and execute thread.sleep for giving
    duration.
     */

    public static void sleep(int second){
        second *=1000;
        try{
            Thread.sleep(second);

        }catch( InterruptedException e){

        }
    }




}
