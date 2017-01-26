package com.nougat.learnjava;

/**
 * Created by Bhavya Thacker on 26-01-2017.
 */

public class Demo {

    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName());
        tim.setHandleName("Tim");
        System.out.println(tim.getHandleName());

    }
}
