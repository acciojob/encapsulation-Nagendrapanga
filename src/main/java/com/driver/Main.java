package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String [] args){
        RWOnly obj = new RWOnly();

        //obj.name = "Nagendra"
        //'name' has private access in 'com.driver.RWOnly'
        obj.setName("rouch");
        System.out.println(obj.getName());
    }

}