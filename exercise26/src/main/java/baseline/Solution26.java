/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input function to take in input
        -Ask for the balance
        -Ask for APR as a percent
        -Ask for monthly payment rate
    -After all input is grabbed use the calculateMonthsUntilPaidOff function
    in the PaymentCalculator class to determine the output
    -Display the output in the input method
 */
package baseline;

import java.util.Scanner;

public class Solution26 {
    //Where input will be called
    public static void main(String[] args) {
        input();
    }

    //We will take in input then calculate and display the output within this function
    private static void input()
    {
        //This function will utilize the function calculateMonthsUntilPaidOff from the PaymentCalculator class
        Scanner in = new Scanner(System.in);
        double balance, APR, monthlyPayment, totMonths;

        System.out.println("What is your balance?");
        balance = in.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        APR = in.nextDouble();
        APR = APR / 100;

        System.out.println("What is the monthly payment you can make?");
        monthlyPayment = in.nextDouble();

        PaymentCalculator calculator = new PaymentCalculator();

        totMonths = calculator.calculateMonthsUntilPaidOff((APR / 365),balance,monthlyPayment);

        System.out.println("It will take you "+ ((int) totMonths) +" months to pay off this card.\n");


    }
}
