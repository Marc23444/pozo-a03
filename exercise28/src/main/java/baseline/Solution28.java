/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input function to handle all user input
        -This function will have a for loop that takes in input 5 times
        -The input will be in integers
    -This input will then be added and displayed
 */
package baseline;

//Scanner will be used to take in input
import java.util.Scanner;

public class Solution28 {
    //Driver function, will call input
    public static void main(String[] args) {
        input();
    }

    //This function will take in 5 inputs using a scanner
    private static void input()
    {
        //Creates a scanner, uses a for loop to prompt for input.
        Scanner in = new Scanner(System.in);
        int sum = 0;

        //For loop from 1 to 5 to grab 5 inputs
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Enter a number: ");
            sum += in.nextInt();
        }

        System.out.println("The total is "+sum+".");

    }
}
