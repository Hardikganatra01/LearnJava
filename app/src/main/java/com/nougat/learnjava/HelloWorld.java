package com.nougat.learnjava;

/**
 * Created by Bhavya Thacker on 26-01-2017.
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My first Java program");

        String tim;
        tim = "Tim Buchalka";
        System.out.println(tim);

        int timWeeklySalary = 32;
        int timsMonthlySalary = timWeeklySalary * 4;
        System.out.println("Weekly salary: " + timWeeklySalary);
        System.out.println("Monthly salary: " + timsMonthlySalary);

        int apples = 6;
        int oranges = 5;
        int fruit = apples - oranges;
        System.out.println("I have " + fruit + " fruit");

        int weeks = 130;
        double years = weeks / 52.0;
        System.out.println(weeks + " weeks is " + years + " years");

        System.out.println("Hello, " + tim + " here");
    }
}
