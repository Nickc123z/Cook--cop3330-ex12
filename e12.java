/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {

        double p = 0.0;
        double r = 0.0;
        double t = 0.0;
        double A = 0.0;
        int y = 0;
        int simple = 0;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        p = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        r = in.nextDouble();

        System.out.print("Enter the number of years: ");
        t = in.nextDouble();

        A = p*(1 +(r*t)/100);
        y=(int)t;
        simple = (int)A;

        System.out.println("After "+y+" years at "+r+"%, the investment will be worth $"+simple+".");

    }
}
