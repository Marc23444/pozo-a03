/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -The program will have a function called input that will take in user input
        -Input will take the rate of return
    -This input function will then check using a while loop
        -That r is > 0
        -That r is a number
    -The will loop will use a try catch statement to check if the input is valid
    -If either of those conditions are not met the program will prompt for input again
    until the conditions are met.
    -Input will send r to a seperate function called calcYears which will then return
    the years. years will then be output in input
 */
package baseline;

import java.util.Scanner;

public class Solution29 {
    //Driver function, runs input
    public static void main(String[] args) {
        input();
    }

    //Input function, takes in r and makes sure it meets the conditions
    private static void input()
    {
        //Vars
        Scanner in = new Scanner(System.in);
        double r = 0;
        boolean validInput = false;

        /*
            Runs while validinput is false
            This while loop takes in an input and trys to set the double r equal to the input.
            If it fails an error is displayed and the loop asks for input again.
            If it does not fail the loop checks if the number is greater than 0
        */
        while (!validInput)
        {
            System.out.println("What is the rate of return?");

            try{
                r = Double.parseDouble(in.nextLine());
                if( r <= 0)
                {
                    System.out.println("Sorry. That's not a valid input.");
                }
                else if (r > 0)
                {
                    validInput = true;
                }
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
            }

        }

        //Output statement
        System.out.println("It will take "+calcYears(r)+" years to double your initial investment.");


    }

    //Will return years = 72 / r
    private static int calcYears(double r)
    {
        //Cast to int so it can be displayed without a decimal
        return (int) (72/ r);
    }
}
