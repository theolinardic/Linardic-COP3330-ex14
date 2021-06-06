/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 14 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex14;
import java.util.Scanner;

public class ex14 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print( "What is the order amount? " );
        double orderAmount = userInputScanner.nextDouble();
        System.out.print("What is the state? ");
        String state = userInputScanner.next();
        double subtotal = orderAmount;
        double tax = 0;
        if(state.equals("WI")){
            tax = (subtotal * 0.055);
            subtotal = subtotal + tax;
        }
        String finalSubtotal = String.format("$%.2f", subtotal);
        String finalTax = String.format("$%.2f", tax);
        String finalOrderAmount = String.format("$%.2f", orderAmount);

        System.out.println("The subtotal is " +finalOrderAmount+ ".\nThe tax is " + finalTax + ".\nThe total is " + finalSubtotal + ".");

    }
}
