/*
 Program takes user input for principal, annual interest rate, and number of periods (in years)
  and returns the simple interest
  Authors: Lucas Goudreault, Lauren Nadolny, Joseph DeMarco
*/

// default package structure of IntelliJ IDE (organizes classes and prevents name-clashes for larger projects)
package com.company;

// import Scanner class
import java.util.Scanner;

// create top-level class
public class SimpleInterest {

    // define main method
    public static void main(String[] args) {

        // greet user and state program function
        System.out.println("Hello. I would like to help you calculate simple interest.");

        // initialize Scanner input method
        Scanner input = new Scanner(System.in);

        // prompt user to input principal, interest rate, and time values - assign to variables p, r, and t, respectively
        System.out.println("What is the principal amount in US$?");
        double p = input.nextDouble();

        System.out.println("What is the annual interest rate, shown as a decimal?");
        double r = input.nextDouble();

        System.out.println("What is the length of time in years the money will borrowed?");
        double t = input.nextDouble();

        // calculate simple interest and assign value to variable simpleInterest
        double simpleInterest = p * r * t;

        // display interest to be paid formatted to 2 decimal points with comma separators
        System.out.printf("The interest amount is US$%,.2f", simpleInterest);
    }

}
