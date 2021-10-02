/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input method that will take in and validate user input
    -Once input is validated the data is passed through an output function
        -This function will have a while loop that displays the intensity and rate
        -Heart rate will be calculated in a function called calcHR
        -Finally once the HR is calculated it will be displayed in a table
 */

package baseline;

import java.util.Scanner;

public class Solution31 {

    //Driver function, runs input
    public static void main(String[] args) {
        input();
    }

    //Takes in input using a scanner, makes sure that input is valid
    private static void input()
    {
        //Creates a scanner, uses a while loop to check input
        Scanner in = new Scanner(System.in);
        double age = 0, restingHR = 0;
        boolean validInput = false;

        while(!validInput)
        {

            try{
                System.out.println("Whats your age?");
                age = Integer.parseInt(in.nextLine());

                System.out.println("Whats your resting Heart Rate?");
                restingHR = Integer.parseInt(in.nextLine());

                if(age >= 0 && restingHR >= 0)
                {
                    validInput = true;
                }
                else
                {
                    System.out.println("Please enter a valid input.");

                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid input.");
            }
        }

        output(age,restingHR);

    }

    //Takes in age and heart rate once they've been validated, displays the output
    private static void output(double age, double restingHR)
    {
        System.out.println("Resting Pulse: "+ restingHR+"\tAge: "+age);
        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");

        for(double i = 55; i <=95; i+=5)
        {
            System.out.println(i+"%\t\t | "+calcHR(age,restingHR,(i / 100))+" bpm");
        }

    }

    //Used to calculate heart rate at each intensity
    private static int calcHR(double age, double restingHR, double intensity)
    {
        //Uses the formula: TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR


        return  (int) (restingHR + (((220.0 - age) - restingHR) * intensity));
    }

}
